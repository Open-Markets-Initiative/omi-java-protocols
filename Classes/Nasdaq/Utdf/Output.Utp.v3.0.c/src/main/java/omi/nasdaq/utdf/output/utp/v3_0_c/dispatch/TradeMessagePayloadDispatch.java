package omi.nasdaq.utdf.output.utp.v3_0_c.dispatch;

import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.FractionalAsOfTradeMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.FractionalTradeCancelErrorMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.FractionalTradeCorrectionMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.FractionalTradeReportMessageLongFormMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.FractionalTradeReportMessageShortFormMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.PriorDayAsOfTradeMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.TradeCorrectionMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.TradeReportMessageLongFormMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.TradeReportMessageShortFormMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;

/**
 * Selects the message a Trade Message Payload branch holds by its Trade Message Type.
 */
public final class TradeMessagePayloadDispatch {

    private TradeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Trade Message Type selects.
     *
     * @param tradeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char tradeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (tradeMessageType == 'A') {
            message = new TradeReportMessageShortFormMessage();
        } else if (tradeMessageType == 'W') {
            message = new TradeReportMessageLongFormMessage();
        } else if (tradeMessageType == 'Z') {
            message = new TradeCancelErrorMessage();
        } else if (tradeMessageType == 'Y') {
            message = new TradeCorrectionMessage();
        } else if (tradeMessageType == 'H') {
            message = new PriorDayAsOfTradeMessage();
        } else if (tradeMessageType == 'M') {
            message = new FractionalTradeReportMessageShortFormMessage();
        } else if (tradeMessageType == 'N') {
            message = new FractionalTradeReportMessageLongFormMessage();
        } else if (tradeMessageType == 'O') {
            message = new FractionalTradeCancelErrorMessage();
        } else if (tradeMessageType == 'P') {
            message = new FractionalTradeCorrectionMessage();
        } else if (tradeMessageType == 'Q') {
            message = new FractionalAsOfTradeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
