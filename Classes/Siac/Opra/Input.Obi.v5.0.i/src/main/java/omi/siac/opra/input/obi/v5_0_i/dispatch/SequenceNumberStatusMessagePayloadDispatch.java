package omi.siac.opra.input.obi.v5_0_i.dispatch;

import java.util.Optional;
import omi.siac.opra.input.obi.v5_0_i.messages.application.BlockSequenceNumberStatusInquiryRequestMessage;
import omi.siac.opra.input.obi.v5_0_i.messages.application.BlockSequenceNumberStatusResponseMessage;
import omi.siac.opra.input.obi.v5_0_i.messages.application.MessageCountStatusInquiryRequestMessage;
import omi.siac.opra.input.obi.v5_0_i.messages.application.MessageCountStatusResponseMessage;
import omi.siac.opra.input.obi.v5_0_i.types.Message;

/**
 * Selects the message a Sequence Number Status Message Payload branch holds by its Sequence Number Status Message Type.
 */
public final class SequenceNumberStatusMessagePayloadDispatch {

    private SequenceNumberStatusMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Sequence Number Status Message Type selects.
     *
     * @param sequenceNumberStatusMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequenceNumberStatusMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequenceNumberStatusMessageType == 'L') {
            message = new BlockSequenceNumberStatusInquiryRequestMessage();
        } else if (sequenceNumberStatusMessageType == 'M') {
            message = new BlockSequenceNumberStatusResponseMessage();
        } else if (sequenceNumberStatusMessageType == 'R') {
            message = new MessageCountStatusInquiryRequestMessage();
        } else if (sequenceNumberStatusMessageType == 'S') {
            message = new MessageCountStatusResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
