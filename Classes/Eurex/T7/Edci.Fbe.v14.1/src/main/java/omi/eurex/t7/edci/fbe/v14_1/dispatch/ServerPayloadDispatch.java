package omi.eurex.t7.edci.fbe.v14_1.dispatch;

import java.util.Optional;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.DeleteOrderBroadcast;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.ForcedLogoutNotification;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.HeartbeatNotification;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.LogonResponse;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.LogoutResponse;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.OrderExecReportBroadcast;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.PartitionListNotification;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.Reject;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.SessionListNotification;
import omi.eurex.t7.edci.fbe.v14_1.messages.application.SessionStatusBroadcast;
import omi.eurex.t7.edci.fbe.v14_1.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Template Id.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
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
        if (templateId == 10902L) {
            message = new DeleteOrderBroadcast();
        } else if (templateId == 10012L) {
            message = new ForcedLogoutNotification();
        } else if (templateId == 10023L) {
            message = new HeartbeatNotification();
        } else if (templateId == 10001L) {
            message = new LogonResponse();
        } else if (templateId == 10003L) {
            message = new LogoutResponse();
        } else if (templateId == 10901L) {
            message = new OrderExecReportBroadcast();
        } else if (templateId == 10037L) {
            message = new PartitionListNotification();
        } else if (templateId == 10010L) {
            message = new Reject();
        } else if (templateId == 10036L) {
            message = new SessionListNotification();
        } else if (templateId == 10903L) {
            message = new SessionStatusBroadcast();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
