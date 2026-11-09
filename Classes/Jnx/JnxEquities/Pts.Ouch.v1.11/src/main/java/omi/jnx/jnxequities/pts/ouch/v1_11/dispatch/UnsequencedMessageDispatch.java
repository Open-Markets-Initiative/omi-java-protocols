package omi.jnx.jnxequities.pts.ouch.v1_11.dispatch;

import java.util.Optional;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.CancelOrderMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.EnterOrderMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.messages.application.ReplaceOrderMessage;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Unsequenced Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Unsequenced Message Type selects.
     *
     * @param unsequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char unsequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (unsequencedMessageType == 'O') {
            message = new EnterOrderMessage();
        } else if (unsequencedMessageType == 'U') {
            message = new ReplaceOrderMessage();
        } else if (unsequencedMessageType == 'X') {
            message = new CancelOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
