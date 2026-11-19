package omi.ice.icefutures.bgw.sbe.v7_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.CancelReplaceRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.CancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ErrorMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportCancelMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportModifyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportNewMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportRejectMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportSnapshotMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportTradeMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.HeartBeatMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.IpReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.IpRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogonReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogonRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogoutReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogoutRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.MassQuoteReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.MassQuoteRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderCrossReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderCrossRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewsMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.OrderMassCancelReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.OrderMassCancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteCancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ResendReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ResendRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRejectMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportProductMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportStrategyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestCreateFlexMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestCreateStrategyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SequenceResetMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SimpleOpenFramingHeaderMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogonReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogonRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogoutReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogoutRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(CancelReplaceRequestMessage::new);
        check(CancelRequestMessage::new);
        check(ErrorMessage::new);
        check(ExecutionReportCancelMessage::new);
        check(ExecutionReportModifyMessage::new);
        check(ExecutionReportNewMessage::new);
        check(ExecutionReportRejectMessage::new);
        check(ExecutionReportSnapshotMessage::new);
        check(ExecutionReportTradeMessage::new);
        checkGrouped(IpReportMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(IpRequestMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(LogonReportMessage::new);
        check(LogonRequestMessage::new);
        check(LogoutReportMessage::new);
        check(LogoutRequestMessage::new);
        checkGrouped(MassQuoteReportMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(MassQuoteRequestMessage::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(NewOrderCrossReportMessage::new);
        checkGrouped(NewOrderCrossRequestMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(NewOrderRequestMessage::new);
        checkGrouped(NewsMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        check(OrderMassCancelReportMessage::new);
        check(OrderMassCancelRequestMessage::new);
        checkGrouped(QuoteCancelRequestMessage::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(QuoteReportMessage::new);
        check(QuoteRequestMessage::new);
        check(ResendReportMessage::new);
        check(ResendRequestMessage::new);
        check(SecurityDefinitionRejectMessage::new);
        checkGrouped(SecurityDefinitionReportMessage::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(SecurityDefinitionReportProductMessage::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(SecurityDefinitionReportStrategyMessage::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(SecurityDefinitionRequestCreateFlexMessage::new);
        checkGrouped(SecurityDefinitionRequestCreateStrategyMessage::new, RoundTrip::wire10, true, true, true, 1, 0);
        check(SecurityDefinitionRequestMessage::new);
        check(SequenceResetMessage::new);
        check(SimpleOpenFramingHeaderMessage::new);
        check(TraderLogonReportMessage::new);
        check(TraderLogonRequestMessage::new);
        check(TraderLogoutReportMessage::new);
        check(TraderLogoutRequestMessage::new);
        check(HeartBeatMessage::new);

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
        random(wire, random, 100);
        count(wire, 88L + delta(88), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 88 + delta(88));
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        count(wire, 20L + delta(20), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 20 + delta(20));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 100);
        count(wire, 121L + delta(121), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 121 + delta(121));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 48L + delta(48), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 48 + delta(48));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 100);
        random(wire, random, 8);
        count(wire, 265L + delta(265), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 265 + delta(265));
        }
        count(wire, 113L + delta(113), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 113 + delta(113));
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 20);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 20);
        count(wire, 12L + delta(12), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 12 + delta(12));
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 12);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 12L + delta(12), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 12 + delta(12));
        }
        count(wire, 33L + delta(33), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 12);
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
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 12L + delta(12), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 12 + delta(12));
        }
        count(wire, 33L + delta(33), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        count(wire, 28L + delta(28), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 28 + delta(28));
        }
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 2, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
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
