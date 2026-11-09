package omi.iex.iexequities.tops.iextp.v1_56.dispatch;

import java.util.Optional;
import omi.iex.iexequities.tops.iextp.v1_56.messages.application.QuoteUpdateMessage;
import omi.iex.iexequities.tops.iextp.v1_56.messages.application.TradeBreakMessage;
import omi.iex.iexequities.tops.iextp.v1_56.messages.application.TradeReportMessage;
import omi.iex.iexequities.tops.iextp.v1_56.types.Message;

/**
 * Selects the message a Message Data branch holds by its Message Type.
 */
public final class MessageDataDispatch {

    private MessageDataDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'Q') {
            message = new QuoteUpdateMessage();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'B') {
            message = new TradeBreakMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
