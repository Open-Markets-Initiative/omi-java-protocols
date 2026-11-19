package omi.jpx.osederivatives.geniuminet.ouch.v5_0.dispatch;

import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.CancelByOrderId;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.CancelOrder;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.EnterMmOrder;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.EnterOrder;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.MassCancel;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.ReplaceOrder;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Message;

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
            message = new EnterOrder();
        } else if (unsequencedMessageType == 'P') {
            message = new EnterMmOrder();
        } else if (unsequencedMessageType == 'U') {
            message = new ReplaceOrder();
        } else if (unsequencedMessageType == 'X') {
            message = new CancelOrder();
        } else if (unsequencedMessageType == 'Y') {
            message = new CancelByOrderId();
        } else if (unsequencedMessageType == 'M') {
            message = new MassCancel();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
