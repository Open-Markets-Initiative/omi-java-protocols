package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.AccountQueryMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.BrokenTradeMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.CancelOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.CancelPendingMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.CancelRejectedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.CancelledOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.EnterOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.ExecutedOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.GtcCancelledMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.MmiNotificationRequestMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.MmoRefreshRequestMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.OrderAcceptedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.OrderReplacedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.OrderRestatedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.PendingOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.RejectedOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.ReplaceOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.ReplacePendingMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.ResponseToMmiNotificationMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.StreamStatusMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application.SystemEventMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.ClientHeartbeat;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.DebugPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.EndOfSession;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.LoginAcceptedPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.LoginRejectedPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.LoginRequestPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.LogoutRequest;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.SequencedDataPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.ServerHeartbeat;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.session.UnsequencedDataPacket;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AccountQueryResponseMessage::new);
        check(BrokenTradeMessage::new);
        check(CancelOrderMessage::new);
        check(CancelPendingMessage::new);
        check(CancelRejectedMessage::new);
        check(CancelledOrderMessage::new);
        checkGrouped(DebugPacket::new, RoundTrip::wire0, true, false, false, 1, 0);
        checkGrouped(EnterOrderMessage::new, RoundTrip::wire1, true, true, false, 8, 0);
        check(ExecutedOrderMessage::new);
        check(GtcCancelledMessage::new);
        check(LoginAcceptedPacket::new);
        check(LoginRejectedPacket::new);
        check(LoginRequestPacket::new);
        check(MmiNotificationRequestMessage::new);
        check(MmoRefreshRequestMessage::new);
        checkGrouped(OrderAcceptedMessage::new, RoundTrip::wire2, true, true, false, 8, 0);
        checkGrouped(OrderReplacedMessage::new, RoundTrip::wire3, true, true, false, 8, 0);
        checkGrouped(OrderRestatedMessage::new, RoundTrip::wire4, true, true, false, 8, 0);
        check(PendingOrderMessage::new);
        check(RejectedOrderMessage::new);
        checkGrouped(ReplaceOrderMessage::new, RoundTrip::wire5, true, true, false, 8, 0);
        check(ReplacePendingMessage::new);
        check(ResponseToMmiNotificationMessage::new);
        checkGrouped(SequencedDataPacket::new, RoundTrip::wire6, true, false, false, 8, 0);
        check(StreamStatusMessage::new);
        check(SystemEventMessage::new);
        checkGrouped(UnsequencedDataPacket::new, RoundTrip::wire7, true, false, false, 8, 0);
        check(ClientHeartbeat::new);
        check(LogoutRequest::new);
        check(AccountQueryMessage::new);
        check(ServerHeartbeat::new);
        check(EndOfSession::new);

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
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        ByteArrayOutputStream outer0 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer1 = wire;
            wire = new ByteArrayOutputStream();
            int pick0 = random.nextInt(35);
            count(wire, new long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 0L }[pick0], 1, false);
            random(wire, random, new int[] { 12, 1, 4, 15, 1, 1, 1, 4, 4, 2, 4, 1, 4, 4, 10, 4, 8, 4, 1, 4, 8, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2, 2, 1, 4, 3 }[pick0]);
            byte[] measured1 = wire.toByteArray();
            wire = outer1;
            count(wire, measured1.length + 1L - 1L, 1, false);
            wire.writeBytes(measured1);
        }
        byte[] measured0 = wire.toByteArray();
        wire = outer0;
        count(wire, measured0.length - 0L, 2, false);
        wire.writeBytes(measured0);
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        ByteArrayOutputStream outer2 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer3 = wire;
            wire = new ByteArrayOutputStream();
            int pick1 = random.nextInt(35);
            count(wire, new long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 0L }[pick1], 1, false);
            random(wire, random, new int[] { 12, 1, 4, 15, 1, 1, 1, 4, 4, 2, 4, 1, 4, 4, 10, 4, 8, 4, 1, 4, 8, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2, 2, 1, 4, 3 }[pick1]);
            byte[] measured3 = wire.toByteArray();
            wire = outer3;
            count(wire, measured3.length + 1L - 1L, 1, false);
            wire.writeBytes(measured3);
        }
        byte[] measured2 = wire.toByteArray();
        wire = outer2;
        count(wire, measured2.length - 0L, 2, false);
        wire.writeBytes(measured2);
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 6);
        ByteArrayOutputStream outer4 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer5 = wire;
            wire = new ByteArrayOutputStream();
            int pick2 = random.nextInt(35);
            count(wire, new long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 0L }[pick2], 1, false);
            random(wire, random, new int[] { 12, 1, 4, 15, 1, 1, 1, 4, 4, 2, 4, 1, 4, 4, 10, 4, 8, 4, 1, 4, 8, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2, 2, 1, 4, 3 }[pick2]);
            byte[] measured5 = wire.toByteArray();
            wire = outer5;
            count(wire, measured5.length + 1L - 1L, 1, false);
            wire.writeBytes(measured5);
        }
        byte[] measured4 = wire.toByteArray();
        wire = outer4;
        count(wire, measured4.length - 0L, 2, false);
        wire.writeBytes(measured4);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        ByteArrayOutputStream outer6 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer7 = wire;
            wire = new ByteArrayOutputStream();
            int pick3 = random.nextInt(35);
            count(wire, new long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 0L }[pick3], 1, false);
            random(wire, random, new int[] { 12, 1, 4, 15, 1, 1, 1, 4, 4, 2, 4, 1, 4, 4, 10, 4, 8, 4, 1, 4, 8, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2, 2, 1, 4, 3 }[pick3]);
            byte[] measured7 = wire.toByteArray();
            wire = outer7;
            count(wire, measured7.length + 1L - 1L, 1, false);
            wire.writeBytes(measured7);
        }
        byte[] measured6 = wire.toByteArray();
        wire = outer6;
        count(wire, measured6.length - 0L, 2, false);
        wire.writeBytes(measured6);
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 6);
        ByteArrayOutputStream outer8 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer9 = wire;
            wire = new ByteArrayOutputStream();
            int pick4 = random.nextInt(35);
            count(wire, new long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 0L }[pick4], 1, false);
            random(wire, random, new int[] { 12, 1, 4, 15, 1, 1, 1, 4, 4, 2, 4, 1, 4, 4, 10, 4, 8, 4, 1, 4, 8, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2, 2, 1, 4, 3 }[pick4]);
            byte[] measured9 = wire.toByteArray();
            wire = outer9;
            count(wire, measured9.length + 1L - 1L, 1, false);
            wire.writeBytes(measured9);
        }
        byte[] measured8 = wire.toByteArray();
        wire = outer8;
        count(wire, measured8.length - 0L, 2, false);
        wire.writeBytes(measured8);
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick5 = random.nextInt(18);
        ByteArrayOutputStream outer10 = wire;
        wire = new ByteArrayOutputStream();
        if (pick5 == 0) {
            random(wire, random, 9);
        } else if (pick5 == 1) {
            wire.writeBytes(wire2(random, entries, entries));
        } else if (pick5 == 2) {
            wire.writeBytes(wire3(random, entries, entries));
        } else if (pick5 == 3) {
            random(wire, random, 17);
        } else if (pick5 == 4) {
            random(wire, random, 13);
        } else if (pick5 == 5) {
            random(wire, random, 17);
        } else if (pick5 == 6) {
            random(wire, random, 35);
        } else if (pick5 == 7) {
            random(wire, random, 20);
        } else if (pick5 == 8) {
            random(wire, random, 14);
        } else if (pick5 == 9) {
            random(wire, random, 14);
        } else if (pick5 == 10) {
            wire.writeBytes(wire4(random, entries, entries));
        } else if (pick5 == 11) {
            random(wire, random, 17);
        } else if (pick5 == 12) {
            random(wire, random, 12);
        } else if (pick5 == 13) {
            random(wire, random, 22);
        } else if (pick5 == 14) {
            random(wire, random, 29);
        } else if (pick5 == 15) {
            random(wire, random, 13);
        } else if (pick5 == 16) {
            random(wire, random, 15);
        } else {
            random(wire, random, 3);
        }
        byte[] measured10 = wire.toByteArray();
        wire = outer10;
        count(wire, new long[] { 83L, 65L, 85L, 67L, 80L, 78L, 69L, 66L, 74L, 73L, 84L, 87L, 81L, 71L, 82L, 77L, 68L, 32L }[pick5], 1, false);
        wire.writeBytes(measured10);
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick6 = random.nextInt(6);
        ByteArrayOutputStream outer11 = wire;
        wire = new ByteArrayOutputStream();
        if (pick6 == 0) {
            wire.writeBytes(wire1(random, entries, entries));
        } else if (pick6 == 1) {
            wire.writeBytes(wire5(random, entries, entries));
        } else if (pick6 == 2) {
            random(wire, random, 14);
        } else if (pick6 == 3) {
            random(wire, random, 0);
        } else if (pick6 == 4) {
            random(wire, random, 20);
        } else {
            random(wire, random, 3);
        }
        byte[] measured11 = wire.toByteArray();
        wire = outer11;
        count(wire, new long[] { 79L, 85L, 88L, 81L, 77L, 32L }[pick6], 1, false);
        wire.writeBytes(measured11);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
