package omi.cme.globex.sessionmgmt.sbe.v0_2.dispatch;

import java.util.Optional;
import omi.cme.globex.sessionmgmt.sbe.v0_2.messages.application.NegotiationReject;
import omi.cme.globex.sessionmgmt.sbe.v0_2.messages.application.NegotiationResponse;
import omi.cme.globex.sessionmgmt.sbe.v0_2.messages.application.RequestAck;
import omi.cme.globex.sessionmgmt.sbe.v0_2.messages.application.RequestReject;
import omi.cme.globex.sessionmgmt.sbe.v0_2.messages.application.Terminate;
import omi.cme.globex.sessionmgmt.sbe.v0_2.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Template Id.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
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
        if (templateId == 201L) {
            message = new NegotiationReject();
        } else if (templateId == 202L) {
            message = new NegotiationResponse();
        } else if (templateId == 203L) {
            message = new Terminate();
        } else if (templateId == 206L) {
            message = new RequestAck();
        } else if (templateId == 207L) {
            message = new RequestReject();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
