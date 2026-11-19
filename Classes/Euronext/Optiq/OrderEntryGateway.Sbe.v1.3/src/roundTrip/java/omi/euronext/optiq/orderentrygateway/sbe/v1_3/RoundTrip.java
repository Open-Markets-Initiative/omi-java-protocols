package omi.euronext.optiq.orderentrygateway.sbe.v1_3;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.AckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.AskForQuoteMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CancelReplaceMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CancelRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CollarBreachConfirmationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationCancelAndRefusalMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationNoticeMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FillMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FundPriceInputAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FundPriceInputMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.HeartbeatMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.InstrumentSynchronizationListMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.KillMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LiquidityProviderCommandMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogoutMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.MassCancelAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.MassCancelMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.NewOrderMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OpenOrderRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OwnershipRequestAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OwnershipRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.PriceInputMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuoteAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuoteRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuotesMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RequestForExecutionMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RfqMatchingStatusMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RfqNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.SynchronizationTimeMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TechnicalRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TestRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TradeBustNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.UserNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AckMessage::new);
        check(AskForQuoteMessage::new);
        checkGrouped(CancelReplaceMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(CancelRequestMessage::new);
        check(CollarBreachConfirmationMessage::new);
        check(DeclarationCancelAndRefusalMessage::new);
        check(DeclarationEntryAckMessage::new);
        check(DeclarationEntryMessage::new);
        check(DeclarationEntryRejectMessage::new);
        check(DeclarationNoticeMessage::new);
        checkGrouped(FillMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(FundPriceInputAckMessage::new);
        check(FundPriceInputMessage::new);
        checkGrouped(InstrumentSynchronizationListMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(KillMessage::new);
        check(LiquidityProviderCommandMessage::new);
        check(LogonAckMessage::new);
        check(LogonMessage::new);
        check(LogonRejectMessage::new);
        check(LogoutMessage::new);
        check(MassCancelAckMessage::new);
        check(MassCancelMessage::new);
        checkGrouped(NewOrderMessage::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(OpenOrderRequestMessage::new);
        check(OwnershipRequestAckMessage::new);
        check(OwnershipRequestMessage::new);
        check(PriceInputMessage::new);
        checkGrouped(QuoteAckMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(QuoteRequestMessage::new);
        checkGrouped(QuotesMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(RejectMessage::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(RequestForExecutionMessage::new);
        check(RfqMatchingStatusMessage::new);
        check(RfqNotificationMessage::new);
        check(SynchronizationTimeMessage::new);
        check(TechnicalRejectMessage::new);
        check(TradeBustNotificationMessage::new);
        check(UserNotificationMessage::new);
        check(HeartbeatMessage::new);
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
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
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
        random(wire, random, 2);
        count(wire, 18L + delta(18), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 18 + delta(18));
        }
        count(wire, 34L + delta(34), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        count(wire, 33L + delta(33), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 33 + delta(33));
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 32L + delta(32), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        count(wire, 21L + delta(21), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 21 + delta(21));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 2);
        count(wire, 5L + delta(5), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 5 + delta(5));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 18L + delta(18), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 18 + delta(18));
        }
        count(wire, 12L + delta(12), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 12 + delta(12));
        }
        count(wire, 50L + delta(50), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 50 + delta(50));
        }
        count(wire, 34L + delta(34), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 34 + delta(34));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 27L + delta(27), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 27 + delta(27));
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 12L + delta(12), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 12 + delta(12));
        }
        count(wire, 51L + delta(51), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 51 + delta(51));
        }
        count(wire, 37L + delta(37), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 37 + delta(37));
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
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
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        count(wire, 9L + delta(9), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
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
