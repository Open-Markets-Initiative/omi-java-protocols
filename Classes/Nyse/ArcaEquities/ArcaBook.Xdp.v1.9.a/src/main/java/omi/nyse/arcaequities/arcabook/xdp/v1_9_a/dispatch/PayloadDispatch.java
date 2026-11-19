package omi.nyse.arcaequities.arcabook.xdp.v1_9_a.dispatch;

import java.util.Optional;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.AddOrderMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.AddOrderRefreshMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.AttributedAddOrderMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.AttributedAddOrderRefreshMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.DeleteOrderMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.ExecutionMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.ImbalanceMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.messages.application.ModifyOrderMessage;
import omi.nyse.arcaequities.arcabook.xdp.v1_9_a.types.Message;

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
        if (messageType == 100L) {
            message = new AddOrderMessage();
        } else if (messageType == 107L) {
            message = new AttributedAddOrderMessage();
        } else if (messageType == 101L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 102L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 103L) {
            message = new ExecutionMessage();
        } else if (messageType == 106L) {
            message = new AddOrderRefreshMessage();
        } else if (messageType == 108L) {
            message = new AttributedAddOrderRefreshMessage();
        } else if (messageType == 105L) {
            message = new ImbalanceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
