package omi.siac.cts.output.cta.v2_10.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_10.messages.application.ConsolidatedEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.ConsolidatedStartOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalConsolidatedEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalParticipantEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.ParticipantEndOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.ParticipantStartOfDaySummaryMessage;
import omi.siac.cts.output.cta.v2_10.types.Message;

/**
 * Selects the message a Summary Message Payload branch holds by its Summary Message Type.
 */
public final class SummaryMessagePayloadDispatch {

    private SummaryMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Summary Message Type selects.
     *
     * @param summaryMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char summaryMessageType, byte[] data, int offset, int end) {
        Message message;
        if (summaryMessageType == 'A') {
            message = new ConsolidatedStartOfDaySummaryMessage();
        } else if (summaryMessageType == 'B') {
            message = new ParticipantStartOfDaySummaryMessage();
        } else if (summaryMessageType == 'C') {
            message = new ConsolidatedEndOfDaySummaryMessage();
        } else if (summaryMessageType == 'T') {
            message = new FractionalConsolidatedEndOfDaySummaryMessage();
        } else if (summaryMessageType == 'D') {
            message = new ParticipantEndOfDaySummaryMessage();
        } else if (summaryMessageType == 'P') {
            message = new FractionalParticipantEndOfDaySummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
