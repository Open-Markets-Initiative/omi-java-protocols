package omi.finra.finraorf.tdds.dfi.v2_1.dispatch;

import java.util.Optional;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.TradeCancelErrorMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.TradeCorrectionMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.TradeReportLongFormMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.TradeReportShortFormMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;

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
        if (tradeMessageType == '5') {
            message = new TradeReportShortFormMessage();
        } else if (tradeMessageType == '6') {
            message = new TradeReportLongFormMessage();
        } else if (tradeMessageType == '7') {
            message = new TradeCancelErrorMessage();
        } else if (tradeMessageType == '8') {
            message = new TradeCorrectionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
