package omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestAskUpdateLongFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestAskUpdateShortFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestBidAndAskUpdateLongFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestBidAndAskUpdateShortFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestBidUpdateLongFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.BestBidUpdateShortFormMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.messages.application.TradingActionMessage;
import omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.types.Message;

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
        } else if (messageType == 'q') {
            message = new BestBidAndAskUpdateShortFormMessage();
        } else if (messageType == 'Q') {
            message = new BestBidAndAskUpdateLongFormMessage();
        } else if (messageType == 'b') {
            message = new BestBidUpdateShortFormMessage();
        } else if (messageType == 'a') {
            message = new BestAskUpdateShortFormMessage();
        } else if (messageType == 'B') {
            message = new BestBidUpdateLongFormMessage();
        } else if (messageType == 'A') {
            message = new BestAskUpdateLongFormMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
