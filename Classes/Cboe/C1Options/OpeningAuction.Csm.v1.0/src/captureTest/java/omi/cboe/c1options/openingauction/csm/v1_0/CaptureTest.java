package omi.cboe.c1options.openingauction.csm.v1_0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import omi.cboe.c1options.openingauction.csm.v1_0.dispatch.PacketDecoder;
import omi.cboe.c1options.openingauction.csm.v1_0.types.Message;

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

    private long packets;
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

        if (test.packets + test.records == 0) {
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
        long before = packets + records;
        try (Pcap pcap = Pcap.open(path)) {
            for (Pcap.Packet packet = pcap.next(); packet != null; packet = pcap.next()) {
                String where = path.getFileName() + " packet " + pcap.records();
                if (packet.tcp()) {
                    continue;
                }

                byte[] payload = packet.payload();
                if (check(where, walked(PacketDecoder.decode(payload, 0, payload.length)), strict)) {
                    packets++;
                }
            }
        }

        // One capture among many could otherwise hold nothing and pass unnoticed.
        if (strict && packets + records == before) {
            errors++;
            System.out.println(path.getFileName() + ": no packet was read");
        }
    }

    private static Walked walked(PacketDecoder.Decoded decoded) {
        return new Walked(decoded.messages(), decoded.undecoded(), decoded.complete(),
            decoded.trailing().stream().map(ended -> new Ended(ended.message(), ended.bytes())).toList(),
            decoded.padding().stream().map(padded -> new Ended(padded.message(), padded.bytes())).toList());
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

    private void summary() {
        System.out.println();
        System.out.println("=== Summary ===");
        System.out.println("Packets:  " + packets);
        System.out.println("Messages: " + messages);
        System.out.println("Errors:   " + errors);
        System.out.println("Other traffic: " + otherPackets + " capture packets");
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
