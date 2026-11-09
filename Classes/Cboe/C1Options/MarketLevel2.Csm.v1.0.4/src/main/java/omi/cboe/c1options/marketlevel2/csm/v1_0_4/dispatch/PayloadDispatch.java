package omi.cboe.c1options.marketlevel2.csm.v1_0_4.dispatch;

import java.util.Optional;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application.HeartbeatMessage;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application.IncrementalRefreshMessage;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application.SecurityDefinitionMessage;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application.SecurityStatusMessage;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application.SnapshotFullRefreshMessage;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
        if (templateId == 13L) {
            message = new SecurityDefinitionMessage();
        } else if (templateId == 17L) {
            message = new SnapshotFullRefreshMessage();
        } else if (templateId == 18L) {
            message = new IncrementalRefreshMessage();
        } else if (templateId == 19L) {
            message = new SecurityStatusMessage();
        } else if (templateId == 16L) {
            message = new HeartbeatMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
