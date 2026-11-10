package omi.miax.pearlequities.depthofmarket.mach.v1_3_d;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.AddOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.DeleteOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.EndOfRefreshNotificationMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.ModifyOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.OrderExecutionMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.RefreshRequestMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.RefreshResponseMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SecurityTradingStatusNotificationMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SymbolClearMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SymbolUpdateMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SystemStateMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SystemTimeMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.TradeCancelMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.TradeMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.ClientHeartbeat;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.GoodbyePacket;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.LoginRequest;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.LoginResponse;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.LogoutRequest;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.RetransmissionRequest;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.ServerHeartbeat;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.SynchronizationComplete;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.TestPacket;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.session.TradingSessionUpdate;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderMessage::new);
        check(DeleteOrderMessage::new);
        check(EndOfRefreshNotificationMessage::new);
        checkGrouped(GoodbyePacket::new, RoundTrip::wire0, true, false, false, 1, 0);
        checkGrouped(LoginRequest::new, RoundTrip::wire1, true, true, true, 1, 0);
        checkGrouped(LoginResponse::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(LogoutRequest::new, RoundTrip::wire3, true, false, false, 1, 0);
        check(ModifyOrderMessage::new);
        check(OrderExecutionMessage::new);
        check(RefreshRequestMessage::new);
        check(RefreshResponseMessage::new);
        check(RetransmissionRequest::new);
        check(SecurityTradingStatusNotificationMessage::new);
        check(SymbolClearMessage::new);
        check(SymbolUpdateMessage::new);
        check(SynchronizationComplete::new);
        check(SystemStateMessage::new);
        check(SystemTimeMessage::new);
        checkGrouped(TestPacket::new, RoundTrip::wire4, true, false, false, 1, 0);
        check(TradeCancelMessage::new);
        check(TradeMessage::new);
        check(TradingSessionUpdate::new);
        check(ServerHeartbeat::new);
        check(ClientHeartbeat::new);

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
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 5);
        random(wire, random, 5);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
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
