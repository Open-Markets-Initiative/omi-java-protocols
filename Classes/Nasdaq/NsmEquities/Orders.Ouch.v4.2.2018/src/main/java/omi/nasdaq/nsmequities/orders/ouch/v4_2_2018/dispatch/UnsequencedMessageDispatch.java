package omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.CancelOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.EnterOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.ModifyOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.ReplaceOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.messages.application.TradeNowMessage;
import omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.types.Message;

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
        } else if (unsequencedMessageType == 'N') {
            message = new TradeNowMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
