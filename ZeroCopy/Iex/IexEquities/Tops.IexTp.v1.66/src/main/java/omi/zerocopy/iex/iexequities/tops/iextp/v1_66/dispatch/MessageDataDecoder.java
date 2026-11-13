package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.dispatch;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.AuctionInformationMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.OfficialPriceMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.OperationalHaltStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.QuoteUpdateMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.RetailLiquidityIndicatorMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.SecurityDirectoryMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.ShortSalePriceTestStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.SystemEventMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.TradeReportMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application.TradingStatusMessage;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: the flyweight of the message's type is rewrapped and returned, so one returned is
 * valid until this decoder decodes the next message of its type. A decoder is not safe to share between threads.</p>
 */
public final class MessageDataDecoder {

    private final SystemEventMessage systemEventMessage = new SystemEventMessage();

    private final SecurityDirectoryMessage securityDirectoryMessage = new SecurityDirectoryMessage();

    private final TradingStatusMessage tradingStatusMessage = new TradingStatusMessage();

    private final RetailLiquidityIndicatorMessage retailLiquidityIndicatorMessage = new RetailLiquidityIndicatorMessage();

    private final OperationalHaltStatusMessage operationalHaltStatusMessage = new OperationalHaltStatusMessage();

    private final ShortSalePriceTestStatusMessage shortSalePriceTestStatusMessage = new ShortSalePriceTestStatusMessage();

    private final QuoteUpdateMessage quoteUpdateMessage = new QuoteUpdateMessage();

    private final TradeReportMessage tradeReportMessage = new TradeReportMessage();

    private final OfficialPriceMessage officialPriceMessage = new OfficialPriceMessage();

    private final TradeBreakMessage tradeBreakMessage = new TradeBreakMessage();

    private final AuctionInformationMessage auctionInformationMessage = new AuctionInformationMessage();

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
     * @throws omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.wrap(buffer, offset, end);
                return systemEventMessage;
            case 'D':
                securityDirectoryMessage.wrap(buffer, offset, end);
                return securityDirectoryMessage;
            case 'H':
                tradingStatusMessage.wrap(buffer, offset, end);
                return tradingStatusMessage;
            case 'I':
                retailLiquidityIndicatorMessage.wrap(buffer, offset, end);
                return retailLiquidityIndicatorMessage;
            case 'O':
                operationalHaltStatusMessage.wrap(buffer, offset, end);
                return operationalHaltStatusMessage;
            case 'P':
                shortSalePriceTestStatusMessage.wrap(buffer, offset, end);
                return shortSalePriceTestStatusMessage;
            case 'Q':
                quoteUpdateMessage.wrap(buffer, offset, end);
                return quoteUpdateMessage;
            case 'T':
                tradeReportMessage.wrap(buffer, offset, end);
                return tradeReportMessage;
            case 'X':
                officialPriceMessage.wrap(buffer, offset, end);
                return officialPriceMessage;
            case 'B':
                tradeBreakMessage.wrap(buffer, offset, end);
                return tradeBreakMessage;
            case 'A':
                auctionInformationMessage.wrap(buffer, offset, end);
                return auctionInformationMessage;
            default:
                return null;
        }
    }
}
