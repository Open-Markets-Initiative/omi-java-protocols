package omi.miax.pearlequities.expressorders.meo.v2_6.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelReduceSizeOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ExecutionNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ModifyOrderResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.NewOrderResponseMessage;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.OrderPriceUpdateNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.ReserveOrderReplenishmentNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.SymbolUpdate;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.SystemStateNotification;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

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
            message = new SymbolUpdate();
        } else if ("NR".equals(sequencedMessageType)) {
            message = new NewOrderResponseMessage();
        } else if ("MR".equals(sequencedMessageType)) {
            message = new ModifyOrderResponse();
        } else if ("CR".equals(sequencedMessageType)) {
            message = new CancelOrderResponse();
        } else if ("CQ".equals(sequencedMessageType)) {
            message = new CancelOrderByExchangeOrderIdResponseMessage();
        } else if ("SN".equals(sequencedMessageType)) {
            message = new SystemStateNotification();
        } else if ("O1".equals(sequencedMessageType)) {
            message = new NewOrderNotification();
        } else if ("MN".equals(sequencedMessageType)) {
            message = new ModifyOrderNotification();
        } else if ("XN".equals(sequencedMessageType)) {
            message = new CancelReduceSizeOrderNotification();
        } else if ("PU".equals(sequencedMessageType)) {
            message = new OrderPriceUpdateNotification();
        } else if ("RA".equals(sequencedMessageType)) {
            message = new ReserveOrderReplenishmentNotification();
        } else if ("E1".equals(sequencedMessageType)) {
            message = new ExecutionNotification();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
