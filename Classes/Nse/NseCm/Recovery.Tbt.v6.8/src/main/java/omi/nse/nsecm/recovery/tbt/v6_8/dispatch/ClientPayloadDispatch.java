package omi.nse.nsecm.recovery.tbt.v6_8.dispatch;

import java.util.Optional;
import omi.nse.nsecm.recovery.tbt.v6_8.messages.application.TickDataRecoveryRequestMessage;
import omi.nse.nsecm.recovery.tbt.v6_8.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Client Message Type.
 */
public final class ClientPayloadDispatch {

    private ClientPayloadDispatch() {
    }

    /**
     * Decodes the message a Client Message Type selects.
     *
     * @param clientMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char clientMessageType, byte[] data, int offset, int end) {
        Message message;
        if (clientMessageType == 'R') {
            message = new TickDataRecoveryRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
