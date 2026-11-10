package omi.siac.cqs.output.cta.v2_10_a;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.AuctionStatusMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.DisasterRecoveryDataCenterActivationMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.EndOfDayMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.FinraCloseMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.FinraOpenMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.LineIntegrityMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.LongQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.MarketWideCircuitBreakerDeclineLevelStatusMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.MarketWideCircuitBreakerStatusMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.ResetBlockSequenceNumberMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.ShortQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.SpecialLongQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.StartOfDayMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.SymbolReferenceDataMessage;
import omi.siac.cqs.output.cta.v2_10_a.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AuctionStatusMessage::new);
        check(DisasterRecoveryDataCenterActivationMessage::new);
        check(EndOfDayMessage::new);
        check(FinraCloseMessage::new);
        check(FinraOpenMessage::new);
        check(LineIntegrityMessage::new);
        checkGrouped(LongQuoteMessage::new, RoundTrip::wire0, true, true, false, 1, 0);
        check(MarketWideCircuitBreakerDeclineLevelStatusMessage::new);
        check(MarketWideCircuitBreakerStatusMessage::new);
        check(ResetBlockSequenceNumberMessage::new);
        checkGrouped(ShortQuoteMessage::new, RoundTrip::wire1, true, true, false, 1, 0);
        checkGrouped(SpecialLongQuoteMessage::new, RoundTrip::wire2, true, true, false, 1, 0);
        check(StartOfDayMessage::new);
        check(SymbolReferenceDataMessage::new);

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
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 11);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 81L : 32L, 1, false);
        if (entries > 0) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 11);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        count(wire, entries > 0 ? 81L : 32L, 1, false);
        if (entries > 0) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 11);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, entries > 0 ? 81L : 32L, 1, false);
        if (entries > 0) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
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
