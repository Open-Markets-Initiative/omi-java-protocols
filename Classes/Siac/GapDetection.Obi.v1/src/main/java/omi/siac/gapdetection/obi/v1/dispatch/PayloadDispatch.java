package omi.siac.gapdetection.obi.v1.dispatch;

import java.util.Optional;
import omi.siac.gapdetection.obi.v1.messages.session.AdministrativeMessage;
import omi.siac.gapdetection.obi.v1.messages.session.ControlMessage;
import omi.siac.gapdetection.obi.v1.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Category.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Category selects.
     *
     * @param messageCategory the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageCategory, byte[] data, int offset, int end) {
        Message message;
        if (messageCategory == 'C') {
            message = new AdministrativeMessage();
        } else if (messageCategory == 'H') {
            message = new ControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
