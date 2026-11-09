package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ApplicationLayerRejectMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.AuctionPriceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.AuctionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.BulkCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.DmmSymbolReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.EquitiesSymbolReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ExecutionReportMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.GtBeginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.GtEndMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ManualActionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ManualActionResponseMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.MinimumPriceVariantClassReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.MinimumPriceVariantLevelReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.MmidConfigurationMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.MpidConfigurationMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.NewOrderSingleAndCancelReplaceRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderAndCancelReplaceAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderModifyCancelRequestAcknowledgmentAndUroutMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderModifyRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderPriorityUpdateAcknowledgmentMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskActionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskControlAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskControlAlertMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskLimitUpdateRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SequencedFillerMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SessionConfigurationAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SessionConfigurationRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SymbolSubscriptionAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SymbolSubscriptionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgBeginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgEndMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TradeBustCorrectMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.ClientSeqMsg;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.Close;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.CloseResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.Heartbeat;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.LoginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.LoginResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.Open;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.OpenResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.ServerSeqMsg;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session.StreamAvail;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ApplicationLayerRejectMessage::new);
        check(AuctionPriceDataMessage::new);
        check(AuctionRequestMessage::new);
        check(BulkCancelRequestMessage::new);
        checkGrouped(ClientSeqMsg::new, RoundTrip::wire0, true, false, false, 8);
        check(Close::new);
        check(CloseResponse::new);
        check(DmmSymbolReferenceDataMessage::new);
        check(EquitiesSymbolReferenceDataMessage::new);
        checkGrouped(ExecutionReportMessage::new, RoundTrip::wire1, true, true, false, 1);
        check(GtBeginMessage::new);
        check(GtEndMessage::new);
        check(Heartbeat::new);
        check(LoginMessage::new);
        check(LoginResponse::new);
        check(ManualActionRequestMessage::new);
        check(ManualActionResponseMessage::new);
        check(MinimumPriceVariantClassReferenceDataMessage::new);
        checkGrouped(MinimumPriceVariantLevelReferenceDataMessage::new, RoundTrip::wire2, true, false, false, 1);
        check(MmidConfigurationMessage::new);
        check(MpidConfigurationMessage::new);
        checkGrouped(NewOrderSingleAndCancelReplaceRequestMessage::new, RoundTrip::wire3, true, true, false, 1);
        check(Open::new);
        check(OpenResponse::new);
        checkGrouped(OrderAndCancelReplaceAcknowledgementMessage::new, RoundTrip::wire4, true, true, false, 1);
        check(OrderCancelRequestMessage::new);
        check(OrderModifyCancelRequestAcknowledgmentAndUroutMessage::new);
        check(OrderModifyRequestMessage::new);
        check(OrderPriorityUpdateAcknowledgmentMessage::new);
        check(RiskActionRequestMessage::new);
        check(RiskControlAcknowledgementMessage::new);
        check(RiskControlAlertMessage::new);
        check(RiskLimitUpdateRequestMessage::new);
        checkGrouped(ServerSeqMsg::new, RoundTrip::wire5, true, false, false, 8);
        check(SessionConfigurationAcknowledgementMessage::new);
        check(SessionConfigurationRequestMessage::new);
        check(StreamAvail::new);
        check(SymbolSubscriptionAcknowledgementMessage::new);
        check(SymbolSubscriptionRequestMessage::new);
        check(TradeBustCorrectMessage::new);
        check(SequencedFillerMessage::new);
        check(TgBeginMessage::new);
        check(TgEndMessage::new);
        checkGiven(ExecutionReportMessage::new, RoundTrip::wire1, (message, entries, length) -> { message.seqMsgLengthInput(length - -4L); }, false);
        checkGiven(NewOrderSingleAndCancelReplaceRequestMessage::new, RoundTrip::wire3, (message, entries, length) -> { message.seqMsgLengthInput(length - -4L); }, false);
        checkGiven(OrderAndCancelReplaceAcknowledgementMessage::new, RoundTrip::wire4, (message, entries, length) -> { message.seqMsgLengthInput(length - -4L); }, false);

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
        int pick0 = random.nextInt(13);
        ByteArrayOutputStream outer0 = wire;
        wire = new ByteArrayOutputStream();
        if (pick0 == 0) {
            random(wire, random, 70);
        } else if (pick0 == 1) {
            random(wire, random, 0);
        } else if (pick0 == 2) {
            wire.writeBytes(wire3(random, entries, entries));
        } else if (pick0 == 3) {
            random(wire, random, 24);
        } else if (pick0 == 4) {
            random(wire, random, 30);
        } else if (pick0 == 5) {
            random(wire, random, 27);
        } else if (pick0 == 6) {
            random(wire, random, 20);
        } else if (pick0 == 7) {
            random(wire, random, 0);
        } else if (pick0 == 8) {
            random(wire, random, 0);
        } else if (pick0 == 9) {
            random(wire, random, 65);
        } else if (pick0 == 10) {
            random(wire, random, 268);
        } else if (pick0 == 11) {
            random(wire, random, 246);
        } else {
            random(wire, random, 3);
        }
        byte[] measured0 = wire.toByteArray();
        wire = outer0;
        random(wire, random, 2);
        count(wire, 36L + measured0.length - 0L, 2, true);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, new long[] { 544L, 642L, 576L, 640L, 624L, 641L, 838L, 835L, 836L, 852L, 816L, 817L, 0L }[pick0], 2, true);
        count(wire, measured0.length - -4L, 2, true);
        wire.writeBytes(measured0);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        if (entries > 0) {
            random(wire, random, 2);
            random(wire, random, 2);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 24);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        if (entries > 0) {
            random(wire, random, 2);
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        if (entries > 0) {
            random(wire, random, 2);
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick1 = random.nextInt(22);
        ByteArrayOutputStream outer1 = wire;
        wire = new ByteArrayOutputStream();
        if (pick1 == 0) {
            random(wire, random, 52);
        } else if (pick1 == 1) {
            random(wire, random, 125);
        } else if (pick1 == 2) {
            random(wire, random, 46);
        } else if (pick1 == 3) {
            wire.writeBytes(wire2(random, entries, entries));
        } else if (pick1 == 4) {
            random(wire, random, 79);
        } else if (pick1 == 5) {
            random(wire, random, 138);
        } else if (pick1 == 6) {
            random(wire, random, 94);
        } else if (pick1 == 7) {
            wire.writeBytes(wire4(random, entries, entries));
        } else if (pick1 == 8) {
            random(wire, random, 70);
        } else if (pick1 == 9) {
            random(wire, random, 58);
        } else if (pick1 == 10) {
            wire.writeBytes(wire1(random, entries, entries));
        } else if (pick1 == 11) {
            random(wire, random, 78);
        } else if (pick1 == 12) {
            random(wire, random, 39);
        } else if (pick1 == 13) {
            random(wire, random, 29);
        } else if (pick1 == 14) {
            random(wire, random, 8);
        } else if (pick1 == 15) {
            random(wire, random, 8);
        } else if (pick1 == 16) {
            random(wire, random, 42);
        } else if (pick1 == 17) {
            random(wire, random, 21);
        } else if (pick1 == 18) {
            random(wire, random, 91);
        } else if (pick1 == 19) {
            random(wire, random, 310);
        } else if (pick1 == 20) {
            random(wire, random, 301);
        } else {
            random(wire, random, 3);
        }
        byte[] measured1 = wire.toByteArray();
        wire = outer1;
        random(wire, random, 2);
        count(wire, 36L + measured1.length - 0L, 2, true);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        count(wire, new long[] { 562L, 2098L, 560L, 561L, 626L, 627L, 545L, 608L, 625L, 610L, 656L, 658L, 611L, 839L, 841L, 848L, 850L, 840L, 851L, 818L, 819L, 0L }[pick1], 2, true);
        count(wire, measured1.length - -4L, 2, true);
        wire.writeBytes(measured1);
        return wire.toByteArray();
    }

    private interface Give<M> {
        void give(M message, long entries, long length);
    }

    private static <M extends Message> void checkGiven(Supplier<M> create, Wire wire, Give<M> give, boolean counted) {
        String name = create.get().getClass().getSimpleName();
        Random random = new Random(name.hashCode() + 1);
        for (int entries : new int[] { 0, 1, 3 }) {
            byte[] bytes = wire.build(random, entries, entries);
            M message = create.get();
            give.give(message, entries, bytes.length);
            String label = name + " given its inputs, with " + entries + " entries";
            expect(label + " decodes", message.parseFrom(bytes, 0, bytes.length) && message.isDecoded());
            expect(label + " has its length", message.byteLength() == bytes.length);
            expect(label + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        }
        if (counted) {
            byte[] bytes = wire.build(random, 1, 1);
            M message = create.get();
            give.give(message, 2, bytes.length);
            expect(name + " refuses a given count beyond its entries", !message.parseFrom(bytes, 0, bytes.length));
        }
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
