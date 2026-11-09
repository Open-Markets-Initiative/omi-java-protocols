package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch;

import java.util.Optional;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyAuctionMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyOpenClosedMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.SystemEventMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new ComplexStrategyDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StrategyTradingActionMessage();
        } else if (messageType == 'O') {
            message = new StrategyOpenClosedMessage();
        } else if (messageType == 'L') {
            message = new ComplexStrategyOrderOnBookMessage();
        } else if (messageType == 'J') {
            message = new ComplexStrategyAuctionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
