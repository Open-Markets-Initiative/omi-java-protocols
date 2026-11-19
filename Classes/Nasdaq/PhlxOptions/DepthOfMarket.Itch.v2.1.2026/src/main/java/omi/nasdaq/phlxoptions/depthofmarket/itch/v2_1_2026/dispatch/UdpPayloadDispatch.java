package omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.AddQuoteLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.AddQuoteShortFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.NetOrderImbalanceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.OrderCancelMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.QuoteDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.QuoteReplaceLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.QuoteReplaceShortFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideReplaceLongFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideReplaceShortFormMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.TradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.messages.application.TradingActionMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v2_1_2026.types.Message;

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
        } else if (messageType == 'r') {
            message = new AddOrderShortFormMessage();
        } else if (messageType == 'o') {
            message = new AddOrderLongFormMessage();
        } else if (messageType == 'j') {
            message = new AddQuoteShortFormMessage();
        } else if (messageType == 'J') {
            message = new AddQuoteLongFormMessage();
        } else if (messageType == 'e') {
            message = new SingleSideExecutedMessage();
        } else if (messageType == 'c') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'u') {
            message = new SingleSideReplaceShortFormMessage();
        } else if (messageType == 'U') {
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
        } else if (messageType == 'q') {
            message = new TradeMessage();
        } else if (messageType == 'O') {
            message = new NetOrderImbalanceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
