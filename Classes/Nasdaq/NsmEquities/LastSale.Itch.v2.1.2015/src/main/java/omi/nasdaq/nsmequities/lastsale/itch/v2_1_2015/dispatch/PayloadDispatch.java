package omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.AdjustedClosingPriceMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.EtmfTradeCancelErrorMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.EtmfTradeCorrectionMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.EtmfTradeReportMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.MwcbStatusMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.messages.application.TradeReportMessage;
import omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.types.Message;

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
            message = new EtmfTradeReportMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelErrorMessage();
        } else if (messageType == 'O') {
            message = new EtmfTradeCancelErrorMessage();
        } else if (messageType == 'C') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'Z') {
            message = new EtmfTradeCorrectionMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'G') {
            message = new AdjustedClosingPriceMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbStatusMessage();
        } else if (messageType == 'K') {
            message = new IpoQuotingPeriodUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
