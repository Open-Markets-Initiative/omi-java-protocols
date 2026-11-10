package omi.eurex.t7.eti.fbe.v10_0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddComplexInstrumentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddComplexInstrumentResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddFlexibleInstrumentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddFlexibleInstrumentResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AmendBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveReverseTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ApproveTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BasketApproveBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BasketBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BasketDeleteBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BasketExecutionBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BasketResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.BroadcastErrorNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ClipDeletionNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ClipExecutionNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ClipResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.CrossRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.CrossRequestResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderNrResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderQuoteEventBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllOrderResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllQuoteBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteAllQuoteResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteClipRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderNrResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.DeleteTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterClipRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.EnterTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ForcedLogoutNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ForcedUserLogoutNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.Heartbeat;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.HeartbeatNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireEnrichmentRuleIdListRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireEnrichmentRuleIdListResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireMmParameterRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireMmParameterResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquirePreTradeRiskLimitsRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireSessionListRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireSessionListResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireUserRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.InquireUserResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LegalNotificationBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogonRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogonResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogoutRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.LogoutResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MassQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MassQuoteResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MmParameterDefinitionRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.MmParameterDefinitionResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyBasketTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderComplexShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderNrResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyOrderSingleShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ModifyTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderComplexRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderComplexShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderNrResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderSingleRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewOrderSingleShortRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.NewsBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.OrderExecNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.OrderExecReportBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.OrderExecResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PartyActionReport;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PartyEntitlementsUpdateReport;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PingRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PingResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PreTradeRiskLimitResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.PreTradeRiskLimitsDefinitionRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.QuoteActivationNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.QuoteActivationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.QuoteActivationResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.QuoteExecutionReport;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.Reject;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitMeMessageRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitMeMessageResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RetransmitResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ReverseTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RfqRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RfqResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.RiskNotificationBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ServiceAvailabilityBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ServiceAvailabilityMarketBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsCreateDealNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsDealNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsDealResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsEnterQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsHitQuoteRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsInquireSmartRespondentRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsInquireSmartRespondentResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsNegotiationNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsNegotiationRequesterNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsNegotiationStatusNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsOpenNegotiationNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsOpenNegotiationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsOpenNegotiationRequesterNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsQuoteNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsQuoteResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsQuotingStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsStatusBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsUpdateDealStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SrqsUpdateNegotiationRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SubscribeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.SubscribeResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesApproveBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesCompressionRunStatusBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesCompressionRunStatusRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesCompressionRunStatusResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesDeleteBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesExecutionBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesReversalBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesTradeBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesTradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TesUploadBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.ThrottleUpdateNotification;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TmTradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TradeBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.TradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UnsubscribeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UnsubscribeResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UploadTesTradeRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLoginRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLoginResponse;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLogoutRequest;
import omi.eurex.t7.eti.fbe.v10_0.messages.application.UserLogoutResponse;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(AddComplexInstrumentRequest::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(AddComplexInstrumentResponse::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(AddFlexibleInstrumentRequest::new);
        check(AddFlexibleInstrumentResponse::new);
        checkGrouped(AmendBasketTradeRequest::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(ApproveBasketTradeRequest::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(ApproveReverseTesTradeRequest::new);
        check(ApproveTesTradeRequest::new);
        checkGrouped(BasketApproveBroadcast::new, RoundTrip::wire4, true, true, true, 1, 0);
        checkGrouped(BasketBroadcast::new, RoundTrip::wire5, true, true, true, 1, 0);
        check(BasketDeleteBroadcast::new);
        checkGrouped(BasketExecutionBroadcast::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(BasketResponse::new);
        checkGrouped(BroadcastErrorNotification::new, RoundTrip::wire7, true, true, true, 1, 0);
        check(ClipDeletionNotification::new);
        checkGrouped(ClipExecutionNotification::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(ClipResponse::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(CrossRequest::new);
        check(CrossRequestResponse::new);
        checkGrouped(DeleteAllOrderBroadcast::new, RoundTrip::wire10, true, true, true, 1, 0);
        check(DeleteAllOrderNrResponse::new);
        check(DeleteAllOrderQuoteEventBroadcast::new);
        check(DeleteAllOrderRequest::new);
        checkGrouped(DeleteAllOrderResponse::new, RoundTrip::wire11, true, true, true, 1, 0);
        checkGrouped(DeleteAllQuoteBroadcast::new, RoundTrip::wire12, true, true, true, 1, 0);
        check(DeleteAllQuoteRequest::new);
        checkGrouped(DeleteAllQuoteResponse::new, RoundTrip::wire13, true, true, true, 1, 0);
        check(DeleteBasketTradeRequest::new);
        check(DeleteClipRequest::new);
        check(DeleteOrderBroadcast::new);
        check(DeleteOrderComplexRequest::new);
        check(DeleteOrderNrResponse::new);
        check(DeleteOrderResponse::new);
        check(DeleteOrderSingleRequest::new);
        check(DeleteTesTradeRequest::new);
        checkGrouped(EnterBasketTradeRequest::new, RoundTrip::wire14, true, true, true, 1, 0);
        checkGrouped(EnterClipRequest::new, RoundTrip::wire15, true, true, true, 1, 0);
        checkGrouped(EnterTesTradeRequest::new, RoundTrip::wire16, true, true, true, 1, 0);
        checkGrouped(ForcedLogoutNotification::new, RoundTrip::wire17, true, true, true, 1, 0);
        checkGrouped(ForcedUserLogoutNotification::new, RoundTrip::wire18, true, true, true, 1, 0);
        check(Heartbeat::new);
        check(HeartbeatNotification::new);
        check(InquireEnrichmentRuleIdListRequest::new);
        checkGrouped(InquireEnrichmentRuleIdListResponse::new, RoundTrip::wire19, true, true, true, 1, 0);
        check(InquireMmParameterRequest::new);
        checkGrouped(InquireMmParameterResponse::new, RoundTrip::wire20, true, true, true, 1, 0);
        check(InquirePreTradeRiskLimitsRequest::new);
        check(InquireSessionListRequest::new);
        checkGrouped(InquireSessionListResponse::new, RoundTrip::wire21, true, true, true, 1, 0);
        check(InquireUserRequest::new);
        checkGrouped(InquireUserResponse::new, RoundTrip::wire22, true, true, true, 1, 0);
        checkGrouped(LegalNotificationBroadcast::new, RoundTrip::wire23, true, true, true, 1, 0);
        check(LogonRequest::new);
        check(LogonResponse::new);
        check(LogoutRequest::new);
        check(LogoutResponse::new);
        checkGrouped(MassQuoteRequest::new, RoundTrip::wire24, true, true, true, 1, 0);
        checkGrouped(MassQuoteResponse::new, RoundTrip::wire25, true, true, true, 1, 0);
        check(MmParameterDefinitionRequest::new);
        check(MmParameterDefinitionResponse::new);
        checkGrouped(ModifyBasketTradeRequest::new, RoundTrip::wire26, true, true, true, 1, 0);
        checkGrouped(ModifyOrderComplexRequest::new, RoundTrip::wire27, true, true, true, 1, 0);
        check(ModifyOrderComplexShortRequest::new);
        checkGrouped(ModifyOrderNrResponse::new, RoundTrip::wire28, true, true, true, 1, 0);
        checkGrouped(ModifyOrderResponse::new, RoundTrip::wire29, true, true, true, 1, 0);
        check(ModifyOrderSingleRequest::new);
        check(ModifyOrderSingleShortRequest::new);
        checkGrouped(ModifyTesTradeRequest::new, RoundTrip::wire30, true, true, true, 1, 0);
        checkGrouped(NewOrderComplexRequest::new, RoundTrip::wire31, true, true, true, 1, 0);
        check(NewOrderComplexShortRequest::new);
        checkGrouped(NewOrderNrResponse::new, RoundTrip::wire32, true, true, true, 1, 0);
        checkGrouped(NewOrderResponse::new, RoundTrip::wire33, true, true, true, 1, 0);
        check(NewOrderSingleRequest::new);
        check(NewOrderSingleShortRequest::new);
        checkGrouped(NewsBroadcast::new, RoundTrip::wire34, true, true, true, 1, 0);
        checkGrouped(OrderExecNotification::new, RoundTrip::wire35, true, true, true, 1, 0);
        checkGrouped(OrderExecReportBroadcast::new, RoundTrip::wire36, true, true, true, 1, 0);
        checkGrouped(OrderExecResponse::new, RoundTrip::wire37, true, true, true, 1, 0);
        check(PartyActionReport::new);
        check(PartyEntitlementsUpdateReport::new);
        check(PingRequest::new);
        check(PingResponse::new);
        checkGrouped(PreTradeRiskLimitResponse::new, RoundTrip::wire38, true, true, true, 1, 0);
        checkGrouped(PreTradeRiskLimitsDefinitionRequest::new, RoundTrip::wire39, true, true, true, 1, 0);
        checkGrouped(QuoteActivationNotification::new, RoundTrip::wire40, true, true, true, 1, 0);
        check(QuoteActivationRequest::new);
        checkGrouped(QuoteActivationResponse::new, RoundTrip::wire41, true, true, true, 1, 0);
        checkGrouped(QuoteExecutionReport::new, RoundTrip::wire42, true, true, true, 1, 0);
        checkGrouped(Reject::new, RoundTrip::wire43, true, true, true, 1, 0);
        check(RetransmitMeMessageRequest::new);
        check(RetransmitMeMessageResponse::new);
        check(RetransmitRequest::new);
        check(RetransmitResponse::new);
        check(ReverseTesTradeRequest::new);
        check(RfqRequest::new);
        check(RfqResponse::new);
        check(RiskNotificationBroadcast::new);
        check(ServiceAvailabilityBroadcast::new);
        check(ServiceAvailabilityMarketBroadcast::new);
        checkGrouped(SrqsCreateDealNotification::new, RoundTrip::wire44, true, true, true, 1, 0);
        checkGrouped(SrqsDealNotification::new, RoundTrip::wire45, true, true, true, 1, 0);
        checkGrouped(SrqsDealResponse::new, RoundTrip::wire46, true, true, true, 1, 0);
        check(SrqsEnterQuoteRequest::new);
        checkGrouped(SrqsHitQuoteRequest::new, RoundTrip::wire47, true, true, true, 1, 0);
        check(SrqsInquireSmartRespondentRequest::new);
        checkGrouped(SrqsInquireSmartRespondentResponse::new, RoundTrip::wire48, true, true, true, 1, 0);
        check(SrqsNegotiationNotification::new);
        checkGrouped(SrqsNegotiationRequesterNotification::new, RoundTrip::wire49, true, true, true, 1, 0);
        check(SrqsNegotiationStatusNotification::new);
        checkGrouped(SrqsOpenNegotiationNotification::new, RoundTrip::wire50, true, true, true, 1, 0);
        checkGrouped(SrqsOpenNegotiationRequest::new, RoundTrip::wire51, true, true, true, 1, 0);
        checkGrouped(SrqsOpenNegotiationRequesterNotification::new, RoundTrip::wire52, true, true, true, 1, 0);
        check(SrqsQuoteNotification::new);
        check(SrqsQuoteResponse::new);
        check(SrqsQuotingStatusRequest::new);
        check(SrqsStatusBroadcast::new);
        check(SrqsUpdateDealStatusRequest::new);
        checkGrouped(SrqsUpdateNegotiationRequest::new, RoundTrip::wire53, true, true, true, 1, 0);
        check(SubscribeRequest::new);
        check(SubscribeResponse::new);
        checkGrouped(TesApproveBroadcast::new, RoundTrip::wire54, true, true, true, 1, 0);
        checkGrouped(TesBroadcast::new, RoundTrip::wire55, true, true, true, 1, 0);
        check(TesCompressionRunStatusBroadcast::new);
        check(TesCompressionRunStatusRequest::new);
        check(TesCompressionRunStatusResponse::new);
        check(TesDeleteBroadcast::new);
        check(TesExecutionBroadcast::new);
        check(TesResponse::new);
        checkGrouped(TesReversalBroadcast::new, RoundTrip::wire56, true, true, true, 1, 0);
        checkGrouped(TesTradeBroadcast::new, RoundTrip::wire57, true, true, true, 1, 0);
        check(TesTradingSessionStatusBroadcast::new);
        checkGrouped(TesUploadBroadcast::new, RoundTrip::wire58, true, true, true, 1, 0);
        check(ThrottleUpdateNotification::new);
        check(TmTradingSessionStatusBroadcast::new);
        check(TradeBroadcast::new);
        check(TradingSessionStatusBroadcast::new);
        check(UnsubscribeRequest::new);
        check(UnsubscribeResponse::new);
        checkGrouped(UploadTesTradeRequest::new, RoundTrip::wire59, true, true, true, 1, 0);
        check(UserLoginRequest::new);
        check(UserLoginResponse::new);
        check(UserLogoutRequest::new);
        check(UserLogoutResponse::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static int blockDelta;

    private static int delta(int root) {
        return blockDelta < 0 ? -Math.min(-blockDelta, root - 1) : blockDelta;
    }

    private interface Wire {
        byte[] build(Random random, int entries, long count);
    }

    private static void checkGrouped(Supplier<Message> create, Wire wire, boolean variable, boolean bounded, boolean counted, int builds, int leaves) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        Random random = new Random(name.hashCode());

        for (int delta : new int[] { 0, 3, -1 }) {
            blockDelta = delta;
            for (int entries : new int[] { 0, 1, 3 }) {
                String label = name + " with " + entries + " entries, block " + blockDelta;
                byte[] bytes = wire.build(random, entries, entries);
                int offset = 1 + random.nextInt(7);
                byte[] shifted = new byte[offset + bytes.length + leaves + 3];
                random.nextBytes(shifted);
                System.arraycopy(bytes, 0, shifted, offset, bytes.length);

                expect(label + " decodes", message.parseFrom(shifted, offset, offset + bytes.length + leaves) && message.isDecoded());
                expect(label + " has its length", message.byteLength() == bytes.length);
                expect(label + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
                expect(label + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
                Arrays.fill(shifted, (byte) 0x5A);
                expect(label + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

                Message again = create.get();
                again.parseFrom(Arrays.copyOf(bytes, bytes.length + leaves), 0);
                expect(label + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

                expect(label + " refuses a short buffer", !bounded || bytes.length == 0 || !message.parseFrom(bytes, 0, bytes.length - 1));
                message.clear();
                expect(label + " clears", !message.isDecoded() && message.raw().isEmpty());
            }
        }
        blockDelta = 0;

        for (int build = 0; build < builds; build++) {
            if (counted && variable && bounded) {
                expect(name + " refuses a count beyond its entries", !message.parseFrom(wire.build(random, 1, 2), 0));
            }
            if (counted && bounded) {
                expect(name + " refuses an absurd count", !message.parseFrom(wire.build(random, 1, Long.MAX_VALUE), 0));
            }
        }
    }

    private static void random(ByteArrayOutputStream wire, Random random, int length) {
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        wire.writeBytes(bytes);
    }

    private static void count(ByteArrayOutputStream wire, long count, int width, boolean littleEndian) {
        for (int index = 0; index < width; index++) {
            wire.write((int) (count >>> (8 * (littleEndian ? index : width - 1 - index))));
        }
    }

    private static byte[] wire0(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 20);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 5);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 2);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 5);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 32);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 5);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 2);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 5);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 32);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, count, 2, true);
        count(wire, count, 2, true);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 32);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 5);
            random(wire, random, 20);
            random(wire, random, 2);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 30);
        random(wire, random, 3);
        random(wire, random, 30);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 32);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32);
            random(wire, random, 7);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire18(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire22(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 3);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire23(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire24(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire25(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire26(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 20);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire27(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 32);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 20);
        count(wire, count, 1, false);
        random(wire, random, 5);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire28(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire29(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire30(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire31(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 20);
        random(wire, random, 1);
        random(wire, random, 32);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 20);
        count(wire, count, 1, false);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire32(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire33(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire34(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 256);
        random(wire, random, 6);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire35(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 20);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire36(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 32);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 20);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire37(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 7);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire38(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 3);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire39(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 5);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire40(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire41(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire42(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        count(wire, count, 1, false);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire43(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire44(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 132);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 32);
        random(wire, random, 2);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 6);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire45(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 132);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 32);
        random(wire, random, 2);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 6);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire46(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire47(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 132);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 32);
        random(wire, random, 2);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire48(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire49(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 132);
        random(wire, random, 132);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire50(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 132);
        random(wire, random, 132);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire51(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 132);
        random(wire, random, 20);
        random(wire, random, 132);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire52(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 132);
        random(wire, random, 132);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire53(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 132);
        random(wire, random, 132);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 7);
        }
        return wire.toByteArray();
    }

    private static byte[] wire54(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 5);
        random(wire, random, 2);
        random(wire, random, 32);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 30);
        random(wire, random, 3);
        random(wire, random, 30);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 32);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32);
            random(wire, random, 7);
            random(wire, random, 1);
        }
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire55(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 12);
        random(wire, random, 30);
        random(wire, random, 3);
        random(wire, random, 30);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 32);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32);
            random(wire, random, 7);
            random(wire, random, 1);
        }
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire56(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 20);
        random(wire, random, 132);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire57(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 3);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 32);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 5);
        random(wire, random, 4);
        random(wire, random, 9);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 4);
        random(wire, random, 52);
        random(wire, random, 5);
        random(wire, random, 20);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire58(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 5);
        random(wire, random, 6);
        random(wire, random, 12);
        random(wire, random, 30);
        random(wire, random, 3);
        random(wire, random, 30);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 32);
            random(wire, random, 5);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 1);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 32);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32);
            random(wire, random, 7);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire59(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 20);
        random(wire, random, 12);
        random(wire, random, 30);
        random(wire, random, 3);
        random(wire, random, 30);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 5);
            random(wire, random, 6);
            random(wire, random, 1);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
            random(wire, random, 32);
            random(wire, random, 5);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 7);
            random(wire, random, 9);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 20);
            random(wire, random, 1);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 1);
            random(wire, random, 32);
            random(wire, random, 7);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32);
            random(wire, random, 7);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
