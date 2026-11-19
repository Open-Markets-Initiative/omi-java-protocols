package omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.dispatch;

import java.util.Optional;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.AuctionStatusMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.AuctionTradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.BrokenAuctionTradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.BrokenTradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.ClearBookMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.CorrectedAuctionTradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.CorrectedTradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.InstrumentDirectoryMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.OrderAddedMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.OrderDeletedMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.OrderExecutedMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.OrderReducedMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.RegShoRestrictionMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.SecurityTradingStatusMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.SnapshotCompleteMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.TradeMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.messages.application.TradingSessionStatusMessage;
import omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 1L) {
            message = new InstrumentDirectoryMessage();
        } else if (templateId == 2L) {
            message = new RegShoRestrictionMessage();
        } else if (templateId == 3L) {
            message = new SecurityTradingStatusMessage();
        } else if (templateId == 5L) {
            message = new TradingSessionStatusMessage();
        } else if (templateId == 10L) {
            message = new OrderAddedMessage();
        } else if (templateId == 11L) {
            message = new OrderDeletedMessage();
        } else if (templateId == 12L) {
            message = new OrderReducedMessage();
        } else if (templateId == 13L) {
            message = new OrderExecutedMessage();
        } else if (templateId == 14L) {
            message = new TradeMessage();
        } else if (templateId == 15L) {
            message = new BrokenTradeMessage();
        } else if (templateId == 16L) {
            message = new CorrectedTradeMessage();
        } else if (templateId == 18L) {
            message = new ClearBookMessage();
        } else if (templateId == 19L) {
            message = new AuctionStatusMessage();
        } else if (templateId == 20L) {
            message = new AuctionTradeMessage();
        } else if (templateId == 21L) {
            message = new BrokenAuctionTradeMessage();
        } else if (templateId == 22L) {
            message = new CorrectedAuctionTradeMessage();
        } else if (templateId == 100L) {
            message = new SnapshotCompleteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
