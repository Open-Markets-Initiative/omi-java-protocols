package omi.nasdaq.nsmequities.nlsplus.itch.v4_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.AdjustedClosingPriceMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.EndOfDayTradeSummaryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.IpoInformationMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.MwcbStatusMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.messages.application.TradeReportMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v4_0.types.Message;

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
        } else if (messageType == 'e') {
            message = new TradeReportMessage();
        } else if (messageType == 'o') {
            message = new TradeCancelErrorMessage();
        } else if (messageType == 'b') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'g') {
            message = new AdjustedClosingPriceMessage();
        } else if (messageType == 'p') {
            message = new EndOfDayTradeSummaryMessage();
        } else if (messageType == 'i') {
            message = new IpoInformationMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbStatusMessage();
        } else if (messageType == 'k') {
            message = new IpoQuotingPeriodUpdateMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
