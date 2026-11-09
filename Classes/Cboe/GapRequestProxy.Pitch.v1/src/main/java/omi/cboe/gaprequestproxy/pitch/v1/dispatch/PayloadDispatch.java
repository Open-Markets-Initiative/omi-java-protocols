package omi.cboe.gaprequestproxy.pitch.v1.dispatch;

import java.util.Optional;
import omi.cboe.gaprequestproxy.pitch.v1.messages.application.GapRequestMessage;
import omi.cboe.gaprequestproxy.pitch.v1.messages.application.GapResponseMessage;
import omi.cboe.gaprequestproxy.pitch.v1.messages.application.LoginMessage;
import omi.cboe.gaprequestproxy.pitch.v1.messages.application.LoginResponseMessage;
import omi.cboe.gaprequestproxy.pitch.v1.types.Message;

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
        if (messageType == 1L) {
            message = new LoginMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 3L) {
            message = new GapRequestMessage();
        } else if (messageType == 4L) {
            message = new GapResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
