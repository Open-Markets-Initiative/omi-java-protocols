package omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.AcceptedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.AiqCancelledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.CancelPendingMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.CancelRejectMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.CanceledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.ExecutedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.ExecutedWithReferencePriceMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.OrderModifiedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.OrderPriorityUpdateMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.RejectedOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.ReplacedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.SequencedTradeNowMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AcceptedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new ReplacedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new CanceledMessage();
        } else if (sequencedMessageType == 'D') {
            message = new AiqCancelledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutedMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'G') {
            message = new ExecutedWithReferencePriceMessage();
        } else if (sequencedMessageType == 'F') {
            message = new TradeCorrectionMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedOrderMessage();
        } else if (sequencedMessageType == 'P') {
            message = new CancelPendingMessage();
        } else if (sequencedMessageType == 'I') {
            message = new CancelRejectMessage();
        } else if (sequencedMessageType == 'T') {
            message = new OrderPriorityUpdateMessage();
        } else if (sequencedMessageType == 'M') {
            message = new OrderModifiedMessage();
        } else if (sequencedMessageType == 'N') {
            message = new SequencedTradeNowMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
