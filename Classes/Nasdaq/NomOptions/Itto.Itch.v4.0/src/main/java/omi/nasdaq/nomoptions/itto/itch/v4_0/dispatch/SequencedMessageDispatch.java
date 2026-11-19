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
            message = new OptionsDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'O') {
            message = new SecurityOpenMessage();
        } else if (sequencedMessageType == 'a') {
            message = new AddOrderMessageShortMessageForm();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessageLongFormMessage();
        } else if (sequencedMessageType == 'j') {
            message = new AddQuoteMessageShortFormMessage();
        } else if (sequencedMessageType == 'J') {
            message = new AddQuoteMessageLongFormMessage();
        } else if (sequencedMessageType == 'E') {
            message = new SingleSideExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new SingleSideExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderCancelMessage();
        } else if (sequencedMessageType == 'u') {
            message = new SingleSideReplaceMessageShortForm();
        } else if (sequencedMessageType == 'U') {
            message = new SingleSideReplaceMessageLongForm();
        } else if (sequencedMessageType == 'D') {
            message = new SingleSideDeleteMessage();
        } else if (sequencedMessageType == 'G') {
            message = new SingleSideChangeMessage();
        } else if (sequencedMessageType == 'k') {
            message = new QuoteReplaceMessageShortForm();
        } else if (sequencedMessageType == 'K') {
            message = new QuoteReplaceMessageLongForm();
        } else if (sequencedMessageType == 'Y') {
            message = new QuoteDeleteMessage();
        } else if (sequencedMessageType == 'P') {
            message = new OptionsTradeMessagesNonAuction();
        } else if (sequencedMessageType == 'Q') {
            message = new OptionsCrossTradeMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeOrderExecutedMessage();
        } else if (sequencedMessageType == 'I') {
            message = new NoiiMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
