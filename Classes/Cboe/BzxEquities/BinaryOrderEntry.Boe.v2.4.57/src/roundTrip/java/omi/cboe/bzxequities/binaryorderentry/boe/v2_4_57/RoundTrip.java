package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.CancelOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.CancelRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.ClientHeartbeatMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.LoginRequestMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.LoginResponseMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.LogoutMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.LogoutRequestMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.ModifyOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.NewOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderAcknowledgmentMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderCancelledMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderExecutionMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderModifiedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.OrderRestatedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.PurgeOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.PurgeRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.ReplayCompleteMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.ServerHeartbeatMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.TradeCancelOrCorrectMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application.UserModifyRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(CancelOrderMessage::new, RoundTrip::wire0, true, true, false, 1, 0);
        checkGrouped(CancelRejectedMessage::new, RoundTrip::wire1, true, true, false, 1, 0);
        checkGrouped(LoginRequestMessage::new, RoundTrip::wire2, true, true, true, 8, 0);
        checkGrouped(LoginResponseMessage::new, RoundTrip::wire3, true, true, true, 8, 0);
        checkGrouped(LogoutMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(MassCancelAcknowledgmentMessage::new);
        checkGrouped(ModifyOrderMessage::new, RoundTrip::wire5, true, true, false, 1, 0);
        checkGrouped(NewOrderMessage::new, RoundTrip::wire6, true, true, false, 1, 0);
        checkGrouped(OrderAcknowledgmentMessage::new, RoundTrip::wire7, true, true, false, 1, 0);
        checkGrouped(OrderCancelledMessage::new, RoundTrip::wire8, true, true, false, 1, 0);
        checkGrouped(OrderExecutionMessage::new, RoundTrip::wire9, true, true, false, 1, 0);
        checkGrouped(OrderModifiedMessage::new, RoundTrip::wire10, true, true, false, 1, 0);
        checkGrouped(OrderRejectedMessage::new, RoundTrip::wire11, true, true, false, 1, 0);
        checkGrouped(OrderRestatedMessage::new, RoundTrip::wire12, true, true, false, 1, 0);
        checkGrouped(PurgeOrderMessage::new, RoundTrip::wire13, true, true, true, 1, 0);
        checkGrouped(PurgeRejectedMessage::new, RoundTrip::wire14, true, true, false, 1, 0);
        checkGrouped(TradeCancelOrCorrectMessage::new, RoundTrip::wire15, true, true, false, 1, 0);
        checkGrouped(UserModifyRejectedMessage::new, RoundTrip::wire16, true, true, false, 1, 0);
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
        random(wire, random, 20);
        count(wire, entries > 0 ? 2L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
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
            count(wire, entries > 0 ? 6L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            int pick0 = random.nextInt(2);
            random(wire, random, 2);
            count(wire, new long[] { 128L, 129L }[pick0], 1, true);
            if (pick0 == 0) {
                random(wire, random, 1);
                count(wire, count, 1, true);
                for (int entry1 = 0; entry1 < entries; entry1++) {
                    random(wire, random, 1);
                    random(wire, random, 4);
                }
            } else if (pick0 == 1) {
                random(wire, random, 1);
                count(wire, entries > 0 ? 22L : 0L, 1, true);
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
            }
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
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
            int pick1 = random.nextInt(2);
            random(wire, random, 2);
            count(wire, new long[] { 128L, 129L }[pick1], 1, true);
            if (pick1 == 0) {
                random(wire, random, 1);
                count(wire, count, 1, true);
                for (int entry1 = 0; entry1 < entries; entry1++) {
                    random(wire, random, 1);
                    random(wire, random, 4);
                }
            } else if (pick1 == 1) {
                random(wire, random, 1);
                count(wire, entries > 0 ? 22L : 0L, 1, true);
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
            }
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
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

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 20);
        count(wire, entries > 0 ? 2L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 253L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 131L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
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
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, entries > 0 ? 12L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 195L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 251L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 10L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 63L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 2L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 14L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 2);
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
            random(wire, random, 8);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 126L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
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
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 126L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
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
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 24L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
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
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 3L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 126L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 126L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
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
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 126L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 96L : 0L, 1, true);
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
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 64);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 3);
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
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        count(wire, entries > 0 ? 2L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 21L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 131L : 0L, 1, true);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 20L : 0L, 1, true);
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
            count(wire, entries > 0 ? 8L : 0L, 1, true);
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
            random(wire, random, 20);
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 21L : 0L, 1, true);
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
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
            count(wire, entries > 0 ? 1L : 0L, 1, true);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 22L : 0L, 1, true);
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
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
