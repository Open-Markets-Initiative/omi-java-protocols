package omi.cme.globex.ilink3.sbe.v8_5.dispatch;

import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.BusinessReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.EstablishmentAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.EstablishmentReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportCancel;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportElimination;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportModify;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportNew;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportStatus;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumOutright;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumSpread;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeAddendumSpreadLeg;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeOutright;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeSpread;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionReportTradeSpreadLeg;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.MassQuoteAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NegotiationReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NegotiationResponse;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NotApplied;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReplaceReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassActionReport;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsDefinitionRequestAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsListReport;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.QuoteCancelAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RequestForQuoteAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Retransmission;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RetransmitReject;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.SecurityDefinitionResponse;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Sequence;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Terminate;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Template Id.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
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
        if (templateId == 501L) {
            message = new NegotiationResponse();
        } else if (templateId == 502L) {
            message = new NegotiationReject();
        } else if (templateId == 504L) {
            message = new EstablishmentAck();
        } else if (templateId == 505L) {
            message = new EstablishmentReject();
        } else if (templateId == 506L) {
            message = new Sequence();
        } else if (templateId == 507L) {
            message = new Terminate();
        } else if (templateId == 509L) {
            message = new Retransmission();
        } else if (templateId == 510L) {
            message = new RetransmitReject();
        } else if (templateId == 513L) {
            message = new NotApplied();
        } else if (templateId == 519L) {
            message = new PartyDetailsDefinitionRequestAck();
        } else if (templateId == 521L) {
            message = new BusinessReject();
        } else if (templateId == 522L) {
            message = new ExecutionReportNew();
        } else if (templateId == 523L) {
            message = new ExecutionReportReject();
        } else if (templateId == 524L) {
            message = new ExecutionReportElimination();
        } else if (templateId == 525L) {
            message = new ExecutionReportTradeOutright();
        } else if (templateId == 526L) {
            message = new ExecutionReportTradeSpread();
        } else if (templateId == 527L) {
            message = new ExecutionReportTradeSpreadLeg();
        } else if (templateId == 531L) {
            message = new ExecutionReportModify();
        } else if (templateId == 532L) {
            message = new ExecutionReportStatus();
        } else if (templateId == 534L) {
            message = new ExecutionReportCancel();
        } else if (templateId == 535L) {
            message = new OrderCancelReject();
        } else if (templateId == 536L) {
            message = new OrderCancelReplaceReject();
        } else if (templateId == 538L) {
            message = new PartyDetailsListReport();
        } else if (templateId == 545L) {
            message = new MassQuoteAck();
        } else if (templateId == 546L) {
            message = new RequestForQuoteAck();
        } else if (templateId == 548L) {
            message = new ExecutionReportTradeAddendumOutright();
        } else if (templateId == 549L) {
            message = new ExecutionReportTradeAddendumSpread();
        } else if (templateId == 550L) {
            message = new ExecutionReportTradeAddendumSpreadLeg();
        } else if (templateId == 561L) {
            message = new SecurityDefinitionResponse();
        } else if (templateId == 562L) {
            message = new OrderMassActionReport();
        } else if (templateId == 563L) {
            message = new QuoteCancelAck();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
