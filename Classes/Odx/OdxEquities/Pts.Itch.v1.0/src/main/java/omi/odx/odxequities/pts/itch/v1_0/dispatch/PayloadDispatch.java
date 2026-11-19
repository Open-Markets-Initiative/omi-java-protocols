package omi.odx.odxequities.pts.itch.v1_0.dispatch;

import java.util.Optional;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderAddedMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderAddedWithAttributesMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderDeletedMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderExecutedMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderReplacedMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.OrderbookDirectoryMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.PriceTickSizeMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.SecondsMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.ShortSellingPriceRestrictionStateMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.SystemEventMessage;
import omi.odx.odxequities.pts.itch.v1_0.messages.application.TradingStateMessage;
import omi.odx.odxequities.pts.itch.v1_0.types.Message;

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
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (messageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingStateMessage();
        } else if (messageType == 'Y') {
            message = new ShortSellingPriceRestrictionStateMessage();
        } else if (messageType == 'A') {
            message = new OrderAddedMessage();
        } else if (messageType == 'F') {
            message = new OrderAddedWithAttributesMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'D') {
            message = new OrderDeletedMessage();
        } else if (messageType == 'U') {
            message = new OrderReplacedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
