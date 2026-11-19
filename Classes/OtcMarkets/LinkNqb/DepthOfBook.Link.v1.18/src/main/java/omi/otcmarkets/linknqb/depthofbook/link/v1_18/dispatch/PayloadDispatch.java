package omi.otcmarkets.linknqb.depthofbook.link.v1_18.dispatch;

import java.util.Optional;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.EndOfSpinMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.ImbalanceMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.OrderAddMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.OrderDeleteMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.OrderExecutionMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.OrderExecutionWithPriceMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.OrderUpdateMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.SecurityMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.StartOfSpinMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.SystemRecoveryEventMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.TradeMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application.TradingSessionMessage;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 11L) {
            message = new StartOfSpinMessage();
        } else if (messageType == 12L) {
            message = new EndOfSpinMessage();
        } else if (messageType == 20L) {
            message = new TradingSessionMessage();
        } else if (messageType == 9L) {
            message = new SecurityMessage();
        } else if (messageType == 21L) {
            message = new OrderAddMessage();
        } else if (messageType == 22L) {
            message = new OrderUpdateMessage();
        } else if (messageType == 23L) {
            message = new OrderDeleteMessage();
        } else if (messageType == 24L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 25L) {
            message = new OrderExecutionWithPriceMessage();
        } else if (messageType == 26L) {
            message = new TradeMessage();
        } else if (messageType == 28L) {
            message = new ImbalanceMessage();
        } else if (messageType == 74L) {
            message = new SystemRecoveryEventMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
