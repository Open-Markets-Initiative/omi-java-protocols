package omi.jnx.jnxequities.pts.itch.v1_6.dispatch;

import java.util.Optional;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderAddedWithAttributesMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderAddedWithoutAttributesMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderDeletedMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderExecutedMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderReplacedMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.OrderbookDirectoryMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.PriceTickSizeMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.SecondsMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.ShortSellingPriceRestrictionStateMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.SystemEventMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.messages.application.TradingStateMessage;
import omi.jnx.jnxequities.pts.itch.v1_6.types.Message;

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
            message = new OrderAddedWithoutAttributesMessage();
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
