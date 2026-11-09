package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.AllocationInstructionMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.AllocationReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.BusinessMessageRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.EstablishAckMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.EstablishMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.EstablishRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportCancelMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportForwardMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportModifyMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportNewMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.ExecutionReportTradeMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NegotiateMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NegotiateRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NegotiateResponseMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NewOrderCrossMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NewOrderSingleMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.NotAppliedMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.OrderCancelReplaceRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.OrderCancelRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.OrderMassActionReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.OrderMassActionRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.PositionMaintenanceCancelRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.PositionMaintenanceReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.PositionMaintenanceRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.QuoteCancelMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.QuoteMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.QuoteRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.QuoteRequestRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.QuoteStatusReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.RetransmissionMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.RetransmitRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.RetransmitRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.SecurityDefinitionRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.SecurityDefinitionResponseMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.SequenceMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.SimpleModifyOrderMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.SimpleNewOrderMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application.TerminateMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AllocationInstructionMessage::new, RoundTrip::wire0, true, true, true, 1);
        check(AllocationReportMessage::new);
        checkGrouped(BusinessMessageRejectMessage::new, RoundTrip::wire1, true, true, true, 1);
        check(EstablishAckMessage::new);
        checkGrouped(EstablishMessage::new, RoundTrip::wire2, true, true, true, 1);
        check(EstablishRejectMessage::new);
        checkGrouped(ExecutionReportCancelMessage::new, RoundTrip::wire3, true, true, true, 1);
        checkGrouped(ExecutionReportForwardMessage::new, RoundTrip::wire4, true, true, true, 1);
        checkGrouped(ExecutionReportModifyMessage::new, RoundTrip::wire5, true, true, true, 1);
        checkGrouped(ExecutionReportNewMessage::new, RoundTrip::wire6, true, true, true, 1);
        checkGrouped(ExecutionReportRejectMessage::new, RoundTrip::wire7, true, true, true, 1);
        checkGrouped(ExecutionReportTradeMessage::new, RoundTrip::wire8, true, true, true, 1);
        checkGrouped(NegotiateMessage::new, RoundTrip::wire9, true, true, true, 1);
        check(NegotiateRejectMessage::new);
        check(NegotiateResponseMessage::new);
        checkGrouped(NewOrderCrossMessage::new, RoundTrip::wire10, true, true, true, 1);
        checkGrouped(NewOrderSingleMessage::new, RoundTrip::wire11, true, true, true, 1);
        check(NotAppliedMessage::new);
        checkGrouped(OrderCancelReplaceRequestMessage::new, RoundTrip::wire12, true, true, true, 1);
        checkGrouped(OrderCancelRequestMessage::new, RoundTrip::wire13, true, true, true, 1);
        checkGrouped(OrderMassActionReportMessage::new, RoundTrip::wire14, true, true, true, 1);
        check(OrderMassActionRequestMessage::new);
        check(PositionMaintenanceCancelRequestMessage::new);
        checkGrouped(PositionMaintenanceReportMessage::new, RoundTrip::wire15, true, true, true, 1);
        checkGrouped(PositionMaintenanceRequestMessage::new, RoundTrip::wire16, true, true, true, 1);
        checkGrouped(QuoteCancelMessage::new, RoundTrip::wire17, true, true, true, 1);
        checkGrouped(QuoteMessage::new, RoundTrip::wire18, true, true, true, 1);
        checkGrouped(QuoteRequestMessage::new, RoundTrip::wire19, true, true, true, 1);
        checkGrouped(QuoteRequestRejectMessage::new, RoundTrip::wire20, true, true, true, 1);
        checkGrouped(QuoteStatusReportMessage::new, RoundTrip::wire21, true, true, true, 1);
        check(RetransmissionMessage::new);
        check(RetransmitRejectMessage::new);
        check(RetransmitRequestMessage::new);
        checkGrouped(SecurityDefinitionRequestMessage::new, RoundTrip::wire22, true, true, true, 1);
        check(SecurityDefinitionResponseMessage::new);
        check(SequenceMessage::new);
        checkGrouped(SimpleModifyOrderMessage::new, RoundTrip::wire23, true, true, true, 1);
        checkGrouped(SimpleNewOrderMessage::new, RoundTrip::wire24, true, true, true, 1);
        check(TerminateMessage::new);

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
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 17L + delta(17), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 17 + delta(17));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 8);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire18(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 2);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 2);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire22(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 10);
        random(wire, random, 5);
        count(wire, 30L + delta(30), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 30 + delta(30));
        }
        return wire.toByteArray();
    }

    private static byte[] wire23(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire24(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
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
