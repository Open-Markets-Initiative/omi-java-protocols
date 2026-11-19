package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.dispatch;

import java.util.Optional;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.CancelOrderV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.CancelRejectedV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.ClientHeartbeatMessage;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.LoginRequestV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.LoginResponseV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.LogoutMessage;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.LogoutRequestMessage;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.ModifyOrderV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.NewOrderV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderAcknowledgmentV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderCancelledV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderExecutionV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderModifiedV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderRejectedV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.OrderRestatedV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.ReplayCompleteMessage;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.ServerHeartbeatMessage;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCancelOrCorrectV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCaptureConfirmV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCaptureReportAcknowledgmentV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCaptureReportDeclineV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCaptureReportRejectV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.TradeCaptureReportV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application.UserModifyRejectedV2Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.Message;

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
            message = new LoginRequestV2Message();
        } else if (messageType == 2L) {
            message = new LogoutRequestMessage();
        } else if (messageType == 3L) {
            message = new ClientHeartbeatMessage();
        } else if (messageType == 36L) {
            message = new LoginResponseV2Message();
        } else if (messageType == 8L) {
            message = new LogoutMessage();
        } else if (messageType == 9L) {
            message = new ServerHeartbeatMessage();
        } else if (messageType == 19L) {
            message = new ReplayCompleteMessage();
        } else if (messageType == 56L) {
            message = new NewOrderV2Message();
        } else if (messageType == 57L) {
            message = new CancelOrderV2Message();
        } else if (messageType == 58L) {
            message = new ModifyOrderV2Message();
        } else if (messageType == 60L) {
            message = new TradeCaptureReportV2Message();
        } else if (messageType == 37L) {
            message = new OrderAcknowledgmentV2Message();
        } else if (messageType == 38L) {
            message = new OrderRejectedV2Message();
        } else if (messageType == 39L) {
            message = new OrderModifiedV2Message();
        } else if (messageType == 40L) {
            message = new OrderRestatedV2Message();
        } else if (messageType == 41L) {
            message = new UserModifyRejectedV2Message();
        } else if (messageType == 42L) {
            message = new OrderCancelledV2Message();
        } else if (messageType == 43L) {
            message = new CancelRejectedV2Message();
        } else if (messageType == 44L) {
            message = new OrderExecutionV2Message();
        } else if (messageType == 45L) {
            message = new TradeCancelOrCorrectV2Message();
        } else if (messageType == 48L) {
            message = new TradeCaptureReportAcknowledgmentV2Message();
        } else if (messageType == 49L) {
            message = new TradeCaptureReportRejectV2Message();
        } else if (messageType == 50L) {
            message = new TradeCaptureConfirmV2Message();
        } else if (messageType == 51L) {
            message = new TradeCaptureReportDeclineV2Message();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
