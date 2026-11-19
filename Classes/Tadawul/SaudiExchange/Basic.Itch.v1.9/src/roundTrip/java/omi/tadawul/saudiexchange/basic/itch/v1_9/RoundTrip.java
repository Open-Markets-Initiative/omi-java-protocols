package omi.tadawul.saudiexchange.basic.itch.v1_9;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.BestBidOfferMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.IndexMemberDirectoryMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.IndexValueMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.OrderbookDirectoryMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.OrderbookPriceMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.OrderbookTradingActionMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.PriceTickSizeMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.QuantityTickSizeMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.SystemEventMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.TimestampSecondsMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application.TradeMessage;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.ClientHeartbeat;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.DebugPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.EndOfSession;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.LoginAcceptedPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.LoginRejectedPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.LoginRequestPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.LogoutRequest;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.SequencedDataPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.ServerHeartbeat;
import omi.tadawul.saudiexchange.basic.itch.v1_9.messages.session.UnsequencedDataPacket;
import omi.tadawul.saudiexchange.basic.itch.v1_9.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BestBidOfferMessage::new);
        checkGrouped(DebugPacket::new, RoundTrip::wire0, true, false, false, 1, 0);
        check(IndexMemberDirectoryMessage::new);
        check(IndexValueMessage::new);
        check(LoginAcceptedPacket::new);
        check(LoginRejectedPacket::new);
        check(LoginRequestPacket::new);
        check(OrderbookDirectoryMessage::new);
        check(OrderbookPriceMessage::new);
        check(OrderbookTradingActionMessage::new);
        check(PriceTickSizeMessage::new);
        check(QuantityTickSizeMessage::new);
        checkGrouped(SequencedDataPacket::new, RoundTrip::wire1, true, false, false, 8, 0);
        check(SystemEventMessage::new);
        check(TimestampSecondsMessage::new);
        check(TradeMessage::new);
        checkGrouped(UnsequencedDataPacket::new, RoundTrip::wire2, true, false, false, 1, 0);
        check(ClientHeartbeat::new);
        check(LogoutRequest::new);
        check(ServerHeartbeat::new);
        check(EndOfSession::new);

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
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick0 = random.nextInt(12);
        ByteArrayOutputStream outer0 = wire;
        wire = new ByteArrayOutputStream();
        if (pick0 == 0) {
            random(wire, random, 4);
        } else if (pick0 == 1) {
            random(wire, random, 29);
        } else if (pick0 == 2) {
            random(wire, random, 16);
        } else if (pick0 == 3) {
            random(wire, random, 24);
        } else if (pick0 == 4) {
            random(wire, random, 214);
        } else if (pick0 == 5) {
            random(wire, random, 10);
        } else if (pick0 == 6) {
            random(wire, random, 34);
        } else if (pick0 == 7) {
            random(wire, random, 32);
        } else if (pick0 == 8) {
            random(wire, random, 14);
        } else if (pick0 == 9) {
            random(wire, random, 16);
        } else if (pick0 == 10) {
            random(wire, random, 16);
        } else {
            random(wire, random, 3);
        }
        byte[] measured0 = wire.toByteArray();
        wire = outer0;
        count(wire, new long[] { 84L, 83L, 76L, 77L, 82L, 72L, 80L, 81L, 88L, 89L, 90L, 32L }[pick0], 1, false);
        wire.writeBytes(measured0);
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
