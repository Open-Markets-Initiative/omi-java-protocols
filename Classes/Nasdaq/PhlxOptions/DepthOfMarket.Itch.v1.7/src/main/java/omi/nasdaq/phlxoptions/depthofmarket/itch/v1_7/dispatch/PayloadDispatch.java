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
        if (messageType == 'T') {
            message = new SecondsMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'L') {
            message = new BaseReferenceMessage();
        } else if (messageType == 'R') {
            message = new OptionDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'O') {
            message = new SecurityOpenMessage();
        } else if (messageType == 'a') {
            message = new AddOrderShortMessage();
        } else if (messageType == 'A') {
            message = new AddOrderLongMessage();
        } else if (messageType == 'j') {
            message = new AddQuoteShortMessage();
        } else if (messageType == 'J') {
            message = new AddQuoteLongMessage();
        } else if (messageType == 'E') {
            message = new SingleSideExecutedMessage();
        } else if (messageType == 'C') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new SingleSideCancelMessage();
        } else if (messageType == 'u') {
            message = new SingleSideReplaceShortMessage();
        } else if (messageType == 'U') {
            message = new SingleSideReplaceLongMessage();
        } else if (messageType == 'v') {
            message = new OrderReplaceShortMessage();
        } else if (messageType == 'V') {
            message = new OrderReplaceLongMessage();
        } else if (messageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (messageType == 'G') {
            message = new SingleSideUpdateMessage();
        } else if (messageType == 'k') {
            message = new QuoteReplaceShortMessage();
        } else if (messageType == 'K') {
            message = new QuoteReplaceLongMessage();
        } else if (messageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (messageType == 'Z') {
            message = new BlockDeleteMessage();
        } else if (messageType == 'P') {
            message = new NonAuctionOptionsTradeMessage();
        } else if (messageType == 'Q') {
            message = new OptionsCrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeOrderExecutedMessage();
        } else if (messageType == 'I') {
            message = new AuctionNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
