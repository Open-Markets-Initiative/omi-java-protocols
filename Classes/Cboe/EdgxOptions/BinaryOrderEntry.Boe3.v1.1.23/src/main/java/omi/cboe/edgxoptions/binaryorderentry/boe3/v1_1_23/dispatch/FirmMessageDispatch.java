package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.dispatch;

import java.util.Optional;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.CancelOrderMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelOrderMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.ModifyOrderMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderShortMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexOrderV2Message;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderCrossMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderCrossMultilegMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.NewOrderShortMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.PurgeOrdersV2Message;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateShortMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application.ResetRiskMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.session.ClientHeartbeat;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.session.LoginRequestMessage;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.session.LogoutRequest;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.types.Message;

/**
 * Selects the message a Firm Message branch holds by its Firm Message Type.
 */
public final class FirmMessageDispatch {

    private FirmMessageDispatch() {
    }

    /**
     * Decodes the message a Firm Message Type selects.
     *
     * @param firmMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long firmMessageType, byte[] data, int offset, int end) {
        Message message;
        if (firmMessageType == 1L) {
            message = new LoginRequestMessage();
        } else if (firmMessageType == 2L) {
            message = new LogoutRequest();
        } else if (firmMessageType == 3L) {
            message = new ClientHeartbeat();
        } else if (firmMessageType == 2001L) {
            message = new NewOrderMessage();
        } else if (firmMessageType == 2002L) {
            message = new NewOrderShortMessage();
        } else if (firmMessageType == 2003L) {
            message = new NewOrderCrossMessage();
        } else if (firmMessageType == 2005L) {
            message = new NewComplexInstrumentMessage();
        } else if (firmMessageType == 2006L) {
            message = new NewComplexOrderMessage();
        } else if (firmMessageType == 2023L) {
            message = new NewComplexOrderV2Message();
        } else if (firmMessageType == 2007L) {
            message = new NewComplexOrderShortMessage();
        } else if (firmMessageType == 2008L) {
            message = new NewOrderCrossMultilegMessage();
        } else if (firmMessageType == 2010L) {
            message = new CancelOrderMessage();
        } else if (firmMessageType == 2015L) {
            message = new MassCancelOrderMessage();
        } else if (firmMessageType == 2011L) {
            message = new ModifyOrderMessage();
        } else if (firmMessageType == 2012L) {
            message = new QuoteUpdateMessage();
        } else if (firmMessageType == 2013L) {
            message = new QuoteUpdateShortMessage();
        } else if (firmMessageType == 2021L) {
            message = new PurgeOrdersV2Message();
        } else if (firmMessageType == 2014L) {
            message = new ResetRiskMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
