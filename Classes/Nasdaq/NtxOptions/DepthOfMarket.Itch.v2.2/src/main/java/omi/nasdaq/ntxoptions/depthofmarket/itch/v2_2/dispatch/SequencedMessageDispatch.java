package omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddQuoteLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddQuoteShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.NetOrderImbalanceMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderCancelMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderChangeMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderDeleteMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderExecutedMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderReplaceLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.OrderReplaceShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.QuoteDeleteMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.QuoteReplaceLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.QuoteReplaceShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.SystemEventMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.TradeMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.TradingActionMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.types.Message;

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
        } else if (sequencedMessageType == 'R') {
            message = new DerivativeDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'a') {
            message = new AddOrderShortFormMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderLongFormMessage();
        } else if (sequencedMessageType == 'j') {
            message = new AddQuoteShortFormMessage();
        } else if (sequencedMessageType == 'J') {
            message = new AddQuoteLongFormMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderCancelMessage();
        } else if (sequencedMessageType == 'u') {
            message = new OrderReplaceShortFormMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplaceLongFormMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (sequencedMessageType == 'G') {
            message = new OrderChangeMessage();
        } else if (sequencedMessageType == 'k') {
            message = new QuoteReplaceShortFormMessage();
        } else if (sequencedMessageType == 'K') {
            message = new QuoteReplaceLongFormMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new TradeMessage();
        } else if (sequencedMessageType == 'I') {
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
