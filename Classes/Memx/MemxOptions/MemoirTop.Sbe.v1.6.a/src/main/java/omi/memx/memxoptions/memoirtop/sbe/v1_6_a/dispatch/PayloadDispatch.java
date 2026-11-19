package omi.memx.memxoptions.memoirtop.sbe.v1_6_a.dispatch;

import java.util.Optional;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BestBidMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BestBidOfferMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BestBidShortMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BestOfferMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BestOfferShortMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.BrokenTradeMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.ClearBookMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.CorrectedTradeMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.InstrumentDirectoryMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.OptionsInstrumentStatusMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.SnapshotCompleteMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.TradeMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application.UnderlierInstrumentStatusMessage;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.types.Message;

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
            message = new OptionsInstrumentStatusMessage();
        } else if (templateId == 3L) {
            message = new UnderlierInstrumentStatusMessage();
        } else if (templateId == 5L) {
            message = new BrokenTradeMessage();
        } else if (templateId == 6L) {
            message = new CorrectedTradeMessage();
        } else if (templateId == 7L) {
            message = new SnapshotCompleteMessage();
        } else if (templateId == 10L) {
            message = new BestBidOfferMessage();
        } else if (templateId == 11L) {
            message = new BestBidMessage();
        } else if (templateId == 12L) {
            message = new BestOfferMessage();
        } else if (templateId == 13L) {
            message = new BestBidShortMessage();
        } else if (templateId == 14L) {
            message = new BestOfferShortMessage();
        } else if (templateId == 15L) {
            message = new TradeMessage();
        } else if (templateId == 16L) {
            message = new ClearBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
