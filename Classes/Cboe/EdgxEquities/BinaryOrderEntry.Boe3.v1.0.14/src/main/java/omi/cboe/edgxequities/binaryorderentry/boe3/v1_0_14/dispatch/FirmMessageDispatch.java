package omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.dispatch;

import java.util.Optional;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.CancelOrderUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.ModifyOrderUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.NewOrderShortUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.NewOrderUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.PurgeOrdersUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.application.ResetRiskUsEquitiesV;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.session.ClientHeartbeat;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.session.LoginRequestMessage;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.messages.session.LogoutRequest;
import omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.types.Message;

/**
 * Selects the message a Firm Message branch holds by its Firm Message Type.
 */
public final class FirmMessageDispatch {

    private FirmMessageDispatch() {
    }

    /**
     * Decodes the message a Firm Message Type selects.
     *
     * @param firmMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long firmMessageType, byte[] data, int offset, int end) {
        Message message;
        if (firmMessageType == 1L) {
            message = new LoginRequestMessage();
        } else if (firmMessageType == 2L) {
            message = new LogoutRequest();
        } else if (firmMessageType == 3L) {
            message = new ClientHeartbeat();
        } else if (firmMessageType == 4001L) {
            message = new NewOrderUsEquitiesV();
        } else if (firmMessageType == 4006L) {
            message = new NewOrderShortUsEquitiesV();
        } else if (firmMessageType == 4003L) {
            message = new CancelOrderUsEquitiesV();
        } else if (firmMessageType == 4002L) {
            message = new ModifyOrderUsEquitiesV();
        } else if (firmMessageType == 4005L) {
            message = new PurgeOrdersUsEquitiesV();
        } else if (firmMessageType == 4004L) {
            message = new ResetRiskUsEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
