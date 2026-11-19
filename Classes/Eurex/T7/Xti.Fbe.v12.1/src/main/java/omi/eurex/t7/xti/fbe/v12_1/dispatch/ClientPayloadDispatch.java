package omi.eurex.t7.xti.fbe.v12_1.dispatch;

import java.util.Optional;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ApproveTesTradeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.CrossRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.DeleteAllOrderRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.DeleteAllQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.DeleteOrderSingleRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.DeleteTesTradeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.EnterTesTradeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.Heartbeat;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.InquireEnrichmentRuleIdListRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.InquirePreTradeRiskLimitsRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.InquireSessionListRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.InquireUserRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.IssuerSecurityStateChangeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.LogonRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.LogonRequestEncrypted;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.LogoutRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.MassQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ModifyOrderRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ModifyOrderShortRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ModifyOrderSingleRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ModifyOrderSingleShortRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.ModifyTesTradeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.NewOrderRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.NewOrderShortRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.NewOrderSingleRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.NewOrderSingleShortRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.PingRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.PreTradeRiskLimitsDefinitionRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.QuoteActivationRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.RetransmitMeMessageRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.RetransmitRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.RfqRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.SingleQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.SpecialistRfqRejectRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.SpecialistRfqReplyRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.SpecialistSecurityStateChangeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.SubscribeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.UnsubscribeRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.UserLoginRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.UserLoginRequestEncrypted;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.UserLogoutRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightApproveDealRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightDeleteAllQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightEnterQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightHitQuoteRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightOpenNegotiationRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightQuoteSnapshotRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightQuotingStatusRequest;
import omi.eurex.t7.xti.fbe.v12_1.messages.application.XetraEnLightUpdateNegotiationRequest;
import omi.eurex.t7.xti.fbe.v12_1.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Template Id.
 */
public final class ClientPayloadDispatch {

    private ClientPayloadDispatch() {
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
        if (templateId == 10603L) {
            message = new ApproveTesTradeRequest();
        } else if (templateId == 10118L) {
            message = new CrossRequest();
        } else if (templateId == 10120L) {
            message = new DeleteAllOrderRequest();
        } else if (templateId == 10408L) {
            message = new DeleteAllQuoteRequest();
        } else if (templateId == 10109L) {
            message = new DeleteOrderSingleRequest();
        } else if (templateId == 10602L) {
            message = new DeleteTesTradeRequest();
        } else if (templateId == 10600L) {
            message = new EnterTesTradeRequest();
        } else if (templateId == 10011L) {
            message = new Heartbeat();
        } else if (templateId == 10040L) {
            message = new InquireEnrichmentRuleIdListRequest();
        } else if (templateId == 10311L) {
            message = new InquirePreTradeRiskLimitsRequest();
        } else if (templateId == 10035L) {
            message = new InquireSessionListRequest();
        } else if (templateId == 10038L) {
            message = new InquireUserRequest();
        } else if (templateId == 10314L) {
            message = new IssuerSecurityStateChangeRequest();
        } else if (templateId == 10000L) {
            message = new LogonRequest();
        } else if (templateId == 19000L) {
            message = new LogonRequestEncrypted();
        } else if (templateId == 10002L) {
            message = new LogoutRequest();
        } else if (templateId == 10405L) {
            message = new MassQuoteRequest();
        } else if (templateId == 10140L) {
            message = new ModifyOrderRequest();
        } else if (templateId == 10141L) {
            message = new ModifyOrderShortRequest();
        } else if (templateId == 10106L) {
            message = new ModifyOrderSingleRequest();
        } else if (templateId == 10126L) {
            message = new ModifyOrderSingleShortRequest();
        } else if (templateId == 10601L) {
            message = new ModifyTesTradeRequest();
        } else if (templateId == 10138L) {
            message = new NewOrderRequest();
        } else if (templateId == 10139L) {
            message = new NewOrderShortRequest();
        } else if (templateId == 10100L) {
            message = new NewOrderSingleRequest();
        } else if (templateId == 10125L) {
            message = new NewOrderSingleShortRequest();
        } else if (templateId == 10320L) {
            message = new PingRequest();
        } else if (templateId == 10312L) {
            message = new PreTradeRiskLimitsDefinitionRequest();
        } else if (templateId == 10403L) {
            message = new QuoteActivationRequest();
        } else if (templateId == 10401L) {
            message = new RfqRequest();
        } else if (templateId == 10026L) {
            message = new RetransmitMeMessageRequest();
        } else if (templateId == 10008L) {
            message = new RetransmitRequest();
        } else if (templateId == 10418L) {
            message = new SingleQuoteRequest();
        } else if (templateId == 10421L) {
            message = new SpecialistRfqRejectRequest();
        } else if (templateId == 10422L) {
            message = new SpecialistRfqReplyRequest();
        } else if (templateId == 10317L) {
            message = new SpecialistSecurityStateChangeRequest();
        } else if (templateId == 10025L) {
            message = new SubscribeRequest();
        } else if (templateId == 10006L) {
            message = new UnsubscribeRequest();
        } else if (templateId == 10018L) {
            message = new UserLoginRequest();
        } else if (templateId == 19018L) {
            message = new UserLoginRequestEncrypted();
        } else if (templateId == 10029L) {
            message = new UserLogoutRequest();
        } else if (templateId == 10819L) {
            message = new XetraEnLightApproveDealRequest();
        } else if (templateId == 10821L) {
            message = new XetraEnLightDeleteAllQuoteRequest();
        } else if (templateId == 10802L) {
            message = new XetraEnLightEnterQuoteRequest();
        } else if (templateId == 10804L) {
            message = new XetraEnLightHitQuoteRequest();
        } else if (templateId == 10800L) {
            message = new XetraEnLightOpenNegotiationRequest();
        } else if (templateId == 10820L) {
            message = new XetraEnLightQuoteSnapshotRequest();
        } else if (templateId == 10817L) {
            message = new XetraEnLightQuotingStatusRequest();
        } else if (templateId == 10801L) {
            message = new XetraEnLightUpdateNegotiationRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
