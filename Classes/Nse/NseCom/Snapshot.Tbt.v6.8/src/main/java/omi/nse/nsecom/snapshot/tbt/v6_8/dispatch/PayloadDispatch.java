package omi.nse.nsecom.snapshot.tbt.v6_8.dispatch;

import java.util.Optional;
import omi.nse.nsecom.snapshot.tbt.v6_8.messages.application.NewOrderMessage;
import omi.nse.nsecom.snapshot.tbt.v6_8.messages.application.NewSpreadOrderMessage;
import omi.nse.nsecom.snapshot.tbt.v6_8.types.Message;

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
        if (messageType == 'N') {
            message = new NewOrderMessage();
        } else if (messageType == 'G') {
            message = new NewSpreadOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
