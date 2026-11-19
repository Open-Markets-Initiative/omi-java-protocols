package omi.nyse.nyseequities.depthfeedrequest.pillar.v1_7.dispatch;

import java.util.Optional;
import omi.nyse.nyseequities.depthfeedrequest.pillar.v1_7.messages.application.RequestResponseMessage;
import omi.nyse.nyseequities.depthfeedrequest.pillar.v1_7.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Message Type.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
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
        if (messageType == 11L) {
            message = new RequestResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
