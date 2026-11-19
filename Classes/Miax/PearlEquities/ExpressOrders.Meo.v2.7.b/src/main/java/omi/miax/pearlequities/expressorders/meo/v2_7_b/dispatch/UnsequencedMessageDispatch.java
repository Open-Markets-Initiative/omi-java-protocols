package omi.miax.pearlequities.expressorders.meo.v2_7_b.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.AggressiveSidePurgeRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.AggressiveSidePurgeResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderByExchangeOrderIdRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderByExchangeOrderIdResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ExecutionNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.MassCancelRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.MassCancelResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ModifyOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ModifyOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.NewOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.NewOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ReserveOrderReplenishmentNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Unsequenced Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Unsequenced Message Type selects.
     *
     * @param unsequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String unsequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if ("N1".equals(unsequencedMessageType)) {
            message = new NewOrderRequestMessage();
        } else if ("NR".equals(unsequencedMessageType)) {
            message = new NewOrderResponseMessage();
        } else if ("M1".equals(unsequencedMessageType)) {
            message = new ModifyOrderRequestMessage();
        } else if ("MR".equals(unsequencedMessageType)) {
            message = new ModifyOrderResponseMessage();
        } else if ("CO".equals(unsequencedMessageType)) {
            message = new CancelOrderRequestMessage();
        } else if ("CR".equals(unsequencedMessageType)) {
            message = new CancelOrderResponseMessage();
        } else if ("CX".equals(unsequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdRequestMessage();
        } else if ("CQ".equals(unsequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdResponseMessage();
        } else if ("XQ".equals(unsequencedMessageType)) {
            message = new MassCancelRequestMessage();
        } else if ("XR".equals(unsequencedMessageType)) {
            message = new MassCancelResponseMessage();
        } else if ("XS".equals(unsequencedMessageType)) {
            message = new AggressiveSidePurgeRequestMessage();
        } else if ("SR".equals(unsequencedMessageType)) {
            message = new AggressiveSidePurgeResponseMessage();
        } else if ("RA".equals(unsequencedMessageType)) {
            message = new ReserveOrderReplenishmentNotificationMessage();
        } else if ("E1".equals(unsequencedMessageType)) {
            message = new ExecutionNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
