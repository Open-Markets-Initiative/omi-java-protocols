package omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.dispatch;

import java.util.Optional;
import omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.messages.application.HeartbeatResponseMessage;
import omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.messages.application.RefreshRequestMessage;
import omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.messages.application.RetransmissionRequestMessage;
import omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.arcaequities.depthfeedrequest.pillar.v1_7.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Message Type.
 */
public final class ClientPayloadDispatch {

    private ClientPayloadDispatch() {
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
        if (messageType == 10L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 12L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 13L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 15L) {
            message = new RefreshRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
