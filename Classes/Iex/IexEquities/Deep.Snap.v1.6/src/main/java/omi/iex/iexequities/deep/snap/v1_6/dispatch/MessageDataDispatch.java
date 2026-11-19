package omi.iex.iexequities.deep.snap.v1_6.dispatch;

import java.util.Optional;
import omi.iex.iexequities.deep.snap.v1_6.messages.application.ErrorResponseMessage;
import omi.iex.iexequities.deep.snap.v1_6.messages.application.SnapshotDataMessage;
import omi.iex.iexequities.deep.snap.v1_6.messages.application.SnapshotEndMessage;
import omi.iex.iexequities.deep.snap.v1_6.messages.application.SnapshotRequestMessage;
import omi.iex.iexequities.deep.snap.v1_6.messages.application.SnapshotStartMessage;
import omi.iex.iexequities.deep.snap.v1_6.types.Message;

/**
 * Selects the message a Message Data branch holds by its Message Type.
 */
public final class MessageDataDispatch {

    private MessageDataDispatch() {
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
        if (messageType == 'r') {
            message = new SnapshotRequestMessage();
        } else if (messageType == 'e') {
            message = new ErrorResponseMessage();
        } else if (messageType == 's') {
            message = new SnapshotStartMessage();
        } else if (messageType == 'd') {
            message = new SnapshotDataMessage();
        } else if (messageType == 'x') {
            message = new SnapshotEndMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
