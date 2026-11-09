package omi.siac.cts.output.cta.v2_9.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_9.messages.application.PriorDayTradeCancelErrorMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.PriorDayTradeCorrectionMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.PriorDayTradeMessage;
import omi.siac.cts.output.cta.v2_9.types.Message;

/**
 * Selects the message a Prior Day Message Payload branch holds by its Prior Day Message Type.
 */
public final class PriorDayMessagePayloadDispatch {

    private PriorDayMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Prior Day Message Type selects.
     *
     * @param priorDayMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char priorDayMessageType, byte[] data, int offset, int end) {
        Message message;
        if (priorDayMessageType == 'C') {
            message = new PriorDayTradeCorrectionMessage();
        } else if (priorDayMessageType == 'T') {
            message = new PriorDayTradeMessage();
        } else if (priorDayMessageType == 'X') {
            message = new PriorDayTradeCancelErrorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
