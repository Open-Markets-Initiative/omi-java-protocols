package omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.dispatch;

import java.util.Optional;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.AddOrderRefreshMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.ImbalanceMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.RefreshHeaderMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.SecurityStatusMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.SequenceNumberResetMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.SourceTimeReferenceMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.messages.application.SymbolIndexMappingMessage;
import omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.types.Message;

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
        } else if (messageType == 34L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 105L) {
            message = new ImbalanceMessage();
        } else if (messageType == 106L) {
            message = new AddOrderRefreshMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
