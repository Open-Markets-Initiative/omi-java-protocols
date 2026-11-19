package omi.finra.finraorf.tdds.dfi.v2_1.dispatch;

import java.util.Optional;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.ClosingTradeSummaryReportMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.GeneralAdministrativeMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.MarketWideCircuitBreakerEventMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.TradingActionMessage;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;

/**
 * Selects the message a Administrative Message Payload branch holds by its Administrative Message Type.
 */
public final class AdministrativeMessagePayloadDispatch {

    private AdministrativeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Administrative Message Type selects.
     *
     * @param administrativeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char administrativeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (administrativeMessageType == 'A') {
            message = new GeneralAdministrativeMessage();
        } else if (administrativeMessageType == '2') {
            message = new ClosingTradeSummaryReportMessage();
        } else if (administrativeMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (administrativeMessageType == 'M') {
            message = new MarketWideCircuitBreakerEventMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
