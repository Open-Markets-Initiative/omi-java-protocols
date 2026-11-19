package omi.bruceats.bruceequities.depthofbook.itch.v3_3.dispatch;

import java.util.Optional;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.AddOrderMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.OrderCancelMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.OrderDeleteMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.OrderExecutedMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.OrderReplaceMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.StockDirectoryMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.StockTradingActionMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.SystemEventMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.TradeBreakMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.messages.application.TradeCorrectionMessage;
import omi.bruceats.bruceequities.depthofbook.itch.v3_3.types.Message;

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
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'C') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'B') {
            message = new TradeBreakMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
