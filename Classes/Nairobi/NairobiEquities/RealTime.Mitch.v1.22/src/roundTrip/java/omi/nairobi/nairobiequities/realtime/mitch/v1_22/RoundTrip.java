package omi.nairobi.nairobiequities.realtime.mitch.v1_22;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AddAttributedOrderMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AddOrderMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AonInfoMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AuctionInfoMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AuctionTradeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.ConsolidatedStatisticsMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.DeletePricePointMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.ExtendedStatisticsMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.IndexMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.NewsMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OffBookTradeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OrderBookClearMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OrderDeletedMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OrderExecutedMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OrderExecutedWithPriceSizeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.OrderModifiedMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.RecoveryTradeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.StatisticsMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.SymbolDirectoryMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.SymbolStatusMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.SystemEventMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.TimeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.TopOfBookMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.TradeBreakMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.TradeCorrectionMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.TradeMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.UpdatePricePointMessage;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddAttributedOrderMessage::new);
        check(AddOrderMessage::new);
        check(AonInfoMessage::new);
        check(AuctionInfoMessage::new);
        check(AuctionTradeMessage::new);
        check(ConsolidatedStatisticsMessage::new);
        check(DeletePricePointMessage::new);
        check(ExtendedStatisticsMessage::new);
        check(IndexMessage::new);
        check(NewsMessage::new);
        check(OffBookTradeMessage::new);
        check(OrderBookClearMessage::new);
        check(OrderDeletedMessage::new);
        check(OrderExecutedMessage::new);
        check(OrderExecutedWithPriceSizeMessage::new);
        check(OrderModifiedMessage::new);
        check(RecoveryTradeMessage::new);
        check(StatisticsMessage::new);
        check(SymbolDirectoryMessage::new);
        check(SymbolStatusMessage::new);
        check(SystemEventMessage::new);
        check(TimeMessage::new);
        check(TopOfBookMessage::new);
        check(TradeBreakMessage::new);
        check(TradeCorrectionMessage::new);
        check(TradeMessage::new);
        check(UpdatePricePointMessage::new);

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
