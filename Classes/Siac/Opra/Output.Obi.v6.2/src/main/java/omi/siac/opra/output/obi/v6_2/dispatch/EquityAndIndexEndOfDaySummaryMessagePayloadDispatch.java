package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.EquityAndIndexEndOfDaySummaryMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Selects the message a Equity And Index End Of Day Summary Message Payload branch holds by its Equity And Index End Of Day Summary Message Type.
 */
public final class EquityAndIndexEndOfDaySummaryMessagePayloadDispatch {

    private EquityAndIndexEndOfDaySummaryMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Equity And Index End Of Day Summary Message Type selects.
     *
     * @param equityAndIndexEndOfDaySummaryMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char equityAndIndexEndOfDaySummaryMessageType, byte[] data, int offset, int end) {
        Message message;
        if (equityAndIndexEndOfDaySummaryMessageType == ' ') {
            message = new EquityAndIndexEndOfDaySummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
