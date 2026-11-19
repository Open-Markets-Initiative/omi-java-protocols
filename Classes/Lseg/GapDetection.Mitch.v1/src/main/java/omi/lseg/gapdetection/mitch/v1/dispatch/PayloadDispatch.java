package omi.lseg.gapdetection.mitch.v1.dispatch;

import java.util.Optional;
import omi.lseg.gapdetection.mitch.v1.messages.application.ApplicationMessage;
import omi.lseg.gapdetection.mitch.v1.messages.application.TimeMessage;
import omi.lseg.gapdetection.mitch.v1.types.Message;

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
        if (messageType == 84L) {
            message = new TimeMessage();
        } else if (messageType == 83L) {
            message = new ApplicationMessage();
        } else if (messageType == 82L) {
            message = new ApplicationMessage();
        } else if (messageType == 72L) {
            message = new ApplicationMessage();
        } else if (messageType == 65L) {
            message = new ApplicationMessage();
        } else if (messageType == 70L) {
            message = new ApplicationMessage();
        } else if (messageType == 68L) {
            message = new ApplicationMessage();
        } else if (messageType == 85L) {
            message = new ApplicationMessage();
        } else if (messageType == 121L) {
            message = new ApplicationMessage();
        } else if (messageType == 69L) {
            message = new ApplicationMessage();
        } else if (messageType == 67L) {
            message = new ApplicationMessage();
        } else if (messageType == 80L) {
            message = new ApplicationMessage();
        } else if (messageType == 81L) {
            message = new ApplicationMessage();
        } else if (messageType == 73L) {
            message = new ApplicationMessage();
        } else if (messageType == 119L) {
            message = new ApplicationMessage();
        } else if (messageType == 113L) {
            message = new ApplicationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
