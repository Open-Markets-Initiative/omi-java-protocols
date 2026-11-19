package omi.cboe.gapdetection.pitch.v6.dispatch;

import java.util.Optional;
import omi.cboe.gapdetection.pitch.v6.messages.application.ApplicationMessage;
import omi.cboe.gapdetection.pitch.v6.messages.application.TimeMessage;
import omi.cboe.gapdetection.pitch.v6.messages.application.TimeReferenceMessage;
import omi.cboe.gapdetection.pitch.v6.types.Message;

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
     * @return the selected message, decoded where its bytes allow
     */
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 177L) {
            message = new TimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else {
            message = new ApplicationMessage();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
