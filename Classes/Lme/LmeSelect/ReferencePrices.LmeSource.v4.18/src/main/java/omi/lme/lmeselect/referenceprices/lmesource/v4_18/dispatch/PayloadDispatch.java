package omi.lme.lmeselect.referenceprices.lmesource.v4_18.dispatch;

import java.util.Optional;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application.ReferenceForwardCurvePriceMessage;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application.ReferenceFxRateMessage;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application.ReferencePriceMessage;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application.ReferenceVolatilityPriceMessage;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application.SequenceResetMessage;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.Message;

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
        } else if (msgType == 401L) {
            message = new ReferencePriceMessage();
        } else if (msgType == 402L) {
            message = new ReferenceForwardCurvePriceMessage();
        } else if (msgType == 403L) {
            message = new ReferenceFxRateMessage();
        } else if (msgType == 404L) {
            message = new ReferenceVolatilityPriceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
