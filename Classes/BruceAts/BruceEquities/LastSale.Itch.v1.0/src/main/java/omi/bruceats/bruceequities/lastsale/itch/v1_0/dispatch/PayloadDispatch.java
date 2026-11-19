package omi.bruceats.bruceequities.lastsale.itch.v1_0.dispatch;

import java.util.Optional;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.RegShoShortSalePriceTestRestrictedIndicator;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.StockDirectory;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.StockTradingAction;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.SystemEventMessage;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.TradeCancelMessage;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.messages.application.TradeReportMessage;
import omi.bruceats.bruceequities.lastsale.itch.v1_0.types.Message;

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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectory();
        } else if (messageType == 'H') {
            message = new StockTradingAction();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicator();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
