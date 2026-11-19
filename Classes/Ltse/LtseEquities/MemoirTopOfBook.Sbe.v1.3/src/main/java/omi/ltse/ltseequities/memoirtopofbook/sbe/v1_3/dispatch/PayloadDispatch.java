package omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.dispatch;

import java.util.Optional;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestBidMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestBidOfferMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestBidShortMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestOfferMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestOfferShortMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.ClearBookMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.InstrumentDirectoryMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.RegShoRestrictionMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.SecurityTradingStatusMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.SnapshotCompleteMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.TradingSessionStatusMessage;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.types.Message;

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
        } else if (templateId == 4L) {
            message = new SnapshotCompleteMessage();
        } else if (templateId == 5L) {
            message = new TradingSessionStatusMessage();
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
            message = new ClearBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
