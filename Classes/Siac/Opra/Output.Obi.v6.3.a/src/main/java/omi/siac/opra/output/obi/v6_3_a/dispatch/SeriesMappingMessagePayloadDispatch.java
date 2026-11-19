package omi.siac.opra.output.obi.v6_3_a.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_3_a.messages.application.SeriesMappingMessage;
import omi.siac.opra.output.obi.v6_3_a.types.Message;

/**
 * Selects the message a Series Mapping Message Payload branch holds by its Series Mapping Message Type.
 */
public final class SeriesMappingMessagePayloadDispatch {

    private SeriesMappingMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Series Mapping Message Type selects.
     *
     * @param seriesMappingMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char seriesMappingMessageType, byte[] data, int offset, int end) {
        Message message;
        if (seriesMappingMessageType == ' ') {
            message = new SeriesMappingMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
