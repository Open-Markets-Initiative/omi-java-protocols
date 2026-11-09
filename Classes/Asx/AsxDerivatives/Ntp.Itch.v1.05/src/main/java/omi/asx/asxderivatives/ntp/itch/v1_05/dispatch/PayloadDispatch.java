package omi.asx.asxderivatives.ntp.itch.v1_05.dispatch;

import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.AddOrderMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.AnomalousOrderThresholdPublishMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.AuctionOrderExecutedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.BundlesSymbolDirectory;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.CombinationOrderExecutedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.CombinationSymbolDirectoryMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.CombinationTradeExecutedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.EndOfBusinessTradeDateMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.EquilibriumPriceMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.FutureSymbolDirectoryMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.ImpliedOrderAddedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.ImpliedOrderDeletedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.ImpliedOrderReplacedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.MarketSettlementMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OpenHighLowLastTradeAdjustmentMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OptionsSymbolDirectoryMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OrderBookStateMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OrderDeletedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OrderExecutedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.OrderVolumeCancelledMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.RequestForQuoteMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.SecondsMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.TextMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.TradeCancellationMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.TradeExecutedMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.VolumeAndOpenInterestMessage;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;

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
            message = new SecondsMessage();
        } else if (messageType == 'S') {
            message = new EndOfBusinessTradeDateMessage();
        } else if (messageType == 'f') {
            message = new FutureSymbolDirectoryMessage();
        } else if (messageType == 'h') {
            message = new OptionsSymbolDirectoryMessage();
        } else if (messageType == 'M') {
            message = new CombinationSymbolDirectoryMessage();
        } else if (messageType == 'm') {
            message = new BundlesSymbolDirectory();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'X') {
            message = new OrderVolumeCancelledMessage();
        } else if (messageType == 'D') {
            message = new OrderDeletedMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new AuctionOrderExecutedMessage();
        } else if (messageType == 'e') {
            message = new CombinationOrderExecutedMessage();
        } else if (messageType == 'j') {
            message = new ImpliedOrderAddedMessage();
        } else if (messageType == 'l') {
            message = new ImpliedOrderReplacedMessage();
        } else if (messageType == 'k') {
            message = new ImpliedOrderDeletedMessage();
        } else if (messageType == 'P') {
            message = new TradeExecutedMessage();
        } else if (messageType == 'p') {
            message = new CombinationTradeExecutedMessage();
        } else if (messageType == 'B') {
            message = new TradeCancellationMessage();
        } else if (messageType == 'Z') {
            message = new EquilibriumPriceMessage();
        } else if (messageType == 't') {
            message = new OpenHighLowLastTradeAdjustmentMessage();
        } else if (messageType == 'Y') {
            message = new MarketSettlementMessage();
        } else if (messageType == 'x') {
            message = new TextMessage();
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
