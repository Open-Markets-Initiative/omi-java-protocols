package omi.nasdaq.nsmequities.totalview.itch.v4_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.AddOrderMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.AddOrderWithMpidMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.CrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.OrderCancelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.OrderDeleteMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.OrderReplaceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.TimestampMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.messages.application.TradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v4_0.types.Message;

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
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'T') {
            message = new TimestampMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (sequencedMessageType == 'L') {
            message = new MarketParticipantPositionMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'F') {
            message = new AddOrderWithMpidMessage();
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
            message = new TradeMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
