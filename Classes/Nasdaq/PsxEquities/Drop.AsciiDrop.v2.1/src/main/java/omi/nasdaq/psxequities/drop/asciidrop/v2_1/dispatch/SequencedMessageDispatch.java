package omi.nasdaq.psxequities.drop.asciidrop.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.messages.application.ExistingOrderCanceledMessage;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.messages.application.ExistingOrderExecutedMessage;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.messages.application.ExistingOrderReplacedMessage;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.messages.application.NewOrderAcceptedMessage;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.messages.application.PreviousExecutionBrokenMessage;
import omi.nasdaq.psxequities.drop.asciidrop.v2_1.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
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
        if (messageType == 'A') {
            message = new NewOrderAcceptedMessage();
        } else if (messageType == 'E') {
            message = new ExistingOrderExecutedMessage();
        } else if (messageType == 'X') {
            message = new ExistingOrderCanceledMessage();
        } else if (messageType == 'B') {
            message = new PreviousExecutionBrokenMessage();
        } else if (messageType == 'U') {
            message = new ExistingOrderReplacedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
