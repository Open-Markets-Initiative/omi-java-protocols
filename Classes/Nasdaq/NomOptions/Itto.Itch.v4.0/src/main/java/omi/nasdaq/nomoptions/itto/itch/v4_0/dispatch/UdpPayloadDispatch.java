package omi.nasdaq.nomoptions.itto.itch.v4_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.AddOrderMessageLongFormMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.AddOrderMessageShortMessageForm;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.AddQuoteMessageLongFormMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.AddQuoteMessageShortFormMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.BrokenTradeOrderExecutedMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.NoiiMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.OptionsCrossTradeMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.OptionsDirectoryMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.OptionsTradeMessagesNonAuction;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.OrderCancelMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.QuoteDeleteMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.QuoteReplaceMessageLongForm;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.QuoteReplaceMessageShortForm;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SecurityOpenMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideChangeMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideReplaceMessageLongForm;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SingleSideReplaceMessageShortForm;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.SystemEventMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.messages.application.TradingActionMessage;
import omi.nasdaq.nomoptions.itto.itch.v4_0.types.Message;

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
            message = new OptionsDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'O') {
            message = new SecurityOpenMessage();
        } else if (messageType == 'a') {
            message = new AddOrderMessageShortMessageForm();
        } else if (messageType == 'A') {
            message = new AddOrderMessageLongFormMessage();
        } else if (messageType == 'j') {
            message = new AddQuoteMessageShortFormMessage();
        } else if (messageType == 'J') {
            message = new AddQuoteMessageLongFormMessage();
        } else if (messageType == 'E') {
            message = new SingleSideExecutedMessage();
        } else if (messageType == 'C') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (messageType == 'X') {
            message = new OrderCancelMessage();
        } else if (messageType == 'u') {
            message = new SingleSideReplaceMessageShortForm();
        } else if (messageType == 'U') {
            message = new SingleSideReplaceMessageLongForm();
        } else if (messageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (messageType == 'G') {
            message = new SingleSideChangeMessage();
        } else if (messageType == 'k') {
            message = new QuoteReplaceMessageShortForm();
        } else if (messageType == 'K') {
            message = new QuoteReplaceMessageLongForm();
        } else if (messageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (messageType == 'P') {
            message = new OptionsTradeMessagesNonAuction();
        } else if (messageType == 'Q') {
            message = new OptionsCrossTradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeOrderExecutedMessage();
        } else if (messageType == 'I') {
            message = new NoiiMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
