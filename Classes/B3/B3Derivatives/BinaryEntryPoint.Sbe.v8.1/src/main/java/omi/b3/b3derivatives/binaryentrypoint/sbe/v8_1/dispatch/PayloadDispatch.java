package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.dispatch;

import java.util.Optional;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.AllocationInstructionMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.AllocationReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.BusinessMessageRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.EstablishAckMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.EstablishMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.EstablishRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportCancelMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportForwardMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportModifyMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportNewMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.ExecutionReportTradeMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NegotiateMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NegotiateRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NegotiateResponseMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NewOrderCrossMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NewOrderSingleMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.NotAppliedMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.OrderCancelReplaceRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.OrderCancelRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.OrderMassActionReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.OrderMassActionRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.PositionMaintenanceCancelRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.PositionMaintenanceReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.PositionMaintenanceRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.QuoteCancelMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.QuoteMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.QuoteRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.QuoteRequestRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.QuoteStatusReportMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.RetransmissionMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.RetransmitRejectMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.RetransmitRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.SecurityDefinitionRequestMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.SecurityDefinitionResponseMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.SequenceMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.SimpleModifyOrderMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.SimpleNewOrderMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.TerminateMessage;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 1L) {
            message = new NegotiateMessage();
        } else if (templateId == 2L) {
            message = new NegotiateResponseMessage();
        } else if (templateId == 3L) {
            message = new NegotiateRejectMessage();
        } else if (templateId == 4L) {
            message = new EstablishMessage();
        } else if (templateId == 5L) {
            message = new EstablishAckMessage();
        } else if (templateId == 6L) {
            message = new EstablishRejectMessage();
        } else if (templateId == 7L) {
            message = new TerminateMessage();
        } else if (templateId == 8L) {
            message = new NotAppliedMessage();
        } else if (templateId == 9L) {
            message = new SequenceMessage();
        } else if (templateId == 12L) {
            message = new RetransmitRequestMessage();
        } else if (templateId == 13L) {
            message = new RetransmissionMessage();
        } else if (templateId == 14L) {
            message = new RetransmitRejectMessage();
        } else if (templateId == 100L) {
            message = new SimpleNewOrderMessage();
        } else if (templateId == 101L) {
            message = new SimpleModifyOrderMessage();
        } else if (templateId == 102L) {
            message = new NewOrderSingleMessage();
        } else if (templateId == 104L) {
            message = new OrderCancelReplaceRequestMessage();
        } else if (templateId == 105L) {
            message = new OrderCancelRequestMessage();
        } else if (templateId == 106L) {
            message = new NewOrderCrossMessage();
        } else if (templateId == 200L) {
            message = new ExecutionReportNewMessage();
        } else if (templateId == 201L) {
            message = new ExecutionReportModifyMessage();
        } else if (templateId == 202L) {
            message = new ExecutionReportCancelMessage();
        } else if (templateId == 203L) {
            message = new ExecutionReportTradeMessage();
        } else if (templateId == 204L) {
            message = new ExecutionReportRejectMessage();
        } else if (templateId == 205L) {
            message = new ExecutionReportForwardMessage();
        } else if (templateId == 206L) {
            message = new BusinessMessageRejectMessage();
        } else if (templateId == 300L) {
            message = new SecurityDefinitionRequestMessage();
        } else if (templateId == 301L) {
            message = new SecurityDefinitionResponseMessage();
        } else if (templateId == 401L) {
            message = new QuoteRequestMessage();
        } else if (templateId == 402L) {
            message = new QuoteStatusReportMessage();
        } else if (templateId == 403L) {
            message = new QuoteMessage();
        } else if (templateId == 404L) {
            message = new QuoteCancelMessage();
        } else if (templateId == 405L) {
            message = new QuoteRequestRejectMessage();
        } else if (templateId == 501L) {
            message = new PositionMaintenanceCancelRequestMessage();
        } else if (templateId == 502L) {
            message = new PositionMaintenanceRequestMessage();
        } else if (templateId == 503L) {
            message = new PositionMaintenanceReportMessage();
        } else if (templateId == 601L) {
            message = new AllocationInstructionMessage();
        } else if (templateId == 602L) {
            message = new AllocationReportMessage();
        } else if (templateId == 701L) {
            message = new OrderMassActionRequestMessage();
        } else if (templateId == 702L) {
            message = new OrderMassActionReportMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
