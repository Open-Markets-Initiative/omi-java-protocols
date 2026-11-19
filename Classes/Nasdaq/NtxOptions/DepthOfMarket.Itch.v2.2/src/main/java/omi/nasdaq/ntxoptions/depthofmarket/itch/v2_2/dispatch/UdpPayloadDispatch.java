package omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddOrderLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddOrderShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddQuoteLongFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.AddQuoteShortFormMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application.DerivativeDirectoryMessage;
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
        } else if (messageType == 'R') {
            message = new DerivativeDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'a') {
            message = new AddOrderShortFormMessage();
        } else if (messageType == 'A') {
            message = new AddOrderLongFormMessage();
        } else if (messageType == 'j') {
            message = new AddQuoteShortFormMessage();
        } else if (messageType == 'J') {
            message = new AddQuoteLongFormMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'u') {
            message = new OrderReplaceShortFormMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceLongFormMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'G') {
            message = new OrderChangeMessage();
        } else if (messageType == 'k') {
            message = new QuoteReplaceShortFormMessage();
        } else if (messageType == 'K') {
            message = new QuoteReplaceLongFormMessage();
        } else if (messageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (messageType == 'Q') {
            message = new TradeMessage();
        } else if (messageType == 'I') {
            message = new NetOrderImbalanceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
