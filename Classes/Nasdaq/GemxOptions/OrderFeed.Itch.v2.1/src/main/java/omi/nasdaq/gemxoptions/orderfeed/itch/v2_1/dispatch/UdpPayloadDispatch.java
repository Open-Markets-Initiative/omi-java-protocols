package omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.messages.application.AddOrderMessage;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.messages.application.AuctionMessage;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.messages.application.TradingActionMessage;
import omi.nasdaq.gemxoptions.orderfeed.itch.v2_1.types.Message;

/**
 * Selects the message a Udp Payload branch holds by its Message Type.
 */
public final class UdpPayloadDispatch {

    private UdpPayloadDispatch() {
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
        } else if (messageType == 'm') {
            message = new DerivativeDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'O') {
            message = new AddOrderMessage();
        } else if (messageType == 'J') {
            message = new AuctionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
