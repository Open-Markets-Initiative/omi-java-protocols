package omi.tmx.tsx.indexfeed.qrtmd.v1_19.dispatch;

import java.util.Optional;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.messages.application.BeginningOfIndexSummaryMessage;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.messages.application.SAndPTsxOfficialIndexLevelMessage;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.types.Message;

/**
 * Selects the message a Message Body branch holds by its Message Type.
 */
public final class MessageBodyDispatch {

    private MessageBodyDispatch() {
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
    public static Optional<Message> decode(String messageType, byte[] data, int offset, int end) {
        Message message;
        if ("K ".equals(messageType)) {
            message = new SAndPTsxOfficialIndexLevelMessage();
        } else if ("PA".equals(messageType)) {
            message = new BeginningOfIndexSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
