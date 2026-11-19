package omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyAuctionMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.ComplexStrategyTradeMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideReplaceLongFormMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideReplaceShortFormMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.types.Message;

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
        } else if (sequencedMessageType == 's') {
            message = new ComplexStrategyDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new StrategyTradingActionMessage();
        } else if (sequencedMessageType == 'r') {
            message = new AddOrderShortFormMessage();
        } else if (sequencedMessageType == 'o') {
            message = new AddOrderLongFormMessage();
        } else if (sequencedMessageType == 't') {
            message = new SingleSideExecutedMessage();
        } else if (sequencedMessageType == 'T') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'i') {
            message = new SingleSideReplaceShortFormMessage();
        } else if (sequencedMessageType == 'I') {
            message = new SingleSideReplaceLongFormMessage();
        } else if (sequencedMessageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (sequencedMessageType == 'P') {
            message = new SingleSideUpdateMessage();
        } else if (sequencedMessageType == 'q') {
            message = new ComplexStrategyTradeMessage();
        } else if (sequencedMessageType == 'a') {
            message = new ComplexStrategyAuctionMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
