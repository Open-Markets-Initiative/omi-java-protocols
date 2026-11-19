package omi.tadawul.saudiexchange.totalview.itch.v1_9.dispatch;

import java.util.Optional;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.AddOrderMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.IndexMemberDirectoryMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.IndexValueMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.IndicativePriceQuantityMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderDeleteMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderExecutedMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderExecutedWithPriceMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderReplaceMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderbookDirectoryMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderbookPriceMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.OrderbookTradingActionMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.PriceTickSizeMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.QuantityTickSizeMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.SystemEventMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.TimestampSecondsMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.TradeMessage;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.types.Message;

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
            message = new TimestampSecondsMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (sequencedMessageType == 'M') {
            message = new QuantityTickSizeMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new OrderbookTradingActionMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'P') {
            message = new TradeMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (sequencedMessageType == 'I') {
            message = new IndicativePriceQuantityMessage();
        } else if (sequencedMessageType == 'X') {
            message = new OrderbookPriceMessage();
        } else if (sequencedMessageType == 'Y') {
            message = new IndexMemberDirectoryMessage();
        } else if (sequencedMessageType == 'Z') {
            message = new IndexValueMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
