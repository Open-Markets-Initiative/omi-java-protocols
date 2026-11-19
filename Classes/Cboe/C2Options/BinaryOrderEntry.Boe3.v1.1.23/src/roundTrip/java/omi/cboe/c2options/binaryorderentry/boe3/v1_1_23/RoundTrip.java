package omi.cboe.c2options.binaryorderentry.boe3.v1_1_23;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.CancelOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.CancelRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.CarriedRestatementMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.DoneForDayMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.ModifyOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.ModifyRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentAcceptedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderV2Message;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderAcknowledgementMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderCancelledMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderExecutionMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderModifiedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.OrderRestatedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeAcknowledgementMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeNotificationMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeOrdersV2Message;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteCancelledMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteExecutionMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteRestatedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateAcknowledgementMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.ResetRiskAcknowledgementMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.ResetRiskMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application.TradeCancelCorrectMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.ClientHeartbeat;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.LoginRequestMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.LoginResponseMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.LogoutRequest;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.LogoutResponseMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.ReplayComplete;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.session.ServerHeartbeat;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(CancelOrderMessage::new);
        check(CancelRejectedMessage::new);
        check(CarriedRestatementMessage::new);
        check(DoneForDayMessage::new);
        checkGrouped(LoginRequestMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(LoginResponseMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(LogoutResponseMessage::new);
        check(MassCancelAcknowledgmentMessage::new);
        check(MassCancelOrderMessage::new);
        check(MassCancelRejectedMessage::new);
        check(ModifyOrderMessage::new);
        check(ModifyRejectedMessage::new);
        checkGrouped(NewComplexInstrumentAcceptedMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(NewComplexInstrumentMessage::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(NewComplexInstrumentRejectedMessage::new);
        checkGrouped(NewComplexOrderMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        checkGrouped(NewComplexOrderShortMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(NewComplexOrderV2Message::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(NewOrderMessage::new);
        check(NewOrderShortMessage::new);
        check(OrderAcknowledgementMessage::new);
        check(OrderCancelledMessage::new);
        check(OrderExecutionMessage::new);
        check(OrderModifiedMessage::new);
        check(OrderRejectedMessage::new);
        check(OrderRestatedMessage::new);
        check(PurgeAcknowledgementMessage::new);
        check(PurgeNotificationMessage::new);
        checkGrouped(PurgeOrdersV2Message::new, RoundTrip::wire7, true, true, true, 1, 0);
        check(PurgeRejectedMessage::new);
        check(QuoteCancelledMessage::new);
        check(QuoteExecutionMessage::new);
        check(QuoteRestatedMessage::new);
        checkGrouped(QuoteUpdateAcknowledgementMessage::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(QuoteUpdateMessage::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(QuoteUpdateRejectedMessage::new);
        checkGrouped(QuoteUpdateShortMessage::new, RoundTrip::wire10, true, true, true, 1, 0);
        check(ResetRiskAcknowledgementMessage::new);
        check(ResetRiskMessage::new);
        check(TradeCancelCorrectMessage::new);
        check(LogoutRequest::new);
        check(ClientHeartbeat::new);
        check(ReplayComplete::new);
        check(ServerHeartbeat::new);

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
        random(wire, random, 1);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
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

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 8);
            random(wire, random, 2);
            random(wire, random, 4);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 8);
            random(wire, random, 2);
            random(wire, random, 4);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 16);
        random(wire, random, 8);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 2);
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
