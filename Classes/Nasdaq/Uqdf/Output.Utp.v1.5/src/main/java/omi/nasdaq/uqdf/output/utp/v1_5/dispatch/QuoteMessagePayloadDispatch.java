package omi.nasdaq.uqdf.output.utp.v1_5.dispatch;

import java.util.Optional;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.FinraAdfMarketParticipantQuotationMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.QuoteLongFormMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.QuoteShortFormMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;

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
        if (quoteMessageType == 'E') {
            message = new QuoteShortFormMessage();
        } else if (quoteMessageType == 'F') {
            message = new QuoteLongFormMessage();
        } else if (quoteMessageType == 'M') {
            message = new FinraAdfMarketParticipantQuotationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
