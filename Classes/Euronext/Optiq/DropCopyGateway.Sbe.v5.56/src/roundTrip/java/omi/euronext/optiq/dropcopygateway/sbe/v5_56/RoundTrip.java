package omi.euronext.optiq.dropcopygateway.sbe.v5_56;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcClearBookMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcDeclarationNewMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcMarketStatusChangeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcPriceUpdateMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcQuoteMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcQuoteRequestMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortDeclarationCancelMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortDeclarationFillMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortDeclarationRejectMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortOrderRejectMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortTradeCancellationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortTradeDeclarationCancellationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcShortTradeDeclarationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcStaticCollarsMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcTradeBustDeclarationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcTradeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.DcafqrfeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.LongOrderMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application.TradeBustNotificationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(DcClearBookMessage::new);
        check(DcDeclarationNewMessage::new);
        check(DcMarketStatusChangeMessage::new);
        check(DcPriceUpdateMessage::new);
        checkGrouped(DcQuoteMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(DcQuoteRequestMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(DcShortDeclarationCancelMessage::new);
        check(DcShortDeclarationFillMessage::new);
        check(DcShortDeclarationRejectMessage::new);
        checkGrouped(DcShortOrderRejectMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(DcShortTradeCancellationMessage::new);
        check(DcShortTradeDeclarationCancellationMessage::new);
        checkGrouped(DcShortTradeDeclarationMessage::new, RoundTrip::wire3, true, true, true, 1, 0);
        checkGrouped(DcStaticCollarsMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(DcTradeBustDeclarationMessage::new);
        checkGrouped(DcTradeMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        check(DcafqrfeMessage::new);
        checkGrouped(LongOrderMessage::new, RoundTrip::wire6, true, true, true, 1, 0);
        checkGrouped(TradeBustNotificationMessage::new, RoundTrip::wire7, true, true, true, 1, 0);

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
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 68L + delta(68), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 68 + delta(68));
        }
        count(wire, 68L + delta(68), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 68 + delta(68));
        }
        count(wire, 51L + delta(51), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 51 + delta(51));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 8L + delta(8), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8 + delta(8));
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
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 11);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
        }
        count(wire, 11L + delta(11), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 11 + delta(11));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 8L + delta(8), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8 + delta(8));
        }
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 139L + delta(139), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 139 + delta(139));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 9L + delta(9), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
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
        random(wire, random, 8);
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
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 140L + delta(140), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 140 + delta(140));
        }
        count(wire, 124L + delta(124), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 124 + delta(124));
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 8);
        random(wire, random, 1);
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
        count(wire, 10L + delta(10), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 10 + delta(10));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 8L + delta(8), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8 + delta(8));
        }
        count(wire, 41L + delta(41), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 41 + delta(41));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 41L + delta(41), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 41 + delta(41));
        }
        count(wire, 17L + delta(17), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 17 + delta(17));
        }
        count(wire, 16L + delta(16), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
        }
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 18);
        random(wire, random, 12);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 16);
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
        }
        count(wire, 3L + delta(3), 1, false);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 3 + delta(3));
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
