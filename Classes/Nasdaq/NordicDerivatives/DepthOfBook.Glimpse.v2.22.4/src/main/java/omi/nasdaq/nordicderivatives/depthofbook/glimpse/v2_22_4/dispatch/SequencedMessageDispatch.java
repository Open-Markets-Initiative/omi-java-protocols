package omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.AddOrderMpidAttribution;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.AddOrderNoMpidAttribution;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.CombinationOrderBookDirectory;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.EndOfSnapshotMessage;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.OrderBookDirectory;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.OrderBookStateMessage;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.SecondsMessage;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application.TickSizeTableEntry;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.Message;

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
            message = new CombinationOrderBookDirectory();
        } else if (sequencedMessageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (sequencedMessageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderNoMpidAttribution();
        } else if (sequencedMessageType == 'F') {
            message = new AddOrderMpidAttribution();
        } else if (sequencedMessageType == 'G') {
            message = new EndOfSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
