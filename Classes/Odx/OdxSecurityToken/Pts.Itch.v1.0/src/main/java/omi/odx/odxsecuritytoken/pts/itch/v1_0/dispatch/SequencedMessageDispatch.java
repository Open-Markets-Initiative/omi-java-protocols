package omi.odx.odxsecuritytoken.pts.itch.v1_0.dispatch;

import java.util.Optional;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.EquilibriumPriceUpdateMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderAddedMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderBookStateMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderDeletedMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderExecutedWithPriceMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderReplacedMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.OrderbookDirectoryMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.PriceTickSizeMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.SecondsMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.SystemEventMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.messages.application.TradingStateMessage;
import omi.odx.odxsecuritytoken.pts.itch.v1_0.types.Message;

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
        } else if (sequencedMessageType == 'A') {
            message = new OrderAddedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeletedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplacedMessage();
        } else if (sequencedMessageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (sequencedMessageType == 'Z') {
            message = new EquilibriumPriceUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
