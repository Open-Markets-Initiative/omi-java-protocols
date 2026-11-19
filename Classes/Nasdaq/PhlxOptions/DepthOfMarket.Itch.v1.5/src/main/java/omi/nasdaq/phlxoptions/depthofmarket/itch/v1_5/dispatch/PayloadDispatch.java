package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.AddOrderMessageLongForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.AddOrderMessageShortForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.AddQuoteMessageLongForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.AddQuoteMessageShortForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.BaseReferenceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.BlockDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.BrokenTradeOrderExecutionMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.NonAuctionOptionsTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.OptionDirectoryMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.OptionsCrossTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.OrderReplaceMessageShortForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.QuoteDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.QuoteReplaceLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.QuoteReplaceShortFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SecondsMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SecurityOpenMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideCancelMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideReplaceLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideReplaceMessageLongForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideReplaceMessageShortForm;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application.TradingActionMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.types.Message;

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
            message = new AddOrderMessageShortForm();
        } else if (messageType == 'A') {
            message = new AddOrderMessageLongForm();
        } else if (messageType == 'j') {
            message = new AddQuoteMessageShortForm();
        } else if (messageType == 'J') {
            message = new AddQuoteMessageLongForm();
        } else if (messageType == 'E') {
            message = new SingleSideExecutedMessage();
        } else if (messageType == 'C') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new SingleSideCancelMessage();
        } else if (messageType == 'u') {
            message = new SingleSideReplaceMessageShortForm();
        } else if (messageType == 'U') {
            message = new SingleSideReplaceMessageLongForm();
        } else if (messageType == 'v') {
            message = new OrderReplaceMessageShortForm();
        } else if (messageType == 'V') {
            message = new SingleSideReplaceLongFormMessage();
        } else if (messageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (messageType == 'G') {
            message = new SingleSideUpdateMessage();
        } else if (messageType == 'k') {
            message = new QuoteReplaceShortFormMessage();
        } else if (messageType == 'K') {
            message = new QuoteReplaceLongFormMessage();
        } else if (messageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (messageType == 'Z') {
            message = new BlockDeleteMessage();
        } else if (messageType == 'P') {
            message = new NonAuctionOptionsTradeMessage();
        } else if (messageType == 'Q') {
            message = new OptionsCrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeOrderExecutionMessage();
        } else if (messageType == 'I') {
            message = new AuctionNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
