package omi.miax.pearlequities.expressorders.meo.v2_7_b.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderByExchangeOrderIdResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.CancelReduceSizeOrderNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ExecutionNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ModifyOrderNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ModifyOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.NewOrderNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.NewOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.OrderPriceUpdateNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.ReserveOrderReplenishmentNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.SymbolUpdateMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.SystemStateNotificationMessage;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.types.Message;

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
        if ("SU".equals(sequencedMessageType)) {
            message = new SymbolUpdateMessage();
        } else if ("NR".equals(sequencedMessageType)) {
            message = new NewOrderResponseMessage();
        } else if ("MR".equals(sequencedMessageType)) {
            message = new ModifyOrderResponseMessage();
        } else if ("CR".equals(sequencedMessageType)) {
            message = new CancelOrderResponseMessage();
        } else if ("CQ".equals(sequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdResponseMessage();
        } else if ("SN".equals(sequencedMessageType)) {
            message = new SystemStateNotificationMessage();
        } else if ("O1".equals(sequencedMessageType)) {
            message = new NewOrderNotificationMessage();
        } else if ("MN".equals(sequencedMessageType)) {
            message = new ModifyOrderNotificationMessage();
        } else if ("XN".equals(sequencedMessageType)) {
            message = new CancelReduceSizeOrderNotificationMessage();
        } else if ("P1".equals(sequencedMessageType)) {
            message = new OrderPriceUpdateNotificationMessage();
        } else if ("RA".equals(sequencedMessageType)) {
            message = new ReserveOrderReplenishmentNotificationMessage();
        } else if ("E1".equals(sequencedMessageType)) {
            message = new ExecutionNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
