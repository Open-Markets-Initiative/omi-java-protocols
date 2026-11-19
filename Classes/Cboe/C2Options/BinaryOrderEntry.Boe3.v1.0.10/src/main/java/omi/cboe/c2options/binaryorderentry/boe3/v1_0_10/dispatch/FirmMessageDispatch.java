package omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.dispatch;

import java.util.Optional;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.CancelOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.MassCancelOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.ModifyOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.NewComplexInstrumentMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.NewComplexOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.NewComplexOrderShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.NewOrderMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.NewOrderShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.PurgeOrdersMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.QuoteUpdateMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.QuoteUpdateShortMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.application.ResetRiskMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.session.ClientHeartbeat;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.session.LoginRequestMessage;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.messages.session.LogoutRequest;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.types.Message;

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
        } else if (firmMessageType == 2005L) {
            message = new NewComplexInstrumentMessage();
        } else if (firmMessageType == 2006L) {
            message = new NewComplexOrderMessage();
        } else if (firmMessageType == 2007L) {
            message = new NewComplexOrderShortMessage();
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
        } else if (firmMessageType == 2016L) {
            message = new PurgeOrdersMessage();
        } else if (firmMessageType == 2014L) {
            message = new ResetRiskMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
