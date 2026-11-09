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
 * Selects the message a File Payload branch holds by its Message Type.
 */
public final class FilePayloadDispatch {

    private FilePayloadDispatch() {
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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'L') {
            message = new MarketParticipantPositionMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbStatusLevelMessage();
        } else if (messageType == 'K') {
            message = new IpoQuotingPeriodUpdate();
        } else if (messageType == 'J') {
            message = new LuldAuctionCollarMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else if (messageType == 'A') {
            message = new AddOrderNoMpidAttributionMessage();
        } else if (messageType == 'F') {
            message = new AddOrderWithMpidAttributionMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'P') {
            message = new NonCrossTradeMessage();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else if (messageType == 'N') {
            message = new RetailPriceImprovementIndicatorMessage();
        } else if (messageType == 'O') {
            message = new DirectListingWithCapitalRaisePriceDiscoveryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
