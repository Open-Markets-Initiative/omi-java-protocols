package omi.nyse.texasequities.trades.pillar.v2_6_a.dispatch;

import java.util.Optional;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.HeartbeatResponseMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.MessageUnavailableMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.RefreshHeaderMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.RefreshRequestMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.RequestResponseMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.RetransmissionRequestMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SecurityStatusMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SourceTimeReferenceMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.StockSummaryMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SymbolClearMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SymbolIndexMappingMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TradeCancelMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TradeCorrectionMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TradeMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TrfFractionalPriorDayTradeCancelMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TrfFractionalPriorDayTradeMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TrfFractionalTradeCorrectionMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TrfFractionalTradeMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.messages.application.TrfTradeCancelMessage;
import omi.nyse.texasequities.trades.pillar.v2_6_a.types.Message;

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
