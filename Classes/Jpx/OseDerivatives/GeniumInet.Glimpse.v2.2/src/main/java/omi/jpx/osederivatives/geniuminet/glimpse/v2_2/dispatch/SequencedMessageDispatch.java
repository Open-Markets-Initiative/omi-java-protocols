package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.dispatch;

import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.DeletedOrderMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.EpMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.ExecutionNoticeMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.ExecutionNoticeWithTradeInformationMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.NewOrderMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.SecondsMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.SeriesInformationBasicCombinationMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.SeriesInformationBasicMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.SnapshotCompletionMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.SystemEventDataMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.TickSizeDataMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application.TradingStatusDataMessage;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.types.Message;

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
            message = new SeriesInformationBasicMessage();
        } else if (sequencedMessageType == 'M') {
            message = new SeriesInformationBasicCombinationMessage();
        } else if (sequencedMessageType == 'L') {
            message = new TickSizeDataMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventDataMessage();
        } else if (sequencedMessageType == 'O') {
            message = new TradingStatusDataMessage();
        } else if (sequencedMessageType == 'A') {
            message = new NewOrderMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutionNoticeMessage();
        } else if (sequencedMessageType == 'C') {
            message = new ExecutionNoticeWithTradeInformationMessage();
        } else if (sequencedMessageType == 'D') {
            message = new DeletedOrderMessage();
        } else if (sequencedMessageType == 'Z') {
            message = new EpMessage();
        } else if (sequencedMessageType == 'G') {
            message = new SnapshotCompletionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
