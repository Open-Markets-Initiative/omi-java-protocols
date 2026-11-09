package omi.nyse.nationalequities.trades.pillar.v2_6.dispatch;

import java.util.Optional;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.HeartbeatResponseMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.MessageUnavailableMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.RefreshHeaderMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.RefreshRequestMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.RequestResponseMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.RetransmissionRequestMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SecurityStatusMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SequenceNumberResetMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SourceTimeReferenceMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.StockSummaryMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SymbolClearMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TradeCancelMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TradeCorrectionMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TradeMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TrfFractionalPriorDayTradeCancelMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TrfFractionalPriorDayTradeMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TrfFractionalTradeCorrectionMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TrfFractionalTradeMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.messages.application.TrfTradeCancelMessage;
import omi.nyse.nationalequities.trades.pillar.v2_6.types.Message;

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
        } else if (messageType == 220L) {
            message = new TradeMessage();
        } else if (messageType == 221L) {
            message = new TradeCancelMessage();
        } else if (messageType == 222L) {
            message = new TradeCorrectionMessage();
        } else if (messageType == 223L) {
            message = new StockSummaryMessage();
        } else if (messageType == 210L) {
            message = new TrfFractionalTradeMessage();
        } else if (messageType == 216L) {
            message = new TrfTradeCancelMessage();
        } else if (messageType == 212L) {
            message = new TrfFractionalTradeCorrectionMessage();
        } else if (messageType == 213L) {
            message = new TrfFractionalPriorDayTradeMessage();
        } else if (messageType == 214L) {
            message = new TrfFractionalPriorDayTradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
