package omi.nse.nsecm.snapshot.tbt.v6_9.dispatch;

import java.util.Optional;
import omi.nse.nsecm.snapshot.tbt.v6_9.messages.application.OrderBookSnapshotRecoveryResponseMessage;
import omi.nse.nsecm.snapshot.tbt.v6_9.types.Message;

/**
 * Selects the message a Response Payload branch holds by its Response Message Type.
 */
public final class ResponsePayloadDispatch {

    private ResponsePayloadDispatch() {
    }

    /**
     * Decodes the message a Response Message Type selects.
     *
     * @param responseMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char responseMessageType, byte[] data, int offset, int end) {
        Message message;
        if (responseMessageType == 'B') {
            message = new OrderBookSnapshotRecoveryResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
