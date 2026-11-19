package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.dispatch;

import java.util.Optional;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.CancelOrderJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.ModifyOrderJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.NewOrderJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.PurgeOrdersJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.ClientHeartbeat;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.LoginRequestMessage;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.LogoutRequest;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;

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
        } else if (firmMessageType == 5001L) {
            message = new NewOrderJpEquitiesV();
        } else if (firmMessageType == 5002L) {
            message = new ModifyOrderJpEquitiesV();
        } else if (firmMessageType == 5003L) {
            message = new CancelOrderJpEquitiesV();
        } else if (firmMessageType == 5004L) {
            message = new PurgeOrdersJpEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
