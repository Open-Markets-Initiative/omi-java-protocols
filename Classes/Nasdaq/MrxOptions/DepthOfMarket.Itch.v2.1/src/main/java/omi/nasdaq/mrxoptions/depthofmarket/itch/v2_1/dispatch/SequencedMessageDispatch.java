package omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.AddQuoteLongFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.AddQuoteShortFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.NetOrderImbalanceMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.OrderCancelMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.QuoteDeleteMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.QuoteReplaceLongFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.QuoteReplaceShortFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideReplaceLongFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideReplaceShortFormMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.TradeMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.messages.application.TradingActionMessage;
import omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1.types.Message;

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
        } else if (sequencedMessageType == 'm') {
            message = new DerivativeDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'r') {
            message = new AddOrderShortFormMessage();
        } else if (sequencedMessageType == 'o') {
            message = new AddOrderLongFormMessage();
        } else if (sequencedMessageType == 'j') {
            message = new AddQuoteShortFormMessage();
        } else if (sequencedMessageType == 'J') {
            message = new AddQuoteLongFormMessage();
        } else if (sequencedMessageType == 'e') {
            message = new SingleSideExecutedMessage();
        } else if (sequencedMessageType == 'c') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderCancelMessage();
        } else if (sequencedMessageType == 'u') {
            message = new SingleSideReplaceShortFormMessage();
        } else if (sequencedMessageType == 'U') {
            message = new SingleSideReplaceLongFormMessage();
        } else if (sequencedMessageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (sequencedMessageType == 'G') {
            message = new SingleSideUpdateMessage();
        } else if (sequencedMessageType == 'k') {
            message = new QuoteReplaceShortFormMessage();
        } else if (sequencedMessageType == 'K') {
            message = new QuoteReplaceLongFormMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (sequencedMessageType == 'q') {
            message = new TradeMessage();
        } else if (sequencedMessageType == 'O') {
            message = new NetOrderImbalanceMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
