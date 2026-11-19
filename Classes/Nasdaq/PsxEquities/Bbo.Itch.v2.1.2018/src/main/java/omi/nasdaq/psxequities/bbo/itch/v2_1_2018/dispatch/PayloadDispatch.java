package omi.nasdaq.psxequities.bbo.itch.v2_1_2018.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.MwcbStatusMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.NextSharesQuotationMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.OperationalHaltMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.QuotationMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.StockDirectoryMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.StockTradingActionMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.types.Message;

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
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbStatusMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else if (messageType == 'Q') {
            message = new QuotationMessage();
        } else if (messageType == 'A') {
            message = new NextSharesQuotationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
