package omi.cboe.neoequities.orderentry.boe3.v1_0_19.dispatch;

import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.CancelRejectedCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.CarriedRestatementCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.DoneForDayCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.ModifyRejectedCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderAcknowledgementCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderCancelledCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderExecutionCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderModifiedCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderRejectedCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.OrderRestatedCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application.TradeCancelCorrectCaEquitiesV;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.LoginResponseMessage;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.LogoutResponseMessage;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.ReplayComplete;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.session.ServerHeartbeat;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;

/**
 * Selects the message a Exchange Message branch holds by its Exchange Message Type.
 */
public final class ExchangeMessageDispatch {

    private ExchangeMessageDispatch() {
    }

    /**
     * Decodes the message a Exchange Message Type selects.
     *
     * @param exchangeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long exchangeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (exchangeMessageType == 501L) {
            message = new LoginResponseMessage();
        } else if (exchangeMessageType == 502L) {
            message = new ReplayComplete();
        } else if (exchangeMessageType == 503L) {
            message = new LogoutResponseMessage();
        } else if (exchangeMessageType == 504L) {
            message = new ServerHeartbeat();
        } else if (exchangeMessageType == 6501L) {
            message = new OrderAcknowledgementCaEquitiesV();
        } else if (exchangeMessageType == 6502L) {
            message = new OrderRejectedCaEquitiesV();
        } else if (exchangeMessageType == 6503L) {
            message = new OrderModifiedCaEquitiesV();
        } else if (exchangeMessageType == 6504L) {
            message = new ModifyRejectedCaEquitiesV();
        } else if (exchangeMessageType == 6505L) {
            message = new OrderRestatedCaEquitiesV();
        } else if (exchangeMessageType == 6506L) {
            message = new OrderExecutionCaEquitiesV();
        } else if (exchangeMessageType == 6507L) {
            message = new OrderCancelledCaEquitiesV();
        } else if (exchangeMessageType == 6508L) {
            message = new CancelRejectedCaEquitiesV();
        } else if (exchangeMessageType == 6510L) {
            message = new CarriedRestatementCaEquitiesV();
        } else if (exchangeMessageType == 6511L) {
            message = new DoneForDayCaEquitiesV();
        } else if (exchangeMessageType == 6512L) {
            message = new TradeCancelCorrectCaEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
