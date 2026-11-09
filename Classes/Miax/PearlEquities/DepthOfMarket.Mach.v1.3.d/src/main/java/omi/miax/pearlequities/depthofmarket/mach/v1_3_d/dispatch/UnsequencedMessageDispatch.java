package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.EndOfRefreshNotificationMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.RefreshRequestMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.RefreshResponseMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;

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
        if (unsequencedMessageType == 'R') {
            message = new RefreshRequestMessage();
        } else if (unsequencedMessageType == 'r') {
            message = new RefreshResponseMessage();
        } else if (unsequencedMessageType == 'E') {
            message = new EndOfRefreshNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
