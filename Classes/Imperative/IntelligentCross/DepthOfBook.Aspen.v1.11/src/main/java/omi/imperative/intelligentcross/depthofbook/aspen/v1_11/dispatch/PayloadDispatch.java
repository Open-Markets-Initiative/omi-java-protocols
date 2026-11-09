package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.dispatch;

import java.util.Optional;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.MarketEventMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.NewOrderAddMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.OrderCancelAllMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.OrderExecutedMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.OrderPartialCancelMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.OrderUpdatedMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.SymbolInformationMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.SymbolStateMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.TradeBreakMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application.TradeMessage;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.types.Message;

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
        } else if (messageType == 'H') {
            message = new OrderUpdatedMessage();
        } else if (messageType == 'J') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'K') {
            message = new TradeMessage();
        } else if (messageType == 'M') {
            message = new TradeBreakMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
