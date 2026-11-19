package omi.biva.bivaequities.totalview.glimpse.v1_12.dispatch;

import java.util.Optional;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.AddOrderMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.GlimpseSnapshotMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.IndicativePriceQuantityMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.OrderbookDirectoryMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.OrderbookReferencePriceMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.OrderbookTradingActionMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.ParticipantDirectoryMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.PriceTickSizeMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.QuantityTickSizeMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.SystemEventMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.messages.application.TimeStampSecondsMessage;
import omi.biva.bivaequities.totalview.glimpse.v1_12.types.Message;

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
            message = new TimeStampSecondsMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (sequencedMessageType == 'M') {
            message = new QuantityTickSizeMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (sequencedMessageType == 'F') {
            message = new ParticipantDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new OrderbookTradingActionMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderbookReferencePriceMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'I') {
            message = new IndicativePriceQuantityMessage();
        } else if (sequencedMessageType == 'G') {
            message = new GlimpseSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
