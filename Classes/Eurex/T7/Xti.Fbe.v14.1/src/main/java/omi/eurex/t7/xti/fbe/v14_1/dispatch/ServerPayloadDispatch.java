package omi.eurex.t7.xti.fbe.v14_1.dispatch;

import java.util.Optional;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.BroadcastErrorNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.CrossRequestResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllOrderBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllOrderNrResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllOrderQuoteEventBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllOrderResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllQuoteBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteAllQuoteResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteOrderBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteOrderNrResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.DeleteOrderResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ExtendedDeletionReport;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ForcedLogoutNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ForcedUserLogoutNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.HeartbeatNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.InquireEnrichmentRuleIdListResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.InquireSessionListResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.InquireUserResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.IssuerNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.IssuerSecurityStateChangeResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.LegalNotificationBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.LogonResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.LogoutResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.MassQuoteResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ModifyOrderNrResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ModifyOrderResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.NewOrderNrResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.NewOrderResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.NewsBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.OrderExecNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.OrderExecReportBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.OrderExecResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.OtcResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.OtcUploadBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.PartyActionReport;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.PartyEntitlementsUpdateReport;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.PingResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.PreTradeRiskLimitResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.QuoteActivationNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.QuoteActivationResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.QuoteExecutionReport;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.Reject;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RetransmitMeMessageResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RetransmitResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqRejectNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqReplyNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqReplyResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.RfqSpecialistIssuerBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ServiceAvailabilityBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ServiceAvailabilityMarketBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.SpecialistDeleteAllOrderBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.SpecialistInstrumentEventNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.SpecialistOrderBookNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.SpecialistSecurityStateChangeResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.StatusBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.SubscribeResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesApproveBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesDeleteBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesExecutionBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesReversalBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesTradeBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TesTradingSessionStatusBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.ThrottleUpdateNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TmTradingSessionStatusBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TradeBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TradingSessionStatusBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.TrailingStopUpdateNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.UnsubscribeResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.UserLoginResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.UserLogoutResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightCreateDealNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightDealResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightDealStatusNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightDeleteAllQuoteNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightNegotiationNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightNegotiationRequesterNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightNegotiationStatusNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightOpenNegotiationNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightOpenNegotiationRequesterNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightQuoteNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightQuoteRequesterNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightQuoteResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightQuoteSnapshotNotification;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightResponse;
import omi.eurex.t7.xti.fbe.v14_1.messages.application.XetraEnLightStatusBroadcast;
import omi.eurex.t7.xti.fbe.v14_1.types.Message;

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
        if (templateId == 10032L) {
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
        } else if (templateId == 10128L) {
            message = new ExtendedDeletionReport();
        } else if (templateId == 10012L) {
            message = new ForcedLogoutNotification();
        } else if (templateId == 10043L) {
            message = new ForcedUserLogoutNotification();
        } else if (templateId == 10023L) {
            message = new HeartbeatNotification();
        } else if (templateId == 10041L) {
            message = new InquireEnrichmentRuleIdListResponse();
        } else if (templateId == 10036L) {
            message = new InquireSessionListResponse();
        } else if (templateId == 10039L) {
            message = new InquireUserResponse();
        } else if (templateId == 10316L) {
            message = new IssuerNotification();
        } else if (templateId == 10315L) {
            message = new IssuerSecurityStateChangeResponse();
        } else if (templateId == 10037L) {
            message = new LegalNotificationBroadcast();
        } else if (templateId == 10001L) {
            message = new LogonResponse();
        } else if (templateId == 10003L) {
            message = new LogoutResponse();
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
        } else if (templateId == 10617L) {
            message = new OtcResponse();
        } else if (templateId == 10618L) {
            message = new OtcUploadBroadcast();
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
        } else if (templateId == 10321L) {
            message = new PingResponse();
        } else if (templateId == 10313L) {
            message = new PreTradeRiskLimitResponse();
        } else if (templateId == 10411L) {
            message = new QuoteActivationNotification();
        } else if (templateId == 10404L) {
            message = new QuoteActivationResponse();
        } else if (templateId == 10407L) {
            message = new QuoteExecutionReport();
        } else if (templateId == 10415L) {
            message = new RfqBroadcast();
        } else if (templateId == 10420L) {
            message = new RfqRejectNotification();
        } else if (templateId == 10424L) {
            message = new RfqReplyNotification();
        } else if (templateId == 10423L) {
            message = new RfqReplyResponse();
        } else if (templateId == 10402L) {
            message = new RfqResponse();
        } else if (templateId == 10419L) {
            message = new RfqSpecialistIssuerBroadcast();
        } else if (templateId == 10010L) {
            message = new Reject();
        } else if (templateId == 10027L) {
            message = new RetransmitMeMessageResponse();
        } else if (templateId == 10009L) {
            message = new RetransmitResponse();
        } else if (templateId == 10030L) {
            message = new ServiceAvailabilityBroadcast();
        } else if (templateId == 10044L) {
            message = new ServiceAvailabilityMarketBroadcast();
        } else if (templateId == 10137L) {
            message = new SpecialistDeleteAllOrderBroadcast();
        } else if (templateId == 10319L) {
            message = new SpecialistInstrumentEventNotification();
        } else if (templateId == 10136L) {
            message = new SpecialistOrderBookNotification();
        } else if (templateId == 10318L) {
            message = new SpecialistSecurityStateChangeResponse();
        } else if (templateId == 10045L) {
            message = new StatusBroadcast();
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
        } else if (templateId == 10632L) {
            message = new TesReversalBroadcast();
        } else if (templateId == 10614L) {
            message = new TesTradeBroadcast();
        } else if (templateId == 10615L) {
            message = new TesTradingSessionStatusBroadcast();
        } else if (templateId == 10501L) {
            message = new TmTradingSessionStatusBroadcast();
        } else if (templateId == 10028L) {
            message = new ThrottleUpdateNotification();
        } else if (templateId == 10500L) {
            message = new TradeBroadcast();
        } else if (templateId == 10307L) {
            message = new TradingSessionStatusBroadcast();
        } else if (templateId == 10127L) {
            message = new TrailingStopUpdateNotification();
        } else if (templateId == 10007L) {
            message = new UnsubscribeResponse();
        } else if (templateId == 10019L) {
            message = new UserLoginResponse();
        } else if (templateId == 10024L) {
            message = new UserLogoutResponse();
        } else if (templateId == 10808L) {
            message = new XetraEnLightCreateDealNotification();
        } else if (templateId == 10805L) {
            message = new XetraEnLightDealResponse();
        } else if (templateId == 10825L) {
            message = new XetraEnLightDealStatusNotification();
        } else if (templateId == 10824L) {
            message = new XetraEnLightDeleteAllQuoteNotification();
        } else if (templateId == 10813L) {
            message = new XetraEnLightNegotiationNotification();
        } else if (templateId == 10812L) {
            message = new XetraEnLightNegotiationRequesterNotification();
        } else if (templateId == 10815L) {
            message = new XetraEnLightNegotiationStatusNotification();
        } else if (templateId == 10811L) {
            message = new XetraEnLightOpenNegotiationNotification();
        } else if (templateId == 10810L) {
            message = new XetraEnLightOpenNegotiationRequesterNotification();
        } else if (templateId == 10807L) {
            message = new XetraEnLightQuoteNotification();
        } else if (templateId == 10816L) {
            message = new XetraEnLightQuoteRequesterNotification();
        } else if (templateId == 10803L) {
            message = new XetraEnLightQuoteResponse();
        } else if (templateId == 10823L) {
            message = new XetraEnLightQuoteSnapshotNotification();
        } else if (templateId == 10822L) {
            message = new XetraEnLightResponse();
        } else if (templateId == 10814L) {
            message = new XetraEnLightStatusBroadcast();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
