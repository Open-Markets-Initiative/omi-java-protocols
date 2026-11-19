package omi.cboe.cboeeurope.tradereporting.boe.v2_0_23;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.ClientHeartbeatMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.LoginRequestV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.LoginResponseV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.LogoutMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.LogoutRequestMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.QuoteCancelV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.QuoteRejectV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.QuoteStatusV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.QuoteV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.ReplayCompleteMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.ServerHeartbeatMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.TradeCaptureConfirmV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.TradeCaptureReportAcknowledgmentV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.TradeCaptureReportDeclineV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.TradeCaptureReportRejectV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application.TradeCaptureReportV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(LoginRequestV2Message::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(LoginResponseV2Message::new, RoundTrip::wire1, true, true, true, 1, 0);
        checkGrouped(LogoutMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(QuoteCancelV2Message::new, RoundTrip::wire3, true, true, true, 1, 0);
        checkGrouped(QuoteRejectV2Message::new, RoundTrip::wire4, true, true, false, 1, 0);
        checkGrouped(QuoteStatusV2Message::new, RoundTrip::wire5, true, true, false, 1, 0);
        checkGrouped(QuoteV2Message::new, RoundTrip::wire6, true, true, false, 1, 0);
        checkGrouped(TradeCaptureConfirmV2Message::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportAcknowledgmentV2Message::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportDeclineV2Message::new, RoundTrip::wire9, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportRejectV2Message::new, RoundTrip::wire10, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportV2Message::new, RoundTrip::wire11, true, true, true, 1, 0);
        check(LogoutRequestMessage::new);
        check(ClientHeartbeatMessage::new);
        check(ServerHeartbeatMessage::new);
        check(ReplayCompleteMessage::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static int blockDelta;

    private static int delta(int root) {
        return blockDelta < 0 ? -Math.min(-blockDelta, root - 1) : blockDelta;
    }

    private interface Wire {
        byte[] build(Random random, int entries, long count);
    }

    private static void checkGrouped(Supplier<Message> create, Wire wire, boolean variable, boolean bounded, boolean counted, int builds, int leaves) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        Random random = new Random(name.hashCode());

        for (int delta : new int[] { 0, 3, -1 }) {
            blockDelta = delta;
            for (int entries : new int[] { 0, 1, 3 }) {
                String label = name + " with " + entries + " entries, block " + blockDelta;
                byte[] bytes = wire.build(random, entries, entries);
                int offset = 1 + random.nextInt(7);
                byte[] shifted = new byte[offset + bytes.length + leaves + 3];
                random.nextBytes(shifted);
                System.arraycopy(bytes, 0, shifted, offset, bytes.length);

                expect(label + " decodes", message.parseFrom(shifted, offset, offset + bytes.length + leaves) && message.isDecoded());
                expect(label + " has its length", message.byteLength() == bytes.length);
                expect(label + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
                expect(label + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
                Arrays.fill(shifted, (byte) 0x5A);
                expect(label + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

                Message again = create.get();
                again.parseFrom(Arrays.copyOf(bytes, bytes.length + leaves), 0);
                expect(label + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

                expect(label + " refuses a short buffer", !bounded || bytes.length == 0 || !message.parseFrom(bytes, 0, bytes.length - 1));
                message.clear();
                expect(label + " clears", !message.isDecoded() && message.raw().isEmpty());
            }
        }
        blockDelta = 0;

        for (int build = 0; build < builds; build++) {
            if (counted && variable && bounded) {
                expect(name + " refuses a count beyond its entries", !message.parseFrom(wire.build(random, 1, 2), 0));
            }
            if (counted && bounded) {
                expect(name + " refuses an absurd count", !message.parseFrom(wire.build(random, 1, Long.MAX_VALUE), 0));
            }
        }
    }

    private static void random(ByteArrayOutputStream wire, Random random, int length) {
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        wire.writeBytes(bytes);
    }

    private static void count(ByteArrayOutputStream wire, long count, int width, boolean littleEndian) {
        for (int index = 0; index < width; index++) {
            wire.write((int) (count >>> (8 * (littleEndian ? index : width - 1 - index))));
        }
    }

    private static byte[] wire0(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 4);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        count(wire, entries > 0 ? 1L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 63L : 0L, 1, true);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            if (entries > 0) {
                random(wire, random, 8);
            }
            if (entries > 0) {
                random(wire, random, 3);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 2L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 2L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        count(wire, entries > 0 ? 1L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 130L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 14L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 80L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 2);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 60);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 2L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 80L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 6L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 80L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 15L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 125L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 6L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 80L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 48L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, entries > 0 ? 6L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 61L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 80L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 30L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            if (entries > 0) {
                random(wire, random, 1);
            }
            random(wire, random, 4);
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 1);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
