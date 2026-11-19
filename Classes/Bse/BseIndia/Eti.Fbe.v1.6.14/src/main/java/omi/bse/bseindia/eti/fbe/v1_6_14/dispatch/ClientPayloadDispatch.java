package omi.bse.bseindia.eti.fbe.v1_6_14.dispatch;

import java.util.Optional;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DebtInquiryRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GatewayRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.Heartbeat;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.InquireSessionListRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogonRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogoutRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MassQuoteRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderSingleShortRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegOrderRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderSingleShortRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitMeMessageRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionPasswordChangeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionRegistrationRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SubscribeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UnsubscribeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLoginRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLogoutRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserPasswordChangeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;

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
        if (templateId == 10390L) {
            message = new DebtInquiryRequest();
        } else if (templateId == 10120L) {
            message = new DeleteAllOrderRequest();
        } else if (templateId == 10408L) {
            message = new DeleteAllQuoteRequest();
        } else if (templateId == 10123L) {
            message = new DeleteOrderComplexRequest();
        } else if (templateId == 10109L) {
            message = new DeleteOrderSingleRequest();
        } else if (templateId == 10020L) {
            message = new GatewayRequest();
        } else if (templateId == 10011L) {
            message = new Heartbeat();
        } else if (templateId == 10035L) {
            message = new InquireSessionListRequest();
        } else if (templateId == 10000L) {
            message = new LogonRequest();
        } else if (templateId == 10002L) {
            message = new LogoutRequest();
        } else if (templateId == 10405L) {
            message = new MassQuoteRequest();
        } else if (templateId == 10114L) {
            message = new ModifyOrderComplexRequest();
        } else if (templateId == 10106L) {
            message = new ModifyOrderSingleRequest();
        } else if (templateId == 10126L) {
            message = new ModifyOrderSingleShortRequest();
        } else if (templateId == 10991L) {
            message = new MultiLegOrderRequest();
        } else if (templateId == 10113L) {
            message = new NewOrderComplexRequest();
        } else if (templateId == 10100L) {
            message = new NewOrderSingleRequest();
        } else if (templateId == 10125L) {
            message = new NewOrderSingleShortRequest();
        } else if (templateId == 10026L) {
            message = new RetransmitMeMessageRequest();
        } else if (templateId == 10008L) {
            message = new RetransmitRequest();
        } else if (templateId == 10997L) {
            message = new SessionPasswordChangeRequest();
        } else if (templateId == 10053L) {
            message = new SessionRegistrationRequest();
        } else if (templateId == 10025L) {
            message = new SubscribeRequest();
        } else if (templateId == 10006L) {
            message = new UnsubscribeRequest();
        } else if (templateId == 10018L) {
            message = new UserLoginRequest();
        } else if (templateId == 10029L) {
            message = new UserLogoutRequest();
        } else if (templateId == 10996L) {
            message = new UserPasswordChangeRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
