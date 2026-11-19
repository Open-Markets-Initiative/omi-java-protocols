package omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestAskUpdateLongFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestAskUpdateShortFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestBidAndAskUpdateLongFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestBidAndAskUpdateShortFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestBidUpdateLongFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.BestBidUpdateShortFormMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application.TradingActionMessage;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'm') {
            message = new DerivativeDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'q') {
            message = new BestBidAndAskUpdateShortFormMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new BestBidAndAskUpdateLongFormMessage();
        } else if (sequencedMessageType == 'b') {
            message = new BestBidUpdateShortFormMessage();
        } else if (sequencedMessageType == 'a') {
            message = new BestAskUpdateShortFormMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BestBidUpdateLongFormMessage();
        } else if (sequencedMessageType == 'A') {
            message = new BestAskUpdateLongFormMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
