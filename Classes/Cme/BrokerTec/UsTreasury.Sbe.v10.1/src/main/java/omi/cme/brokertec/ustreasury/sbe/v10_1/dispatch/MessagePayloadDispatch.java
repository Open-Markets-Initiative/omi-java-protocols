package omi.cme.brokertec.ustreasury.sbe.v10_1.dispatch;

import java.util.Optional;
import omi.cme.brokertec.ustreasury.sbe.v10_1.messages.application.AdminHeartbeat;
import omi.cme.brokertec.ustreasury.sbe.v10_1.messages.application.MdIncrementalRefreshBtec;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class MessagePayloadDispatch {

    private MessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 405L) {
            message = new MdIncrementalRefreshBtec();
        } else if (templateId == 411L) {
            message = new AdminHeartbeat();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
