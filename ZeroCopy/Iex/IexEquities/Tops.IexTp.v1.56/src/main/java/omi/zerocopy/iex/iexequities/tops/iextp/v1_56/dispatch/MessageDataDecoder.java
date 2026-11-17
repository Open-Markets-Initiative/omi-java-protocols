package omi.zerocopy.iex.iexequities.tops.iextp.v1_56.dispatch;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.QuoteUpdateMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.messages.application.TradeReportMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_56.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, each into a view of its own.
 *
 * <p>A message returned is a new view, valid for as long as its bytes are unchanged. The decoder holds nothing, so
 * it may be shared between threads.</p>
 */
public final class MessageDataDecoder {

    /**
     * Creates a decoder.
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
     * @return a view of the message, or null when this library decodes no message of that type
     * @throws omi.zerocopy.iex.iexequities.tops.iextp.v1_56.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'Q':
                return new QuoteUpdateMessage(buffer, offset, end);
            case 'T':
                return new TradeReportMessage(buffer, offset, end);
            case 'B':
                return new TradeBreakMessage(buffer, offset, end);
            default:
                return null;
        }
    }
}
