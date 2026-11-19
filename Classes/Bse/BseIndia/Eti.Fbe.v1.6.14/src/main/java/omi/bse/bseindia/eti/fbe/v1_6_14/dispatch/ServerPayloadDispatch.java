package omi.bse.bseindia.eti.fbe.v1_6_14.dispatch;

import java.util.Optional;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.BroadcastErrorNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DebtInquiryResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderQuoteEventBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ForcedLogoutNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GatewayResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GwOrderAcknowledgement;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.HeartbeatNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.InquireSessionListResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogonResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogoutResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MassQuoteResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegExecResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegOrderReject;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewsBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.QuoteExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.QuoteExecutionReport;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.Reject;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitMeMessageResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskCollateralAlertAdminBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskCollateralAlertBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskNotificationBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ServiceAvailabilityBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionPasswordChangeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionRegistrationResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SubscribeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ThrottleUpdateNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TmTradingSessionStatusBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradeBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradeEnhancementBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradingSessionStatusBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UnsubscribeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLoginResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLogoutResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserPasswordChangeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;

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
        } else if (templateId == 10391L) {
            message = new DebtInquiryResponse();
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
        } else if (templateId == 10022L) {
            message = new GatewayResponse();
        } else if (templateId == 10990L) {
            message = new GwOrderAcknowledgement();
        } else if (templateId == 10023L) {
            message = new HeartbeatNotification();
        } else if (templateId == 10036L) {
            message = new InquireSessionListResponse();
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
        } else if (templateId == 10994L) {
            message = new MultiLegExecReportBroadcast();
        } else if (templateId == 10993L) {
            message = new MultiLegExecResponse();
        } else if (templateId == 10992L) {
            message = new MultiLegOrderReject();
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
        } else if (templateId == 10412L) {
            message = new QuoteExecReportBroadcast();
        } else if (templateId == 10407L) {
            message = new QuoteExecutionReport();
        } else if (templateId == 10010L) {
            message = new Reject();
        } else if (templateId == 10027L) {
            message = new RetransmitMeMessageResponse();
        } else if (templateId == 10009L) {
            message = new RetransmitResponse();
        } else if (templateId == 10048L) {
            message = new RiskCollateralAlertAdminBroadcast();
        } else if (templateId == 10049L) {
            message = new RiskCollateralAlertBroadcast();
        } else if (templateId == 10033L) {
            message = new RiskNotificationBroadcast();
        } else if (templateId == 10030L) {
            message = new ServiceAvailabilityBroadcast();
        } else if (templateId == 10995L) {
            message = new SessionPasswordChangeResponse();
        } else if (templateId == 10054L) {
            message = new SessionRegistrationResponse();
        } else if (templateId == 10005L) {
            message = new SubscribeResponse();
        } else if (templateId == 10501L) {
            message = new TmTradingSessionStatusBroadcast();
        } else if (templateId == 10028L) {
            message = new ThrottleUpdateNotification();
        } else if (templateId == 10500L) {
            message = new TradeBroadcast();
        } else if (templateId == 10989L) {
            message = new TradeEnhancementBroadcast();
        } else if (templateId == 10307L) {
            message = new TradingSessionStatusBroadcast();
        } else if (templateId == 10007L) {
            message = new UnsubscribeResponse();
        } else if (templateId == 10019L) {
            message = new UserLoginResponse();
        } else if (templateId == 10024L) {
            message = new UserLogoutResponse();
        } else if (templateId == 10043L) {
            message = new UserPasswordChangeResponse();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
