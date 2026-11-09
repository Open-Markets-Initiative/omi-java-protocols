package omi.txse.txseequities.seed.rake.v1_0.dispatch;

import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.CancelOrderMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.LimitOrderMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MarketOrderMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MassCancelMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.ModifyOrderMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.ReplaceOrderMessage;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 76L) {
            message = new LimitOrderMessage();
        } else if (messageType == 65L) {
            message = new MarketOrderMessage();
        } else if (messageType == 67L) {
            message = new CancelOrderMessage();
        } else if (messageType == 77L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 82L) {
            message = new ReplaceOrderMessage();
        } else if (messageType == 86L) {
            message = new MassCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
