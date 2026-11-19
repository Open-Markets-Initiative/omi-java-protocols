package omi.pse.pseequities.basicwithlastsale.itch.v2_3.dispatch;

import java.util.Optional;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.BboQuotationMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.OrderbookDirectoryMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.OrderbookRestrictionsMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.OrderbookTradingActionMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.PriceTickSizeMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.QuantityTickSizeMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.SystemEventMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.TimeStampSecondsMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.TradeMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.TradeWithBrokerIdMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application.TradingScheduleMessage;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.Message;

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
            message = new TimeStampSecondsMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 's') {
            message = new TradingScheduleMessage();
        } else if (messageType == 'L') {
            message = new PriceTickSizeMessage();
        } else if (messageType == 'M') {
            message = new QuantityTickSizeMessage();
        } else if (messageType == 'R') {
            message = new OrderbookDirectoryMessage();
        } else if (messageType == 'k') {
            message = new OrderbookRestrictionsMessage();
        } else if (messageType == 'H') {
            message = new OrderbookTradingActionMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'p') {
            message = new TradeWithBrokerIdMessage();
        } else if (messageType == 'O') {
            message = new BboQuotationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
