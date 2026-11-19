package omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.dispatch;

import java.util.Optional;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.AddOrderMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.BrokenTradeMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.LongFormAddOrderMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.LongFormOrderCancelMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.LongFormOrderExecutionMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.LongFormTradeMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.OrderCancelMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.OrderExecutionMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.StockStatusMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.SystemEventMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application.TradeMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.Message;

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
        if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'a') {
            message = new LongFormAddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutionMessage();
        } else if (messageType == 'e') {
            message = new LongFormOrderExecutionMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'x') {
            message = new LongFormOrderCancelMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'p') {
            message = new LongFormTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'H') {
            message = new StockStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
