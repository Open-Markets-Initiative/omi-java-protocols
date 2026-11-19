package omi.biva.bivaequities.orderentry.ouch.v1_05.dispatch;

import java.util.Optional;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.AcceptedMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.BrokenTradeMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.CanceledMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.ExecutedOrderMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.RejectedOrderMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.ReplacedMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application.SystemEventMessage;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.Message;

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
            message = new AcceptedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new ReplacedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new CanceledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutedOrderMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
