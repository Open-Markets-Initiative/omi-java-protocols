package omi.lme.lmeselect.referencedata.lmesource.v4_18.dispatch;

import java.util.Optional;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.ContractDefinitionMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.OutrightDefinitionMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.PriceLimitsMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.SequenceResetMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.StrategyDefinitionMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.messages.application.TradeStatisticsEndOfDayMessage;
import omi.lme.lmeselect.referencedata.lmesource.v4_18.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 100L) {
            message = new SequenceResetMessage();
        } else if (msgType == 300L) {
            message = new ContractDefinitionMessage();
        } else if (msgType == 301L) {
            message = new OutrightDefinitionMessage();
        } else if (msgType == 302L) {
            message = new StrategyDefinitionMessage();
        } else if (msgType == 305L) {
            message = new PriceLimitsMessage();
        } else if (msgType == 351L) {
            message = new TradeStatisticsEndOfDayMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
