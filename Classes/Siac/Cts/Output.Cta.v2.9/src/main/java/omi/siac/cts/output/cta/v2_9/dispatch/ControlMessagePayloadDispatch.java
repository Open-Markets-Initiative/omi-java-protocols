package omi.siac.cts.output.cta.v2_9.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_9.messages.application.DisasterRecoveryDataCenterActivationMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.EndOfDayMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.LineIntegrityMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.ResetBlockSequenceNumberMessage;
import omi.siac.cts.output.cta.v2_9.messages.application.StartOfDayMessage;
import omi.siac.cts.output.cta.v2_9.types.Message;

/**
 * Selects the message a Control Message Payload branch holds by its Control Message Type.
 */
public final class ControlMessagePayloadDispatch {

    private ControlMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Control Message Type selects.
     *
     * @param controlMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char controlMessageType, byte[] data, int offset, int end) {
        Message message;
        if (controlMessageType == 'A') {
            message = new StartOfDayMessage();
        } else if (controlMessageType == 'L') {
            message = new ResetBlockSequenceNumberMessage();
        } else if (controlMessageType == 'P') {
            message = new DisasterRecoveryDataCenterActivationMessage();
        } else if (controlMessageType == 'T') {
            message = new LineIntegrityMessage();
        } else if (controlMessageType == 'Z') {
            message = new EndOfDayMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
