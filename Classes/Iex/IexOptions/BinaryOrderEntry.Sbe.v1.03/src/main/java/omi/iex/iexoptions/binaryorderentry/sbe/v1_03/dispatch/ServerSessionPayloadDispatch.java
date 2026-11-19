package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.dispatch;

import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.GatewayHeartbeatMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.LoginResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SequencedMessageHeaderMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SubsessionJoinResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SubsessionLeaveResponseMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.TerminateMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;

/**
 * Selects the message a Server Session Payload branch holds by its Template Id.
 */
public final class ServerSessionPayloadDispatch {

    private ServerSessionPayloadDispatch() {
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
        if (templateId == 2L) {
            message = new LoginResponseMessage();
        } else if (templateId == 3L) {
            message = new GatewayHeartbeatMessage();
        } else if (templateId == 6L) {
            message = new TerminateMessage();
        } else if (templateId == 7L) {
            message = new SequencedMessageHeaderMessage();
        } else if (templateId == 9L) {
            message = new SubsessionJoinResponseMessage();
        } else if (templateId == 11L) {
            message = new SubsessionLeaveResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
