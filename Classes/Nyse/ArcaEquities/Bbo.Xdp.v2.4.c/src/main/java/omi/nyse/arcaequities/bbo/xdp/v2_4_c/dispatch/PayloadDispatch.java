package omi.nyse.arcaequities.bbo.xdp.v2_4_c.dispatch;

import java.util.Optional;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.HeartbeatResponseMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.MessageUnavailableMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.QuoteMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.RefreshHeaderMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.RefreshRequestMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.RequestResponseMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.RetransmissionRequestMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SecurityStatusMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SequenceNumberResetMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SourceTimeReferenceMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SymbolClearMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SymbolIndexMappingMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.messages.application.TradingSessionChangeMessage;
import omi.nyse.arcaequities.bbo.xdp.v2_4_c.types.Message;

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
            message = new SequenceNumberResetMessage();
        } else if (messageType == 2L) {
            message = new SourceTimeReferenceMessage();
        } else if (messageType == 3L) {
            message = new SymbolIndexMappingMessage();
        } else if (messageType == 10L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 11L) {
            message = new RequestResponseMessage();
        } else if (messageType == 12L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 13L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 15L) {
            message = new RefreshRequestMessage();
        } else if (messageType == 31L) {
            message = new MessageUnavailableMessage();
        } else if (messageType == 32L) {
            message = new SymbolClearMessage();
        } else if (messageType == 33L) {
            message = new TradingSessionChangeMessage();
        } else if (messageType == 34L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 140L) {
            message = new QuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
