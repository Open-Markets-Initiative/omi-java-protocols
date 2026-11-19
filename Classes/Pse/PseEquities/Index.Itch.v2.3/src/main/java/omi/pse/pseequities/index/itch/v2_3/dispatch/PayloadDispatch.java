package omi.pse.pseequities.index.itch.v2_3.dispatch;

import java.util.Optional;
import omi.pse.pseequities.index.itch.v2_3.messages.application.IndexMemberDirectoryMessage;
import omi.pse.pseequities.index.itch.v2_3.messages.application.IndexValueMessage;
import omi.pse.pseequities.index.itch.v2_3.messages.application.OrderbookDirectoryMessage;
import omi.pse.pseequities.index.itch.v2_3.messages.application.SystemEventMessage;
import omi.pse.pseequities.index.itch.v2_3.messages.application.TimeStampSecondsMessage;
import omi.pse.pseequities.index.itch.v2_3.types.Message;

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
        } else if (messageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (messageType == 'Y') {
            message = new IndexMemberDirectoryMessage();
        } else if (messageType == 'Z') {
            message = new IndexValueMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
