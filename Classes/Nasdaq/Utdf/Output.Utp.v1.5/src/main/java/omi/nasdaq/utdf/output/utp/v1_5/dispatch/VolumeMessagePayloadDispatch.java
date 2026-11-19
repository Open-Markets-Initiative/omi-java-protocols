package omi.nasdaq.utdf.output.utp.v1_5.dispatch;

import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v1_5.messages.application.TotalConsolidatedAndMarketCenterVolumeMessage;
import omi.nasdaq.utdf.output.utp.v1_5.types.Message;

/**
 * Selects the message a Volume Message Payload branch holds by its Volume Message Type.
 */
public final class VolumeMessagePayloadDispatch {

    private VolumeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Volume Message Type selects.
     *
     * @param volumeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char volumeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (volumeMessageType == 'M') {
            message = new TotalConsolidatedAndMarketCenterVolumeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
