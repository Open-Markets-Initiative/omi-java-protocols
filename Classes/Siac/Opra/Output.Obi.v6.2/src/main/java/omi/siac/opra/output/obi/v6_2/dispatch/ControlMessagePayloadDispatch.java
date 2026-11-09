package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.ControlMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

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
        if (controlMessageType == 'C') {
            message = new ControlMessage();
        } else if (controlMessageType == 'E') {
            message = new ControlMessage();
        } else if (controlMessageType == 'F') {
            message = new ControlMessage();
        } else if (controlMessageType == 'J') {
            message = new ControlMessage();
        } else if (controlMessageType == 'K') {
            message = new ControlMessage();
        } else if (controlMessageType == 'L') {
            message = new ControlMessage();
        } else if (controlMessageType == 'M') {
            message = new ControlMessage();
        } else if (controlMessageType == 'N') {
            message = new ControlMessage();
        } else if (controlMessageType == 'P') {
            message = new ControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
