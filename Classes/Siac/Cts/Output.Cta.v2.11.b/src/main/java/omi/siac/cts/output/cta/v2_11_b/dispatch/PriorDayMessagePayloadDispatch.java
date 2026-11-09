package omi.siac.cts.output.cta.v2_11_b.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_11_b.messages.application.FractionalPriorDayTradeCancelErrorMessage;
import omi.siac.cts.output.cta.v2_11_b.messages.application.FractionalPriorDayTradeCorrectionMessage;
import omi.siac.cts.output.cta.v2_11_b.messages.application.FractionalPriorDayTradeMessage;
import omi.siac.cts.output.cta.v2_11_b.messages.application.PriorDayTradeCancelErrorMessage;
import omi.siac.cts.output.cta.v2_11_b.messages.application.PriorDayTradeCorrectionMessage;
import omi.siac.cts.output.cta.v2_11_b.messages.application.PriorDayTradeMessage;
import omi.siac.cts.output.cta.v2_11_b.types.Message;

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
        } else if (priorDayMessageType == 'O') {
            message = new FractionalPriorDayTradeCorrectionMessage();
        } else if (priorDayMessageType == 'R') {
            message = new FractionalPriorDayTradeMessage();
        } else if (priorDayMessageType == 'E') {
            message = new FractionalPriorDayTradeCancelErrorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
