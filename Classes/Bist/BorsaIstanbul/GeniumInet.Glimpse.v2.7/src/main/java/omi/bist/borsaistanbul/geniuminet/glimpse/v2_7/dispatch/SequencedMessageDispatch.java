package omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.dispatch;

import java.util.Optional;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.AddOrderNoMpidAttribution;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.AddOrderWithMpidAttribution;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.CombinationOrderBookLeg;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.EndOfSnapshotMessage;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.OrderBookDirectory;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.OrderBookStateMessage;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.SecondsMessage;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.ShortSellStatus;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.messages.application.TickSizeTableEntry;
import omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.types.Message;

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
            message = new OrderBookDirectory();
        } else if (sequencedMessageType == 'M') {
            message = new CombinationOrderBookLeg();
        } else if (sequencedMessageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (sequencedMessageType == 'V') {
            message = new ShortSellStatus();
        } else if (sequencedMessageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderNoMpidAttribution();
        } else if (sequencedMessageType == 'F') {
            message = new AddOrderWithMpidAttribution();
        } else if (sequencedMessageType == 'G') {
            message = new EndOfSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
