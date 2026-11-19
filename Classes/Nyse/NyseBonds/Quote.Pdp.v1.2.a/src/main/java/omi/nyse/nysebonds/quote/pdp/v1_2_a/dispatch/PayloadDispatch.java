package omi.nyse.nysebonds.quote.pdp.v1_2_a.dispatch;

import java.util.Optional;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.HeartbeatMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.MessageUnavailableMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.QuoteMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.RefreshQuoteMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application.SymbolIndexMappingMessage;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.types.Message;

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
        if (msgType == 1L) {
            message = new SequenceNumberResetMessage();
        } else if (msgType == 2L) {
            message = new HeartbeatMessage();
        } else if (msgType == 5L) {
            message = new MessageUnavailableMessage();
        } else if (msgType == 23L) {
            message = new RefreshQuoteMessage();
        } else if (msgType == 26L) {
            message = new SymbolIndexMappingMessage();
        } else if (msgType == 141L) {
            message = new QuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
