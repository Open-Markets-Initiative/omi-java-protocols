package omi.siac.opra.input.obi.v5_0_i.dispatch;

import java.util.Optional;
import omi.siac.opra.input.obi.v5_0_i.messages.application.UnderlyingValueBidAndOfferMessage;
import omi.siac.opra.input.obi.v5_0_i.messages.application.UnderlyingValueLastSaleMessage;
import omi.siac.opra.input.obi.v5_0_i.types.Message;

/**
 * Selects the message a Underlying Value Message Message Payload branch holds by its Underlying Value Message Message Type.
 */
public final class UnderlyingValueMessageMessagePayloadDispatch {

    private UnderlyingValueMessageMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Underlying Value Message Message Type selects.
     *
     * @param underlyingValueMessageMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char underlyingValueMessageMessageType, byte[] data, int offset, int end) {
        Message message;
        if (underlyingValueMessageMessageType == ' ') {
            message = new UnderlyingValueLastSaleMessage();
        } else if (underlyingValueMessageMessageType == 'I') {
            message = new UnderlyingValueBidAndOfferMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
