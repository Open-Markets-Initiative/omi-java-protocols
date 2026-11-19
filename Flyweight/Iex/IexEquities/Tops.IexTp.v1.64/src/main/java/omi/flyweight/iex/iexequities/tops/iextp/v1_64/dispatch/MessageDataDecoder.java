package omi.flyweight.iex.iexequities.tops.iextp.v1_64.dispatch;

import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.AuctionInformationMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.OfficialPriceMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.OperationalHaltStatusMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.QuoteUpdateMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityDirectoryMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityEventMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.ShortSalePriceTestStatusMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.SystemEventMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.TradeBreakMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.TradeReportMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application.TradingStatusMessage;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: every field is copied into the flyweight of the message's type, which is returned,
 * so one returned is valid after its bytes are reused, until this decoder decodes the next message of its type. A
 * decoder is not safe to share between threads.</p>
 */
public final class MessageDataDecoder {

    private final SystemEventMessage systemEventMessage = new SystemEventMessage();

    private final SecurityDirectoryMessage securityDirectoryMessage = new SecurityDirectoryMessage();

    private final TradingStatusMessage tradingStatusMessage = new TradingStatusMessage();

    private final OperationalHaltStatusMessage operationalHaltStatusMessage = new OperationalHaltStatusMessage();

    private final ShortSalePriceTestStatusMessage shortSalePriceTestStatusMessage = new ShortSalePriceTestStatusMessage();

    private final SecurityEventMessage securityEventMessage = new SecurityEventMessage();

    private final QuoteUpdateMessage quoteUpdateMessage = new QuoteUpdateMessage();

    private final TradeReportMessage tradeReportMessage = new TradeReportMessage();

    private final OfficialPriceMessage officialPriceMessage = new OfficialPriceMessage();

    private final TradeBreakMessage tradeBreakMessage = new TradeBreakMessage();

    private final AuctionInformationMessage auctionInformationMessage = new AuctionInformationMessage();

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
     * @throws omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.decode(buffer, offset, end);
                return systemEventMessage;
            case 'D':
                securityDirectoryMessage.decode(buffer, offset, end);
                return securityDirectoryMessage;
            case 'H':
                tradingStatusMessage.decode(buffer, offset, end);
                return tradingStatusMessage;
            case 'O':
                operationalHaltStatusMessage.decode(buffer, offset, end);
                return operationalHaltStatusMessage;
            case 'P':
                shortSalePriceTestStatusMessage.decode(buffer, offset, end);
                return shortSalePriceTestStatusMessage;
            case 'E':
                securityEventMessage.decode(buffer, offset, end);
                return securityEventMessage;
            case 'Q':
                quoteUpdateMessage.decode(buffer, offset, end);
                return quoteUpdateMessage;
            case 'T':
                tradeReportMessage.decode(buffer, offset, end);
                return tradeReportMessage;
            case 'X':
                officialPriceMessage.decode(buffer, offset, end);
                return officialPriceMessage;
            case 'B':
                tradeBreakMessage.decode(buffer, offset, end);
                return tradeBreakMessage;
            case 'A':
                auctionInformationMessage.decode(buffer, offset, end);
                return auctionInformationMessage;
            default:
                return null;
        }
    }
}
