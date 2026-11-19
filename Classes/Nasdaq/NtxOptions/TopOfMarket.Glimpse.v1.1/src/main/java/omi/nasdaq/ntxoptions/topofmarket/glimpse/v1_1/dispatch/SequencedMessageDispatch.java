package omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.BestBidAndAskUpdateLongFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.BestBidAndAskUpdateShortFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.BestBidOrAskUpdateLongFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.BestBidOrAskUpdateShortFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.SnapshotMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.SystemEventMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.messages.application.TradingActionMessage;
import omi.nasdaq.ntxoptions.topofmarket.glimpse.v1_1.types.Message;

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
        } else if (sequencedMessageType == 'R') {
            message = new DerivativeDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'q') {
            message = new BestBidAndAskUpdateShortFormMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new BestBidAndAskUpdateLongFormMessage();
        } else if (sequencedMessageType == 'b') {
            message = new BestBidOrAskUpdateShortFormMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BestBidOrAskUpdateLongFormMessage();
        } else if (sequencedMessageType == 'M') {
            message = new SnapshotMessage();
        } else if (sequencedMessageType == 'a') {
            message = new BestBidOrAskUpdateShortFormMessage();
        } else if (sequencedMessageType == 'A') {
            message = new BestBidOrAskUpdateLongFormMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
