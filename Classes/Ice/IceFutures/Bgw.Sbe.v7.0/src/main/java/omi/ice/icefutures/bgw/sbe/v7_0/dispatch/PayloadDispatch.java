package omi.ice.icefutures.bgw.sbe.v7_0.dispatch;

import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.CancelReplaceRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.CancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ErrorMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportCancelMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportModifyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportNewMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportRejectMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportSnapshotMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ExecutionReportTradeMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.HeartBeatMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.IpReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.IpRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogonReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogonRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogoutReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.LogoutRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.MassQuoteReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.MassQuoteRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderCrossReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderCrossRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewOrderRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.NewsMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.OrderMassCancelReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.OrderMassCancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteCancelRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.QuoteRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ResendReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.ResendRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRejectMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportProductMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionReportStrategyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestCreateFlexMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestCreateStrategyMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SecurityDefinitionRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SequenceResetMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.SimpleOpenFramingHeaderMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogonReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogonRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogoutReportMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.TraderLogoutRequestMessage;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;

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
        if (templateId == 0L) {
            message = new SimpleOpenFramingHeaderMessage();
        } else if (templateId == 1L) {
            message = new LogonRequestMessage();
        } else if (templateId == 101L) {
            message = new LogonReportMessage();
        } else if (templateId == 13L) {
            message = new LogoutRequestMessage();
        } else if (templateId == 113L) {
            message = new LogoutReportMessage();
        } else if (templateId == 51L) {
            message = new HeartBeatMessage();
        } else if (templateId == 114L) {
            message = new ErrorMessage();
        } else if (templateId == 116L) {
            message = new NewsMessage();
        } else if (templateId == 112L) {
            message = new SecurityDefinitionReportStrategyMessage();
        } else if (templateId == 115L) {
            message = new SecurityDefinitionReportMessage();
        } else if (templateId == 155L) {
            message = new SecurityDefinitionRejectMessage();
        } else if (templateId == 15L) {
            message = new SecurityDefinitionRequestMessage();
        } else if (templateId == 154L) {
            message = new SecurityDefinitionReportProductMessage();
        } else if (templateId == 2001L) {
            message = new IpRequestMessage();
        } else if (templateId == 2002L) {
            message = new IpReportMessage();
        } else if (templateId == 2L) {
            message = new TraderLogonRequestMessage();
        } else if (templateId == 102L) {
            message = new TraderLogonReportMessage();
        } else if (templateId == 3L) {
            message = new TraderLogoutRequestMessage();
        } else if (templateId == 103L) {
            message = new TraderLogoutReportMessage();
        } else if (templateId == 4L) {
            message = new NewOrderRequestMessage();
        } else if (templateId == 5L) {
            message = new CancelReplaceRequestMessage();
        } else if (templateId == 6L) {
            message = new CancelRequestMessage();
        } else if (templateId == 7L) {
            message = new QuoteRequestMessage();
        } else if (templateId == 8L) {
            message = new NewOrderCrossRequestMessage();
        } else if (templateId == 9L) {
            message = new OrderMassCancelRequestMessage();
        } else if (templateId == 10L) {
            message = new MassQuoteRequestMessage();
        } else if (templateId == 11L) {
            message = new QuoteCancelRequestMessage();
        } else if (templateId == 12L) {
            message = new SecurityDefinitionRequestCreateStrategyMessage();
        } else if (templateId == 14L) {
            message = new SecurityDefinitionRequestCreateFlexMessage();
        } else if (templateId == 104L) {
            message = new ExecutionReportNewMessage();
        } else if (templateId == 105L) {
            message = new ExecutionReportModifyMessage();
        } else if (templateId == 106L) {
            message = new ExecutionReportCancelMessage();
        } else if (templateId == 151L) {
            message = new ExecutionReportRejectMessage();
        } else if (templateId == 152L) {
            message = new ExecutionReportSnapshotMessage();
        } else if (templateId == 153L) {
            message = new ExecutionReportTradeMessage();
        } else if (templateId == 107L) {
            message = new QuoteReportMessage();
        } else if (templateId == 108L) {
            message = new NewOrderCrossReportMessage();
        } else if (templateId == 109L) {
            message = new OrderMassCancelReportMessage();
        } else if (templateId == 110L) {
            message = new MassQuoteReportMessage();
        } else if (templateId == 16L) {
            message = new ResendRequestMessage();
        } else if (templateId == 117L) {
            message = new ResendReportMessage();
        } else if (templateId == 111L) {
            message = new SequenceResetMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
