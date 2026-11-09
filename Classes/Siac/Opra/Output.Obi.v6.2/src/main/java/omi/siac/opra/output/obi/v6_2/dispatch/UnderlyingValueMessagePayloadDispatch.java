package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.messages.application.UnderlyingValueBidAndOfferMessage;
import omi.siac.opra.output.obi.v6_2.messages.application.UnderlyingValueLastSaleMessage;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Selects the message a Underlying Value Message Payload branch holds by its Underlying Value Message Type.
 */
public final class UnderlyingValueMessagePayloadDispatch {

    private UnderlyingValueMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Underlying Value Message Type selects.
     *
     * @param underlyingValueMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char underlyingValueMessageType, byte[] data, int offset, int end) {
        Message message;
        if (underlyingValueMessageType == ' ') {
            message = new UnderlyingValueLastSaleMessage();
        } else if (underlyingValueMessageType == 'I') {
            message = new UnderlyingValueBidAndOfferMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
