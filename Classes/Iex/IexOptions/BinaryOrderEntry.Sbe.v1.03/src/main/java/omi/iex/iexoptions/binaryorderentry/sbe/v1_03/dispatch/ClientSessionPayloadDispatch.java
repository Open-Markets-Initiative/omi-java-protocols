package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.dispatch;

import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.ClientHeartbeatMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.LoginRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.LogoutRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SequencedMessageHeaderMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SubsessionJoinMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SubsessionLeaveMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;

/**
 * Selects the message a Client Session Payload branch holds by its Template Id.
 */
public final class ClientSessionPayloadDispatch {

    private ClientSessionPayloadDispatch() {
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
        if (templateId == 1L) {
            message = new LoginRequestMessage();
        } else if (templateId == 4L) {
            message = new ClientHeartbeatMessage();
        } else if (templateId == 5L) {
            message = new LogoutRequestMessage();
        } else if (templateId == 7L) {
            message = new SequencedMessageHeaderMessage();
        } else if (templateId == 8L) {
            message = new SubsessionJoinMessage();
        } else if (templateId == 10L) {
            message = new SubsessionLeaveMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
