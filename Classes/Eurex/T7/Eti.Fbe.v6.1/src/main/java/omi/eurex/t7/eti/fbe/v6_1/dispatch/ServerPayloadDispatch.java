package omi.eurex.t7.eti.fbe.v6_1.dispatch;

import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.AddComplexInstrumentResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.AddFlexibleInstrumentResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.BroadcastErrorNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.CrossRequestResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllOrderBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllOrderNrResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllOrderQuoteEventBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllOrderResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllQuoteBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteAllQuoteResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteOrderBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteOrderNrResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.DeleteOrderResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ForcedLogoutNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ForcedUserLogoutNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.GatewayResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.HeartbeatNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.InquireEnrichmentRuleIdListResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.InquireMmParameterResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.InquireSessionListResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.InquireUserResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.LegalNotificationBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.LogonResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.LogoutResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.MassQuoteResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.MmParameterDefinitionResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ModifyOrderNrResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ModifyOrderResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.NewOrderNrResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.NewOrderResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.NewsBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.OrderExecNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.OrderExecReportBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.OrderExecResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.PartyActionReport;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.PartyEntitlementsUpdateReport;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.QuoteActivationNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.QuoteActivationResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.QuoteExecutionReport;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.Reject;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.RetransmitMeMessageResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.RetransmitResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.RfqResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.RiskNotificationBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ServiceAvailabilityBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ServiceAvailabilityMarketBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsCreateDealNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsDealNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsDealResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsNegotiationNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsNegotiationRequesterNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsNegotiationStatusNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsOpenNegotiationNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsOpenNegotiationRequesterNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsQuoteNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsQuoteResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SrqsStatusBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.SubscribeResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesApproveBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesDeleteBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesExecutionBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesTradeBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesTradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TesUploadBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.ThrottleUpdateNotification;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TmTradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TradeBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.TradingSessionStatusBroadcast;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.UnsubscribeResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.UserLoginResponse;
import omi.eurex.t7.eti.fbe.v6_1.messages.application.UserLogoutResponse;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;

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
        if (templateId == 10302L) {
            message = new AddComplexInstrumentResponse();
        } else if (templateId == 10310L) {
            message = new AddFlexibleInstrumentResponse();
        } else if (templateId == 10032L) {
            message = new BroadcastErrorNotification();
        } else if (templateId == 10119L) {
            message = new CrossRequestResponse();
        } else if (templateId == 10122L) {
            message = new DeleteAllOrderBroadcast();
        } else if (templateId == 10124L) {
            message = new DeleteAllOrderNrResponse();
        } else if (templateId == 10308L) {
            message = new DeleteAllOrderQuoteEventBroadcast();
        } else if (templateId == 10121L) {
            message = new DeleteAllOrderResponse();
        } else if (templateId == 10410L) {
            message = new DeleteAllQuoteBroadcast();
        } else if (templateId == 10409L) {
            message = new DeleteAllQuoteResponse();
        } else if (templateId == 10112L) {
            message = new DeleteOrderBroadcast();
        } else if (templateId == 10111L) {
            message = new DeleteOrderNrResponse();
        } else if (templateId == 10110L) {
            message = new DeleteOrderResponse();
        } else if (templateId == 10012L) {
            message = new ForcedLogoutNotification();
        } else if (templateId == 10043L) {
            message = new ForcedUserLogoutNotification();
        } else if (templateId == 10021L) {
            message = new GatewayResponse();
        } else if (templateId == 10023L) {
            message = new HeartbeatNotification();
        } else if (templateId == 10041L) {
            message = new InquireEnrichmentRuleIdListResponse();
        } else if (templateId == 10306L) {
            message = new InquireMmParameterResponse();
        } else if (templateId == 10036L) {
            message = new InquireSessionListResponse();
        } else if (templateId == 10039L) {
            message = new InquireUserResponse();
        } else if (templateId == 10037L) {
            message = new LegalNotificationBroadcast();
        } else if (templateId == 10001L) {
            message = new LogonResponse();
        } else if (templateId == 10003L) {
            message = new LogoutResponse();
        } else if (templateId == 10304L) {
            message = new MmParameterDefinitionResponse();
        } else if (templateId == 10406L) {
            message = new MassQuoteResponse();
        } else if (templateId == 10108L) {
            message = new ModifyOrderNrResponse();
        } else if (templateId == 10107L) {
            message = new ModifyOrderResponse();
        } else if (templateId == 10102L) {
            message = new NewOrderNrResponse();
        } else if (templateId == 10101L) {
            message = new NewOrderResponse();
        } else if (templateId == 10031L) {
            message = new NewsBroadcast();
        } else if (templateId == 10104L) {
            message = new OrderExecNotification();
        } else if (templateId == 10117L) {
            message = new OrderExecReportBroadcast();
        } else if (templateId == 10103L) {
            message = new OrderExecResponse();
        } else if (templateId == 10042L) {
            message = new PartyActionReport();
        } else if (templateId == 10034L) {
            message = new PartyEntitlementsUpdateReport();
        } else if (templateId == 10411L) {
            message = new QuoteActivationNotification();
        } else if (templateId == 10404L) {
            message = new QuoteActivationResponse();
        } else if (templateId == 10407L) {
            message = new QuoteExecutionReport();
        } else if (templateId == 10402L) {
            message = new RfqResponse();
        } else if (templateId == 10010L) {
            message = new Reject();
        } else if (templateId == 10027L) {
            message = new RetransmitMeMessageResponse();
        } else if (templateId == 10009L) {
            message = new RetransmitResponse();
        } else if (templateId == 10033L) {
            message = new RiskNotificationBroadcast();
        } else if (templateId == 10708L) {
            message = new SrqsCreateDealNotification();
        } else if (templateId == 10709L) {
            message = new SrqsDealNotification();
        } else if (templateId == 10705L) {
            message = new SrqsDealResponse();
        } else if (templateId == 10713L) {
            message = new SrqsNegotiationNotification();
        } else if (templateId == 10712L) {
            message = new SrqsNegotiationRequesterNotification();
        } else if (templateId == 10715L) {
            message = new SrqsNegotiationStatusNotification();
        } else if (templateId == 10711L) {
            message = new SrqsOpenNegotiationNotification();
        } else if (templateId == 10710L) {
            message = new SrqsOpenNegotiationRequesterNotification();
        } else if (templateId == 10707L) {
            message = new SrqsQuoteNotification();
        } else if (templateId == 10703L) {
            message = new SrqsQuoteResponse();
        } else if (templateId == 10714L) {
            message = new SrqsStatusBroadcast();
        } else if (templateId == 10030L) {
            message = new ServiceAvailabilityBroadcast();
        } else if (templateId == 10044L) {
            message = new ServiceAvailabilityMarketBroadcast();
        } else if (templateId == 10005L) {
            message = new SubscribeResponse();
        } else if (templateId == 10607L) {
            message = new TesApproveBroadcast();
        } else if (templateId == 10604L) {
            message = new TesBroadcast();
        } else if (templateId == 10606L) {
            message = new TesDeleteBroadcast();
        } else if (templateId == 10610L) {
            message = new TesExecutionBroadcast();
        } else if (templateId == 10611L) {
            message = new TesResponse();
        } else if (templateId == 10614L) {
            message = new TesTradeBroadcast();
        } else if (templateId == 10615L) {
            message = new TesTradingSessionStatusBroadcast();
        } else if (templateId == 10613L) {
            message = new TesUploadBroadcast();
        } else if (templateId == 10501L) {
            message = new TmTradingSessionStatusBroadcast();
        } else if (templateId == 10028L) {
            message = new ThrottleUpdateNotification();
        } else if (templateId == 10500L) {
            message = new TradeBroadcast();
        } else if (templateId == 10307L) {
            message = new TradingSessionStatusBroadcast();
        } else if (templateId == 10007L) {
            message = new UnsubscribeResponse();
        } else if (templateId == 10019L) {
            message = new UserLoginResponse();
        } else if (templateId == 10024L) {
            message = new UserLogoutResponse();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
