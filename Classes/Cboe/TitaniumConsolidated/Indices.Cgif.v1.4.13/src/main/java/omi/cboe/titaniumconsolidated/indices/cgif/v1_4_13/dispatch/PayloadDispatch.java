package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.dispatch;

import java.util.Optional;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.ContributorValueMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.HeartbeatMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.IndexDefinitionMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.IndexSummaryMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.IndexValueMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application.IndexValueWithStatusMessage;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.Message;

/**
 * Selects the message a Payload branch holds by its Template ID.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template ID selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 16L) {
            message = new HeartbeatMessage();
        } else if (templateId == 22L) {
            message = new IndexValueMessage();
        } else if (templateId == 23L) {
            message = new ContributorValueMessage();
        } else if (templateId == 24L) {
            message = new IndexSummaryMessage();
        } else if (templateId == 25L) {
            message = new IndexValueWithStatusMessage();
        } else if (templateId == 26L) {
            message = new IndexDefinitionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
