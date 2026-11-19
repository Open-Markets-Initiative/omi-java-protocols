package omi.iex.iexoptions.binaryorderentry.sbe.v1_02;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.ApplicationLayerRejectMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.BulkQuoteAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.ClientHeartbeatMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.ExecutionReportMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.GatewayHeartbeatMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.InstrumentRefDataMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.LoginRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.LoginResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.LogoutRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.MarketMakerSymbolAppointmentMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.MassCancelAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.MassCancelRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.MpidConfigurationAcknowledgementMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.NewBulkQuoteMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.NewIocQuoteAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.NewOrderSingleMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderCancelAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderCancelReplaceRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderCancelRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.PurgeAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.PurgeRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.QuoteCanceledMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.QuoteRestatedMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskActionRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskControlAcknowledgmentMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskControlAlertMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskLimitUpdateRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SequencedMessageHeaderMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SessionConfigurationAcknowledgementMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SubsessionJoinMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SubsessionJoinResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SubsessionLeaveMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.SubsessionLeaveResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.TerminateMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.TradeBustCorrectMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.UnderlyingRefDataMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.UnsolicitedModifyAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ApplicationLayerRejectMessage::new);
        checkGrouped(BulkQuoteAckMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(ExecutionReportMessage::new);
        checkGrouped(GatewayHeartbeatMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(InstrumentRefDataMessage::new);
        check(LoginRequestMessage::new);
        check(LoginResponseMessage::new);
        check(MarketMakerSymbolAppointmentMessage::new);
        check(MassCancelAckMessage::new);
        check(MassCancelRequestMessage::new);
        check(MpidConfigurationAcknowledgementMessage::new);
        checkGrouped(NewBulkQuoteMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(NewIocQuoteAckMessage::new);
        check(NewOrderSingleMessage::new);
        check(OrderAckMessage::new);
        check(OrderCancelAckMessage::new);
        check(OrderCancelReplaceRequestMessage::new);
        check(OrderCancelRequestMessage::new);
        checkGrouped(PurgeAckMessage::new, RoundTrip::wire3, true, true, true, 1, 0);
        checkGrouped(PurgeRequestMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(QuoteCanceledMessage::new);
        check(QuoteRestatedMessage::new);
        check(RiskActionRequestMessage::new);
        check(RiskControlAcknowledgmentMessage::new);
        check(RiskControlAlertMessage::new);
        check(RiskLimitUpdateRequestMessage::new);
        check(SequencedMessageHeaderMessage::new);
        check(SessionConfigurationAcknowledgementMessage::new);
        check(SubsessionJoinMessage::new);
        check(SubsessionJoinResponseMessage::new);
        check(SubsessionLeaveMessage::new);
        check(SubsessionLeaveResponseMessage::new);
        check(TerminateMessage::new);
        check(TradeBustCorrectMessage::new);
        check(UnderlyingRefDataMessage::new);
        check(UnsolicitedModifyAckMessage::new);
        check(ClientHeartbeatMessage::new);
        check(LogoutRequestMessage::new);

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
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 3);
        random(wire, random, 1);
        count(wire, 23L + delta(23), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 23 + delta(23));
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        count(wire, 14L + delta(14), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 14 + delta(14));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 1);
        count(wire, 15L + delta(15), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 15 + delta(15));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 2L + delta(2), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 2L + delta(2), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
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
