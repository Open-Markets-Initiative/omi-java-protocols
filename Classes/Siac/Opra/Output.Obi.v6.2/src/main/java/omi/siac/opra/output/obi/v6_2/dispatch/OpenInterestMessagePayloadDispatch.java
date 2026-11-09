package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.OpenInterestMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Selects the message a Open Interest Message Payload branch holds by its Open Interest Message Type.
 */
public final class OpenInterestMessagePayloadDispatch {

    private OpenInterestMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Open Interest Message Type selects.
     *
     * @param openInterestMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char openInterestMessageType, byte[] data, int offset, int end) {
        Message message;
        if (openInterestMessageType == ' ') {
            message = new OpenInterestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
