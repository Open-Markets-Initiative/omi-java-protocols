package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.CancelOrder;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.MassCancelOrder;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.ModifyOrder;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.NewComplexInstrumentOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.NewOrder;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.NewOrderOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.PurgeOrders;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteUpdate;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteUpdateOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.ResetRisk;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.ClientHeartbeat;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.LoginRequestMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.LogoutRequest;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;

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
        } else if (firmMessageType == 1008L) {
            message = new NewOrder();
        } else if (firmMessageType == 1009L) {
            message = new NewOrderOption();
        } else if (firmMessageType == 1002L) {
            message = new ModifyOrder();
        } else if (firmMessageType == 1003L) {
            message = new CancelOrder();
        } else if (firmMessageType == 1004L) {
            message = new MassCancelOrder();
        } else if (firmMessageType == 1005L) {
            message = new PurgeOrders();
        } else if (firmMessageType == 1006L) {
            message = new QuoteUpdate();
        } else if (firmMessageType == 1010L) {
            message = new QuoteUpdateOption();
        } else if (firmMessageType == 1007L) {
            message = new ResetRisk();
        } else if (firmMessageType == 1011L) {
            message = new NewComplexInstrumentOption();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
