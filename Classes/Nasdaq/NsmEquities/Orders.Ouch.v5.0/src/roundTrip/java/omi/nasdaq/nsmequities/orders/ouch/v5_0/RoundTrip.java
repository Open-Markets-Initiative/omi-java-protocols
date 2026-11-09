package omi.nasdaq.nsmequities.orders.ouch.v5_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AiqCanceledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelPendingMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelRejectMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CanceledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.DisableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.DisableOrderEntryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnableOrderEntryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnterOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.MassCancelRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.MassCancelResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ModifyOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderAcceptedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderModifiedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderPriorityUpdateMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderRestatedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.RejectedOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ReplaceOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ReplacedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.ClientHeartbeat;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.DebugPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.EndOfSession;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.LoginAcceptedPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.LoginRejectedPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.LoginRequestPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.LogoutRequest;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.SequencedDataPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.ServerHeartbeat;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.UnsequencedDataPacket;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AccountQueryMessage::new, RoundTrip::wire0, true, false, false, 8);
        checkGrouped(AccountQueryResponseMessage::new, RoundTrip::wire1, true, false, false, 8);
        checkGrouped(AiqCanceledMessage::new, RoundTrip::wire2, true, false, false, 8);
        checkGrouped(BrokenTradeMessage::new, RoundTrip::wire3, true, false, false, 8);
        checkGrouped(CancelOrderMessage::new, RoundTrip::wire4, true, false, false, 8);
        checkGrouped(CancelPendingMessage::new, RoundTrip::wire5, true, false, false, 8);
        checkGrouped(CancelRejectMessage::new, RoundTrip::wire6, true, false, false, 8);
        checkGrouped(CanceledMessage::new, RoundTrip::wire7, true, false, false, 8);
        checkGrouped(DebugPacket::new, RoundTrip::wire8, true, false, false, 1);
        checkGrouped(DisableOrderEntryRequestMessage::new, RoundTrip::wire9, true, true, false, 8);
        checkGrouped(DisableOrderEntryResponseMessage::new, RoundTrip::wire10, true, true, false, 8);
        checkGrouped(EnableOrderEntryRequestMessage::new, RoundTrip::wire11, true, true, false, 8);
        checkGrouped(EnableOrderEntryResponseMessage::new, RoundTrip::wire12, true, true, false, 8);
        checkGrouped(EnterOrderMessage::new, RoundTrip::wire13, true, true, false, 8);
        check(LoginAcceptedPacket::new);
        check(LoginRejectedPacket::new);
        check(LoginRequestPacket::new);
        checkGrouped(MassCancelRequestMessage::new, RoundTrip::wire14, true, true, false, 8);
        checkGrouped(MassCancelResponseMessage::new, RoundTrip::wire15, true, true, false, 8);
        checkGrouped(ModifyOrderMessage::new, RoundTrip::wire16, true, false, false, 8);
        checkGrouped(OrderAcceptedMessage::new, RoundTrip::wire17, true, true, false, 8);
        checkGrouped(OrderExecutedMessage::new, RoundTrip::wire18, true, true, false, 8);
        checkGrouped(OrderModifiedMessage::new, RoundTrip::wire19, true, false, false, 8);
        checkGrouped(OrderPriorityUpdateMessage::new, RoundTrip::wire20, true, false, false, 8);
        checkGrouped(OrderRestatedMessage::new, RoundTrip::wire21, true, true, false, 8);
        checkGrouped(RejectedOrderMessage::new, RoundTrip::wire22, true, false, false, 8);
        checkGrouped(ReplaceOrderMessage::new, RoundTrip::wire23, true, true, false, 8);
        checkGrouped(ReplacedMessage::new, RoundTrip::wire24, true, true, false, 8);
        checkGrouped(SequencedDataPacket::new, RoundTrip::wire25, true, false, false, 8);
        check(SystemEventMessage::new);
        checkGrouped(UnsequencedDataPacket::new, RoundTrip::wire26, true, false, false, 8);
        check(ClientHeartbeat::new);
        check(LogoutRequest::new);
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

    private static void checkGrouped(Supplier<Message> create, Wire wire, boolean variable, boolean bounded, boolean counted, int builds) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        Random random = new Random(name.hashCode());

        for (int delta : new int[] { 0, 3, -1 }) {
            blockDelta = delta;
            for (int entries : new int[] { 0, 1, 3 }) {
                String label = name + " with " + entries + " entries, block " + blockDelta;
                byte[] bytes = wire.build(random, entries, entries);
                int offset = 1 + random.nextInt(7);
                byte[] shifted = new byte[offset + bytes.length + 3];
                random.nextBytes(shifted);
                System.arraycopy(bytes, 0, shifted, offset, bytes.length);

                expect(label + " decodes", message.parseFrom(shifted, offset, offset + bytes.length) && message.isDecoded());
                expect(label + " has its length", message.byteLength() == bytes.length);
                expect(label + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
                expect(label + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
                Arrays.fill(shifted, (byte) 0x5A);
                expect(label + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

                Message again = create.get();
                again.parseFrom(bytes, 0);
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
        if (entries > 0) {
            ByteArrayOutputStream outer0 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer1 = wire;
                wire = new ByteArrayOutputStream();
                int pick0 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick0], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick0]);
                byte[] measured1 = wire.toByteArray();
                wire = outer1;
                count(wire, measured1.length + 1L - 1L, 1, false);
                wire.writeBytes(measured1);
            }
            byte[] measured0 = wire.toByteArray();
            wire = outer0;
            count(wire, measured0.length - 0L, 2, false);
            wire.writeBytes(measured0);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer2 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer3 = wire;
                wire = new ByteArrayOutputStream();
                int pick1 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick1], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick1]);
                byte[] measured3 = wire.toByteArray();
                wire = outer3;
                count(wire, measured3.length + 1L - 1L, 1, false);
                wire.writeBytes(measured3);
            }
            byte[] measured2 = wire.toByteArray();
            wire = outer2;
            count(wire, measured2.length - 0L, 2, false);
            wire.writeBytes(measured2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        if (entries > 0) {
            ByteArrayOutputStream outer4 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer5 = wire;
                wire = new ByteArrayOutputStream();
                int pick2 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick2], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick2]);
                byte[] measured5 = wire.toByteArray();
                wire = outer5;
                count(wire, measured5.length + 1L - 1L, 1, false);
                wire.writeBytes(measured5);
            }
            byte[] measured4 = wire.toByteArray();
            wire = outer4;
            count(wire, measured4.length - 0L, 2, false);
            wire.writeBytes(measured4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 14);
        if (entries > 0) {
            ByteArrayOutputStream outer6 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer7 = wire;
                wire = new ByteArrayOutputStream();
                int pick3 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick3], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick3]);
                byte[] measured7 = wire.toByteArray();
                wire = outer7;
                count(wire, measured7.length + 1L - 1L, 1, false);
                wire.writeBytes(measured7);
            }
            byte[] measured6 = wire.toByteArray();
            wire = outer6;
            count(wire, measured6.length - 0L, 2, false);
            wire.writeBytes(measured6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer8 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer9 = wire;
                wire = new ByteArrayOutputStream();
                int pick4 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick4], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick4]);
                byte[] measured9 = wire.toByteArray();
                wire = outer9;
                count(wire, measured9.length + 1L - 1L, 1, false);
                wire.writeBytes(measured9);
            }
            byte[] measured8 = wire.toByteArray();
            wire = outer8;
            count(wire, measured8.length - 0L, 2, false);
            wire.writeBytes(measured8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer10 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer11 = wire;
                wire = new ByteArrayOutputStream();
                int pick5 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick5], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick5]);
                byte[] measured11 = wire.toByteArray();
                wire = outer11;
                count(wire, measured11.length + 1L - 1L, 1, false);
                wire.writeBytes(measured11);
            }
            byte[] measured10 = wire.toByteArray();
            wire = outer10;
            count(wire, measured10.length - 0L, 2, false);
            wire.writeBytes(measured10);
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer12 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer13 = wire;
                wire = new ByteArrayOutputStream();
                int pick6 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick6], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick6]);
                byte[] measured13 = wire.toByteArray();
                wire = outer13;
                count(wire, measured13.length + 1L - 1L, 1, false);
                wire.writeBytes(measured13);
            }
            byte[] measured12 = wire.toByteArray();
            wire = outer12;
            count(wire, measured12.length - 0L, 2, false);
            wire.writeBytes(measured12);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        if (entries > 0) {
            ByteArrayOutputStream outer14 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer15 = wire;
                wire = new ByteArrayOutputStream();
                int pick7 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick7], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick7]);
                byte[] measured15 = wire.toByteArray();
                wire = outer15;
                count(wire, measured15.length + 1L - 1L, 1, false);
                wire.writeBytes(measured15);
            }
            byte[] measured14 = wire.toByteArray();
            wire = outer14;
            count(wire, measured14.length - 0L, 2, false);
            wire.writeBytes(measured14);
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        ByteArrayOutputStream outer16 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer17 = wire;
            wire = new ByteArrayOutputStream();
            int pick8 = random.nextInt(2);
            count(wire, new long[] { 28L, 0L }[pick8], 1, false);
            random(wire, random, new int[] { 1, 3 }[pick8]);
            byte[] measured17 = wire.toByteArray();
            wire = outer17;
            count(wire, measured17.length + 1L - 1L, 1, false);
            wire.writeBytes(measured17);
        }
        byte[] measured16 = wire.toByteArray();
        wire = outer16;
        count(wire, measured16.length - 0L, 2, false);
        wire.writeBytes(measured16);
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        ByteArrayOutputStream outer18 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer19 = wire;
            wire = new ByteArrayOutputStream();
            int pick9 = random.nextInt(2);
            count(wire, new long[] { 28L, 0L }[pick9], 1, false);
            random(wire, random, new int[] { 1, 3 }[pick9]);
            byte[] measured19 = wire.toByteArray();
            wire = outer19;
            count(wire, measured19.length + 1L - 1L, 1, false);
            wire.writeBytes(measured19);
        }
        byte[] measured18 = wire.toByteArray();
        wire = outer18;
        count(wire, measured18.length - 0L, 2, false);
        wire.writeBytes(measured18);
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        ByteArrayOutputStream outer20 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer21 = wire;
            wire = new ByteArrayOutputStream();
            int pick10 = random.nextInt(2);
            count(wire, new long[] { 28L, 0L }[pick10], 1, false);
            random(wire, random, new int[] { 1, 3 }[pick10]);
            byte[] measured21 = wire.toByteArray();
            wire = outer21;
            count(wire, measured21.length + 1L - 1L, 1, false);
            wire.writeBytes(measured21);
        }
        byte[] measured20 = wire.toByteArray();
        wire = outer20;
        count(wire, measured20.length - 0L, 2, false);
        wire.writeBytes(measured20);
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        ByteArrayOutputStream outer22 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer23 = wire;
            wire = new ByteArrayOutputStream();
            int pick11 = random.nextInt(2);
            count(wire, new long[] { 28L, 0L }[pick11], 1, false);
            random(wire, random, new int[] { 1, 3 }[pick11]);
            byte[] measured23 = wire.toByteArray();
            wire = outer23;
            count(wire, measured23.length + 1L - 1L, 1, false);
            wire.writeBytes(measured23);
        }
        byte[] measured22 = wire.toByteArray();
        wire = outer22;
        count(wire, measured22.length - 0L, 2, false);
        wire.writeBytes(measured22);
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 14);
        ByteArrayOutputStream outer24 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer25 = wire;
            wire = new ByteArrayOutputStream();
            int pick12 = random.nextInt(21);
            count(wire, new long[] { 2L, 3L, 4L, 5L, 6L, 7L, 9L, 10L, 11L, 12L, 13L, 15L, 16L, 17L, 24L, 25L, 26L, 28L, 29L, 30L, 0L }[pick12], 1, false);
            random(wire, random, new int[] { 4, 4, 1, 4, 1, 4, 8, 1, 4, 1, 4, 4, 1, 1, 2, 1, 4, 1, 1, 2, 3 }[pick12]);
            byte[] measured25 = wire.toByteArray();
            wire = outer25;
            count(wire, measured25.length + 1L - 1L, 1, false);
            wire.writeBytes(measured25);
        }
        byte[] measured24 = wire.toByteArray();
        wire = outer24;
        count(wire, measured24.length - 0L, 2, false);
        wire.writeBytes(measured24);
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        ByteArrayOutputStream outer26 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer27 = wire;
            wire = new ByteArrayOutputStream();
            int pick13 = random.nextInt(4);
            count(wire, new long[] { 27L, 24L, 28L, 0L }[pick13], 1, false);
            random(wire, random, new int[] { 1, 2, 1, 3 }[pick13]);
            byte[] measured27 = wire.toByteArray();
            wire = outer27;
            count(wire, measured27.length + 1L - 1L, 1, false);
            wire.writeBytes(measured27);
        }
        byte[] measured26 = wire.toByteArray();
        wire = outer26;
        count(wire, measured26.length - 0L, 2, false);
        wire.writeBytes(measured26);
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        ByteArrayOutputStream outer28 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer29 = wire;
            wire = new ByteArrayOutputStream();
            int pick14 = random.nextInt(4);
            count(wire, new long[] { 27L, 24L, 28L, 0L }[pick14], 1, false);
            random(wire, random, new int[] { 1, 2, 1, 3 }[pick14]);
            byte[] measured29 = wire.toByteArray();
            wire = outer29;
            count(wire, measured29.length + 1L - 1L, 1, false);
            wire.writeBytes(measured29);
        }
        byte[] measured28 = wire.toByteArray();
        wire = outer28;
        count(wire, measured28.length - 0L, 2, false);
        wire.writeBytes(measured28);
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer30 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer31 = wire;
                wire = new ByteArrayOutputStream();
                int pick15 = random.nextInt(4);
                count(wire, new long[] { 28L, 25L, 26L, 0L }[pick15], 1, false);
                random(wire, random, new int[] { 1, 1, 4, 3 }[pick15]);
                byte[] measured31 = wire.toByteArray();
                wire = outer31;
                count(wire, measured31.length + 1L - 1L, 1, false);
                wire.writeBytes(measured31);
            }
            byte[] measured30 = wire.toByteArray();
            wire = outer30;
            count(wire, measured30.length - 0L, 2, false);
            wire.writeBytes(measured30);
        }
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 14);
        ByteArrayOutputStream outer32 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer33 = wire;
            wire = new ByteArrayOutputStream();
            int pick16 = random.nextInt(22);
            count(wire, new long[] { 2L, 3L, 4L, 5L, 6L, 7L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 24L, 25L, 28L, 29L, 30L, 0L }[pick16], 1, false);
            random(wire, random, new int[] { 4, 4, 1, 4, 1, 4, 8, 1, 4, 1, 4, 4, 4, 1, 1, 1, 2, 1, 1, 1, 2, 3 }[pick16]);
            byte[] measured33 = wire.toByteArray();
            wire = outer33;
            count(wire, measured33.length + 1L - 1L, 1, false);
            wire.writeBytes(measured33);
        }
        byte[] measured32 = wire.toByteArray();
        wire = outer32;
        count(wire, measured32.length - 0L, 2, false);
        wire.writeBytes(measured32);
        return wire.toByteArray();
    }

    private static byte[] wire18(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        ByteArrayOutputStream outer34 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer35 = wire;
            wire = new ByteArrayOutputStream();
            int pick17 = random.nextInt(2);
            count(wire, new long[] { 28L, 0L }[pick17], 1, false);
            random(wire, random, new int[] { 1, 3 }[pick17]);
            byte[] measured35 = wire.toByteArray();
            wire = outer35;
            count(wire, measured35.length + 1L - 1L, 1, false);
            wire.writeBytes(measured35);
        }
        byte[] measured34 = wire.toByteArray();
        wire = outer34;
        count(wire, measured34.length - 0L, 2, false);
        wire.writeBytes(measured34);
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        if (entries > 0) {
            ByteArrayOutputStream outer36 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer37 = wire;
                wire = new ByteArrayOutputStream();
                int pick18 = random.nextInt(4);
                count(wire, new long[] { 28L, 25L, 26L, 0L }[pick18], 1, false);
                random(wire, random, new int[] { 1, 1, 4, 3 }[pick18]);
                byte[] measured37 = wire.toByteArray();
                wire = outer37;
                count(wire, measured37.length + 1L - 1L, 1, false);
                wire.writeBytes(measured37);
            }
            byte[] measured36 = wire.toByteArray();
            wire = outer36;
            count(wire, measured36.length - 0L, 2, false);
            wire.writeBytes(measured36);
        }
        return wire.toByteArray();
    }

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        if (entries > 0) {
            ByteArrayOutputStream outer38 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer39 = wire;
                wire = new ByteArrayOutputStream();
                int pick19 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick19], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick19]);
                byte[] measured39 = wire.toByteArray();
                wire = outer39;
                count(wire, measured39.length + 1L - 1L, 1, false);
                wire.writeBytes(measured39);
            }
            byte[] measured38 = wire.toByteArray();
            wire = outer38;
            count(wire, measured38.length - 0L, 2, false);
            wire.writeBytes(measured38);
        }
        return wire.toByteArray();
    }

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        ByteArrayOutputStream outer40 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer41 = wire;
            wire = new ByteArrayOutputStream();
            int pick20 = random.nextInt(5);
            count(wire, new long[] { 22L, 23L, 1L, 28L, 0L }[pick20], 1, false);
            random(wire, random, new int[] { 4, 8, 8, 1, 3 }[pick20]);
            byte[] measured41 = wire.toByteArray();
            wire = outer41;
            count(wire, measured41.length + 1L - 1L, 1, false);
            wire.writeBytes(measured41);
        }
        byte[] measured40 = wire.toByteArray();
        wire = outer40;
        count(wire, measured40.length - 0L, 2, false);
        wire.writeBytes(measured40);
        return wire.toByteArray();
    }

    private static byte[] wire22(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 14);
        if (entries > 0) {
            ByteArrayOutputStream outer42 = wire;
            wire = new ByteArrayOutputStream();
            for (int entry0 = 0; entry0 < entries; entry0++) {
                ByteArrayOutputStream outer43 = wire;
                wire = new ByteArrayOutputStream();
                int pick21 = random.nextInt(2);
                count(wire, new long[] { 28L, 0L }[pick21], 1, false);
                random(wire, random, new int[] { 1, 3 }[pick21]);
                byte[] measured43 = wire.toByteArray();
                wire = outer43;
                count(wire, measured43.length + 1L - 1L, 1, false);
                wire.writeBytes(measured43);
            }
            byte[] measured42 = wire.toByteArray();
            wire = outer42;
            count(wire, measured42.length - 0L, 2, false);
            wire.writeBytes(measured42);
        }
        return wire.toByteArray();
    }

    private static byte[] wire23(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 14);
        ByteArrayOutputStream outer44 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer45 = wire;
            wire = new ByteArrayOutputStream();
            int pick22 = random.nextInt(19);
            count(wire, new long[] { 3L, 5L, 6L, 12L, 15L, 16L, 17L, 13L, 7L, 9L, 10L, 11L, 25L, 26L, 28L, 27L, 29L, 30L, 0L }[pick22], 1, false);
            random(wire, random, new int[] { 4, 4, 1, 1, 4, 1, 1, 4, 4, 8, 1, 4, 1, 4, 1, 1, 1, 2, 3 }[pick22]);
            byte[] measured45 = wire.toByteArray();
            wire = outer45;
            count(wire, measured45.length + 1L - 1L, 1, false);
            wire.writeBytes(measured45);
        }
        byte[] measured44 = wire.toByteArray();
        wire = outer44;
        count(wire, measured44.length - 0L, 2, false);
        wire.writeBytes(measured44);
        return wire.toByteArray();
    }

    private static byte[] wire24(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 14);
        ByteArrayOutputStream outer46 = wire;
        wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer47 = wire;
            wire = new ByteArrayOutputStream();
            int pick23 = random.nextInt(13);
            count(wire, new long[] { 2L, 3L, 5L, 6L, 12L, 15L, 16L, 17L, 18L, 28L, 29L, 30L, 0L }[pick23], 1, false);
            random(wire, random, new int[] { 4, 4, 4, 1, 1, 4, 1, 1, 1, 1, 1, 2, 3 }[pick23]);
            byte[] measured47 = wire.toByteArray();
            wire = outer47;
            count(wire, measured47.length + 1L - 1L, 1, false);
            wire.writeBytes(measured47);
        }
        byte[] measured46 = wire.toByteArray();
        wire = outer46;
        count(wire, measured46.length - 0L, 2, false);
        wire.writeBytes(measured46);
        return wire.toByteArray();
    }

    private static byte[] wire25(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick24 = random.nextInt(18);
        ByteArrayOutputStream outer48 = wire;
        wire = new ByteArrayOutputStream();
        if (pick24 == 0) {
            random(wire, random, 9);
        } else if (pick24 == 1) {
            wire.writeBytes(wire17(random, entries, entries));
        } else if (pick24 == 2) {
            wire.writeBytes(wire24(random, entries, entries));
        } else if (pick24 == 3) {
            wire.writeBytes(wire7(random, entries, entries));
        } else if (pick24 == 4) {
            wire.writeBytes(wire2(random, entries, entries));
        } else if (pick24 == 5) {
            wire.writeBytes(wire18(random, entries, entries));
        } else if (pick24 == 6) {
            wire.writeBytes(wire3(random, entries, entries));
        } else if (pick24 == 7) {
            wire.writeBytes(wire22(random, entries, entries));
        } else if (pick24 == 8) {
            wire.writeBytes(wire5(random, entries, entries));
        } else if (pick24 == 9) {
            wire.writeBytes(wire6(random, entries, entries));
        } else if (pick24 == 10) {
            wire.writeBytes(wire20(random, entries, entries));
        } else if (pick24 == 11) {
            wire.writeBytes(wire19(random, entries, entries));
        } else if (pick24 == 12) {
            wire.writeBytes(wire21(random, entries, entries));
        } else if (pick24 == 13) {
            wire.writeBytes(wire1(random, entries, entries));
        } else if (pick24 == 14) {
            wire.writeBytes(wire15(random, entries, entries));
        } else if (pick24 == 15) {
            wire.writeBytes(wire10(random, entries, entries));
        } else if (pick24 == 16) {
            wire.writeBytes(wire12(random, entries, entries));
        } else {
            random(wire, random, 3);
        }
        byte[] measured48 = wire.toByteArray();
        wire = outer48;
        count(wire, new long[] { 83L, 65L, 85L, 67L, 68L, 69L, 66L, 74L, 80L, 73L, 84L, 77L, 82L, 81L, 88L, 71L, 75L, 32L }[pick24], 1, false);
        wire.writeBytes(measured48);
        return wire.toByteArray();
    }

    private static byte[] wire26(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick25 = random.nextInt(9);
        ByteArrayOutputStream outer49 = wire;
        wire = new ByteArrayOutputStream();
        if (pick25 == 0) {
            wire.writeBytes(wire13(random, entries, entries));
        } else if (pick25 == 1) {
            wire.writeBytes(wire23(random, entries, entries));
        } else if (pick25 == 2) {
            wire.writeBytes(wire4(random, entries, entries));
        } else if (pick25 == 3) {
            wire.writeBytes(wire16(random, entries, entries));
        } else if (pick25 == 4) {
            wire.writeBytes(wire0(random, entries, entries));
        } else if (pick25 == 5) {
            wire.writeBytes(wire14(random, entries, entries));
        } else if (pick25 == 6) {
            wire.writeBytes(wire9(random, entries, entries));
        } else if (pick25 == 7) {
            wire.writeBytes(wire11(random, entries, entries));
        } else {
            random(wire, random, 3);
        }
        byte[] measured49 = wire.toByteArray();
        wire = outer49;
        count(wire, new long[] { 79L, 85L, 88L, 77L, 81L, 67L, 68L, 69L, 32L }[pick25], 1, false);
        wire.writeBytes(measured49);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
