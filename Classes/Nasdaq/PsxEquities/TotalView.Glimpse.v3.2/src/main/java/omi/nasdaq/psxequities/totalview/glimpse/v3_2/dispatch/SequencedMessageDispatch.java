package omi.nasdaq.psxequities.totalview.glimpse.v3_2.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.AddOrderMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.AddOrderMpidAttributionMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.EndOfSnapshotMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.MillisecondsMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.RegShoRestrictionMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.SecondsMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.StockDirectoryMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.StockTradingActionMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.totalview.glimpse.v3_2.types.Message;

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
        if (messageType == 'T') {
            message = new SecondsMessage();
        } else if (messageType == 'M') {
            message = new MillisecondsMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'F') {
            message = new AddOrderMpidAttributionMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoRestrictionMessage();
        } else if (messageType == 'G') {
            message = new EndOfSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
