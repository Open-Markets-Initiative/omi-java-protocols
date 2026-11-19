package omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.CancelOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.MassCancelOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.ModifyOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.NewOrderMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.PurgeOrdersMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteUpdateMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.ResetRiskMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.ClientHeartbeat;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.LoginRequestMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.LogoutRequest;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.types.Message;

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
        } else if (firmMessageType == 1001L) {
            message = new NewOrderMessage();
        } else if (firmMessageType == 1002L) {
            message = new ModifyOrderMessage();
        } else if (firmMessageType == 1003L) {
            message = new CancelOrderMessage();
        } else if (firmMessageType == 1004L) {
            message = new MassCancelOrderMessage();
        } else if (firmMessageType == 1005L) {
            message = new PurgeOrdersMessage();
        } else if (firmMessageType == 1006L) {
            message = new QuoteUpdateMessage();
        } else if (firmMessageType == 1007L) {
            message = new ResetRiskMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
