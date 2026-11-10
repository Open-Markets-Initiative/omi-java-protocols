package omi.b3.b3derivatives.binaryumdf.sbe.v1_8;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.AuctionImbalance19Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ChannelReset11Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ClosingPrice17Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.DeleteOrderMbO51Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.DeprecatedSecurityDefinitionMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.EmptyBookMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ExecutionStatistics56Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ExecutionSummary55Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ForwardTrade54Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.HighPrice24Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.LastTradePrice27Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.LowPrice25Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.MassDeleteOrdersMbO52Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.News5Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OpenInterest29Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OpeningPrice15Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OrderMbO50Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.PriceBand20Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.PriceBand22Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.QuantityBand21Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityDefinitionMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityGroupPhase10Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityStatus3Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SequenceMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SequenceResetMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SettlementPrice28Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SnapshotFullRefreshHeader30Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SnapshotFullRefreshOrdersMbO71Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.TheoreticalOpeningPrice16Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.Trade53Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.TradeBust57Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AuctionImbalance19Message::new);
        check(ChannelReset11Message::new);
        check(ClosingPrice17Message::new);
        check(DeleteOrderMbO51Message::new);
        checkGrouped(DeprecatedSecurityDefinitionMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(EmptyBookMessage::new);
        check(ExecutionStatistics56Message::new);
        check(ExecutionSummary55Message::new);
        check(ForwardTrade54Message::new);
        check(HighPrice24Message::new);
        check(LastTradePrice27Message::new);
        check(LowPrice25Message::new);
        check(MassDeleteOrdersMbO52Message::new);
        checkGrouped(News5Message::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(OpenInterest29Message::new);
        check(OpeningPrice15Message::new);
        check(OrderMbO50Message::new);
        check(PriceBand20Message::new);
        check(PriceBand22Message::new);
        check(QuantityBand21Message::new);
        checkGrouped(SecurityDefinitionMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(SecurityGroupPhase10Message::new);
        check(SecurityStatus3Message::new);
        check(SequenceMessage::new);
        check(SettlementPrice28Message::new);
        check(SnapshotFullRefreshHeader30Message::new);
        checkGrouped(SnapshotFullRefreshOrdersMbO71Message::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(TheoreticalOpeningPrice16Message::new);
        check(Trade53Message::new);
        check(TradeBust57Message::new);
        check(SequenceResetMessage::new);

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
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
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
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 12);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 3);
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
        random(wire, random, 8);
        count(wire, 44L + delta(44), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 44 + delta(44));
        }
        count(wire, 38L + delta(38), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 38 + delta(38));
        }
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        count(wire, count, 2, true);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
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
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 12);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 3);
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
        random(wire, random, 8);
        count(wire, 28L + delta(28), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 28 + delta(28));
        }
        count(wire, 38L + delta(38), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 38 + delta(38));
        }
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        count(wire, count, 1, false);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        count(wire, 41L + delta(41), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 41 + delta(41));
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
