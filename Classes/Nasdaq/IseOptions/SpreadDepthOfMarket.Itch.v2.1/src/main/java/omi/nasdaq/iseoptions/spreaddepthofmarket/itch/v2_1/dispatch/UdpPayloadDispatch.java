package omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyAuctionMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyTradeMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideReplaceLongFormMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideReplaceShortFormMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.types.Message;

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
        } else if (messageType == 'r') {
            message = new AddOrderShortFormMessage();
        } else if (messageType == 'o') {
            message = new AddOrderLongFormMessage();
        } else if (messageType == 't') {
            message = new SingleSideExecutedMessage();
        } else if (messageType == 'T') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (messageType == 'i') {
            message = new SingleSideReplaceShortFormMessage();
        } else if (messageType == 'I') {
            message = new SingleSideReplaceLongFormMessage();
        } else if (messageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (messageType == 'P') {
            message = new SingleSideUpdateMessage();
        } else if (messageType == 'q') {
            message = new ComplexStrategyTradeMessage();
        } else if (messageType == 'a') {
            message = new ComplexStrategyAuctionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
