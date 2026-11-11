package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// Reads the UDP datagrams and TCP segments of a pcap or pcap-ng capture, one record at a time, for the capture test.
final class Pcap implements AutoCloseable {

    // One captured packet's transport payload: a UDP datagram's, or a TCP segment's with what places it in its connection.
    record Packet(boolean tcp, int source, int sourcePort, int destination, int destinationPort, int sequence, int flags, byte[] payload) {
    }

    private static final int SECTION = 0x0A0D0D0A;
    private static final int LARGEST_RECORD = 1 << 28;

    private final InputStream input;
    private final boolean nextGeneration;
    private final List<Integer> links = new ArrayList<>();
    private boolean little;
    private long records;
    private byte[] data;
    private int link;

    private Pcap(InputStream input, boolean nextGeneration) {
        this.input = input;
        this.nextGeneration = nextGeneration;
    }

    static Pcap open(Path path) throws IOException {
        InputStream input = new BufferedInputStream(Files.newInputStream(path), 1 << 16);
        try {
            input.mark(4);
            byte[] magic = input.readNBytes(4);
            if (magic.length < 4) {
                throw new IOException(path + " is not a pcap capture");
            }

            if ((int) read(magic, 0, 4, false) == SECTION) {
                input.reset();
                return new Pcap(input, true);
            }

            Pcap pcap = new Pcap(input, false);
            int value = (int) read(magic, 0, 4, false);
            if (value == 0xD4C3B2A1 || value == 0x4D3CB2A1) {
                pcap.little = true;
            } else if (value != 0xA1B2C3D4 && value != 0xA1B23C4D) {
                throw new IOException(path + " is not a pcap or pcap-ng capture");
            }

            byte[] header = pcap.exactly(20);
            pcap.links.add((int) read(header, 16, 4, pcap.little));
            return pcap;
        } catch (IOException failure) {
            input.close();
            throw failure;
        }
    }

    // Records read so far, numbered as a capture viewer numbers them.
    long records() {
        return records;
    }

    @Override
    public void close() throws IOException {
        input.close();
    }

    // The next UDP datagram or TCP segment, passing over records that hold neither; null at the end of the capture.
    Packet next() throws IOException {
        while (nextGeneration ? block() : record()) {
            if (data == null) {
                continue;
            }

            records++;
            Packet packet = transport(data, data.length, link);
            if (packet != null) {
                return packet;
            }
        }

        return null;
    }

    // Reads the next record into data and link; false at the end of the capture.
    private boolean record() throws IOException {
        byte[] header = input.readNBytes(16);
        if (header.length == 0) {
            return false;
        }

        if (header.length < 16) {
            throw new EOFException("the capture ends inside a record header");
        }

        data = exactly(length(header, 8));
        link = links.get(0);
        return true;
    }

    // Reads the next block, leaving data null unless it holds a packet; false at the end of the capture.
    private boolean block() throws IOException {
        data = null;
        byte[] header = input.readNBytes(8);
        if (header.length == 0) {
            return false;
        }

        if (header.length < 8) {
            throw new EOFException("the capture ends inside a block header");
        }

        int type = (int) read(header, 0, 4, false);
        if (type == SECTION) {
            byte[] order = exactly(4);
            int magic = (int) read(order, 0, 4, false);
            if (magic != 0x1A2B3C4D && magic != 0x4D3C2B1A) {
                throw new IOException("a section header has no byte order magic");
            }

            little = magic == 0x4D3C2B1A;
            links.clear();
            exactly(length(header, 4) - 12);
            return true;
        }

        type = (int) read(header, 0, 4, little);
        int length = length(header, 4);
        if (length < 12 || length % 4 != 0) {
            throw new IOException("a block has the length " + length);
        }

        byte[] body = exactly(length - 8);
        int end = body.length - 4;
        if (type == 1 && end >= 2) {
            links.add((int) read(body, 0, 2, little));
            return true;
        }

        if (type == 6 && end >= 20) {
            link = interfaceLink((int) read(body, 0, 4, little));
            int captured = (int) read(body, 12, 4, little);
            if (captured < 0 || captured > end - 20) {
                throw new IOException("a packet block holds fewer bytes than it says it captured");
            }

            data = slice(body, 20, captured);
            return true;
        }

        if (type == 3 && end >= 4) {
            long original = read(body, 0, 4, little);
            link = interfaceLink(0);
            data = slice(body, 4, (int) Math.min(original, end - 4));
            return true;
        }

        return true;
    }

    private int interfaceLink(int index) throws IOException {
        if (index < 0 || index >= links.size()) {
            throw new IOException("a packet names interface " + index + ", which the section does not describe");
        }

        return links.get(index);
    }

    private int length(byte[] data, int offset) throws IOException {
        long length = read(data, offset, 4, little);
        if (length > LARGEST_RECORD) {
            throw new IOException("a record has the length " + length);
        }

        return (int) length;
    }

    private byte[] exactly(int length) throws IOException {
        byte[] data = input.readNBytes(length);
        if (data.length < length) {
            throw new EOFException("the capture ends inside a record");
        }

        return data;
    }

    private static byte[] slice(byte[] data, int offset, int length) {
        byte[] slice = new byte[length];
        System.arraycopy(data, offset, slice, 0, length);
        return slice;
    }

    private static Packet transport(byte[] data, int end, int link) throws IOException {
        int ip;
        if (link == 1) {
            ip = afterEtherType(data, 12, 14, end);
        } else if (link == 113) {
            ip = afterEtherType(data, 14, 16, end);
        } else if (link == 276) {
            ip = afterEtherType(data, 0, 20, end);
        } else if (link == 0 || link == 108) {
            // BSD loopback: the address family, in the capturing host's byte order or, for 108, the network's
            if (4 > end || (read(data, 0, 4, false) != 2 && read(data, 0, 4, true) != 2)) {
                return null;
            }

            ip = 4;
        } else if (link == 101 || link == 228) {
            ip = 0;
        } else {
            throw new IOException("link type " + link + " is not read");
        }

        if (ip < 0 || ip + 20 > end || (data[ip] & 0xF0) != 0x40 || (data[ip + 9] != 17 && data[ip + 9] != 6)) {
            return null;
        }

        // a fragment, or the first of several, holds part of a datagram this does not reassemble
        if ((read(data, ip + 6, 2, false) & 0x3FFF) != 0) {
            return null;
        }

        int source = (int) read(data, ip + 12, 4, false);
        int destination = (int) read(data, ip + 16, 4, false);
        int transport = ip + (data[ip] & 0x0F) * 4;
        if (data[ip + 9] == 6) {
            // the IP length bounds the segment, as Ethernet pads a short frame
            int total = (int) read(data, ip + 2, 2, false);
            if (total < transport - ip + 20 || ip + total > end) {
                return null;
            }

            int payload = transport + ((data[transport + 12] & 0xF0) >> 4) * 4;
            if (payload < transport + 20 || payload > ip + total) {
                return null;
            }

            return new Packet(true, source, (int) read(data, transport, 2, false), destination, (int) read(data, transport + 2, 2, false),
                (int) read(data, transport + 4, 4, false), data[transport + 13] & 0xFF, slice(data, payload, ip + total - payload));
        }

        if (transport + 8 > end) {
            return null;
        }

        int length = (int) read(data, transport + 4, 2, false);
        if (length < 8 || transport + length > end) {
            return null;
        }

        return new Packet(false, source, (int) read(data, transport, 2, false), destination, (int) read(data, transport + 2, 2, false),
            0, 0, slice(data, transport + 8, length - 8));
    }

    // Where the IPv4 header starts after a link header's EtherType and the VLAN tags it may announce, as the C# reader
    // finds it on Ethernet and Linux cooked captures alike, or -1 where the packet is short or carries no IPv4.
    private static int afterEtherType(byte[] data, int type, int header, int end) {
        if (header > end) {
            return -1;
        }

        long etherType = read(data, type, 2, false);
        int offset = header;
        while (etherType == 0x8100 || etherType == 0x88A8 || etherType == 0x9100) {
            if (offset + 4 > end) {
                return -1;
            }

            etherType = read(data, offset + 2, 2, false);
            offset += 4;
        }

        return etherType == 0x0800 ? offset : -1;
    }

    private static long read(byte[] data, int offset, int length, boolean little) {
        long value = 0;
        for (int index = 0; index < length; index++) {
            int at = little ? offset + length - 1 - index : offset + index;
            value = (value << 8) | (data[at] & 0xFF);
        }

        return value;
    }
}
