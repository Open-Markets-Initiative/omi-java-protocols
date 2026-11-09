package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Reassembles the bytes of each TCP flow of a capture, one direction of one connection, in sequence order and each
// once, as the C# capture reader's TcpReassembler does. A flow keeps at most a mebibyte arriving after a gap; keeping
// more ends it as lost. A FIN or RST ends it once every byte before it is given.
final class Tcp {

    // The side of the connection that sends a flow's bytes, known once a SYN of the connection is captured.
    enum Side { UNKNOWN, CLIENT, SERVER }

    private static final int FIN = 0x01;
    private static final int SYN = 0x02;
    private static final int RST = 0x04;
    private static final int ACK = 0x10;
    private static final int LARGEST_KEPT = 1 << 20;
    private static final byte[] NONE = new byte[0];

    private record Key(int source, int sourcePort, int destination, int destinationPort) {
        Key reverse() {
            return new Key(destination, destinationPort, source, sourcePort);
        }
    }

    private final Map<Key, Flow> flows = new HashMap<>();
    private final Set<Key> ended = new HashSet<>();
    private final List<Flow> seen = new ArrayList<>();

    // Every flow, in the order its first segment was captured.
    List<Flow> flows() {
        return seen;
    }

    // Adds a captured segment to its flow, whose bytes() are then the new in-order bytes it made available; null when
    // the segment belongs to an ended flow and has no SYN, or has no SYN and no bytes and no flow is open for it.
    Flow add(Pcap.Packet segment) {
        Key key = new Key(segment.source(), segment.sourcePort(), segment.destination(), segment.destinationPort());
        boolean synchronize = (segment.flags() & SYN) != 0;
        Flow current = flows.get(key);
        if (current == null || (synchronize && current.isOtherConnection(segment.sequence()))) {
            if (!synchronize && (segment.payload().length == 0 || ended.contains(key))) {
                return null;
            }

            if (current != null && !current.ended) {
                current.finish(!current.kept.isEmpty());
            }

            ended.remove(key);
            current = new Flow(name(segment.source(), segment.sourcePort()) + " -> " + name(segment.destination(), segment.destinationPort()));
            Flow opposite = flows.get(key.reverse());
            if (opposite != null) {
                current.link(opposite);
            }

            flows.put(key, current);
            seen.add(current);
        }

        current.add(segment.flags(), segment.sequence(), segment.payload());
        if (current.ended) {
            flows.remove(key);
            ended.add(key);
        }

        return current;
    }

    private static String name(int address, int port) {
        return (address >>> 24) + "." + ((address >>> 16) & 0xFF) + "." + ((address >>> 8) & 0xFF) + "." + (address & 0xFF) + ":" + port;
    }

    // Sequence numbers wrap at 2^32, so the order of two is the sign of their 32-bit difference.
    private static boolean before(int left, int right) {
        return left - right < 0;
    }

    private static boolean after(int left, int right) {
        return left - right > 0;
    }

    // One direction of one TCP connection.
    static final class Flow {

        private record Kept(int sequence, byte[] bytes) {
            int end() {
                return sequence + bytes.length;
            }
        }

        private final String name;
        private final List<Kept> kept = new ArrayList<>();
        private Side side = Side.UNKNOWN;
        private boolean ended;
        private boolean lost;
        private int keptBytes;
        private int next;
        private Integer synchronize;
        private Integer close;
        private boolean started;
        private Flow reverse;
        private byte[] bytes = NONE;
        private byte[] given = NONE;
        private int givenLength;

        // What the capture test keeps for the flow.
        Object state;

        private Flow(String name) {
            this.name = name;
        }

        // The flow's addresses and ports, sender first.
        String name() {
            return name;
        }

        Side side() {
            return side;
        }

        // The new in-order bytes the last segment added made available.
        byte[] bytes() {
            return bytes;
        }

        // Whether the flow ended at a gap in the captured bytes, giving none after it.
        boolean lost() {
            return lost;
        }

        // Whether the flow holds bytes, or a FIN or RST, following bytes the capture has not given: at the end of the
        // capture, it misses them.
        boolean waiting() {
            return !ended && (!kept.isEmpty() || (close != null && after(close, next)));
        }

        // A SYN with the sequence number of the one that opened the flow is a retransmission, not a new connection.
        private boolean isOtherConnection(int sequence) {
            return ended || (synchronize != null ? synchronize != sequence : started);
        }

        private void link(Flow opposite) {
            reverse = opposite;
            opposite.reverse = this;
            if (opposite.side != Side.UNKNOWN) {
                side = opposite(opposite.side);
            }
        }

        // A SYN takes one sequence number, so its bytes start after it.
        private void add(int flags, int sequence, byte[] payload) {
            bytes = NONE;
            if (ended) {
                return;
            }

            boolean closes = (flags & (FIN | RST)) != 0;
            if ((flags & SYN) != 0) {
                side((flags & ACK) != 0 ? Side.SERVER : Side.CLIENT);
                if (!started) {
                    synchronize = sequence;
                    next = sequence + 1;
                    started = true;
                }

                sequence++;
            } else if (!started) {
                if (payload.length == 0) {
                    if (closes) {
                        finish(false);
                    }
                    return;
                }

                next = sequence;
                started = true;
            }

            if (closes && close == null) {
                close = sequence + payload.length;
            }

            if (payload.length > 0) {
                accept(sequence, payload);
            }

            if (!ended && close != null && !before(next, close)) {
                finish(false);
            }
        }

        private void side(Side value) {
            side = value;
            if (reverse != null) {
                reverse.side = opposite(value);
            }
        }

        private void accept(int sequence, byte[] payload) {
            int start = 0;
            int end = sequence + payload.length;
            if (!after(end, next)) {
                return;
            }

            if (before(sequence, next)) {
                start = next - sequence;
                sequence = next;
            }

            if (sequence != next) {
                keep(sequence, Arrays.copyOfRange(payload, start, payload.length));
                if (keptBytes > LARGEST_KEPT) {
                    finish(true);
                }
                return;
            }

            next = end;
            givenLength = 0;
            give(payload, start, payload.length - start);
            for (int index = releasable(); index >= 0; index = releasable()) {
                Kept segment = kept.remove(index);
                if (after(segment.end(), next)) {
                    give(segment.bytes(), next - segment.sequence(), segment.end() - next);
                    next = segment.end();
                }

                keptBytes -= segment.bytes().length;
            }

            bytes = Arrays.copyOf(given, givenLength);
        }

        // A retransmission of a kept segment is not kept again.
        private void keep(int sequence, byte[] payload) {
            for (Kept segment : kept) {
                if (segment.sequence() == sequence && segment.bytes().length >= payload.length) {
                    return;
                }
            }

            kept.add(new Kept(sequence, payload));
            keptBytes += payload.length;
        }

        private int releasable() {
            for (int index = 0; index < kept.size(); index++) {
                if (!after(kept.get(index).sequence(), next)) {
                    return index;
                }
            }

            return -1;
        }

        private void give(byte[] data, int offset, int length) {
            if (givenLength + length > given.length) {
                given = Arrays.copyOf(given, Math.max(givenLength + length, given.length * 2));
            }

            System.arraycopy(data, offset, given, givenLength, length);
            givenLength += length;
        }

        private void finish(boolean gap) {
            ended = true;
            lost = gap;
            kept.clear();
            keptBytes = 0;
            if (reverse != null) {
                reverse.reverse = null;
            }
            reverse = null;
        }

        private static Side opposite(Side side) {
            return side == Side.CLIENT ? Side.SERVER : Side.CLIENT;
        }
    }
}
