package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.dispatch;

import java.util.Optional;
import java.util.OptionalLong;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.ApplicationLayerRejectMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.AuctionPriceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.AuctionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.DmmSymbolReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.EquitiesSymbolReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.ExecutionReportMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.GtBeginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.GtEndMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.ManualActionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.MinimumPriceVariantClassReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.MinimumPriceVariantLevelReferenceDataMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.MmidConfigurationMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.MpidConfigurationMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.OrderAndCancelReplaceAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.OrderModifyCancelRequestAcknowledgmentAndUroutMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.OrderPriorityUpdateAcknowledgmentMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.RiskControlAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.RiskControlAlertMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.SessionConfigurationAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.SymbolSubscriptionAcknowledgementMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.TradeBustCorrectMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;

/**
 * Selects the message a Server Sequenced Message branch holds by its Seq Msg Type.
 */
public final class ServerSequencedMessageDispatch {

    private ServerSequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Seq Msg Type selects, given none of the values outside it that its rules read.
     *
     * @param seqMsgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long seqMsgType, byte[] data, int offset, int end) {
        return decode(seqMsgType, OptionalLong.empty(), data, offset, end);
    }

    /**
     * Decodes the message a Seq Msg Type selects.
     *
     * @param seqMsgType the value read ahead of the message
     * @param seqMsgLengthInput the SeqMsgLength outside the message, where its reader has it
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long seqMsgType, OptionalLong seqMsgLengthInput, byte[] data, int offset, int end) {
        Message message;
        if (seqMsgType == 562L) {
            message = new EquitiesSymbolReferenceDataMessage();
        } else if (seqMsgType == 2098L) {
            message = new DmmSymbolReferenceDataMessage();
        } else if (seqMsgType == 560L) {
            message = new MinimumPriceVariantClassReferenceDataMessage();
        } else if (seqMsgType == 561L) {
            message = new MinimumPriceVariantLevelReferenceDataMessage();
        } else if (seqMsgType == 626L) {
            message = new MpidConfigurationMessage();
        } else if (seqMsgType == 627L) {
            message = new MmidConfigurationMessage();
        } else if (seqMsgType == 545L) {
            message = new SessionConfigurationAcknowledgementMessage();
        } else if (seqMsgType == 608L) {
            message = new OrderAndCancelReplaceAcknowledgementMessage();
        } else if (seqMsgType == 625L) {
            message = new OrderModifyCancelRequestAcknowledgmentAndUroutMessage();
        } else if (seqMsgType == 610L) {
            message = new OrderPriorityUpdateAcknowledgmentMessage();
        } else if (seqMsgType == 656L) {
            message = new ExecutionReportMessage();
        } else if (seqMsgType == 658L) {
            message = new TradeBustCorrectMessage();
        } else if (seqMsgType == 611L) {
            message = new ApplicationLayerRejectMessage();
        } else if (seqMsgType == 839L) {
            message = new SymbolSubscriptionAcknowledgementMessage();
        } else if (seqMsgType == 841L) {
            message = new GtBeginMessage();
        } else if (seqMsgType == 848L) {
            message = new GtEndMessage();
        } else if (seqMsgType == 850L) {
            message = new AuctionPriceDataMessage();
        } else if (seqMsgType == 840L) {
            message = new AuctionRequestMessage();
        } else if (seqMsgType == 851L) {
            message = new ManualActionRequestMessage();
        } else if (seqMsgType == 818L) {
            message = new RiskControlAcknowledgementMessage();
        } else if (seqMsgType == 819L) {
            message = new RiskControlAlertMessage();
        } else {
            return Optional.empty();
        }

        if (message instanceof OrderAndCancelReplaceAcknowledgementMessage selected && seqMsgLengthInput.isPresent()) {
            selected.seqMsgLengthInput(seqMsgLengthInput.getAsLong());
        }
        if (message instanceof ExecutionReportMessage selected && seqMsgLengthInput.isPresent()) {
            selected.seqMsgLengthInput(seqMsgLengthInput.getAsLong());
        }
        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
