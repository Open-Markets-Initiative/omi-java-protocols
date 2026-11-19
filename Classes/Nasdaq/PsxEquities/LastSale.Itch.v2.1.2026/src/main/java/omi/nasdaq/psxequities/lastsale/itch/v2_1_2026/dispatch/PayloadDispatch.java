package omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.dispatch;

import java.util.Optional;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.MwcbBreachMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.NextSharesTradeReportMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.OperationalHaltMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.StockDirectoryMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.SystemEventMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradeCancelErrorForNextSharesMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradeCorrectionForNextSharesMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradeCorrectionMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradeReportMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.messages.application.TradingActionMessage;
import omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.types.Message;

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
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'M') {
            message = new NextSharesTradeReportMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelErrorMessage();
        } else if (messageType == 'O') {
            message = new TradeCancelErrorForNextSharesMessage();
        } else if (messageType == 'C') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'Z') {
            message = new TradeCorrectionForNextSharesMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbBreachMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
