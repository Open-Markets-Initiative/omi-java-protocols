package omi.nasdaq.psxequities.totalview.itch.v5_0;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.AddOrderNoMpidAttributionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.AddOrderWithMpidAttributionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.CrossTradeMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.LuldAuctionCollarMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MwcbStatusLevelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OperationalHaltMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderCancelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderDeleteMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderReplaceMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.TradeMessageNonCross;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderNoMpidAttributionMessage::new, AddOrderNoMpidAttributionMessage.padding());
        check(AddOrderWithMpidAttributionMessage::new, AddOrderWithMpidAttributionMessage.padding());
        check(BrokenTradeMessage::new, BrokenTradeMessage.padding());
        check(CrossTradeMessage::new, CrossTradeMessage.padding());
        check(LuldAuctionCollarMessage::new, LuldAuctionCollarMessage.padding());
        check(MarketParticipantPositionMessage::new, MarketParticipantPositionMessage.padding());
        check(MwcbDeclineLevelMessage::new, MwcbDeclineLevelMessage.padding());
        check(MwcbStatusLevelMessage::new, MwcbStatusLevelMessage.padding());
        check(NetOrderImbalanceIndicatorMessage::new, NetOrderImbalanceIndicatorMessage.padding());
        check(OperationalHaltMessage::new, OperationalHaltMessage.padding());
        check(OrderCancelMessage::new, OrderCancelMessage.padding());
        check(OrderDeleteMessage::new, OrderDeleteMessage.padding());
        check(OrderExecutedMessage::new, OrderExecutedMessage.padding());
        check(OrderExecutedWithPriceMessage::new, OrderExecutedWithPriceMessage.padding());
        check(OrderReplaceMessage::new, OrderReplaceMessage.padding());
        check(RegShoShortSalePriceTestRestrictedIndicatorMessage::new, RegShoShortSalePriceTestRestrictedIndicatorMessage.padding());
        check(StockDirectoryMessage::new, StockDirectoryMessage.padding());
        check(StockTradingActionMessage::new, StockTradingActionMessage.padding());
        check(SystemEventMessage::new, SystemEventMessage.padding());
        check(TradeMessageNonCross::new, TradeMessageNonCross.padding());

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
