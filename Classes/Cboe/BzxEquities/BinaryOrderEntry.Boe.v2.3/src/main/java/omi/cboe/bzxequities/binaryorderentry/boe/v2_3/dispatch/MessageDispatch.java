package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.dispatch;

import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.CancelOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.CancelRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.ClientHeartbeatMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.LoginRequestMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.LoginResponseMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.LogoutMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.LogoutRequestMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.ModifyOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.NewOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderAcknowledgmentMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderCancelledMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderExecutionMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderModifiedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.OrderRestatedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.PurgeOrderMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.PurgeRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.ReplayCompleteMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.ServerHeartbeatMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.TradeCancelOrCorrectMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application.UserModifyRejectedMessage;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Message;

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
        } else if (messageType == 71L) {
            message = new PurgeOrderMessage();
        } else if (messageType == 37L) {
            message = new OrderAcknowledgmentMessage();
        } else if (messageType == 38L) {
            message = new OrderRejectedMessage();
        } else if (messageType == 39L) {
            message = new OrderModifiedMessage();
        } else if (messageType == 40L) {
            message = new OrderRestatedMessage();
        } else if (messageType == 41L) {
            message = new UserModifyRejectedMessage();
        } else if (messageType == 42L) {
            message = new OrderCancelledMessage();
        } else if (messageType == 43L) {
            message = new CancelRejectedMessage();
        } else if (messageType == 44L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 45L) {
            message = new TradeCancelOrCorrectMessage();
        } else if (messageType == 54L) {
            message = new MassCancelAcknowledgmentMessage();
        } else if (messageType == 72L) {
            message = new PurgeRejectedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
