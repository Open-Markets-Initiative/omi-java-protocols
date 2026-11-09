package omi.cme.globex.ilink3.sbe.v8_5.dispatch;

import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Establish;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.ExecutionAck;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.MassQuote;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Negotiate;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NewOrderCross;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.NewOrderSingle;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelReplaceRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderCancelRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassActionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderMassStatusRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.OrderStatusRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsDefinitionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.PartyDetailsListRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.QuoteCancel;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RequestForQuote;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.RetransmitRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.SecurityDefinitionRequest;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Sequence;
import omi.cme.globex.ilink3.sbe.v8_5.messages.application.Terminate;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;

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
        if (templateId == 500L) {
            message = new Negotiate();
        } else if (templateId == 503L) {
            message = new Establish();
        } else if (templateId == 506L) {
            message = new Sequence();
        } else if (templateId == 507L) {
            message = new Terminate();
        } else if (templateId == 508L) {
            message = new RetransmitRequest();
        } else if (templateId == 514L) {
            message = new NewOrderSingle();
        } else if (templateId == 515L) {
            message = new OrderCancelReplaceRequest();
        } else if (templateId == 516L) {
            message = new OrderCancelRequest();
        } else if (templateId == 517L) {
            message = new MassQuote();
        } else if (templateId == 518L) {
            message = new PartyDetailsDefinitionRequest();
        } else if (templateId == 528L) {
            message = new QuoteCancel();
        } else if (templateId == 529L) {
            message = new OrderMassActionRequest();
        } else if (templateId == 530L) {
            message = new OrderMassStatusRequest();
        } else if (templateId == 533L) {
            message = new OrderStatusRequest();
        } else if (templateId == 537L) {
            message = new PartyDetailsListRequest();
        } else if (templateId == 539L) {
            message = new ExecutionAck();
        } else if (templateId == 543L) {
            message = new RequestForQuote();
        } else if (templateId == 544L) {
            message = new NewOrderCross();
        } else if (templateId == 560L) {
            message = new SecurityDefinitionRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
