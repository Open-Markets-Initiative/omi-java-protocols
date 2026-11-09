package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.dispatch;

import java.util.Optional;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.AddOrderMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.AddOrderRefreshMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.CrossCorrectionMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.CrossTradeMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.DeleteOrderMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.ImbalanceMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.MessageUnavailableMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.ModifyOrderMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.NonDisplayedTradeMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.OrderExecutionMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.ReplaceOrderMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.RetailPriceImprovementMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.SecurityStatusMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.SequenceNumberResetMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.SourceTimeReferenceMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.SymbolClearMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.messages.application.TradeCancelMessage;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.types.Message;

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
        } else if (messageType == 31L) {
            message = new MessageUnavailableMessage();
        } else if (messageType == 100L) {
            message = new AddOrderMessage();
        } else if (messageType == 101L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 102L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 103L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 104L) {
            message = new ReplaceOrderMessage();
        } else if (messageType == 105L) {
            message = new ImbalanceMessage();
        } else if (messageType == 106L) {
            message = new AddOrderRefreshMessage();
        } else if (messageType == 110L) {
            message = new NonDisplayedTradeMessage();
        } else if (messageType == 111L) {
            message = new CrossTradeMessage();
        } else if (messageType == 112L) {
            message = new TradeCancelMessage();
        } else if (messageType == 113L) {
            message = new CrossCorrectionMessage();
        } else if (messageType == 114L) {
            message = new RetailPriceImprovementMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
