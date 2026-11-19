package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.dispatch;

import java.util.Optional;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.CancelOrderAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.ModifyOrderAuEquitiesV1;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.ModifyOrderAuEquitiesV2;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.NewOrderAuEquitiesV1;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.NewOrderAuEquitiesV2;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.PurgeOrdersAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.ClientHeartbeat;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.LoginRequestMessage;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.LogoutRequest;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;

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
        } else if (firmMessageType == 3001L) {
            message = new NewOrderAuEquitiesV1();
        } else if (firmMessageType == 3005L) {
            message = new NewOrderAuEquitiesV2();
        } else if (firmMessageType == 3002L) {
            message = new ModifyOrderAuEquitiesV1();
        } else if (firmMessageType == 3006L) {
            message = new ModifyOrderAuEquitiesV2();
        } else if (firmMessageType == 3003L) {
            message = new CancelOrderAuEquitiesV();
        } else if (firmMessageType == 3004L) {
            message = new PurgeOrdersAuEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
