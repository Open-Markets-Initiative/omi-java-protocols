package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.AddOrderNoMpidAttributionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.AddOrderWithMpidAttributionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.CrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.DirectListingWithCapitalRaisePriceDiscoveryMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.IpoQuotingPeriodUpdate;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.LuldAuctionCollarMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.MwcbStatusLevelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.NonCrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OrderCancelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OrderDeleteMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.OrderReplaceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.RetailPriceImprovementIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (sequencedMessageType == 'L') {
            message = new MarketParticipantPositionMessage();
        } else if (sequencedMessageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (sequencedMessageType == 'W') {
            message = new MwcbStatusLevelMessage();
        } else if (sequencedMessageType == 'K') {
            message = new IpoQuotingPeriodUpdate();
        } else if (sequencedMessageType == 'J') {
            message = new LuldAuctionCollarMessage();
        } else if (sequencedMessageType == 'h') {
            message = new OperationalHaltMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderNoMpidAttributionMessage();
        } else if (sequencedMessageType == 'F') {
            message = new AddOrderWithMpidAttributionMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderCancelMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (sequencedMessageType == 'P') {
            message = new NonCrossTradeMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else if (sequencedMessageType == 'N') {
            message = new RetailPriceImprovementIndicatorMessage();
        } else if (sequencedMessageType == 'O') {
            message = new DirectListingWithCapitalRaisePriceDiscoveryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
