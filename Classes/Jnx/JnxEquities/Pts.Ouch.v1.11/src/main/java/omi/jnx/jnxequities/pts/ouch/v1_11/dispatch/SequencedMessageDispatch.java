package omi.jnx.jnxequities.pts.ouch.v1_11.dispatch;

import java.util.Optional;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderAcceptedMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderAiqCanceledMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderCanceledMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderExecutedMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderRejectedMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.OrderReplacedMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.SystemEventMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.Message;

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
            message = new OrderReplacedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderCanceledMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderAiqCanceledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'J') {
            message = new OrderRejectedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
