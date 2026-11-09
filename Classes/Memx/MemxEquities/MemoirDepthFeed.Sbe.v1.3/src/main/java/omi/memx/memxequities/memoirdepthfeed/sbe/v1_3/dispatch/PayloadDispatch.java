package omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.dispatch;

import java.util.Optional;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.BrokenTradeMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.ClearBookMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.CorrectedTradeMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.InstrumentDirectoryMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.OrderAddedMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.OrderDeletedMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.OrderExecutedMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.OrderReducedMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.RegShoRestrictionMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.SecurityTradingStatusMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.SnapshotCompleteMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.TradeMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.messages.application.TradingSessionStatusMessage;
import omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.types.Message;

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
        } else if (templateId == 100L) {
            message = new SnapshotCompleteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
