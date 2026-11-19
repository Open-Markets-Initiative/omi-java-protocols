package omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.dispatch;

import java.util.Optional;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.session.Heartbeat;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.Message;

/**
 * Selects the message a Messages branch holds by its Message Count.
 *
 * <p>Messages it may select that this library does not decode: Message.</p>
 */
public final class MessagesDispatch {

    private MessagesDispatch() {
    }

    /**
     * Decodes the message a Message Count selects.
     *
     * @param messageCount the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageCount, byte[] data, int offset, int end) {
        Message message;
        if (messageCount == 0L) {
            message = new Heartbeat();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
