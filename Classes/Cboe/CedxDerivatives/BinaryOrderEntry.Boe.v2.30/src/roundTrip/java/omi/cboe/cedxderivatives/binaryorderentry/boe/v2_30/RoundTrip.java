package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.CancelOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.CancelRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ClientHeartbeatMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ComplexInstrumentAcceptedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ComplexInstrumentRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.CrossOrderAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.CrossOrderCancelledMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.CrossOrderRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.LoginRequestV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.LoginResponseV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.LogoutMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.LogoutRequestMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ModifyOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.NewComplexInstrumentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.NewComplexOrderMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.NewOrderCrossMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.NewOrderCrossMultilegMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.NewOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderAcknowledgmentV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderCancelledV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderExecutionV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderModifiedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.OrderRestatedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.PurgeOrdersMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.PurgeRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteCancelledMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteExecutionMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteRestatedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteUpdateAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteUpdateMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ReplayCompleteMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ResetRiskAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ResetRiskMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.ServerHeartbeatMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCancelOrCorrectV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCaptureConfirmV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCaptureReportAcknowledgmentV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCaptureReportDeclineV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCaptureReportRejectV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.TradeCaptureReportV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application.UserModifyRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(CancelOrderV2Message::new, RoundTrip::wire0, true, true, false, 1, 0);
        checkGrouped(CancelRejectedV2Message::new, RoundTrip::wire1, true, true, false, 1, 0);
        checkGrouped(ComplexInstrumentAcceptedMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(ComplexInstrumentRejectedMessage::new, RoundTrip::wire3, true, true, false, 1, 0);
        checkGrouped(CrossOrderAcknowledgmentMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        checkGrouped(CrossOrderCancelledMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(CrossOrderRejectedMessage::new, RoundTrip::wire6, true, true, false, 1, 0);
        checkGrouped(LoginRequestV2Message::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(LoginResponseV2Message::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(LogoutMessage::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(MassCancelAcknowledgmentMessage::new);
        checkGrouped(ModifyOrderV2Message::new, RoundTrip::wire10, true, true, false, 1, 0);
        checkGrouped(NewComplexInstrumentMessage::new, RoundTrip::wire11, true, true, true, 1, 0);
        checkGrouped(NewComplexOrderMessage::new, RoundTrip::wire12, true, true, true, 1, 0);
        checkGrouped(NewOrderCrossMessage::new, RoundTrip::wire13, true, true, true, 1, 0);
        checkGrouped(NewOrderCrossMultilegMessage::new, RoundTrip::wire14, true, true, true, 1, 0);
        checkGrouped(NewOrderV2Message::new, RoundTrip::wire15, true, true, false, 1, 0);
        checkGrouped(OrderAcknowledgmentV2Message::new, RoundTrip::wire16, true, true, false, 1, 0);
        checkGrouped(OrderCancelledV2Message::new, RoundTrip::wire17, true, true, false, 1, 0);
        checkGrouped(OrderExecutionV2Message::new, RoundTrip::wire18, true, true, false, 1, 0);
        checkGrouped(OrderModifiedV2Message::new, RoundTrip::wire19, true, true, false, 1, 0);
        checkGrouped(OrderRejectedV2Message::new, RoundTrip::wire20, true, true, false, 1, 0);
        checkGrouped(OrderRestatedMessage::new, RoundTrip::wire21, true, true, false, 1, 0);
        checkGrouped(PurgeOrdersMessage::new, RoundTrip::wire22, true, true, true, 1, 0);
        checkGrouped(PurgeRejectedMessage::new, RoundTrip::wire23, true, true, false, 1, 0);
        check(QuoteCancelledMessage::new);
        check(QuoteExecutionMessage::new);
        check(QuoteRestatedMessage::new);
        checkGrouped(QuoteUpdateAcknowledgmentMessage::new, RoundTrip::wire24, true, true, true, 1, 0);
        checkGrouped(QuoteUpdateMessage::new, RoundTrip::wire25, true, true, true, 1, 0);
        check(QuoteUpdateRejectedMessage::new);
        check(ResetRiskAcknowledgmentMessage::new);
        check(ResetRiskMessage::new);
        checkGrouped(TradeCancelOrCorrectV2Message::new, RoundTrip::wire26, true, true, false, 1, 0);
        checkGrouped(TradeCaptureConfirmV2Message::new, RoundTrip::wire27, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportAcknowledgmentV2Message::new, RoundTrip::wire28, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportDeclineV2Message::new, RoundTrip::wire29, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportRejectV2Message::new, RoundTrip::wire30, true, true, true, 1, 0);
        checkGrouped(TradeCaptureReportV2Message::new, RoundTrip::wire31, true, true, false, 1, 0);
        checkGrouped(UserModifyRejectedV2Message::new, RoundTrip::wire32, true, true, false, 1, 0);
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
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
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
            count(wire, entries > 0 ? 4L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 131L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 20);
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
            random(wire, random, 4);
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

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
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
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
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

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 5L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 199L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 208L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 130L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 20);
            random(wire, random, 8);
            if (entries > 0) {
                random(wire, random, 1);
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
                random(wire, random, 1);
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
                random(wire, random, 1);
            }
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
            random(wire, random, 3);
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

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 5L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 199L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 212L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 130L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 20);
            random(wire, random, 8);
            if (entries > 0) {
                random(wire, random, 1);
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
                random(wire, random, 1);
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
                random(wire, random, 1);
            }
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
            random(wire, random, 3);
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
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 4L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 192L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 192L : 0L, 1, true);
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
            count(wire, entries > 0 ? 4L : 0L, 1, true);
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
            random(wire, random, 16);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
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

    private static byte[] wire8(Random random, int entries, long count) {
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

    private static byte[] wire9(Random random, int entries, long count) {
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

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 20);
        count(wire, entries > 0 ? 2L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 49L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 66L : 0L, 1, true);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        count(wire, entries > 0 ? 1L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 40L : 0L, 1, true);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
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

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, entries > 0 ? 8L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 135L : 0L, 1, true);
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
            count(wire, entries > 0 ? 248L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
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
            random(wire, random, 3);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 2);
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
            random(wire, random, 1);
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

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, entries > 0 ? 3L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 239L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 127L : 0L, 1, true);
        }
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 20);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
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
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 1);
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
                random(wire, random, 1);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 1);
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
            random(wire, random, 1);
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
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, entries > 0 ? 3L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 249L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 31L : 0L, 1, true);
        }
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 20);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
            if (entries > 0) {
                random(wire, random, 16);
            }
            if (entries > 0) {
                random(wire, random, 4);
            }
            if (entries > 0) {
                random(wire, random, 12);
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
                random(wire, random, 1);
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
                random(wire, random, 1);
            }
        }
        if (entries > 0) {
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, entries > 0 ? 9L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 119L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 161L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 152L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 248L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 66L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 31L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 176L : 0L, 1, true);
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
            random(wire, random, 4);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
        }
        if (entries > 0) {
            random(wire, random, 3);
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
            random(wire, random, 4);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 2);
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

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 17L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 12L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 20L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
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
            random(wire, random, 8);
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
            random(wire, random, 4);
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
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 17L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 12L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 4L : 0L, 1, true);
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
            random(wire, random, 1);
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
            random(wire, random, 16);
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
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
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
            random(wire, random, 8);
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
            random(wire, random, 4);
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

    private static byte[] wire18(Random random, int entries, long count) {
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
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 13L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 192L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 131L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 192L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 20);
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
            random(wire, random, 4);
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
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 17L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 12L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 20L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
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
            random(wire, random, 8);
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
            random(wire, random, 4);
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

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 17L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 12L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 5L : 0L, 1, true);
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
            random(wire, random, 1);
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
            random(wire, random, 16);
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
            random(wire, random, 3);
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
            random(wire, random, 4);
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
            random(wire, random, 4);
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

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 117L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 207L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 17L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 12L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 129L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 223L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 3);
        }
        if (entries > 0) {
            random(wire, random, 1);
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
            random(wire, random, 8);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 20);
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
            random(wire, random, 4);
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

    private static byte[] wire22(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        count(wire, entries > 0 ? 2L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        if (entries > 0) {
            random(wire, random, 6);
        }
        if (entries > 0) {
            random(wire, random, 20);
        }
        return wire.toByteArray();
    }

    private static byte[] wire23(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
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
            random(wire, random, 20);
        }
        return wire.toByteArray();
    }

    private static byte[] wire24(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 17);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire25(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire26(Random random, int entries, long count) {
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
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 40L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 129L : 0L, 1, true);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire27(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 65L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 146L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 142L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 8L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
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
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
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
            if (entries > 0) {
                random(wire, random, 1);
            }
            if (entries > 0) {
                random(wire, random, 2);
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
            random(wire, random, 1);
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
            random(wire, random, 4);
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

    private static byte[] wire28(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 144L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 2L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 24L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
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
        return wire.toByteArray();
    }

    private static byte[] wire29(Random random, int entries, long count) {
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
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
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
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
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
        return wire.toByteArray();
    }

    private static byte[] wire30(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 89L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 67L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 72L : 0L, 1, true);
        }
        if (entries > 0) {
            random(wire, random, 1);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 144L : 0L, 1, true);
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
            count(wire, entries > 0 ? 64L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 16L : 0L, 1, true);
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
            count(wire, entries > 0 ? 128L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 1L : 0L, 1, true);
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
        return wire.toByteArray();
    }

    private static byte[] wire31(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, entries > 0 ? 6L : 0L, 1, true);
        if (entries > 0) {
            count(wire, entries > 0 ? 25L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 255L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 38L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 119L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 6L : 0L, 1, true);
        }
        if (entries > 0) {
            count(wire, entries > 0 ? 7L : 0L, 1, true);
        }
        random(wire, random, 1);
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
            random(wire, random, 1);
        }
        if (entries > 0) {
            random(wire, random, 16);
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
            random(wire, random, 2);
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

    private static byte[] wire32(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 60);
        random(wire, random, 1);
        count(wire, entries > 0 ? 19L : 0L, 1, true);
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
