package omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.messages.application.AddOrderMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.messages.application.LongFormAddOrderMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.messages.application.StockStatusMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.messages.application.SystemEventMessage;
import omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'H') {
            message = new StockStatusMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'a') {
            message = new LongFormAddOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
