package omi.siac.cqs.output.cta.v2_10_a.dispatch;

import java.util.Optional;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.AuctionStatusMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.LongQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.ShortQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.messages.application.SpecialLongQuoteMessage;
import omi.siac.cqs.output.cta.v2_10_a.types.Message;

/**
 * Selects the message a Quote Message Payload branch holds by its Quote Message Type.
 */
public final class QuoteMessagePayloadDispatch {

    private QuoteMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Quote Message Type selects.
     *
     * @param quoteMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char quoteMessageType, byte[] data, int offset, int end) {
        Message message;
        if (quoteMessageType == 'A') {
            message = new AuctionStatusMessage();
        } else if (quoteMessageType == 'L') {
            message = new LongQuoteMessage();
        } else if (quoteMessageType == 'Q') {
            message = new ShortQuoteMessage();
        } else if (quoteMessageType == 'S') {
            message = new SpecialLongQuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
