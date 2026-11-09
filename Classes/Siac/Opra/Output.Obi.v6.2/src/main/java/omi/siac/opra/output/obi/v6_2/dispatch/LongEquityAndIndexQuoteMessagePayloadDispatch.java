package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.LongEquityAndIndexQuoteMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Selects the message a Long Equity And Index Quote Message Payload branch holds by its Long Equity And Index Quote Message Type.
 */
public final class LongEquityAndIndexQuoteMessagePayloadDispatch {

    private LongEquityAndIndexQuoteMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Long Equity And Index Quote Message Type selects.
     *
     * @param longEquityAndIndexQuoteMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char longEquityAndIndexQuoteMessageType, byte[] data, int offset, int end) {
        Message message;
        if (longEquityAndIndexQuoteMessageType == ' ') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'F') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'I') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'R') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'T') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'A') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'B') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'O') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'C') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'X') {
            message = new LongEquityAndIndexQuoteMessage();
        } else if (longEquityAndIndexQuoteMessageType == 'Y') {
            message = new LongEquityAndIndexQuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
