package omi.eurex.t7.edci.fbe.v13_0.dispatch;

import java.util.Optional;
import omi.eurex.t7.edci.fbe.v13_0.messages.application.Heartbeat;
import omi.eurex.t7.edci.fbe.v13_0.messages.application.LogonRequest;
import omi.eurex.t7.edci.fbe.v13_0.messages.application.LogoutRequest;
import omi.eurex.t7.edci.fbe.v13_0.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Template Id.
 */
public final class ClientPayloadDispatch {

    private ClientPayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 10011L) {
            message = new Heartbeat();
        } else if (templateId == 10000L) {
            message = new LogonRequest();
        } else if (templateId == 10002L) {
            message = new LogoutRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
