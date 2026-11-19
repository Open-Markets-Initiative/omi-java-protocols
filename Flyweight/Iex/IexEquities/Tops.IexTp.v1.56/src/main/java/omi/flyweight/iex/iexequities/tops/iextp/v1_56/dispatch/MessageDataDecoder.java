package omi.flyweight.iex.iexequities.tops.iextp.v1_56.dispatch;

import omi.flyweight.iex.iexequities.tops.iextp.v1_56.messages.application.QuoteUpdateMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_56.messages.application.TradeBreakMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_56.messages.application.TradeReportMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_56.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: every field is copied into the flyweight of the message's type, which is returned,
 * so one returned is valid after its bytes are reused, until this decoder decodes the next message of its type. A
 * decoder is not safe to share between threads.</p>
 */
public final class MessageDataDecoder {

    private final QuoteUpdateMessage quoteUpdateMessage = new QuoteUpdateMessage();

    private final TradeReportMessage tradeReportMessage = new TradeReportMessage();

    private final TradeBreakMessage tradeBreakMessage = new TradeBreakMessage();

    /**
     * Creates a decoder and the flyweights it decodes into.
     */
    public MessageDataDecoder() {
    }

    /**
     * Decodes one message.
     *
     * @param messageType the value selecting the message
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @return the message's flyweight, decoded, or null when this library decodes no message of that type
     * @throws omi.flyweight.iex.iexequities.tops.iextp.v1_56.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'Q':
                quoteUpdateMessage.decode(buffer, offset, end);
                return quoteUpdateMessage;
            case 'T':
                tradeReportMessage.decode(buffer, offset, end);
                return tradeReportMessage;
            case 'B':
                tradeBreakMessage.decode(buffer, offset, end);
                return tradeBreakMessage;
            default:
                return null;
        }
    }
}
