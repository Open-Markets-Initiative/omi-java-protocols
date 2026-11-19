package omi.jse.itac.enhancednativetrading.ntgi.v4_04.dispatch;

import java.util.Optional;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.BusinessRejectMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.ExecutionReportMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.HeartbeatMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.LogonMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.LogonResponseMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.LogoutMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.MissedMessageRequestAckMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.MissedMessageRequestMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.NewOrderMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.NewsMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.OrderCancelRejectMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.OrderCancelReplaceRequestMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.OrderCancelRequestMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.OrderMassCancelReportMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.OrderMassCancelRequestMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.RejectMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.SecurityDefinitionRequestMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.SecurityDefinitionResponseMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.SystemStatusMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application.TransmissionCompleteMessage;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'A') {
            message = new LogonMessage();
        } else if (messageType == 'B') {
            message = new LogonResponseMessage();
        } else if (messageType == '5') {
            message = new LogoutMessage();
        } else if (messageType == '0') {
            message = new HeartbeatMessage();
        } else if (messageType == '3') {
            message = new RejectMessage();
        } else if (messageType == 'M') {
            message = new MissedMessageRequestMessage();
        } else if (messageType == 'N') {
            message = new MissedMessageRequestAckMessage();
        } else if (messageType == 'P') {
            message = new TransmissionCompleteMessage();
        } else if (messageType == 'n') {
            message = new SystemStatusMessage();
        } else if (messageType == 'D') {
            message = new NewOrderMessage();
        } else if (messageType == 'F') {
            message = new OrderCancelRequestMessage();
        } else if (messageType == 'q') {
            message = new OrderMassCancelRequestMessage();
        } else if (messageType == 'G') {
            message = new OrderCancelReplaceRequestMessage();
        } else if (messageType == 'O') {
            message = new SecurityDefinitionRequestMessage();
        } else if (messageType == '8') {
            message = new ExecutionReportMessage();
        } else if (messageType == '9') {
            message = new OrderCancelRejectMessage();
        } else if (messageType == 'r') {
            message = new OrderMassCancelReportMessage();
        } else if (messageType == 'R') {
            message = new SecurityDefinitionResponseMessage();
        } else if (messageType == 'Z') {
            message = new NewsMessage();
        } else if (messageType == 'j') {
            message = new BusinessRejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
