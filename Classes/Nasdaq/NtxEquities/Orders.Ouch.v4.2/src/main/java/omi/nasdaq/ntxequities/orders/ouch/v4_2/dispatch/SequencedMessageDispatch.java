package omi.nasdaq.ntxequities.orders.ouch.v4_2.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.AcceptedMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.AiqCanceledMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.BrokenTradeMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.CancelPendingMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.CancelRejectMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.CanceledMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.ExecutedMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.OrderModifiedMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.OrderPriorityUpdateMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.RejectedMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.ReplacedMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application.SystemEventMessage;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.Message;

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
            message = new AiqCanceledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutedMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedMessage();
        } else if (sequencedMessageType == 'P') {
            message = new CancelPendingMessage();
        } else if (sequencedMessageType == 'I') {
            message = new CancelRejectMessage();
        } else if (sequencedMessageType == 'T') {
            message = new OrderPriorityUpdateMessage();
        } else if (sequencedMessageType == 'M') {
            message = new OrderModifiedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
