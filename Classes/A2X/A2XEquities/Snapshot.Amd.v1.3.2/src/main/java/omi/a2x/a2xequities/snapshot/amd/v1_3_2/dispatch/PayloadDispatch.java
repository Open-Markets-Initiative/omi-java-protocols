package omi.a2x.a2xequities.snapshot.amd.v1_3_2.dispatch;

import java.util.Optional;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.messages.application.BookEntryMessage;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.messages.application.BookStatusMessage;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.messages.application.HeartbeatMessage;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.messages.application.MacBookEntryMessage;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.messages.application.SnapshotStartMessage;
import omi.a2x.a2xequities.snapshot.amd.v1_3_2.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 1L) {
            message = new HeartbeatMessage();
        } else if (msgType == 10L) {
            message = new SnapshotStartMessage();
        } else if (msgType == 11L) {
            message = new BookStatusMessage();
        } else if (msgType == 12L) {
            message = new BookEntryMessage();
        } else if (msgType == 18L) {
            message = new MacBookEntryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
