package omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.dispatch;

import java.util.Optional;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.AddOrderMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.CrossTradeMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.ExtendedStockDirectoryMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.OrderCancelMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.OrderDeleteMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.OrderExecutedMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.OrderExecutedWithPriceMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.OrderReplaceMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.StockDirectoryMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.StockTradingActionMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.SystemEventMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.TradeAmendMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.TradeBustMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application.TradeMessage;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.types.Message;

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
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'r') {
            message = new ExtendedStockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'B') {
            message = new TradeBustMessage();
        } else if (messageType == 'M') {
            message = new TradeAmendMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
