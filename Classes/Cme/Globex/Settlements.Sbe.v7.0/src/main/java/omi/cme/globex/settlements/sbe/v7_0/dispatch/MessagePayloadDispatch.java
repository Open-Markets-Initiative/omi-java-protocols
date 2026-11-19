package omi.cme.globex.settlements.sbe.v7_0.dispatch;

import java.util.Optional;
import omi.cme.globex.settlements.sbe.v7_0.messages.application.AdminHeartbeat;
import omi.cme.globex.settlements.sbe.v7_0.messages.application.MdIncrementalRefreshHighLow;
import omi.cme.globex.settlements.sbe.v7_0.messages.application.MdIncrementalRefreshSettle;
import omi.cme.globex.settlements.sbe.v7_0.messages.application.MdIncrementalRefreshVoi;
import omi.cme.globex.settlements.sbe.v7_0.types.Message;

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
        if (templateId == 401L) {
            message = new MdIncrementalRefreshSettle();
        } else if (templateId == 402L) {
            message = new MdIncrementalRefreshVoi();
        } else if (templateId == 403L) {
            message = new MdIncrementalRefreshHighLow();
        } else if (templateId == 407L) {
            message = new AdminHeartbeat();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
