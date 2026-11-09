package omi.jnx.jnxequities.pts.itch.v1_7.dispatch;

import java.util.Optional;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderAddedWithAttributesMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderAddedWithoutAttributesMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderDeletedMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderExecutedMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderReplacedMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.OrderbookDirectoryMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.PriceTickSizeMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.SecondsMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.ShortSellingPriceRestrictionStateMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.SystemEventMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.messages.application.TradingStateMessage;
import omi.jnx.jnxequities.pts.itch.v1_7.types.Message;

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
            message = new SecondsMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingStateMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new ShortSellingPriceRestrictionStateMessage();
        } else if (sequencedMessageType == 'A') {
            message = new OrderAddedWithoutAttributesMessage();
        } else if (sequencedMessageType == 'F') {
            message = new OrderAddedWithAttributesMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeletedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplacedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
