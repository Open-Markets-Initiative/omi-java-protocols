package omi.nasdaq.nsmequities.orders.ouch.v5_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AiqCanceledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelPendingMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelRejectMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CanceledMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.DisableOrderEntryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnableOrderEntryResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.MassCancelResponseMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderAcceptedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderModifiedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderPriorityUpdateMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.OrderRestatedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.RejectedOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ReplacedMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;

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
            message = new OrderAcceptedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new ReplacedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new CanceledMessage();
        } else if (sequencedMessageType == 'D') {
            message = new AiqCanceledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
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
        } else if (sequencedMessageType == 'R') {
            message = new OrderRestatedMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new AccountQueryResponseMessage();
        } else if (sequencedMessageType == 'X') {
            message = new MassCancelResponseMessage();
        } else if (sequencedMessageType == 'G') {
            message = new DisableOrderEntryResponseMessage();
        } else if (sequencedMessageType == 'K') {
            message = new EnableOrderEntryResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
