package omi.tadawul.saudiexchange.lv3.mwz.v4_0.dispatch;

import java.util.Optional;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.AddOrderMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.DeleteOrderMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.DisconnectMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.ExecutedOrderMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.ExecutedOrderWithPriceMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.IndicativePriceOrQuantityMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.ReplaceOrderMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.SystemEventMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.TradeMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.messages.application.TradingActionMessage;
import omi.tadawul.saudiexchange.lv3.mwz.v4_0.types.Message;

/**
 * Selects the message a Message branch holds by its Message Type.
 */
public final class MessageDispatch {

    private MessageDispatch() {
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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 1L) {
            message = new DisconnectMessage();
        } else if (messageType == 38L) {
            message = new TradingActionMessage();
        } else if (messageType == 39L) {
            message = new AddOrderMessage();
        } else if (messageType == 40L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 41L) {
            message = new ReplaceOrderMessage();
        } else if (messageType == 42L) {
            message = new ExecutedOrderMessage();
        } else if (messageType == 43L) {
            message = new ExecutedOrderWithPriceMessage();
        } else if (messageType == 44L) {
            message = new TradeMessage();
        } else if (messageType == 45L) {
            message = new SystemEventMessage();
        } else if (messageType == 46L) {
            message = new IndicativePriceOrQuantityMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
