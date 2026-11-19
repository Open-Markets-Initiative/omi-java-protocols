package omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.dispatch;

import java.util.Optional;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.AddOrderMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.DeleteOrderMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.EndOfSessionMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.ModifyOrderMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.OrderExecutedMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.ReduceSizeMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.TradeBreakMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.TradeMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.TradingStatusMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.messages.application.UnitClearMessage;
import omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.types.Message;

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
        if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 80L) {
            message = new TradingStatusMessage();
        } else if (messageType == 81L) {
            message = new AddOrderMessage();
        } else if (messageType == 82L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 57L) {
            message = new ReduceSizeMessage();
        } else if (messageType == 58L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 60L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 83L) {
            message = new TradeMessage();
        } else if (messageType == 62L) {
            message = new TradeBreakMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
