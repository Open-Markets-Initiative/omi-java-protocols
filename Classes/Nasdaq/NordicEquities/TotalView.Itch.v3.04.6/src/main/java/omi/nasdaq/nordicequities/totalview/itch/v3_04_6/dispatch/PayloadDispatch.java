package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.AddOrderMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.AddOrderMpidAttributionMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.BrokenTradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.CrossTradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.ExecutionSummaryMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.MoiiMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.NoiiMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderBookDirectoryMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderBookFlushMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderBookTradingActionMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderCancelMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderDeleteMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderExecutedMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.OrderReplaceMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.SystemEventMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application.TradeMessage;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.Message;

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
        } else if (messageType == 'H') {
            message = new OrderBookTradingActionMessage();
        } else if (messageType == 'R') {
            message = new OrderBookDirectoryMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'F') {
            message = new AddOrderMpidAttributionMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'Y') {
            message = new OrderBookFlushMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'I') {
            message = new NoiiMessage();
        } else if (messageType == 'J') {
            message = new MoiiMessage();
        } else if (messageType == 'K') {
            message = new ExecutionSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
