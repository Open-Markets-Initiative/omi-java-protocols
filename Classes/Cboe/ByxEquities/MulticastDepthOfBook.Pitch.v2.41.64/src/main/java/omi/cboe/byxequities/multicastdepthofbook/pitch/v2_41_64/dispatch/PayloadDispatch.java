package omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.dispatch;

import java.util.Optional;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderExpandedMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderLongMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderShortMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAuctionSummaryMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAuctionUpdateMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqDeleteOrderMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqEndOfSession;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqModifyOrderLongMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqModifyOrderShortMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqOrderExecutedAtPriceSizeMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqOrderExecutedMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqReduceSizeLongMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqReduceSizeShortMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqRetailPriceImprovementMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTimeMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeBreakMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeExpandedMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeLongMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeShortMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradingStatusMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqUnitClearMessage;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_64.types.Message;

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
            message = new EqTimeMessage();
        } else if (messageType == 151L) {
            message = new EqUnitClearMessage();
        } else if (messageType == 33L) {
            message = new EqAddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new EqAddOrderShortMessage();
        } else if (messageType == 47L) {
            message = new EqAddOrderExpandedMessage();
        } else if (messageType == 35L) {
            message = new EqOrderExecutedMessage();
        } else if (messageType == 36L) {
            message = new EqOrderExecutedAtPriceSizeMessage();
        } else if (messageType == 37L) {
            message = new EqReduceSizeLongMessage();
        } else if (messageType == 38L) {
            message = new EqReduceSizeShortMessage();
        } else if (messageType == 39L) {
            message = new EqModifyOrderLongMessage();
        } else if (messageType == 40L) {
            message = new EqModifyOrderShortMessage();
        } else if (messageType == 41L) {
            message = new EqDeleteOrderMessage();
        } else if (messageType == 42L) {
            message = new EqTradeLongMessage();
        } else if (messageType == 43L) {
            message = new EqTradeShortMessage();
        } else if (messageType == 48L) {
            message = new EqTradeExpandedMessage();
        } else if (messageType == 44L) {
            message = new EqTradeBreakMessage();
        } else if (messageType == 45L) {
            message = new EqEndOfSession();
        } else if (messageType == 49L) {
            message = new EqTradingStatusMessage();
        } else if (messageType == 149L) {
            message = new EqAuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new EqAuctionSummaryMessage();
        } else if (messageType == 152L) {
            message = new EqRetailPriceImprovementMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
