package omi.nasdaq.phlxoptions.orders.itch.v1_92.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexAuctionNotificationMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexOrderMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexOrderStrategyMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.ComplexTradingActionMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.OptionsDirectoryMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SecurityOpenClosedMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SecurityTradingActionMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SimpleOrderMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.StrategyOpenClosedMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'D') {
            message = new OptionsDirectoryMessage();
        } else if (messageType == 'R') {
            message = new ComplexOrderStrategyMessage();
        } else if (messageType == 'H') {
            message = new SecurityTradingActionMessage();
        } else if (messageType == 'I') {
            message = new ComplexTradingActionMessage();
        } else if (messageType == 'P') {
            message = new SecurityOpenClosedMessage();
        } else if (messageType == 'Q') {
            message = new StrategyOpenClosedMessage();
        } else if (messageType == 'O') {
            message = new SimpleOrderMessage();
        } else if (messageType == 'X') {
            message = new ComplexOrderMessage();
        } else if (messageType == 'A') {
            message = new AuctionNotificationMessage();
        } else if (messageType == 'C') {
            message = new ComplexAuctionNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
