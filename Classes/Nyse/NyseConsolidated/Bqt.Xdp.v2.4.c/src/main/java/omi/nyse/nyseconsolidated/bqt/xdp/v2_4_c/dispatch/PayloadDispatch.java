package omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.dispatch;

import java.util.Optional;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.BestQuotesMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedFractionalStockSummaryMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedFractionalVolumeMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedSingleSidedQuoteMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedTradeCancelMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedTradeCorrectionMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.ConsolidatedTradeMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.HeartbeatResponseMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.MessageUnavailableMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.RefreshHeaderMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.RefreshRequestMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.RequestResponseMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.RetransmissionRequestMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SecurityStatusMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SequenceNumberResetMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SourceTimeReferenceMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SymbolClearMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.TrfFractionalPriorDayTradeCancelMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.TrfFractionalPriorDayTradeMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.TrfFractionalTradeCorrectionMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.messages.application.TrfFractionalTradeMessage;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_c.types.Message;

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
        } else if (messageType == 10L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 13L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 15L) {
            message = new RefreshRequestMessage();
        } else if (messageType == 31L) {
            message = new MessageUnavailableMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 11L) {
            message = new RequestResponseMessage();
        } else if (messageType == 12L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 142L) {
            message = new BestQuotesMessage();
        } else if (messageType == 143L) {
            message = new ConsolidatedSingleSidedQuoteMessage();
        } else if (messageType == 210L) {
            message = new TrfFractionalTradeMessage();
        } else if (messageType == 220L) {
            message = new ConsolidatedTradeMessage();
        } else if (messageType == 221L) {
            message = new ConsolidatedTradeCancelMessage();
        } else if (messageType == 212L) {
            message = new TrfFractionalTradeCorrectionMessage();
        } else if (messageType == 222L) {
            message = new ConsolidatedTradeCorrectionMessage();
        } else if (messageType == 213L) {
            message = new TrfFractionalPriorDayTradeMessage();
        } else if (messageType == 214L) {
            message = new TrfFractionalPriorDayTradeCancelMessage();
        } else if (messageType == 202L) {
            message = new ConsolidatedFractionalStockSummaryMessage();
        } else if (messageType == 201L) {
            message = new ConsolidatedFractionalVolumeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
