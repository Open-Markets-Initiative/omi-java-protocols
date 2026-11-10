package omi.siac.cts.output.cta.v2_9.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_9.messages.application.EndOfEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.EndOfStartOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.StartOfEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.StartOfStartOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_9.types.Message;

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
            message = new StartOfEndOfDaySummaryMessage();
        } else if (administrativeMessageType == 'B') {
            message = new EndOfEndOfDaySummaryMessage();
        } else if (administrativeMessageType == 'C') {
            message = new StartOfStartOfDaySummaryMessage();
        } else if (administrativeMessageType == 'D') {
            message = new EndOfStartOfDaySummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
