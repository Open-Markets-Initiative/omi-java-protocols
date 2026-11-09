package omi.coinbase.deribit.ordersapi.sbe.v0_1;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.GapFillMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.HeartbeatMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LoggedOutMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogonConfMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogonMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogoutMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteCancelRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteMmpTriggeredMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteMmpUnfrozenMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteOrdersPlacedMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrderFilledMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrderPlacedMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersCanceledMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersMmpTriggeredMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersMmpUnfrozenMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.RejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.ResendRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.TestRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AmendOrderRejectMessage::new, RoundTrip::wire0, true, true, true, 1);
        check(AmendOrderRequestMessage::new);
        checkGrouped(AmendOrderResponseMessage::new, RoundTrip::wire1, true, true, true, 1);
        checkGrouped(CancelOrderRejectMessage::new, RoundTrip::wire2, true, true, true, 1);
        check(CancelOrderRequestMessage::new);
        check(CancelOrderResponseMessage::new);
        check(GapFillMessage::new);
        check(HeartbeatMessage::new);
        checkGrouped(LoggedOutMessage::new, RoundTrip::wire3, true, true, true, 1);
        check(LogonConfMessage::new);
        check(LogonMessage::new);
        checkGrouped(LogoutMessage::new, RoundTrip::wire4, true, true, true, 1);
        checkGrouped(MassCancelRejectMessage::new, RoundTrip::wire5, true, true, true, 1);
        check(MassCancelRequestMessage::new);
        check(MassCancelResponseMessage::new);
        check(MassQuoteCancelRequestMessage::new);
        check(MassQuoteMmpTriggeredMessage::new);
        check(MassQuoteMmpUnfrozenMessage::new);
        checkGrouped(MassQuoteOrdersPlacedMessage::new, RoundTrip::wire6, true, true, true, 1);
        checkGrouped(MassQuoteRejectMessage::new, RoundTrip::wire7, true, true, true, 1);
        checkGrouped(MassQuoteRequestMessage::new, RoundTrip::wire8, true, true, true, 1);
        checkGrouped(MassQuoteResponseMessage::new, RoundTrip::wire9, true, true, true, 1);
        checkGrouped(NewOrderRejectMessage::new, RoundTrip::wire10, true, true, true, 1);
        check(NewOrderRequestMessage::new);
        checkGrouped(NewOrderResponseMessage::new, RoundTrip::wire11, true, true, true, 1);
        checkGrouped(OrderFilledMessage::new, RoundTrip::wire12, true, true, true, 1);
        checkGrouped(OrderPlacedMessage::new, RoundTrip::wire13, true, true, true, 1);
        checkGrouped(OrdersCanceledMessage::new, RoundTrip::wire14, true, true, true, 1);
        check(OrdersMmpTriggeredMessage::new);
        check(OrdersMmpUnfrozenMessage::new);
        checkGrouped(RejectMessage::new, RoundTrip::wire15, true, true, true, 1);
        check(ResendRequestMessage::new);
        check(TestRequestMessage::new);

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
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 25L + delta(25), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 25 + delta(25));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 62L + delta(62), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 62 + delta(62));
        }
        count(wire, 33L + delta(33), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 46L + delta(46), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 46 + delta(46));
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 80L + delta(80), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 80 + delta(80));
        }
        count(wire, 33L + delta(33), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        count(wire, 33L + delta(33), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 25L + delta(25), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 25 + delta(25));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 60L + delta(60), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 60 + delta(60));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 25L + delta(25), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 25 + delta(25));
        }
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 35L + delta(35), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 35 + delta(35));
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
