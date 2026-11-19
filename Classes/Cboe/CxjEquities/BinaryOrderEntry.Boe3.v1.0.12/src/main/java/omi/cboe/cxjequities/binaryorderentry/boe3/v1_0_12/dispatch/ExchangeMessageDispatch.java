package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.dispatch;

import java.util.Optional;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.CancelRejectedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.ModifyRejectedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderAcknowledgementJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderCancelledJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderExecutionJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderModifiedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderRejectedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.OrderRestatedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.PurgeAcknowledgementJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.PurgeRejectedJpEquitiesV;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.LoginResponseMessage;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.LogoutResponseMessage;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.ReplayComplete;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.session.ServerHeartbeat;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;

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
        } else if (exchangeMessageType == 5501L) {
            message = new OrderAcknowledgementJpEquitiesV();
        } else if (exchangeMessageType == 5502L) {
            message = new OrderRejectedJpEquitiesV();
        } else if (exchangeMessageType == 5503L) {
            message = new OrderModifiedJpEquitiesV();
        } else if (exchangeMessageType == 5504L) {
            message = new ModifyRejectedJpEquitiesV();
        } else if (exchangeMessageType == 5505L) {
            message = new OrderRestatedJpEquitiesV();
        } else if (exchangeMessageType == 5506L) {
            message = new OrderExecutionJpEquitiesV();
        } else if (exchangeMessageType == 5507L) {
            message = new OrderCancelledJpEquitiesV();
        } else if (exchangeMessageType == 5508L) {
            message = new CancelRejectedJpEquitiesV();
        } else if (exchangeMessageType == 5510L) {
            message = new PurgeAcknowledgementJpEquitiesV();
        } else if (exchangeMessageType == 5511L) {
            message = new PurgeRejectedJpEquitiesV();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
