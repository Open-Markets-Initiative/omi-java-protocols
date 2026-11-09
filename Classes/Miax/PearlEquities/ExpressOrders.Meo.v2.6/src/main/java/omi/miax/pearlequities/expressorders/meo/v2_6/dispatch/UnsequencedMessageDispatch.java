package omi.miax.pearlequities.expressorders.meo.v2_6.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ExecutionNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.MassCancelRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.MassCancelResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderRequestMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ReserveOrderReplenishmentNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

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
            message = new ModifyOrderResponse();
        } else if ("CO".equals(unsequencedMessageType)) {
            message = new CancelOrderRequest();
        } else if ("CR".equals(unsequencedMessageType)) {
            message = new CancelOrderResponse();
        } else if ("CX".equals(unsequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdRequest();
        } else if ("CQ".equals(unsequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdResponseMessage();
        } else if ("XQ".equals(unsequencedMessageType)) {
            message = new MassCancelRequest();
        } else if ("XR".equals(unsequencedMessageType)) {
            message = new MassCancelResponse();
        } else if ("RA".equals(unsequencedMessageType)) {
            message = new ReserveOrderReplenishmentNotification();
        } else if ("E1".equals(unsequencedMessageType)) {
            message = new ExecutionNotification();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
