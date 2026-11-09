package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.dispatch;

import java.util.Optional;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.AddOrderExpandedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.AddOrderLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.AddOrderShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.AuctionSummaryMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.AuctionUpdateMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.DeleteOrderMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.EndOfSession;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.ModifyOrderLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.ModifyOrderShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.OrderExecutedAtPriceSizeMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.OrderExecutedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.ReduceSizeLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.ReduceSizeShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TimeMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TradeBreakMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TradeExpandedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TradeLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TradeShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.TradingStatusMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application.UnitClearMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.types.Message;

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
        if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 33L) {
            message = new AddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new AddOrderShortMessage();
        } else if (messageType == 47L) {
            message = new AddOrderExpandedMessage();
        } else if (messageType == 35L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 36L) {
            message = new OrderExecutedAtPriceSizeMessage();
        } else if (messageType == 37L) {
            message = new ReduceSizeLongMessage();
        } else if (messageType == 38L) {
            message = new ReduceSizeShortMessage();
        } else if (messageType == 39L) {
            message = new ModifyOrderLongMessage();
        } else if (messageType == 40L) {
            message = new ModifyOrderShortMessage();
        } else if (messageType == 41L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 42L) {
            message = new TradeLongMessage();
        } else if (messageType == 43L) {
            message = new TradeShortMessage();
        } else if (messageType == 48L) {
            message = new TradeExpandedMessage();
        } else if (messageType == 44L) {
            message = new TradeBreakMessage();
        } else if (messageType == 45L) {
            message = new EndOfSession();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 149L) {
            message = new AuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
