package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.dispatch;

import java.util.Optional;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.AddOrderMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.AuctionSummaryMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.AuctionUpdateMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.CalculatedValueMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.DeleteOrderMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.EndOfSessionMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.ModifyOrderMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.OrderExecutedAtPriceMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.OrderExecutedMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.ReduceSizeMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.TradeBreakMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.TradeMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.TradingStatusMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application.UnitClearMessage;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.Message;

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
        } else if (messageType == 59L) {
            message = new TradingStatusMessage();
        } else if (messageType == 55L) {
            message = new AddOrderMessage();
        } else if (messageType == 56L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 88L) {
            message = new OrderExecutedAtPriceMessage();
        } else if (messageType == 57L) {
            message = new ReduceSizeMessage();
        } else if (messageType == 58L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 60L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 61L) {
            message = new TradeMessage();
        } else if (messageType == 62L) {
            message = new TradeBreakMessage();
        } else if (messageType == 227L) {
            message = new CalculatedValueMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else if (messageType == 89L) {
            message = new AuctionUpdateMessage();
        } else if (messageType == 90L) {
            message = new AuctionSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
