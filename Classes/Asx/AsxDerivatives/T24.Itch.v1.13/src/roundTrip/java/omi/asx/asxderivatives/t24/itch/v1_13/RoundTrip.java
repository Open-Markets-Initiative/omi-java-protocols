package omi.asx.asxderivatives.t24.itch.v1_13;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.AdHocTextMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.AnomalousOrderThresholdPublishMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.CustomMarketExecutedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.CustomMarketOrderAddedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.CustomMarketOrderDeletedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.CustomMarketOrderReplacedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.CustomMarketTradeMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.EquilibriumPriceAuctionInfoMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.FutureSymbolDirectoryMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.ImpliedOrderAddedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.ImpliedOrderDeletedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.ImpliedOrderReplacedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.MarketSettlementMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OpenHighLowLastTradeAdjustmentMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OptionSymbolDirectoryMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderAddedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderBookStateMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderDeletedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderExecutedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderExecutedWithPriceMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderReplacedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.OrderVolumeCancelledMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.RequestForQuoteMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.SpreadExecutedMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.SpreadSymbolDirectoryMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.SystemEventMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.TimeMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.TradeCancellationMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.TradeSpreadExecutionChainMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.messages.application.VolumeAndOpenInterestMessage;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AdHocTextMessage::new);
        check(AnomalousOrderThresholdPublishMessage::new);
        check(CustomMarketExecutedMessage::new);
        check(CustomMarketOrderAddedMessage::new);
        check(CustomMarketOrderDeletedMessage::new);
        check(CustomMarketOrderReplacedMessage::new);
        check(CustomMarketTradeMessage::new);
        check(EquilibriumPriceAuctionInfoMessage::new);
        check(FutureSymbolDirectoryMessage::new);
        check(ImpliedOrderAddedMessage::new);
        check(ImpliedOrderDeletedMessage::new);
        check(ImpliedOrderReplacedMessage::new);
        check(MarketSettlementMessage::new);
        check(OpenHighLowLastTradeAdjustmentMessage::new);
        check(OptionSymbolDirectoryMessage::new);
        check(OrderAddedMessage::new);
        check(OrderBookStateMessage::new);
        check(OrderDeletedMessage::new);
        check(OrderExecutedMessage::new);
        check(OrderExecutedWithPriceMessage::new);
        check(OrderReplacedMessage::new);
        check(OrderVolumeCancelledMessage::new);
        check(RequestForQuoteMessage::new);
        check(SpreadExecutedMessage::new);
        check(SpreadSymbolDirectoryMessage::new);
        check(SystemEventMessage::new);
        check(TimeMessage::new);
        check(TradeCancellationMessage::new);
        check(TradeSpreadExecutionChainMessage::new);
        check(VolumeAndOpenInterestMessage::new);

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
