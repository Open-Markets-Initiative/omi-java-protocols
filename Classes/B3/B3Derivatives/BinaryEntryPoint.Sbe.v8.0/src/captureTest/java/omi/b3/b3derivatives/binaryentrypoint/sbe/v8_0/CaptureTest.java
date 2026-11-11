package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.dispatch.PacketDecoder;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.dispatch.PacketStream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Message;

// Decodes every UDP datagram of a capture, or of each capture in a directory, through the packet decoder, and the
// records of every TCP connection through the stream of the side sending them, and requires every message to
// encode back to its own bytes. A datagram or record the decoder cannot walk to its end is counted as other
// traffic, and a message of a type it does not decode is counted and passed over; with --strict both are errors,
// so a capture of another protocol fails. A message ending before its frame is counted too, and with --strict is an
// error: encoding back compares only the bytes it read, so a message missing a field still agrees with itself. A
// TCP flow missing bytes, or ending in bytes that make no whole record, is an error. Exits non-zero on any error,
// or when nothing was read.
public final class CaptureTest {

    private static final String USAGE = "Usage: CaptureTest <capture or directory> [--strict]";

    // What a datagram or record decoded to, from whichever decoder walked it.
    private record Walked(List<Message> messages, int undecoded, boolean complete, List<Ended> trailing, List<Ended> padding) {
    }

    // A decoded message and the bytes of its frame after it.
    private record Ended(Message message, byte[] bytes) {
    }

    private long otherPackets;
    private long records;
    private long otherFlows;
    private long messages;
    private long undecoded;
    private long trailing;
    private long errors;
    private final Map<String, Long> counts = new TreeMap<>();

    private CaptureTest() {
    }

    public static void main(String[] args) throws IOException {
        boolean strict = args.length == 2 && args[1].equals("--strict");
        if (args.length < 1 || args.length > 2 || (args.length == 2 && !strict)) {
            System.err.println(USAGE);
            System.exit(1);
        }

        Path path = Path.of(args[0]);
        if (!Files.isRegularFile(path) && !Files.isDirectory(path)) {
            System.err.println("File not found: " + path);
            System.exit(1);
        }

        CaptureTest test = new CaptureTest();
        for (Path capture : captures(path)) {
            System.out.println("Reading: " + capture);
            test.walk(capture, strict);
        }
        test.summary();

        if (test.records == 0) {
            System.err.println("No packet was read from the capture.");
            System.exit(1);
        }

        if (test.errors > 0) {
            System.exit(1);
        }
    }

    // The capture itself, or every capture directly in the directory, in name order.
    private static List<Path> captures(Path path) throws IOException {
        if (!Files.isDirectory(path)) {
            return List.of(path);
        }

        try (Stream<Path> files = Files.list(path)) {
            return files.filter(CaptureTest::isCapture).sorted().toList();
        }
    }

    private static boolean isCapture(Path path) {
        String name = path.getFileName().toString();
        return name.endsWith(".pcap") || name.endsWith(".pcapng");
    }

    private void walk(Path path, boolean strict) throws IOException {
        long before = records;
        Tcp tcp = new Tcp();
        try (Pcap pcap = Pcap.open(path)) {
            for (Pcap.Packet packet = pcap.next(); packet != null; packet = pcap.next()) {
                String where = path.getFileName() + " packet " + pcap.records();
                if (packet.tcp()) {
                    Tcp.Flow flow = tcp.add(packet);
                    if (flow != null && flow.bytes().length > 0) {
                        read(where, flow, strict);
                    }
                    continue;
                }

                // this protocol has no packet decoder, so its datagrams are other traffic
                otherPackets++;
            }
        }

        end(path, tcp, strict);

        // One capture among many could otherwise hold nothing and pass unnoticed.
        if (strict && records == before) {
            errors++;
            System.out.println(path.getFileName() + ": no packet was read");
        }
    }

    // Checks one datagram or record: false when it is other traffic, which only a test that is not strict passes over.
    private boolean check(String where, Walked walked, boolean strict) {
        if (!walked.complete() && !strict) {
            otherPackets++;
            return false;
        }

        undecoded += walked.undecoded();
        if (!walked.complete()) {
            errors++;
            System.out.println(where + ": not walked to its end");
        }

        if (walked.undecoded() > 0 && strict) {
            errors++;
            System.out.println(where + ": " + walked.undecoded() + " message(s) of a type not decoded");
        }

        trailing += walked.trailing().size();
        if (strict) {
            for (Ended ended : walked.trailing()) {
                errors++;
                System.out.println(where + ": " + ended.message().getClass().getSimpleName() + " ended " + ended.bytes().length + " byte(s) before its frame");
            }
            for (Ended padded : walked.padding()) {
                if (!isZero(padded.bytes())) {
                    errors++;
                    System.out.println(where + ": " + padded.message().getClass().getSimpleName() + " padding is not zero");
                }
            }
        }

        for (Message message : walked.messages()) {
            messages++;
            String name = message.getClass().getSimpleName();
            counts.merge(name, 1L, Long::sum);

            byte[] captured = message.raw().orElseThrow();
            byte[] encoded = message.toBytes();
            if (!Arrays.equals(encoded, captured)) {
                errors++;
                System.out.println(where + ": " + name + " " + difference(encoded, captured));
            }
        }

        return true;
    }

    // A TCP tree's stream, offered the flows of the side its origin names, or of either side where it names none.
    private interface Reader {
        List<Walked> append(byte[] data);

        int pendingBytes();

        boolean isFailed();
    }

    private record Feed(String name, Tcp.Side side, Supplier<Reader> open) {
    }

    private static final List<Feed> FEEDS = List.of(
        new Feed("PacketStream", Tcp.Side.UNKNOWN, CaptureTest::packetStream));

    private static Reader packetStream() {
        PacketStream stream = new PacketStream();
        return new Reader() {
            @Override
            public List<Walked> append(byte[] data) {
                List<Walked> walked = new ArrayList<>();
                for (PacketStream.Record record : stream.append(data, 0, data.length)) {
                    walked.add(walked(record.decoded()));
                }
                return walked;
            }

            @Override
            public int pendingBytes() {
                return stream.pendingBytes();
            }

            @Override
            public boolean isFailed() {
                return stream.isFailed();
            }
        };
    }

    private static Walked walked(PacketDecoder.Decoded decoded) {
        return new Walked(decoded.messages(), decoded.undecoded(), decoded.complete(),
            decoded.trailing().stream().map(ended -> new Ended(ended.message(), ended.bytes())).toList(),
            decoded.padding().stream().map(padded -> new Ended(padded.message(), padded.bytes())).toList());
    }

    // A feed still deciding whether it reads a flow, and the records it walked meanwhile.
    private static final class Trial {
        private final Feed feed;
        private final Reader reader;
        private final List<Walked> walked = new ArrayList<>();
        private boolean rejected;

        private Trial(Feed feed) {
            this.feed = feed;
            this.reader = feed.open().get();
        }
    }

    // Which feed reads a flow: its owner once chosen, the trials still deciding, or the several feeds that walk its first
    // record, which must then read every record alike; unread when no feed walks it.
    private static final class Reading {
        private Reader owner;
        private List<Trial> trials = new ArrayList<>();
        private List<Trial> agreeing;
        private int compared;
        private boolean disagreed;
        private String unread;
    }

    // A flow sent by a known side goes to the one feed of that side; otherwise every feed offered it tries its first
    // record, and the one walking it reads the flow. A flow no feed is offered is passed over.
    private static Reading start(Tcp.Flow flow) {
        List<Feed> offered = FEEDS.stream().filter(feed -> flow.side() == Tcp.Side.UNKNOWN || feed.side() == flow.side()).toList();
        if (offered.isEmpty()) {
            offered = FEEDS.stream().filter(feed -> feed.side() == Tcp.Side.UNKNOWN).toList();
        }

        Reading reading = new Reading();
        List<Feed> sided = offered.stream().filter(feed -> feed.side() != Tcp.Side.UNKNOWN && feed.side() == flow.side()).toList();
        if (sided.size() == 1) {
            reading.owner = sided.get(0).open().get();
            reading.trials = null;
            return reading;
        }

        for (Feed feed : offered) {
            reading.trials.add(new Trial(feed));
        }
        return reading;
    }

    private void read(String where, Tcp.Flow flow, boolean strict) {
        Reading reading = (Reading) flow.state;
        if (reading == null) {
            reading = start(flow);
            flow.state = reading;
        }

        where = where + " TCP " + flow.name();
        if (reading.agreeing != null) {
            for (Trial trial : reading.agreeing) {
                if (!trial.reader.isFailed()) {
                    trial.walked.addAll(trial.reader.append(flow.bytes()));
                }
            }
            agree(where, reading, strict);
            return;
        }

        if (reading.owner != null) {
            if (!reading.owner.isFailed()) {
                for (Walked walked : reading.owner.append(flow.bytes())) {
                    record(where, walked, strict);
                }
            }
            return;
        }

        if (reading.trials == null || reading.trials.isEmpty()) {
            return;
        }

        boolean deciding = false;
        for (Trial trial : reading.trials) {
            if (trial.rejected) {
                continue;
            }

            // a trial goes on reading the flow, as the one chosen reads it from its start
            try {
                if (!trial.reader.isFailed()) {
                    trial.walked.addAll(trial.reader.append(flow.bytes()));
                }
            } catch (RuntimeException failure) {
                trial.rejected = true;
                continue;
            }

            if (trial.walked.isEmpty()) {
                trial.rejected = trial.reader.isFailed();
                deciding |= !trial.rejected;
            } else {
                Walked first = trial.walked.get(0);
                trial.rejected = !first.complete() || first.undecoded() > 0 || first.messages().stream().anyMatch(CaptureTest::holdsUnknown);
            }
        }

        if (deciding) {
            return;
        }

        List<Trial> accepted = reading.trials.stream().filter(trial -> !trial.rejected).toList();
        reading.trials = null;
        if (accepted.isEmpty()) {
            reading.unread = "no stream walks its first record";
            return;
        }

        // several streams walking it go on reading it, as a datagram several feeds decode alike passes: a flow whose
        // SYN was not captured may hold a message both sides send
        if (accepted.size() > 1) {
            reading.agreeing = accepted;
            agree(where, reading, strict);
            return;
        }

        reading.owner = accepted.get(0).reader;
        for (Walked walked : accepted.get(0).walked) {
            record(where, walked, strict);
        }
    }

    // Checks each record every agreeing stream has walked, once they all decode it alike.
    private void agree(String where, Reading reading, boolean strict) {
        List<Trial> trials = reading.agreeing;
        while (!reading.disagreed && trials.stream().allMatch(trial -> trial.walked.size() > reading.compared)) {
            Walked first = trials.get(0).walked.get(reading.compared);
            for (Trial other : trials.subList(1, trials.size())) {
                if (!alike(first, other.walked.get(reading.compared))) {
                    errors++;
                    reading.disagreed = true;
                    System.out.println(where + ": " + trials.get(0).feed.name() + " and " + other.feed.name() + " read record " + reading.compared + " differently");
                    return;
                }
            }

            record(where, first, strict);
            reading.compared++;
        }
    }

    // The same messages, of the same classes and bytes, walked alike.
    private static boolean alike(Walked one, Walked other) {
        if (one.complete() != other.complete() || one.undecoded() != other.undecoded() || one.messages().size() != other.messages().size()) {
            return false;
        }

        for (int index = 0; index < one.messages().size(); index++) {
            Message left = one.messages().get(index);
            Message right = other.messages().get(index);
            if (!left.getClass().getSimpleName().equals(right.getClass().getSimpleName()) || !Arrays.equals(left.raw().orElseThrow(), right.raw().orElseThrow())) {
                return false;
            }
        }

        return true;
    }

    private void record(String where, Walked walked, boolean strict) {
        if (check(where, walked, strict)) {
            records++;
        }
    }

    // Every flow at the end of a capture: one missing bytes, or holding bytes that make no whole record, is an error, as
    // is a flow no stream reads when strict.
    private void end(Path path, Tcp tcp, boolean strict) {
        for (Tcp.Flow flow : tcp.flows()) {
            if (!(flow.state instanceof Reading reading) || reading.disagreed) {
                continue;
            }

            String where = path.getFileName() + " TCP " + flow.name();
            if (reading.agreeing != null) {
                Trial first = reading.agreeing.get(0);
                if (reading.agreeing.stream().anyMatch(trial -> trial.walked.size() != first.walked.size() || trial.reader.pendingBytes() != first.reader.pendingBytes())) {
                    errors++;
                    System.out.println(where + ": the streams walking it end it differently");
                    continue;
                }

                reading.owner = first.reader;
            }

            // a flow no feed is offered is passed over, as is one whose first record never arrived whole
            if (reading.owner == null && reading.unread == null && (reading.trials == null || reading.trials.isEmpty())) {
                continue;
            }

            if (reading.owner == null) {
                String unread = reading.unread != null ? reading.unread : "no stream reads a whole first record";
                if (strict) {
                    errors++;
                    System.out.println(where + ": " + unread);
                } else {
                    otherFlows++;
                }
                continue;
            }

            if (flow.lost() || flow.waiting()) {
                errors++;
                System.out.println(where + ": the capture misses bytes of the flow");
            }

            if (reading.owner.isFailed()) {
                errors++;
                System.out.println(where + ": a record states a length that is not valid, so the stream stops");
            } else if (reading.owner.pendingBytes() > 0) {
                errors++;
                System.out.println(where + ": " + reading.owner.pendingBytes() + " byte(s) at the end do not make a whole record");
            }
        }
    }

    // Whether a message holds one its dispatch does not decode, as the holder of the other side's sequenced message does.
    private static boolean holdsUnknown(Message message) {
        return false;
    }

    private void summary() {
        System.out.println();
        System.out.println("=== Summary ===");
        System.out.println("TCP records: " + records);
        System.out.println("Messages: " + messages);
        System.out.println("Errors:   " + errors);
        System.out.println("Other traffic: " + otherPackets + " capture packets");
        System.out.println("TCP flows not read: " + otherFlows);
        System.out.println("Messages of a type not decoded: " + undecoded);
        System.out.println("Messages ending before their frame: " + trailing);
        System.out.println();
        System.out.println("Messages by type:");
        counts.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .forEach(entry -> System.out.println("  " + entry.getKey() + ": " + entry.getValue()));
    }

    private static boolean isZero(byte[] bytes) {
        for (byte value : bytes) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    // Where an encoding first differs from the captured bytes, with the bytes either side.
    private static String difference(byte[] encoded, byte[] captured) {
        int shown = 8;
        int offset = Math.max(0, Arrays.mismatch(encoded, captured));
        int start = Math.max(0, offset - shown);
        HexFormat hex = HexFormat.of().withUpperCase();
        return "encodes differently from the captured bytes at byte " + offset
            + ": " + encoded.length + " bytes encoded, " + captured.length + " bytes captured; from byte " + start
            + ", encoded " + hex.formatHex(encoded, start, Math.min(encoded.length, offset + shown))
            + ", captured " + hex.formatHex(captured, start, Math.min(captured.length, offset + shown));
    }
}
