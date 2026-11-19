package omi.otcmarkets.linkats.referencedata.link.v4_10_4.dispatch;

import java.util.Optional;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.messages.application.EndOfSpinMessage;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.messages.application.ExtendedSecurityMessage;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.messages.application.MarketCloseMessage;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.messages.application.MarketOpenMessage;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.messages.application.StartOfSpinMessage;
import omi.otcmarkets.linkats.referencedata.link.v4_10_4.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 11L) {
            message = new StartOfSpinMessage();
        } else if (messageType == 12L) {
            message = new EndOfSpinMessage();
        } else if (messageType == 13L) {
            message = new MarketOpenMessage();
        } else if (messageType == 14L) {
            message = new MarketCloseMessage();
        } else if (messageType == 15L) {
            message = new ExtendedSecurityMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
