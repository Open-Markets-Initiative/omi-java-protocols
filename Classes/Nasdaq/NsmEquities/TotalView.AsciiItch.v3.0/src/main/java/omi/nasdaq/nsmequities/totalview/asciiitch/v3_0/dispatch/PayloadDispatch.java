package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.AddOrderMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.AddOrderWithMpidMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.CrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.MillisecondsMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.OrderCancelMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.OrderDeleteMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.SecondsMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application.TradeMessage;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Message;

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
        if (messageType == 'T') {
            message = new SecondsMessage();
        } else if (messageType == 'M') {
            message = new MillisecondsMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'L') {
            message = new MarketParticipantPositionMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'F') {
            message = new AddOrderWithMpidMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
