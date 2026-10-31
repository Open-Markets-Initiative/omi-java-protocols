package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch;

import java.util.Optional;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyOpenClosedMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.SystemEventMessage;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 *
 * <p>Messages it may select that this library does not decode: ComplexStrategyDirectoryMessage, ComplexStrategyAuctionMessage.</p>
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
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset) {
        Message message;
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'H') {
            message = new StrategyTradingActionMessage();
        } else if (messageType == 'O') {
            message = new StrategyOpenClosedMessage();
        } else if (messageType == 'L') {
            message = new ComplexStrategyOrderOnBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
