package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.dispatch;

import java.util.Optional;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.CancelRejectedAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.CarriedRestatementAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.DoneForDayAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.ExecutionRestatementAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.ModifyRejectedAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderAcknowledgementAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderCancelledAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderExecutionAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderModifiedAuEquitiesV1;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderModifiedAuEquitiesV2;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderRejectedAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.OrderRestatedAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.PurgeAcknowledgementAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.PurgeRejectedAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.TradeCancelCorrectAuEquitiesV;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.LoginResponseMessage;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.LogoutResponseMessage;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.ReplayComplete;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.session.ServerHeartbeat;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;

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
        } else if (exchangeMessageType == 3501L) {
            message = new OrderAcknowledgementAuEquitiesV();
        } else if (exchangeMessageType == 3502L) {
            message = new OrderRejectedAuEquitiesV();
        } else if (exchangeMessageType == 3503L) {
            message = new OrderModifiedAuEquitiesV1();
        } else if (exchangeMessageType == 3504L) {
            message = new ModifyRejectedAuEquitiesV();
        } else if (exchangeMessageType == 3505L) {
            message = new OrderRestatedAuEquitiesV();
        } else if (exchangeMessageType == 3506L) {
            message = new OrderExecutionAuEquitiesV();
        } else if (exchangeMessageType == 3507L) {
            message = new OrderCancelledAuEquitiesV();
        } else if (exchangeMessageType == 3508L) {
            message = new CancelRejectedAuEquitiesV();
        } else if (exchangeMessageType == 3509L) {
            message = new ExecutionRestatementAuEquitiesV();
        } else if (exchangeMessageType == 3510L) {
            message = new PurgeAcknowledgementAuEquitiesV();
        } else if (exchangeMessageType == 3511L) {
            message = new PurgeRejectedAuEquitiesV();
        } else if (exchangeMessageType == 3512L) {
            message = new TradeCancelCorrectAuEquitiesV();
        } else if (exchangeMessageType == 3513L) {
            message = new OrderModifiedAuEquitiesV2();
        } else if (exchangeMessageType == 3514L) {
            message = new CarriedRestatementAuEquitiesV();
        } else if (exchangeMessageType == 3515L) {
            message = new DoneForDayAuEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
