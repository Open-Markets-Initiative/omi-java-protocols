package omi.cboe.neoequities.orderentry.boe3.v1_0_19.dispatch;

import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.CancelOrderCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.ModifyOrderCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.NewOrderCaEquitiesV1;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.NewOrderCaEquitiesV2;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.NewOrderCrossCaEquitiesV1;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.NewOrderCrossCaEquitiesV2;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.ClientHeartbeat;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.LoginRequestMessage;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.LogoutRequest;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;

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
        } else if (firmMessageType == 6001L) {
            message = new NewOrderCaEquitiesV1();
        } else if (firmMessageType == 6006L) {
            message = new NewOrderCaEquitiesV2();
        } else if (firmMessageType == 6002L) {
            message = new ModifyOrderCaEquitiesV();
        } else if (firmMessageType == 6003L) {
            message = new CancelOrderCaEquitiesV();
        } else if (firmMessageType == 6004L) {
            message = new NewOrderCrossCaEquitiesV1();
        } else if (firmMessageType == 6005L) {
            message = new NewOrderCrossCaEquitiesV2();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
