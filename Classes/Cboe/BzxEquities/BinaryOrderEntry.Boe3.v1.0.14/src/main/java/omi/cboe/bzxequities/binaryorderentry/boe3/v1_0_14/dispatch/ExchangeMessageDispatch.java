package omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.dispatch;

import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.CancelRejectedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.ModifyRejectedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderAcknowledgementUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderCancelledUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderExecutionUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderModifiedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderRejectedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.OrderRestatedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.PurgeAcknowledgementUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.PurgeRejectedUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.ResetRiskAcknowledgementUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application.TradeCancelCorrectUsEquitiesV;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.session.LoginResponseMessage;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.session.LogoutResponseMessage;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.session.ReplayComplete;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.session.ServerHeartbeat;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.Message;

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
        } else if (exchangeMessageType == 4501L) {
            message = new OrderAcknowledgementUsEquitiesV();
        } else if (exchangeMessageType == 4502L) {
            message = new OrderRejectedUsEquitiesV();
        } else if (exchangeMessageType == 4503L) {
            message = new OrderModifiedUsEquitiesV();
        } else if (exchangeMessageType == 4505L) {
            message = new OrderRestatedUsEquitiesV();
        } else if (exchangeMessageType == 4504L) {
            message = new ModifyRejectedUsEquitiesV();
        } else if (exchangeMessageType == 4506L) {
            message = new OrderCancelledUsEquitiesV();
        } else if (exchangeMessageType == 4507L) {
            message = new CancelRejectedUsEquitiesV();
        } else if (exchangeMessageType == 4508L) {
            message = new OrderExecutionUsEquitiesV();
        } else if (exchangeMessageType == 4509L) {
            message = new TradeCancelCorrectUsEquitiesV();
        } else if (exchangeMessageType == 4512L) {
            message = new PurgeRejectedUsEquitiesV();
        } else if (exchangeMessageType == 4510L) {
            message = new ResetRiskAcknowledgementUsEquitiesV();
        } else if (exchangeMessageType == 4511L) {
            message = new PurgeAcknowledgementUsEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
