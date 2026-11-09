package omi.nasdaq.nsmequities.orders.ouch.v5_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.DisableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnterOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.MassCancelRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ModifyOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ReplaceOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Unsequenced Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Unsequenced Message Type selects.
     *
     * @param unsequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char unsequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (unsequencedMessageType == 'O') {
            message = new EnterOrderMessage();
        } else if (unsequencedMessageType == 'U') {
            message = new ReplaceOrderMessage();
        } else if (unsequencedMessageType == 'X') {
            message = new CancelOrderMessage();
        } else if (unsequencedMessageType == 'M') {
            message = new ModifyOrderMessage();
        } else if (unsequencedMessageType == 'Q') {
            message = new AccountQueryMessage();
        } else if (unsequencedMessageType == 'C') {
            message = new MassCancelRequestMessage();
        } else if (unsequencedMessageType == 'D') {
            message = new DisableOrderEntryRequestMessage();
        } else if (unsequencedMessageType == 'E') {
            message = new EnableOrderEntryRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
