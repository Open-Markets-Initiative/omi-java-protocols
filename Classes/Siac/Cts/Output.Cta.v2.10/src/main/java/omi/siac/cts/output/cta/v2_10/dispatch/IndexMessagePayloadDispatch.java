package omi.siac.cts.output.cta.v2_10.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_10.messages.application.BidAndOfferIndexMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.Index;
import omi.siac.cts.output.cta.v2_10.types.Message;

/**
 * Selects the message a Index Message Payload branch holds by its Index Message Type.
 */
public final class IndexMessagePayloadDispatch {

    private IndexMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Index Message Type selects.
     *
     * @param indexMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char indexMessageType, byte[] data, int offset, int end) {
        Message message;
        if (indexMessageType == 'I') {
            message = new Index();
        } else if (indexMessageType == 'Q') {
            message = new BidAndOfferIndexMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
