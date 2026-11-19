package omi.nasdaq.utdf.output.utp.v3_0_c.dispatch;

import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.TotalConsolidatedAndMarketCenterVolumeMessage;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;

/**
 * Selects the message a Total Consolidated Volume Message Payload branch holds by its Total Consolidated Volume Message Type.
 */
public final class TotalConsolidatedVolumeMessagePayloadDispatch {

    private TotalConsolidatedVolumeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Total Consolidated Volume Message Type selects.
     *
     * @param totalConsolidatedVolumeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char totalConsolidatedVolumeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (totalConsolidatedVolumeMessageType == 'V') {
            message = new TotalConsolidatedAndMarketCenterVolumeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
