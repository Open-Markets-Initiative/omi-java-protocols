package omi.nasdaq.psxequities.rash.asciirash.v1_1.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.AcceptedOrderMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.AcceptedOrderMessageWithCrossFunctionality;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.BrokenTradeMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.CanceledOrderMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.ExecutedOrderMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.RejectedOrderMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.rash.asciirash.v1_1.types.Message;

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
        } else if (sequencedMessageType == 'A') {
            message = new AcceptedOrderMessage();
        } else if (sequencedMessageType == 'R') {
            message = new AcceptedOrderMessageWithCrossFunctionality();
        } else if (sequencedMessageType == 'C') {
            message = new CanceledOrderMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedOrderMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutedOrderMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
