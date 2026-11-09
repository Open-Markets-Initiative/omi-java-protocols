package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.dispatch;

import java.util.Optional;
import java.util.OptionalLong;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.BulkCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ManualActionResponseMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.NewOrderSingleAndCancelReplaceRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderModifyRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskActionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskLimitUpdateRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SequencedFillerMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SessionConfigurationRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SymbolSubscriptionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgBeginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgEndMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;

/**
 * Selects the message a Client Sequenced Message branch holds by its Seq Msg Type.
 */
public final class ClientSequencedMessageDispatch {

    private ClientSequencedMessageDispatch() {
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
        if (seqMsgType == 544L) {
            message = new SessionConfigurationRequestMessage();
        } else if (seqMsgType == 642L) {
            message = new SequencedFillerMessage();
        } else if (seqMsgType == 576L) {
            message = new NewOrderSingleAndCancelReplaceRequestMessage();
        } else if (seqMsgType == 640L) {
            message = new OrderCancelRequestMessage();
        } else if (seqMsgType == 624L) {
            message = new OrderModifyRequestMessage();
        } else if (seqMsgType == 641L) {
            message = new BulkCancelRequestMessage();
        } else if (seqMsgType == 838L) {
            message = new SymbolSubscriptionRequestMessage();
        } else if (seqMsgType == 835L) {
            message = new TgBeginMessage();
        } else if (seqMsgType == 836L) {
            message = new TgEndMessage();
        } else if (seqMsgType == 852L) {
            message = new ManualActionResponseMessage();
        } else if (seqMsgType == 816L) {
            message = new RiskLimitUpdateRequestMessage();
        } else if (seqMsgType == 817L) {
            message = new RiskActionRequestMessage();
        } else {
            return Optional.empty();
        }

        if (message instanceof NewOrderSingleAndCancelReplaceRequestMessage selected && seqMsgLengthInput.isPresent()) {
            selected.seqMsgLengthInput(seqMsgLengthInput.getAsLong());
        }
        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
