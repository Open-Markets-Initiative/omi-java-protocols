package omi.lseg.millennium.level2recovery.mitch.v11_9.dispatch;

import java.util.Optional;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.AddAttributedOrderMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.AddOrderMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.LoginRequestMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.LoginResponseMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.LogoutRequestMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.SnapshotCompleteMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.SnapshotRequestMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.SnapshotResponseMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application.SymbolStatusMessage;
import omi.lseg.millennium.level2recovery.mitch.v11_9.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 1L) {
            message = new LoginRequestMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 129L) {
            message = new SnapshotRequestMessage();
        } else if (messageType == 130L) {
            message = new SnapshotResponseMessage();
        } else if (messageType == 131L) {
            message = new SnapshotCompleteMessage();
        } else if (messageType == 5L) {
            message = new LogoutRequestMessage();
        } else if (messageType == 72L) {
            message = new SymbolStatusMessage();
        } else if (messageType == 65L) {
            message = new AddOrderMessage();
        } else if (messageType == 70L) {
            message = new AddAttributedOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
