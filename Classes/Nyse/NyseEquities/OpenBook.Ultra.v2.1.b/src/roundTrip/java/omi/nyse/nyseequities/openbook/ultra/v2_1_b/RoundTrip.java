package omi.nyse.nyseequities.openbook.ultra.v2_1_b;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.BookRefreshRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.DeltaUpdateMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.DeltaUpdateMessageBody;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.DeltaUpdateMessages;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.ExtendedBookRefreshRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.FullUpdateMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.FullUpdateMessageBody;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.FullUpdateMessages;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatResponseMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatSubscriptionMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.RequestResponseMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.RetransmissionRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.SequenceNumberResetMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.SymbolIndexMappingResponseMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.UnavailableMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BookRefreshRequestMessage::new);
        checkGrouped(DeltaUpdateMessage::new, RoundTrip::wire0, true, true, false, 1);
        checkGrouped(DeltaUpdateMessageBody::new, RoundTrip::wire1, true, false, false, 1);
        checkGrouped(DeltaUpdateMessages::new, RoundTrip::wire2, true, false, false, 1);
        check(ExtendedBookRefreshRequestMessage::new);
        checkGrouped(FullUpdateMessage::new, RoundTrip::wire3, true, true, false, 1);
        checkGrouped(FullUpdateMessageBody::new, RoundTrip::wire4, true, false, false, 1);
        checkGrouped(FullUpdateMessages::new, RoundTrip::wire5, true, false, false, 1);
        check(HeartbeatResponseMessage::new);
        check(RequestResponseMessage::new);
        check(RetransmissionRequestMessage::new);
        check(SequenceNumberResetMessage::new);
        check(SymbolIndexMappingRequestMessage::new);
        check(SymbolIndexMappingResponseMessage::new);
        check(UnavailableMessage::new);
        check(HeartbeatMessage::new);
        check(HeartbeatSubscriptionMessage::new);
        checkGiven(DeltaUpdateMessages::new, RoundTrip::wire2, (message, entries, length) -> { message.messageCountInput(entries); }, true);
        checkGiven(FullUpdateMessages::new, RoundTrip::wire5, (message, entries, length) -> { message.messageCountInput(entries); }, true);

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
        ByteArrayOutputStream outer0 = wire;
        wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        byte[] measured0 = wire.toByteArray();
        wire = outer0;
        count(wire, measured0.length - -2L, 2, false);
        wire.writeBytes(measured0);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer1 = wire;
            wire = new ByteArrayOutputStream();
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            for (int entry1 = 0; entry1 < entries; entry1++) {
                random(wire, random, 4);
                random(wire, random, 4);
                random(wire, random, 4);
                random(wire, random, 2);
                random(wire, random, 1);
                random(wire, random, 1);
                random(wire, random, 4);
                random(wire, random, 4);
                random(wire, random, 4);
            }
            byte[] measured1 = wire.toByteArray();
            wire = outer1;
            count(wire, measured1.length - -2L, 2, false);
            wire.writeBytes(measured1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        ByteArrayOutputStream outer2 = wire;
        wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 11);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
        }
        byte[] measured2 = wire.toByteArray();
        wire = outer2;
        count(wire, measured2.length - -2L, 2, false);
        wire.writeBytes(measured2);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 11);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        for (int entry0 = 0; entry0 < entries; entry0++) {
            ByteArrayOutputStream outer3 = wire;
            wire = new ByteArrayOutputStream();
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 11);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
            for (int entry1 = 0; entry1 < entries; entry1++) {
                random(wire, random, 4);
                random(wire, random, 4);
                random(wire, random, 2);
                random(wire, random, 1);
                random(wire, random, 1);
            }
            byte[] measured3 = wire.toByteArray();
            wire = outer3;
            count(wire, measured3.length - -2L, 2, false);
            wire.writeBytes(measured3);
        }
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
