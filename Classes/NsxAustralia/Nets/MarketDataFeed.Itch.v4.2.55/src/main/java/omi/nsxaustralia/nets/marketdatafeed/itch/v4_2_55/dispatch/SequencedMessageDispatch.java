package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.dispatch;

import java.util.Optional;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.AddOrderMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.BrokenTradeMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.FirmDirectoryMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.IndexMemberDirectoryMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.IndexValueMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.IndicativePriceQuantityMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.NewsMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderDeleteMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderExecutedMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderExecutedWithPriceMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderReplaceMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderbookAttributeMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderbookDirectoryMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.OrderbookTradingActionMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.PriceTickSizeMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.QuantityTickSizeMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.SystemEventMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.TimestampMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application.TradeMessage;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.Message;

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
            message = new TimestampMessage();
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
        } else if (sequencedMessageType == 'X') {
            message = new OrderbookAttributeMessage();
        } else if (sequencedMessageType == 'F') {
            message = new FirmDirectoryMessage();
        } else if (sequencedMessageType == 'A') {
            message = new AddOrderMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (sequencedMessageType == 'I') {
            message = new IndicativePriceQuantityMessage();
        } else if (sequencedMessageType == 'P') {
            message = new TradeMessage();
        } else if (sequencedMessageType == 'N') {
            message = new NewsMessage();
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
