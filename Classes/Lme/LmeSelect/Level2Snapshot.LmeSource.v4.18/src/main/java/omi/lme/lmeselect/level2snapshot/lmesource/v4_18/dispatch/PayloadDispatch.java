package omi.lme.lmeselect.level2snapshot.lmesource.v4_18.dispatch;

import java.util.Optional;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.AggregateOrderBookMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.IndicativeOpeningPriceMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.MarketStateContractMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.MarketStateInstrumentMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.QuoteRequestMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.RefreshCompleteMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application.SequenceResetMessage;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.types.Message;

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
        } else if (msgType == 311L) {
            message = new MarketStateContractMessage();
        } else if (msgType == 312L) {
            message = new MarketStateInstrumentMessage();
        } else if (msgType == 320L) {
            message = new IndicativeOpeningPriceMessage();
        } else if (msgType == 329L) {
            message = new QuoteRequestMessage();
        } else if (msgType == 322L) {
            message = new AggregateOrderBookMessage();
        } else if (msgType == 203L) {
            message = new RefreshCompleteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
