package omi.siac.cqs.snapshot.cta.v1_0.dispatch;

import java.util.Optional;
import omi.siac.cqs.snapshot.cta.v1_0.messages.application.ConsolidatedSnapshotMessage;
import omi.siac.cqs.snapshot.cta.v1_0.messages.application.FinraSnapshotMessage;
import omi.siac.cqs.snapshot.cta.v1_0.messages.application.LineIntegrityMessage;
import omi.siac.cqs.snapshot.cta.v1_0.messages.application.MarketWideCircuitBreakerDeclineLevelStatusSnapshotMessage;
import omi.siac.cqs.snapshot.cta.v1_0.messages.application.ParticipantSnapshotMessage;
import omi.siac.cqs.snapshot.cta.v1_0.types.Message;

/**
 * Selects the message a Snapshot Message Payload branch holds by its Snapshot Message Type.
 */
public final class SnapshotMessagePayloadDispatch {

    private SnapshotMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Snapshot Message Type selects.
     *
     * @param snapshotMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char snapshotMessageType, byte[] data, int offset, int end) {
        Message message;
        if (snapshotMessageType == 'T') {
            message = new LineIntegrityMessage();
        } else if (snapshotMessageType == 'K') {
            message = new MarketWideCircuitBreakerDeclineLevelStatusSnapshotMessage();
        } else if (snapshotMessageType == 'C') {
            message = new ConsolidatedSnapshotMessage();
        } else if (snapshotMessageType == 'P') {
            message = new ParticipantSnapshotMessage();
        } else if (snapshotMessageType == 'F') {
            message = new FinraSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
