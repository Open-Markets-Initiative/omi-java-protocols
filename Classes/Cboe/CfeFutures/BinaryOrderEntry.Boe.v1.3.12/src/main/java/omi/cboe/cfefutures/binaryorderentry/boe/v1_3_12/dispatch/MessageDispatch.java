package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.CancelOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.CancelRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ClientHeartbeatMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.LoginRequestMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.LoginResponseMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.LogoutMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.LogoutRequestMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ModifyOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.NewOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.OrderAcknowledgmentMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.OrderCancelledMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.OrderExecutionMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.OrderModifiedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.OrderRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.PurgeOrdersMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.PurgeRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteCancelledMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteExecutionMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteRestatedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteUpdateAcknowledgmentMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteUpdateMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ReplayCompleteMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ResetRiskAcknowledgmentMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ResetRiskMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.ServerHeartbeatMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.TasQuoteRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.TasRestatementNewOrderMessageMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.TradeCancelOrCorrectMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.UserModifyRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.VarianceQuoteRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application.VarianceRestatementNewOrderMessageMessage;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;

/**
 * Selects the message a Message branch holds by its Message Type.
 */
public final class MessageDispatch {

    private MessageDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 55L) {
            message = new LoginRequestMessage();
        } else if (messageType == 2L) {
            message = new LogoutRequestMessage();
        } else if (messageType == 3L) {
            message = new ClientHeartbeatMessage();
        } else if (messageType == 36L) {
            message = new LoginResponseMessage();
        } else if (messageType == 8L) {
            message = new LogoutMessage();
        } else if (messageType == 9L) {
            message = new ServerHeartbeatMessage();
        } else if (messageType == 19L) {
            message = new ReplayCompleteMessage();
        } else if (messageType == 56L) {
            message = new NewOrderMessage();
        } else if (messageType == 57L) {
            message = new CancelOrderMessage();
        } else if (messageType == 58L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 112L) {
            message = new QuoteUpdateMessage();
        } else if (messageType == 71L) {
            message = new PurgeOrdersMessage();
        } else if (messageType == 86L) {
            message = new ResetRiskMessage();
        } else if (messageType == 37L) {
            message = new OrderAcknowledgmentMessage();
        } else if (messageType == 113L) {
            message = new QuoteUpdateAcknowledgmentMessage();
        } else if (messageType == 38L) {
            message = new OrderRejectedMessage();
        } else if (messageType == 120L) {
            message = new QuoteUpdateRejectedMessage();
        } else if (messageType == 39L) {
            message = new OrderModifiedMessage();
        } else if (messageType == 114L) {
            message = new QuoteRestatedMessage();
        } else if (messageType == 41L) {
            message = new UserModifyRejectedMessage();
        } else if (messageType == 42L) {
            message = new OrderCancelledMessage();
        } else if (messageType == 115L) {
            message = new QuoteCancelledMessage();
        } else if (messageType == 43L) {
            message = new CancelRejectedMessage();
        } else if (messageType == 44L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 116L) {
            message = new QuoteExecutionMessage();
        } else if (messageType == 45L) {
            message = new TradeCancelOrCorrectMessage();
        } else if (messageType == 72L) {
            message = new PurgeRejectedMessage();
        } else if (messageType == 87L) {
            message = new ResetRiskAcknowledgmentMessage();
        } else if (messageType == 54L) {
            message = new MassCancelAcknowledgmentMessage();
        } else if (messageType == 73L) {
            message = new TasRestatementNewOrderMessageMessage();
        } else if (messageType == 74L) {
            message = new VarianceRestatementNewOrderMessageMessage();
        } else if (messageType == 117L) {
            message = new TasQuoteRestatementMessage();
        } else if (messageType == 118L) {
            message = new VarianceQuoteRestatementMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
