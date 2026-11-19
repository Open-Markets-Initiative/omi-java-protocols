package omi.aix.aixmarket.geniuminet.glimpse.v1_0.dispatch;

import java.util.Optional;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.AddOrderMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.EndOfSnapshotMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.OrderBookDirectoryMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.OrderBookStateMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.SecondsMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.ShortSellStatusMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.messages.application.TickSizeTableEntryMessage;
import omi.aix.aixmarket.geniuminet.glimpse.v1_0.types.Message;

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
        if (sequencedMessageType == 'T') {
            message = new SecondsMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderBookDirectoryMessage();
        } else if (sequencedMessageType == 'L') {
            message = new TickSizeTableEntryMessage();
        } else if (sequencedMessageType == 'V') {
            message = new ShortSellStatusMessage();
        } else if (sequencedMessageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'G') {
            message = new EndOfSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
