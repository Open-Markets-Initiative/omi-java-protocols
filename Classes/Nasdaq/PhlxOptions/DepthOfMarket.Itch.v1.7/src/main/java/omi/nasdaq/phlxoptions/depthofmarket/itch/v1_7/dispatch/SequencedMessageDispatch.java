package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AddOrderLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AddOrderShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AddQuoteLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AddQuoteShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.BaseReferenceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.BlockDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.BrokenTradeOrderExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.EndOfReplaySequenceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.NonAuctionOptionsTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.OptionDirectoryMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.OptionsCrossTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.OrderReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.OrderReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.QuoteDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.QuoteReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.QuoteReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SecondsMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SecurityOpenMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideCancelMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.TradingActionMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.Message;

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
        if (sequencedMessageType == 'T') {
            message = new SecondsMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'L') {
            message = new BaseReferenceMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OptionDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'O') {
            message = new SecurityOpenMessage();
        } else if (sequencedMessageType == 'a') {
            message = new AddOrderShortMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderLongMessage();
        } else if (sequencedMessageType == 'j') {
            message = new AddQuoteShortMessage();
        } else if (sequencedMessageType == 'J') {
            message = new AddQuoteLongMessage();
        } else if (sequencedMessageType == 'E') {
            message = new SingleSideExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'X') {
            message = new SingleSideCancelMessage();
        } else if (sequencedMessageType == 'u') {
            message = new SingleSideReplaceShortMessage();
        } else if (sequencedMessageType == 'U') {
            message = new SingleSideReplaceLongMessage();
        } else if (sequencedMessageType == 'v') {
            message = new OrderReplaceShortMessage();
        } else if (sequencedMessageType == 'V') {
            message = new OrderReplaceLongMessage();
        } else if (sequencedMessageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (sequencedMessageType == 'G') {
            message = new SingleSideUpdateMessage();
        } else if (sequencedMessageType == 'k') {
            message = new QuoteReplaceShortMessage();
        } else if (sequencedMessageType == 'K') {
            message = new QuoteReplaceLongMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (sequencedMessageType == 'Z') {
            message = new BlockDeleteMessage();
        } else if (sequencedMessageType == 'P') {
            message = new NonAuctionOptionsTradeMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new OptionsCrossTradeMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeOrderExecutedMessage();
        } else if (sequencedMessageType == 'I') {
            message = new AuctionNotificationMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
