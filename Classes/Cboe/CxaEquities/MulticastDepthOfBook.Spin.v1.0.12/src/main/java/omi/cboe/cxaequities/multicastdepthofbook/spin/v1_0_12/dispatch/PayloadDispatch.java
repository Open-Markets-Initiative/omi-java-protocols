package omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.dispatch;

import java.util.Optional;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.AddOrderMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.AuctionUpdateMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.CalculatedValueMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.LoginMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.LoginResponseMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.SpinFinishedMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.SpinImageAvailableMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.SpinRequestMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.SpinResponseMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.messages.application.TradingStatusMessage;
import omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
        if (messageType == 1L) {
            message = new LoginMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 128L) {
            message = new SpinImageAvailableMessage();
        } else if (messageType == 129L) {
            message = new SpinRequestMessage();
        } else if (messageType == 130L) {
            message = new SpinResponseMessage();
        } else if (messageType == 131L) {
            message = new SpinFinishedMessage();
        } else if (messageType == 59L) {
            message = new TradingStatusMessage();
        } else if (messageType == 55L) {
            message = new AddOrderMessage();
        } else if (messageType == 227L) {
            message = new CalculatedValueMessage();
        } else if (messageType == 89L) {
            message = new AuctionUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
