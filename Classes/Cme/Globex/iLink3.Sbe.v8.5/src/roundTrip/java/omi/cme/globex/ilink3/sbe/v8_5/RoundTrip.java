package omi.cme.globex.ilink3.sbe.v8_5;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.BusinessReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Establish;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.EstablishmentAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.EstablishmentReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportCancel;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportElimination;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportModify;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportNew;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportStatus;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumOutright;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumSpread;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumSpreadLeg;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeOutright;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeSpread;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeSpreadLeg;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.MassQuote;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.MassQuoteAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Negotiate;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NegotiationReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NegotiationResponse;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NewOrderCross;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NewOrderSingle;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NotApplied;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReplaceReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReplaceRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassActionReport;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassActionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassStatusRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderStatusRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsDefinitionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsDefinitionRequestAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsListReport;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsListRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.QuoteCancel;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.QuoteCancelAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RequestForQuote;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RequestForQuoteAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Retransmission;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RetransmitReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RetransmitRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.SecurityDefinitionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.SecurityDefinitionResponse;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Sequence;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Terminate;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BusinessReject::new);
        checkGrouped(Establish::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(EstablishmentAck::new);
        check(EstablishmentReject::new);
        check(ExecutionAck::new);
        check(ExecutionReportCancel::new);
        check(ExecutionReportElimination::new);
        check(ExecutionReportModify::new);
        check(ExecutionReportNew::new);
        check(ExecutionReportReject::new);
        check(ExecutionReportStatus::new);
        checkGrouped(ExecutionReportTradeAddendumOutright::new, RoundTrip::wire1, true, true, true, 1, 0);
        checkGrouped(ExecutionReportTradeAddendumSpread::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(ExecutionReportTradeAddendumSpreadLeg::new, RoundTrip::wire3, true, true, true, 1, 0);
        checkGrouped(ExecutionReportTradeOutright::new, RoundTrip::wire4, true, true, true, 1, 0);
        checkGrouped(ExecutionReportTradeSpread::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(ExecutionReportTradeSpreadLeg::new, RoundTrip::wire6, true, true, true, 1, 0);
        checkGrouped(MassQuote::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(MassQuoteAck::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(Negotiate::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(NegotiationReject::new);
        checkGrouped(NegotiationResponse::new, RoundTrip::wire10, true, true, true, 1, 0);
        checkGrouped(NewOrderCross::new, RoundTrip::wire11, true, true, true, 1, 0);
        check(NewOrderSingle::new);
        check(NotApplied::new);
        check(OrderCancelReject::new);
        check(OrderCancelReplaceReject::new);
        check(OrderCancelReplaceRequest::new);
        check(OrderCancelRequest::new);
        checkGrouped(OrderMassActionReport::new, RoundTrip::wire12, true, true, true, 1, 0);
        check(OrderMassActionRequest::new);
        check(OrderMassStatusRequest::new);
        check(OrderStatusRequest::new);
        checkGrouped(PartyDetailsDefinitionRequest::new, RoundTrip::wire13, true, true, true, 1, 0);
        checkGrouped(PartyDetailsDefinitionRequestAck::new, RoundTrip::wire14, true, true, true, 1, 0);
        checkGrouped(PartyDetailsListReport::new, RoundTrip::wire15, true, true, true, 1, 0);
        checkGrouped(PartyDetailsListRequest::new, RoundTrip::wire16, true, true, true, 1, 0);
        checkGrouped(QuoteCancel::new, RoundTrip::wire17, true, true, true, 1, 0);
        checkGrouped(QuoteCancelAck::new, RoundTrip::wire18, true, true, true, 1, 0);
        checkGrouped(RequestForQuote::new, RoundTrip::wire19, true, true, true, 1, 0);
        check(RequestForQuoteAck::new);
        check(Retransmission::new);
        check(RetransmitReject::new);
        check(RetransmitRequest::new);
        checkGrouped(SecurityDefinitionRequest::new, RoundTrip::wire20, true, true, true, 1, 0);
        checkGrouped(SecurityDefinitionResponse::new, RoundTrip::wire21, true, true, true, 1, 0);
        check(Sequence::new);
        check(Terminate::new);

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
        random(wire, random, 32);
        random(wire, random, 20);
        random(wire, random, 30);
        random(wire, random, 10);
        random(wire, random, 10);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 3);
        random(wire, random, 5);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 27L + delta(27), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 27 + delta(27));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 41L + delta(41), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 41 + delta(41));
        }
        count(wire, 27L + delta(27), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 27 + delta(27));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 27L + delta(27), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 27 + delta(27));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 23L + delta(23), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 23 + delta(23));
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 29L + delta(29), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 29 + delta(29));
        }
        count(wire, 23L + delta(23), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 23 + delta(23));
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 40);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        count(wire, 23L + delta(23), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 23 + delta(23));
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 30);
        count(wire, 38L + delta(38), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 38 + delta(38));
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 256);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, 11L + delta(11), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 11 + delta(11));
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 32);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 5);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 4);
        count(wire, 34L + delta(34), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 6);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 75);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
        }
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 75);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
        }
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
        }
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, 7L + delta(7), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 7 + delta(7));
        }
        count(wire, 11L + delta(11), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 11 + delta(11));
        }
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 10L + delta(10), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 10 + delta(10));
        }
        count(wire, 10L + delta(10), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 10 + delta(10));
        }
        return wire.toByteArray();
    }

    private static byte[] wire18(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 256);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 6);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 1);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        return wire.toByteArray();
    }

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 5);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, 19L + delta(19), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 19 + delta(19));
        }
        return wire.toByteArray();
    }

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 256);
        random(wire, random, 35);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 3);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 19L + delta(19), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 19 + delta(19));
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
