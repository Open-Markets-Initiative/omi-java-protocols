package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.dispatch;

import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.AccountQueryRequestMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.CancelOrderRequestMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.EnterOrderMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.ReplaceOrderRequestMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;

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
            message = new ReplaceOrderRequestMessage();
        } else if (unsequencedMessageType == 'X') {
            message = new CancelOrderRequestMessage();
        } else if (unsequencedMessageType == 'Q') {
            message = new AccountQueryRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
