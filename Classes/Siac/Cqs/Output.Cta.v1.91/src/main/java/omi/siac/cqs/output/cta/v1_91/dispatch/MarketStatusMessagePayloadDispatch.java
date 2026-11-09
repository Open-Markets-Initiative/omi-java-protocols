package omi.siac.cqs.output.cta.v1_91.dispatch;

import java.util.Optional;
import omi.siac.cqs.output.cta.v1_91.messages.application.MarketWideCircuitBreakerDeclineLevelStatusMessage;
import omi.siac.cqs.output.cta.v1_91.messages.application.MarketWideCircuitBreakerStatusMessage;
import omi.siac.cqs.output.cta.v1_91.types.Message;

/**
 * Selects the message a Market Status Message Payload branch holds by its Market Status Message Type.
 */
public final class MarketStatusMessagePayloadDispatch {

    private MarketStatusMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Market Status Message Type selects.
     *
     * @param marketStatusMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char marketStatusMessageType, byte[] data, int offset, int end) {
        Message message;
        if (marketStatusMessageType == 'K') {
            message = new MarketWideCircuitBreakerDeclineLevelStatusMessage();
        } else if (marketStatusMessageType == 'L') {
            message = new MarketWideCircuitBreakerStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
