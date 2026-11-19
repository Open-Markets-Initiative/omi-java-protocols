package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AddComplexInstrumentMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AddComplexInstrumentResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.CancelOrderMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ComplexInstrumentDirectoryMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.CrossOrderAcceptedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.InstrumentTradingActionMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MassCancelMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MassCancelResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MemberKillSwitchNotificationMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MemberKillSwitchRequestMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ModifyTradeMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ModifyTradeResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.NewCrossOrderMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.NewOrderLongFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.NewOrderShortFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderAcceptedLongFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderAcceptedShortFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderCanceledMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderReplacedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.PendingResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.RejectMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ReplaceOrderMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SimpleInstrumentDirectoryMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SubscriptionRequestMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SubscriptionResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.TradeDetailsMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.ClientHeartbeatPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.DebugPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.EndOfSessionPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.LoginAcceptedPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.LoginRejectedPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.LoginRequestPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.LogoutRequestPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.SequencedDataPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.ServerHeartbeatPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.session.UnsequencedDataPacket;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AddComplexInstrumentMessage::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(AddComplexInstrumentResponseMessage::new);
        checkGrouped(AuctionNotificationMessage::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(CancelOrderMessage::new);
        checkGrouped(ComplexInstrumentDirectoryMessage::new, RoundTrip::wire2, true, true, true, 1, 0);
        check(CrossOrderAcceptedMessage::new);
        checkGrouped(DebugPacket::new, RoundTrip::wire3, true, false, false, 1, 0);
        check(InstrumentTradingActionMessage::new);
        check(LoginAcceptedPacket::new);
        check(LoginRejectedPacket::new);
        check(LoginRequestPacket::new);
        check(MassCancelMessage::new);
        check(MassCancelResponseMessage::new);
        check(MemberKillSwitchNotificationMessage::new);
        check(MemberKillSwitchRequestMessage::new);
        checkGrouped(ModifyTradeMessage::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(ModifyTradeResponseMessage::new);
        checkGrouped(NewCrossOrderMessage::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(NewOrderLongFormMessage::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(NewOrderShortFormMessage::new);
        checkGrouped(OrderAcceptedLongFormMessage::new, RoundTrip::wire7, true, true, true, 1, 0);
        check(OrderAcceptedShortFormMessage::new);
        check(OrderCanceledMessage::new);
        check(OrderExecutedMessage::new);
        check(OrderReplacedMessage::new);
        check(PendingResponseMessage::new);
        check(RejectMessage::new);
        check(ReplaceOrderMessage::new);
        checkGrouped(SequencedDataPacket::new, RoundTrip::wire8, true, false, true, 8, 0);
        check(SimpleInstrumentDirectoryMessage::new);
        check(SubscriptionRequestMessage::new);
        check(SubscriptionResponseMessage::new);
        check(SystemEventMessage::new);
        check(TradeDetailsMessage::new);
        checkGrouped(UnsequencedDataPacket::new, RoundTrip::wire9, true, false, true, 8, 0);
        check(ClientHeartbeatPacket::new);
        check(LogoutRequestPacket::new);
        check(ServerHeartbeatPacket::new);
        check(EndOfSessionPacket::new);

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
        random(wire, random, 16);
        random(wire, random, 2);
        random(wire, random, 13);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 9);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 13);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 4);
        count(wire, count, 2, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 10);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 9);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 9);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 16);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 10);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 9);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick0 = random.nextInt(20);
        ByteArrayOutputStream outer0 = wire;
        wire = new ByteArrayOutputStream();
        if (pick0 == 0) {
            random(wire, random, 11);
        } else if (pick0 == 1) {
            random(wire, random, 69);
        } else if (pick0 == 2) {
            wire.writeBytes(wire2(random, entries, entries));
        } else if (pick0 == 3) {
            random(wire, random, 15);
        } else if (pick0 == 4) {
            wire.writeBytes(wire1(random, entries, entries));
        } else if (pick0 == 5) {
            wire.writeBytes(wire7(random, entries, entries));
        } else if (pick0 == 6) {
            random(wire, random, 65);
        } else if (pick0 == 7) {
            random(wire, random, 100);
        } else if (pick0 == 8) {
            random(wire, random, 41);
        } else if (pick0 == 9) {
            random(wire, random, 72);
        } else if (pick0 == 10) {
            random(wire, random, 107);
        } else if (pick0 == 11) {
            random(wire, random, 169);
        } else if (pick0 == 12) {
            random(wire, random, 33);
        } else if (pick0 == 13) {
            random(wire, random, 36);
        } else if (pick0 == 14) {
            random(wire, random, 32);
        } else if (pick0 == 15) {
            random(wire, random, 56);
        } else if (pick0 == 16) {
            random(wire, random, 28);
        } else if (pick0 == 17) {
            random(wire, random, 27);
        } else if (pick0 == 18) {
            random(wire, random, 34);
        } else {
            random(wire, random, 3);
        }
        byte[] measured0 = wire.toByteArray();
        wire = outer0;
        count(wire, new long[] { 122L, 111L, 115L, 105L, 110L, 97L, 98L, 114L, 99L, 101L, 116L, 120L, 107L, 117L, 100L, 109L, 102L, 106L, 112L, 32L }[pick0], 1, false);
        wire.writeBytes(measured0);
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        int pick1 = random.nextInt(11);
        ByteArrayOutputStream outer1 = wire;
        wire = new ByteArrayOutputStream();
        if (pick1 == 0) {
            wire.writeBytes(wire6(random, entries, entries));
        } else if (pick1 == 1) {
            random(wire, random, 49);
        } else if (pick1 == 2) {
            random(wire, random, 61);
        } else if (pick1 == 3) {
            random(wire, random, 20);
        } else if (pick1 == 4) {
            random(wire, random, 41);
        } else if (pick1 == 5) {
            wire.writeBytes(wire5(random, entries, entries));
        } else if (pick1 == 6) {
            wire.writeBytes(wire0(random, entries, entries));
        } else if (pick1 == 7) {
            wire.writeBytes(wire4(random, entries, entries));
        } else if (pick1 == 8) {
            random(wire, random, 25);
        } else if (pick1 == 9) {
            random(wire, random, 36);
        } else {
            random(wire, random, 3);
        }
        byte[] measured1 = wire.toByteArray();
        wire = outer1;
        count(wire, new long[] { 65L, 66L, 82L, 67L, 85L, 88L, 83L, 77L, 75L, 70L, 32L }[pick1], 1, false);
        wire.writeBytes(measured1);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
