package omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.StrategyBestAskUpdateMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.StrategyBestBidAndAskUpdateMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.StrategyBestBidUpdateMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.spreadtopofmarket.itch.v2_1.types.Message;

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
        } else if (messageType == 's') {
            message = new ComplexStrategyDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StrategyTradingActionMessage();
        } else if (messageType == 'E') {
            message = new StrategyBestBidAndAskUpdateMessage();
        } else if (messageType == 'c') {
            message = new StrategyBestBidUpdateMessage();
        } else if (messageType == 'd') {
            message = new StrategyBestAskUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
