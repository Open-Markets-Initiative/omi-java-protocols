package omi.asx.asxderivatives.t24.itch.v1_13.dispatch;

import java.util.Optional;
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

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'T') {
            message = new TimeMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'f') {
            message = new FutureSymbolDirectoryMessage();
        } else if (messageType == 'g') {
            message = new SpreadSymbolDirectoryMessage();
        } else if (messageType == 'h') {
            message = new OptionSymbolDirectoryMessage();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'A') {
            message = new OrderAddedMessage();
        } else if (messageType == 'U') {
            message = new OrderReplacedMessage();
        } else if (messageType == 'X') {
            message = new OrderVolumeCancelledMessage();
        } else if (messageType == 'D') {
            message = new OrderDeletedMessage();
        } else if (messageType == 'j') {
            message = new ImpliedOrderAddedMessage();
        } else if (messageType == 'l') {
            message = new ImpliedOrderReplacedMessage();
        } else if (messageType == 'k') {
            message = new ImpliedOrderDeletedMessage();
        } else if (messageType == 'm') {
            message = new CustomMarketOrderAddedMessage();
        } else if (messageType == 'n') {
            message = new CustomMarketOrderReplacedMessage();
        } else if (messageType == 'r') {
            message = new CustomMarketOrderDeletedMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'e') {
            message = new SpreadExecutedMessage();
        } else if (messageType == 'P') {
            message = new TradeSpreadExecutionChainMessage();
        } else if (messageType == 'u') {
            message = new CustomMarketExecutedMessage();
        } else if (messageType == 'p') {
            message = new CustomMarketTradeMessage();
        } else if (messageType == 'B') {
            message = new TradeCancellationMessage();
        } else if (messageType == 'Z') {
            message = new EquilibriumPriceAuctionInfoMessage();
        } else if (messageType == 't') {
            message = new OpenHighLowLastTradeAdjustmentMessage();
        } else if (messageType == 'Y') {
            message = new MarketSettlementMessage();
        } else if (messageType == 'x') {
            message = new AdHocTextMessage();
        } else if (messageType == 'q') {
            message = new RequestForQuoteMessage();
        } else if (messageType == 'W') {
            message = new AnomalousOrderThresholdPublishMessage();
        } else if (messageType == 'V') {
            message = new VolumeAndOpenInterestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
