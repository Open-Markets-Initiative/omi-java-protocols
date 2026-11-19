package omi.nasdaq.nordicequities.totalview.itch.v3_04_x;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.AddOrderMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.AddOrderMpidAttributionMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.BrokenTradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.CrossTradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.ExecutionSummaryMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.MoiiMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.NoiiMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderBookDirectoryMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderBookFlushMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderBookTradingActionMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderCancelMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderDeleteMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderExecutedMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.OrderReplaceMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.SystemEventMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.messages.application.TradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_x.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderMessage::new);
        check(AddOrderMpidAttributionMessage::new);
        check(BrokenTradeMessage::new);
        check(CrossTradeMessage::new);
        check(ExecutionSummaryMessage::new);
        check(MoiiMessage::new);
        check(NoiiMessage::new);
        check(OrderBookDirectoryMessage::new);
        check(OrderBookFlushMessage::new);
        check(OrderBookTradingActionMessage::new);
        check(OrderCancelMessage::new);
        check(OrderDeleteMessage::new);
        check(OrderExecutedMessage::new);
        check(OrderExecutedWithPriceMessage::new);
        check(OrderReplaceMessage::new);
        check(SystemEventMessage::new);
        check(TradeMessage::new);

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

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
