package omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.SnapshotMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.StrategyBestAskUpdateMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.StrategyBestBidAndAskUpdateMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.StrategyBestBidUpdateMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.mrxoptions.spreadtopofmarket.glimpse.v2_1.types.Message;

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
        } else if (sequencedMessageType == 's') {
            message = new ComplexStrategyDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new StrategyTradingActionMessage();
        } else if (sequencedMessageType == 'E') {
            message = new StrategyBestBidAndAskUpdateMessage();
        } else if (sequencedMessageType == 'c') {
            message = new StrategyBestBidUpdateMessage();
        } else if (sequencedMessageType == 'd') {
            message = new StrategyBestAskUpdateMessage();
        } else if (sequencedMessageType == 'M') {
            message = new SnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
