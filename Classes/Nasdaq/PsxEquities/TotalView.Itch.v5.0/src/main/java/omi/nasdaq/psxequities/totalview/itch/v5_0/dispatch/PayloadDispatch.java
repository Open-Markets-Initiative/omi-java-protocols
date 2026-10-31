package omi.nasdaq.psxequities.totalview.itch.v5_0.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.AddOrderNoMpidAttributionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.AddOrderWithMpidAttributionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.CrossTradeMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.LuldAuctionCollarMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.MwcbStatusLevelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OperationalHaltMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderCancelMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderDeleteMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.OrderReplaceMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application.TradeMessageNonCross;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset) {
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
            message = new TradeMessageNonCross();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
