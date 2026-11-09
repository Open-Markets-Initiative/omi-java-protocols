package omi.eurex.t7.eobi.fbe.v3_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.AddComplexInstrument;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.AuctionBbo;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.AuctionClearingPrice;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.CrossRequest;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.ExecutionSummary;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.FullOrderExecution;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.Heartbeat;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.InstrumentStateChange;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.InstrumentSummary;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.OrderAdd;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.OrderDelete;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.OrderMassDelete;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.OrderModify;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.OrderModifySamePrio;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.PartialOrderExecution;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.ProductStateChange;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.ProductSummary;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.QuoteRequest;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.SnapshotOrder;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.TopOfBook;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.TradeReport;
import omi.eurex.t7.eobi.fbe.v3_0.messages.application.TradeReversal;
import omi.eurex.t7.eobi.fbe.v3_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AddComplexInstrument::new, RoundTrip::wire0, false, true, true, 1);
        check(AuctionBbo::new);
        check(AuctionClearingPrice::new);
        check(CrossRequest::new);
        check(ExecutionSummary::new);
        check(FullOrderExecution::new);
        check(Heartbeat::new);
        check(InstrumentStateChange::new);
        checkGrouped(InstrumentSummary::new, RoundTrip::wire1, false, true, true, 1);
        check(OrderAdd::new);
        check(OrderDelete::new);
        check(OrderMassDelete::new);
        check(OrderModify::new);
        check(OrderModifySamePrio::new);
        check(PartialOrderExecution::new);
        check(ProductStateChange::new);
        check(ProductSummary::new);
        check(QuoteRequest::new);
        check(SnapshotOrder::new);
        check(TopOfBook::new);
        check(TradeReport::new);
        checkGrouped(TradeReversal::new, RoundTrip::wire2, false, true, true, 1);

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
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count == entries ? Math.min(entries, 20) : count, 1, false);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < Math.min(entries, 20); entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = Math.min(entries, 20); entry0 < 20; entry0++) {
            random(wire, random, 24);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count == entries ? Math.min(entries, 11) : count, 1, false);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < Math.min(entries, 11); entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = Math.min(entries, 11); entry0 < 11; entry0++) {
            random(wire, random, 16);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, count == entries ? Math.min(entries, 11) : count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < Math.min(entries, 11); entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = Math.min(entries, 11); entry0 < 11; entry0++) {
            random(wire, random, 16);
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
