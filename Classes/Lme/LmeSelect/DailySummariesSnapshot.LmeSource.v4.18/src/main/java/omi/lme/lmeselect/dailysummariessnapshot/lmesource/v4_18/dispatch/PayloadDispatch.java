package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.dispatch;

import java.util.Optional;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.OpenInterestBandMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.OpenInterestMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.PositionBandMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.RefreshCompleteMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.SequenceResetMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.TradingVolumeMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application.WarrantBandMessage;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 100L) {
            message = new SequenceResetMessage();
        } else if (msgType == 420L) {
            message = new OpenInterestMessage();
        } else if (msgType == 421L) {
            message = new OpenInterestBandMessage();
        } else if (msgType == 422L) {
            message = new PositionBandMessage();
        } else if (msgType == 423L) {
            message = new WarrantBandMessage();
        } else if (msgType == 424L) {
            message = new TradingVolumeMessage();
        } else if (msgType == 203L) {
            message = new RefreshCompleteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
