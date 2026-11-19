package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.dispatch;

import java.util.Optional;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.CancelOrderRequestMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.CancelOrderResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.MassCancelRequest;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.MassCancelResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.ModifyOrderRequestMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.ModifyOrderResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.NewOrderRequestMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.NewOrderResponseMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.StrategyCreationRequest;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.StrategyCreationResponseMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Message;

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
            message = new CancelOrderRequestMessage();
        } else if ("CR".equals(unsequencedMessageType)) {
            message = new CancelOrderResponse();
        } else if ("XQ".equals(unsequencedMessageType)) {
            message = new MassCancelRequest();
        } else if ("XR".equals(unsequencedMessageType)) {
            message = new MassCancelResponse();
        } else if ("SD".equals(unsequencedMessageType)) {
            message = new StrategyCreationRequest();
        } else if ("SR".equals(unsequencedMessageType)) {
            message = new StrategyCreationResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
