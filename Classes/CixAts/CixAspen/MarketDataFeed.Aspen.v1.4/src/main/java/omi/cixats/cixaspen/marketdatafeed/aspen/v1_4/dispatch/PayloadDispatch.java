package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.dispatch;

import java.util.Optional;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.MarketEventMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.NewOrderAddMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.OrderCancelAllMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.OrderExecutedMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.OrderPartialCancelMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.SymbolInformationMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.SymbolStateMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.TradeCancelMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.TradeCorrectMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application.TradeMessage;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Message;

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
        if (messageType == 'A') {
            message = new MarketEventMessage();
        } else if (messageType == 'B') {
            message = new SymbolInformationMessage();
        } else if (messageType == 'C') {
            message = new SymbolStateMessage();
        } else if (messageType == 'D') {
            message = new NewOrderAddMessage();
        } else if (messageType == 'F') {
            message = new OrderPartialCancelMessage();
        } else if (messageType == 'G') {
            message = new OrderCancelAllMessage();
        } else if (messageType == 'J') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'K') {
            message = new TradeMessage();
        } else if (messageType == 'L') {
            message = new TradeCancelMessage();
        } else if (messageType == 'M') {
            message = new TradeCorrectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
