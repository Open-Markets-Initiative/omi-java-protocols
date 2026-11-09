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
        check(AddOrderMessage::new);
        check(ClearBookMessage::new);
        check(OperationalHaltStatusMessage::new);
        check(OrderDeleteMessage::new);
        check(OrderExecutedMessage::new);
        check(OrderModifyMessage::new);
        check(RetailLiquidityIndicatorMessage::new);
        check(SecurityDirectoryMessage::new);
        check(SecurityEventMessage::new);
        check(ShortSalePriceTestStatusMessage::new);
        check(SystemEventMessage::new);
        check(TradeBreakMessage::new);
        check(TradeMessage::new);
        check(TradingStatusMessage::new);

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
