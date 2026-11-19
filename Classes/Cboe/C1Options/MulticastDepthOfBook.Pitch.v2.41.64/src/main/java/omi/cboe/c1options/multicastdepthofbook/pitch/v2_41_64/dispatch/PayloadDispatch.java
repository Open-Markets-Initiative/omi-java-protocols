package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.dispatch;

import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionCancelMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionNotificationMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionSummaryMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionTradeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxConstituentSymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxDeleteOrderMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxEndOfSession;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxModifyOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxModifyOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOptionsAuctionUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOrderExecutedAtPriceSizeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOrderExecutedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxReduceSizeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxReduceSizeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxSoqStrikeRangeUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxSymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTimeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTimeReferenceMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeBreakMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradingStatusMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTransactionBeginMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTransactionEndMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxUnitClearMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxWidthUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.types.Message;

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
        if (messageType == 177L) {
            message = new OxTimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new OxTimeMessage();
        } else if (messageType == 151L) {
            message = new OxUnitClearMessage();
        } else if (messageType == 188L) {
            message = new OxTransactionBeginMessage();
        } else if (messageType == 189L) {
            message = new OxTransactionEndMessage();
        } else if (messageType == 33L) {
            message = new OxAddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new OxAddOrderShortMessage();
        } else if (messageType == 47L) {
            message = new OxAddOrderExpandedMessage();
        } else if (messageType == 35L) {
            message = new OxOrderExecutedMessage();
        } else if (messageType == 36L) {
            message = new OxOrderExecutedAtPriceSizeMessage();
        } else if (messageType == 37L) {
            message = new OxReduceSizeLongMessage();
        } else if (messageType == 38L) {
            message = new OxReduceSizeShortMessage();
        } else if (messageType == 39L) {
            message = new OxModifyOrderLongMessage();
        } else if (messageType == 40L) {
            message = new OxModifyOrderShortMessage();
        } else if (messageType == 41L) {
            message = new OxDeleteOrderMessage();
        } else if (messageType == 42L) {
            message = new OxTradeLongMessage();
        } else if (messageType == 43L) {
            message = new OxTradeShortMessage();
        } else if (messageType == 48L) {
            message = new OxTradeExpandedMessage();
        } else if (messageType == 44L) {
            message = new OxTradeBreakMessage();
        } else if (messageType == 45L) {
            message = new OxEndOfSession();
        } else if (messageType == 46L) {
            message = new OxSymbolMappingMessage();
        } else if (messageType == 49L) {
            message = new OxTradingStatusMessage();
        } else if (messageType == 210L) {
            message = new OxWidthUpdateMessage();
        } else if (messageType == 209L) {
            message = new OxOptionsAuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new OxAuctionSummaryMessage();
        } else if (messageType == 173L) {
            message = new OxAuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new OxAuctionCancelMessage();
        } else if (messageType == 175L) {
            message = new OxAuctionTradeMessage();
        } else if (messageType == 157L) {
            message = new OxSoqStrikeRangeUpdateMessage();
        } else if (messageType == 158L) {
            message = new OxConstituentSymbolMappingMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
