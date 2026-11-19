package omi.nyse.nyseequities.bqt.xdp.v1_7_a.dispatch;

import java.util.Optional;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.BqtMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedSecurityStatusMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedSingleSidedQuoteMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedStockSummaryMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedSymbolClearMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedTradeCancelMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedTradeCorrectionMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedTradeMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedTradingSessionChangeMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.ConsolidatedVolumeMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.HeartbeatResponseMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.MessageUnavailableMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.RefreshHeaderMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.RefreshRequestMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.RequestResponseMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.RetransmissionRequestMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.types.Message;

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
            message = new ConsolidatedSymbolClearMessage();
        } else if (messageType == 33L) {
            message = new ConsolidatedTradingSessionChangeMessage();
        } else if (messageType == 34L) {
            message = new ConsolidatedSecurityStatusMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 142L) {
            message = new BqtMessage();
        } else if (messageType == 143L) {
            message = new ConsolidatedSingleSidedQuoteMessage();
        } else if (messageType == 220L) {
            message = new ConsolidatedTradeMessage();
        } else if (messageType == 221L) {
            message = new ConsolidatedTradeCancelMessage();
        } else if (messageType == 222L) {
            message = new ConsolidatedTradeCorrectionMessage();
        } else if (messageType == 229L) {
            message = new ConsolidatedStockSummaryMessage();
        } else if (messageType == 240L) {
            message = new ConsolidatedVolumeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
