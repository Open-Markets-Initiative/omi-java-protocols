package omi.nasdaq.phlxoptions.orders.itch.v1_92.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexAuctionNotificationMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexOrderMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexOrderStrategyMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexTradingActionMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.OptionsDirectoryMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SecurityOpenClosedMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SecurityTradingActionMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SimpleOrderMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.StrategyOpenClosedMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Message;

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
        } else if (sequencedMessageType == 'D') {
            message = new OptionsDirectoryMessage();
        } else if (sequencedMessageType == 'R') {
            message = new ComplexOrderStrategyMessage();
        } else if (sequencedMessageType == 'H') {
            message = new SecurityTradingActionMessage();
        } else if (sequencedMessageType == 'I') {
            message = new ComplexTradingActionMessage();
        } else if (sequencedMessageType == 'P') {
            message = new SecurityOpenClosedMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new StrategyOpenClosedMessage();
        } else if (sequencedMessageType == 'O') {
            message = new SimpleOrderMessage();
        } else if (sequencedMessageType == 'X') {
            message = new ComplexOrderMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AuctionNotificationMessage();
        } else if (sequencedMessageType == 'C') {
            message = new ComplexAuctionNotificationMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
