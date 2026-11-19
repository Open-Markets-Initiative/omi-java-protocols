package omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.messages.application.TradeReportMessage;
import omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_0_2010.types.Message;

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
        } else if (messageType == 'X') {
            message = new TradeCancelErrorMessage();
        } else if (messageType == 'C') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
