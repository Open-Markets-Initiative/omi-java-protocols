package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.dispatch;

import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.CancelOrderMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.CancelRejectedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ClientHeartbeatMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.LoginRequestMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.LoginResponseMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.LogoutMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.LogoutRequestMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ModifyOrderMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.NewOrderMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderAcknowledgmentMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderCancelledMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderExecutionMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderModifiedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderRejectedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.OrderRestatedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.PurgeOrderMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.PurgeRejectedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteCancelledMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteExecutionMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteRestatedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteUpdateAcknowledgmentMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteUpdateMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ReplayCompleteMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ResetRiskAcknowledgmentMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.RiskResetMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ServerHeartbeatMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.ShortQuoteUpdateMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.TradeCancelOrCorrectMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.UserModifyRejectedMessage;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;

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
        } else if (messageType == 85L) {
            message = new QuoteUpdateMessage();
        } else if (messageType == 89L) {
            message = new ShortQuoteUpdateMessage();
        } else if (messageType == 71L) {
            message = new PurgeOrderMessage();
        } else if (messageType == 86L) {
            message = new RiskResetMessage();
        } else if (messageType == 37L) {
            message = new OrderAcknowledgmentMessage();
        } else if (messageType == 81L) {
            message = new QuoteUpdateAcknowledgmentMessage();
        } else if (messageType == 38L) {
            message = new OrderRejectedMessage();
        } else if (messageType == 88L) {
            message = new QuoteUpdateRejectedMessage();
        } else if (messageType == 39L) {
            message = new OrderModifiedMessage();
        } else if (messageType == 40L) {
            message = new OrderRestatedMessage();
        } else if (messageType == 82L) {
            message = new QuoteRestatedMessage();
        } else if (messageType == 41L) {
            message = new UserModifyRejectedMessage();
        } else if (messageType == 42L) {
            message = new OrderCancelledMessage();
        } else if (messageType == 83L) {
            message = new QuoteCancelledMessage();
        } else if (messageType == 43L) {
            message = new CancelRejectedMessage();
        } else if (messageType == 84L) {
            message = new QuoteExecutionMessage();
        } else if (messageType == 45L) {
            message = new TradeCancelOrCorrectMessage();
        } else if (messageType == 72L) {
            message = new PurgeRejectedMessage();
        } else if (messageType == 87L) {
            message = new ResetRiskAcknowledgmentMessage();
        } else if (messageType == 54L) {
            message = new MassCancelAcknowledgmentMessage();
        } else if (messageType == 44L) {
            message = new OrderExecutionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
