package omi.eurex.t7.eti.fbe.v10_0.dispatch;

import java.util.Optional;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddComplexInstrumentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddFlexibleInstrumentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AmendBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveReverseTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.CrossRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteClipRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterClipRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.Heartbeat;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireEnrichmentRuleIdListRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireMmParameterRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquirePreTradeRiskLimitsRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireSessionListRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireUserRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogonRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogoutRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MassQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MmParameterDefinitionRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderComplexShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderSingleShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderComplexShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderSingleShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PingRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PreTradeRiskLimitsDefinitionRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.QuoteActivationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitMeMessageRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ReverseTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RfqRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsEnterQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsHitQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsInquireSmartRespondentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsOpenNegotiationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsQuotingStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsUpdateDealStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsUpdateNegotiationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SubscribeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesCompressionRunStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UnsubscribeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UploadTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLoginRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLogoutRequest;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;

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
        if (templateId == 10301L) {
            message = new AddComplexInstrumentRequest();
        } else if (templateId == 10309L) {
            message = new AddFlexibleInstrumentRequest();
        } else if (templateId == 10629L) {
            message = new AmendBasketTradeRequest();
        } else if (templateId == 10623L) {
            message = new ApproveBasketTradeRequest();
        } else if (templateId == 10631L) {
            message = new ApproveReverseTesTradeRequest();
        } else if (templateId == 10603L) {
            message = new ApproveTesTradeRequest();
        } else if (templateId == 10118L) {
            message = new CrossRequest();
        } else if (templateId == 10120L) {
            message = new DeleteAllOrderRequest();
        } else if (templateId == 10408L) {
            message = new DeleteAllQuoteRequest();
        } else if (templateId == 10622L) {
            message = new DeleteBasketTradeRequest();
        } else if (templateId == 10132L) {
            message = new DeleteClipRequest();
        } else if (templateId == 10123L) {
            message = new DeleteOrderComplexRequest();
        } else if (templateId == 10109L) {
            message = new DeleteOrderSingleRequest();
        } else if (templateId == 10602L) {
            message = new DeleteTesTradeRequest();
        } else if (templateId == 10620L) {
            message = new EnterBasketTradeRequest();
        } else if (templateId == 10131L) {
            message = new EnterClipRequest();
        } else if (templateId == 10600L) {
            message = new EnterTesTradeRequest();
        } else if (templateId == 10011L) {
            message = new Heartbeat();
        } else if (templateId == 10040L) {
            message = new InquireEnrichmentRuleIdListRequest();
        } else if (templateId == 10305L) {
            message = new InquireMmParameterRequest();
        } else if (templateId == 10311L) {
            message = new InquirePreTradeRiskLimitsRequest();
        } else if (templateId == 10035L) {
            message = new InquireSessionListRequest();
        } else if (templateId == 10038L) {
            message = new InquireUserRequest();
        } else if (templateId == 10000L) {
            message = new LogonRequest();
        } else if (templateId == 10002L) {
            message = new LogoutRequest();
        } else if (templateId == 10303L) {
            message = new MmParameterDefinitionRequest();
        } else if (templateId == 10405L) {
            message = new MassQuoteRequest();
        } else if (templateId == 10621L) {
            message = new ModifyBasketTradeRequest();
        } else if (templateId == 10114L) {
            message = new ModifyOrderComplexRequest();
        } else if (templateId == 10130L) {
            message = new ModifyOrderComplexShortRequest();
        } else if (templateId == 10106L) {
            message = new ModifyOrderSingleRequest();
        } else if (templateId == 10126L) {
            message = new ModifyOrderSingleShortRequest();
        } else if (templateId == 10601L) {
            message = new ModifyTesTradeRequest();
        } else if (templateId == 10113L) {
            message = new NewOrderComplexRequest();
        } else if (templateId == 10129L) {
            message = new NewOrderComplexShortRequest();
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
        } else if (templateId == 10630L) {
            message = new ReverseTesTradeRequest();
        } else if (templateId == 10702L) {
            message = new SrqsEnterQuoteRequest();
        } else if (templateId == 10704L) {
            message = new SrqsHitQuoteRequest();
        } else if (templateId == 10718L) {
            message = new SrqsInquireSmartRespondentRequest();
        } else if (templateId == 10700L) {
            message = new SrqsOpenNegotiationRequest();
        } else if (templateId == 10717L) {
            message = new SrqsQuotingStatusRequest();
        } else if (templateId == 10706L) {
            message = new SrqsUpdateDealStatusRequest();
        } else if (templateId == 10701L) {
            message = new SrqsUpdateNegotiationRequest();
        } else if (templateId == 10025L) {
            message = new SubscribeRequest();
        } else if (templateId == 10616L) {
            message = new TesCompressionRunStatusRequest();
        } else if (templateId == 10006L) {
            message = new UnsubscribeRequest();
        } else if (templateId == 10612L) {
            message = new UploadTesTradeRequest();
        } else if (templateId == 10018L) {
            message = new UserLoginRequest();
        } else if (templateId == 10029L) {
            message = new UserLogoutRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
