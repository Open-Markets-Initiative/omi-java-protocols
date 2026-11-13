package omi.zerocopy.iex.iexequities.tops.iextp.v1_56.dispatch;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.QuoteUpdateMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.TradeReportMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: the flyweight of the message's type is rewrapped and returned, so one returned is
 * valid until this decoder decodes the next message of its type. A decoder is not safe to share between threads.</p>
 */
public final class MessageDataDecoder {

    private final QuoteUpdateMessage quoteUpdateMessage = new QuoteUpdateMessage();

    private final TradeReportMessage tradeReportMessage = new TradeReportMessage();

    private final TradeBreakMessage tradeBreakMessage = new TradeBreakMessage();

    /**
     * Creates a decoder and the flyweights it rewraps.
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
     * @return the message's flyweight, wrapping it, or null when this library decodes no message of that type
     * @throws omi.zerocopy.iex.iexequities.tops.iextp.v1_56.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'Q':
                quoteUpdateMessage.wrap(buffer, offset, end);
                return quoteUpdateMessage;
            case 'T':
                tradeReportMessage.wrap(buffer, offset, end);
                return tradeReportMessage;
            case 'B':
                tradeBreakMessage.wrap(buffer, offset, end);
                return tradeBreakMessage;
            default:
                return null;
        }
    }
}
