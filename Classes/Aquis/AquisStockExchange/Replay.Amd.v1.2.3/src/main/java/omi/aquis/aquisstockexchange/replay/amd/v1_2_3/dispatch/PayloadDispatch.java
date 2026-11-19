package omi.aquis.aquisstockexchange.replay.amd.v1_2_3.dispatch;

import java.util.Optional;
import omi.aquis.aquisstockexchange.replay.amd.v1_2_3.messages.application.LoginMessage;
import omi.aquis.aquisstockexchange.replay.amd.v1_2_3.messages.application.ReplayRequestMessage;
import omi.aquis.aquisstockexchange.replay.amd.v1_2_3.messages.application.ReplayResponseMessage;
import omi.aquis.aquisstockexchange.replay.amd.v1_2_3.types.Message;

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
        if (msgType == 13L) {
            message = new LoginMessage();
        } else if (msgType == 14L) {
            message = new ReplayRequestMessage();
        } else if (msgType == 15L) {
            message = new ReplayResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
