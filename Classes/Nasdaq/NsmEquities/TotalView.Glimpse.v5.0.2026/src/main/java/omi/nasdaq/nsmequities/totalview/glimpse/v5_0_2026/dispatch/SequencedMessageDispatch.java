package omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.AddOrderMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.AddOrderMpidAttributionMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.EndOfSnapshotMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.RegShoRestrictionMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.RetailInterestMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.totalview.glimpse.v5_0_2026.types.Message;

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
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'F') {
            message = new AddOrderMpidAttributionMessage();
        } else if (sequencedMessageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new RegShoRestrictionMessage();
        } else if (sequencedMessageType == 'N') {
            message = new RetailInterestMessage();
        } else if (sequencedMessageType == 'G') {
            message = new EndOfSnapshotMessage();
        } else if (sequencedMessageType == 'h') {
            message = new OperationalHaltMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
