package omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.dispatch;

import java.util.Optional;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.SecurityStatusMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.SequenceNumberResetMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.SourceTimeReferenceMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.StockSummaryMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.SymbolClearMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nationalequities.integratedfeedstocksummary.pillar.v2_5_g.types.Message;

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
        } else if (messageType == 32L) {
            message = new SymbolClearMessage();
        } else if (messageType == 34L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 223L) {
            message = new StockSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
