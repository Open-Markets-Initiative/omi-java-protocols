package omi.box.boxoptions.solamulticast.hsvf.v1_8;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BeginningOfComplexOrderSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BeginningOfOptionsSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BulletinsMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.CircuitAssuranceMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderImprovementProcessBeginningMessageMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInstrumentKeysMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInstrumentTradeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderMarketDepthMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderMarketSheetInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderTradeCancellationMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.EndOfSalesMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.EndOfTransmissionMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.GroupOpeningTimeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.GroupStatusMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.InitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.MarketSheetInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionImprovementProcessBeginningMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionInstrumentKeysMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionMarketDepthMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionRequestForQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionTradeCancellationMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionTradeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.StrategiesGroupStatusMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.SystemTimestampMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BeginningOfComplexOrderSummaryMessage::new);
        check(BeginningOfOptionsSummaryMessage::new);
        check(BulletinsMessage::new);
        check(CircuitAssuranceMessage::new);
        check(ComplexOrderImprovementProcessBeginningMessageMessage::new);
        check(ComplexOrderInitialAndImprovementOrderMessage::new);
        checkGrouped(ComplexOrderInstrumentKeysMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(ComplexOrderInstrumentTradeMessage::new);
        checkGrouped(ComplexOrderMarketDepthMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(ComplexOrderMarketSheetInitialAndImprovementOrderMessage::new);
        check(ComplexOrderQuoteMessage::new);
        check(ComplexOrderSummaryMessage::new);
        check(ComplexOrderTradeCancellationMessage::new);
        check(EndOfSalesMessage::new);
        check(EndOfTransmissionMessage::new);
        check(GroupOpeningTimeMessage::new);
        check(GroupStatusMessage::new);
        check(InitialAndImprovementOrderMessage::new);
        check(MarketSheetInitialAndImprovementOrderMessage::new);
        check(OptionImprovementProcessBeginningMessage::new);
        check(OptionInstrumentKeysMessage::new);
        checkGrouped(OptionMarketDepthMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(OptionQuoteMessage::new);
        check(OptionRequestForQuoteMessage::new);
        check(OptionSummaryMessage::new);
        check(OptionTradeCancellationMessage::new);
        check(OptionTradeMessage::new);
        check(StrategiesGroupStatusMessage::new);
        check(SystemTimestampMessage::new);

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

    private static void digits(ByteArrayOutputStream wire, long count, int width, byte fill) {
        long largest = 1;
        for (int index = 0; index < width; index++) {
            largest *= 10;
        }
        byte[] spelled = Long.toString(Math.min(count, largest - 1)).getBytes(StandardCharsets.US_ASCII);
        for (int index = spelled.length; index < width; index++) {
            wire.write(fill);
        }
        wire.writeBytes(spelled);
    }

    private static byte[] wire0(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 30);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 30);
        random(wire, random, 1);
        digits(wire, count, 2, (byte) '0');
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 8);
            random(wire, random, 30);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 30);
        random(wire, random, 1);
        digits(wire, count, 1, (byte) '0');
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        digits(wire, count, 1, (byte) '0');
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 2);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 2);
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
