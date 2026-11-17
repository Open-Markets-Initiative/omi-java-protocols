package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.dispatch;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.AuctionInformationMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.OfficialPriceMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.OperationalHaltStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.QuoteUpdateMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityDirectoryMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityEventMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.ShortSalePriceTestStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.SystemEventMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.TradeReportMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application.TradingStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;

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
     * @throws omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                return new SystemEventMessage(buffer, offset, end);
            case 'D':
                return new SecurityDirectoryMessage(buffer, offset, end);
            case 'H':
                return new TradingStatusMessage(buffer, offset, end);
            case 'O':
                return new OperationalHaltStatusMessage(buffer, offset, end);
            case 'P':
                return new ShortSalePriceTestStatusMessage(buffer, offset, end);
            case 'E':
                return new SecurityEventMessage(buffer, offset, end);
            case 'Q':
                return new QuoteUpdateMessage(buffer, offset, end);
            case 'T':
                return new TradeReportMessage(buffer, offset, end);
            case 'X':
                return new OfficialPriceMessage(buffer, offset, end);
            case 'B':
                return new TradeBreakMessage(buffer, offset, end);
            case 'A':
                return new AuctionInformationMessage(buffer, offset, end);
            default:
                return null;
        }
    }
}
