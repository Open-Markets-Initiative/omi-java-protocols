package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.ShortEquityAndIndexQuoteMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Selects the message a Short Equity And Index Quote Message Payload branch holds by its Short Equity And Index Quote Message Type.
 */
public final class ShortEquityAndIndexQuoteMessagePayloadDispatch {

    private ShortEquityAndIndexQuoteMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Short Equity And Index Quote Message Type selects.
     *
     * @param shortEquityAndIndexQuoteMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char shortEquityAndIndexQuoteMessageType, byte[] data, int offset, int end) {
        Message message;
        if (shortEquityAndIndexQuoteMessageType == ' ') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'F') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'I') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'R') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'T') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'A') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'B') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'O') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'C') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'X') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else if (shortEquityAndIndexQuoteMessageType == 'Y') {
            message = new ShortEquityAndIndexQuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
