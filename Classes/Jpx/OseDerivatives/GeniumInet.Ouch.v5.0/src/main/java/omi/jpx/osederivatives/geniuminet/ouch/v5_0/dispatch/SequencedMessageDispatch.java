package omi.jpx.osederivatives.geniuminet.ouch.v5_0.dispatch;

import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.MassCancelAccepted;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.OrderAccepted;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.OrderCanceled;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.OrderExecuted;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.OrderRejected;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.OrderReplaced;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Message;

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
        if (sequencedMessageType == 'A') {
            message = new OrderAccepted();
        } else if (sequencedMessageType == 'M') {
            message = new MassCancelAccepted();
        } else if (sequencedMessageType == 'J') {
            message = new OrderRejected();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplaced();
        } else if (sequencedMessageType == 'C') {
            message = new OrderCanceled();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecuted();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
