package omi.cme.globex.mdp3.sbe.v1_9.dispatch;

import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.MarketDataRequest;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.Negotiate;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.SecurityListRequest;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.SecurityStatusRequest;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.SubscriberHeartbeat;
import omi.cme.globex.mdp3.sbe.v1_9.messages.application.Terminate;
import omi.cme.globex.mdp3.sbe.v1_9.types.Message;

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
        if (templateId == 200L) {
            message = new Negotiate();
        } else if (templateId == 203L) {
            message = new Terminate();
        } else if (templateId == 205L) {
            message = new MarketDataRequest();
        } else if (templateId == 208L) {
            message = new SecurityListRequest();
        } else if (templateId == 209L) {
            message = new SecurityStatusRequest();
        } else if (templateId == 210L) {
            message = new SubscriberHeartbeat();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
