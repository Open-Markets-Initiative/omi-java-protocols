package omi.iex.iexequities.deepplus.iextp.v1_05;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.AddOrderMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.ClearBookMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.OperationalHaltStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderDeleteMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderExecutedMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderModifyMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.RetailLiquidityIndicatorMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityDirectoryMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityEventMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.ShortSalePriceTestStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.SystemEventMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeBreakMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradingStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_05.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderMessage::new, AddOrderMessage.padding());
        check(ClearBookMessage::new, ClearBookMessage.padding());
        check(OperationalHaltStatusMessage::new, OperationalHaltStatusMessage.padding());
        check(OrderDeleteMessage::new, OrderDeleteMessage.padding());
        check(OrderExecutedMessage::new, OrderExecutedMessage.padding());
        check(OrderModifyMessage::new, OrderModifyMessage.padding());
        check(RetailLiquidityIndicatorMessage::new, RetailLiquidityIndicatorMessage.padding());
        check(SecurityDirectoryMessage::new, SecurityDirectoryMessage.padding());
        check(SecurityEventMessage::new, SecurityEventMessage.padding());
        check(ShortSalePriceTestStatusMessage::new, ShortSalePriceTestStatusMessage.padding());
        check(SystemEventMessage::new, SystemEventMessage.padding());
        check(TradeBreakMessage::new, TradeBreakMessage.padding());
        check(TradeMessage::new, TradeMessage.padding());
        check(TradingStatusMessage::new, TradingStatusMessage.padding());

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create, int[] padding) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        for (int run = 0; run < padding.length; run += 2) {
            Arrays.fill(wire, offset + padding[run], offset + padding[run] + padding[run + 1], (byte) 0);
        }
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));

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
