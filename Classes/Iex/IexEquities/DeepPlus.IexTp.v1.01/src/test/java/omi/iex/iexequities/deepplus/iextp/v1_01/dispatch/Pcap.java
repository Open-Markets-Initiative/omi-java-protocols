package omi.iex.iexequities.deepplus.iextp.v1_01.dispatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// Reads the UDP payloads of a classic pcap capture, for the capture tests.
final class Pcap {

    private Pcap() {
    }

    static List<byte[]> udpPayloads(Path path) throws IOException {
        byte[] file = Files.readAllBytes(path);
        if (file.length < 24) {
            throw new IOException(path + " is not a pcap capture");
        }

        int magic = (int) read(file, 0, 4, true);
        boolean little;
        if (magic == 0xA1B2C3D4 || magic == 0xA1B23C4D) {
            little = true;
        } else if (magic == 0xD4C3B2A1 || magic == 0x4D3CB2A1) {
            little = false;
        } else {
            throw new IOException(path + " is not a classic pcap capture");
        }

        int link = (int) read(file, 20, 4, little);
        List<byte[]> payloads = new ArrayList<>();
        int position = 24;

        while (position + 16 <= file.length) {
            int captured = (int) read(file, position + 8, 4, little);
            int start = position + 16;
            if (captured < 0 || captured > file.length - start) {
                throw new IOException(path + " ends inside a record");
            }

            byte[] payload = udp(file, start, start + captured, link);
            if (payload != null) {
                payloads.add(payload);
            }

            position = start + captured;
        }

        return payloads;
    }

    private static byte[] udp(byte[] data, int start, int end, int link) throws IOException {
        int ip;
        if (link == 1) {
            int type = start + 12;
            while (type + 2 <= end && (read(data, type, 2, false) == 0x8100 || read(data, type, 2, false) == 0x88A8)) {
                type += 4;
            }

            if (type + 2 > end || read(data, type, 2, false) != 0x0800) {
                return null;
            }

            ip = type + 2;
        } else if (link == 113) {
            if (start + 16 > end || read(data, start + 14, 2, false) != 0x0800) {
                return null;
            }

            ip = start + 16;
        } else if (link == 101 || link == 228) {
            ip = start;
        } else {
            throw new IOException("link type " + link + " is not read");
        }

        if (ip + 20 > end || (data[ip] & 0xF0) != 0x40 || data[ip + 9] != 17) {
            return null;
        }

        // a fragment, or the first of several, holds part of a datagram this does not reassemble
        if ((read(data, ip + 6, 2, false) & 0x3FFF) != 0) {
            return null;
        }

        int udp = ip + (data[ip] & 0x0F) * 4;
        if (udp + 8 > end) {
            return null;
        }

        int length = (int) read(data, udp + 4, 2, false);
        if (length < 8 || udp + length > end) {
            return null;
        }

        byte[] payload = new byte[length - 8];
        System.arraycopy(data, udp + 8, payload, 0, payload.length);
        return payload;
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
