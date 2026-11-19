package omi.biva.bivaequities.basic.itch.v1_12.dispatch;

import java.util.Optional;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.BestBidOfferMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.OrderbookDirectoryMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.OrderbookReferencePriceMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.OrderbookTradingActionMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.ParticipantDirectoryMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.PriceTickSizeMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.QuantityTickSizeMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.SystemEventMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.TimeStampSecondsMessage;
import omi.biva.bivaequities.basic.itch.v1_12.messages.application.TradeMessage;
import omi.biva.bivaequities.basic.itch.v1_12.types.Message;

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
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'Q') {
            message = new BestBidOfferMessage();
        } else if (messageType == 'X') {
            message = new OrderbookReferencePriceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
