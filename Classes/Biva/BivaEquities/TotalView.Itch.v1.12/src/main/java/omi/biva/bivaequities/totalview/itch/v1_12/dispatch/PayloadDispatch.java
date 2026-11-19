package omi.biva.bivaequities.totalview.itch.v1_12.dispatch;

import java.util.Optional;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.AddOrderMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.BrokenTradeMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.IndicativePriceQuantityMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderDeleteMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderExecutedMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderExecutedWithPriceMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderReplaceMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderbookDirectoryMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderbookReferencePriceMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.OrderbookTradingActionMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.ParticipantDirectoryMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.PriceTickSizeMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.QuantityTickSizeMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.SystemEventMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.TimeStampSecondsMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.TradeMessage;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Message;

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
            message = new TimeStampSecondsMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (messageType == 'M') {
            message = new QuantityTickSizeMessage();
        } else if (messageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (messageType == 'F') {
            message = new ParticipantDirectoryMessage();
        } else if (messageType == 'H') {
            message = new OrderbookTradingActionMessage();
        } else if (messageType == 'X') {
            message = new OrderbookReferencePriceMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'I') {
            message = new IndicativePriceQuantityMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
