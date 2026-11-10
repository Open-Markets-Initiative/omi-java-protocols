package omi.miax.pearlequities.expressorders.meo.v2_6;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelReduceSizeOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ExecutionNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.MassCancelRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.MassCancelResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.OrderPriceUpdateNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ReserveOrderReplenishmentNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.SymbolUpdate;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.SystemStateNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.ClientHeartbeat;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.GoodbyePacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LoginRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LoginResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LogoutRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.RetransmissionRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.ServerHeartbeat;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.SynchronizationComplete;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.TestPacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.TradingSessionUpdate;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(CancelOrderByExchangeOrderIdRequest::new);
        check(CancelOrderByExchangeOrderIdResponseMessage::new);
        check(CancelOrderRequest::new);
        check(CancelOrderResponse::new);
        check(CancelReduceSizeOrderNotification::new);
        check(ExecutionNotification::new);
        checkGrouped(GoodbyePacket::new, RoundTrip::wire0, true, false, false, 1);
        checkGrouped(LoginRequest::new, RoundTrip::wire1, true, true, true, 1);
        checkGrouped(LoginResponse::new, RoundTrip::wire2, true, true, true, 1);
        checkGrouped(LogoutRequest::new, RoundTrip::wire3, true, false, false, 1);
        check(MassCancelRequest::new);
        checkGrouped(MassCancelResponse::new, RoundTrip::wire4, true, true, true, 1);
        check(ModifyOrderNotification::new);
        check(ModifyOrderRequestMessage::new);
        check(ModifyOrderResponse::new);
        check(NewOrderNotification::new);
        check(NewOrderRequestMessage::new);
        check(NewOrderResponseMessage::new);
        check(OrderPriceUpdateNotification::new);
        check(ReserveOrderReplenishmentNotification::new);
        check(RetransmissionRequest::new);
        check(SymbolUpdate::new);
        check(SynchronizationComplete::new);
        check(SystemStateNotification::new);
        checkGrouped(TestPacket::new, RoundTrip::wire5, true, false, false, 1);
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
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        count(wire, count, 1, true);
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
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 20);
        count(wire, count, 1, true);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
        }
        random(wire, random, 10);
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
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
