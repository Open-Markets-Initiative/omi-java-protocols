package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.dispatch;

import java.util.Optional;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.CancelOrderResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.CancelReduceSizeOrderNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.ComplexExecutionNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.MassCancelResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.ModifyOrderNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.ModifyOrderResponse;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.NewOrderNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.NewOrderResponseMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.OrderStatusUpdateNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.SimpleExecutionNotification;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.StrategyCreationResponseMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application.SystemStateNotificationMessage;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if ("NR".equals(sequencedMessageType)) {
            message = new NewOrderResponseMessage();
        } else if ("MR".equals(sequencedMessageType)) {
            message = new ModifyOrderResponse();
        } else if ("CR".equals(sequencedMessageType)) {
            message = new CancelOrderResponse();
        } else if ("XR".equals(sequencedMessageType)) {
            message = new MassCancelResponse();
        } else if ("SR".equals(sequencedMessageType)) {
            message = new StrategyCreationResponseMessage();
        } else if ("SN".equals(sequencedMessageType)) {
            message = new SystemStateNotificationMessage();
        } else if ("O1".equals(sequencedMessageType)) {
            message = new NewOrderNotification();
        } else if ("MN".equals(sequencedMessageType)) {
            message = new ModifyOrderNotification();
        } else if ("XN".equals(sequencedMessageType)) {
            message = new CancelReduceSizeOrderNotification();
        } else if ("OS".equals(sequencedMessageType)) {
            message = new OrderStatusUpdateNotification();
        } else if ("EN".equals(sequencedMessageType)) {
            message = new SimpleExecutionNotification();
        } else if ("CN".equals(sequencedMessageType)) {
            message = new ComplexExecutionNotification();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
