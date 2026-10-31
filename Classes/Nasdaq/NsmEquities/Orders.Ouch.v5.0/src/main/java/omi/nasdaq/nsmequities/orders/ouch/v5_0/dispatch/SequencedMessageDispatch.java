package omi.nasdaq.nsmequities.orders.ouch.v5_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 *
 * <p>Messages it may select that this library does not decode: OrderAcceptedMessage, ReplacedMessage, CanceledMessage, AiqCanceledMessage, OrderExecutedMessage, BrokenTradeMessage, RejectedOrderMessage, CancelPendingMessage, CancelRejectMessage, OrderPriorityUpdateMessage, OrderModifiedMessage, OrderRestatedMessage, AccountQueryResponseMessage, MassCancelResponseMessage, DisableOrderEntryResponseMessage, EnableOrderEntryResponseMessage.</p>
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
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
