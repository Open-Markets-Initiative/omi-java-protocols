package omi.jpx.tseequities.tostnet.flex.v19_5.dispatch;

import java.util.Optional;
import omi.jpx.tseequities.tostnet.flex.v19_5.messages.application.ControlMessage;
import omi.jpx.tseequities.tostnet.flex.v19_5.messages.application.TostnetByissueInformationMessage;
import omi.jpx.tseequities.tostnet.flex.v19_5.messages.application.TostnetMarketInformationMessage;
import omi.jpx.tseequities.tostnet.flex.v19_5.types.Message;

/**
 * Selects the message a Payload branch holds by its Tag ID.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Tag ID selects.
     *
     * @param tagId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String tagId, byte[] data, int offset, int end) {
        Message message;
        if ("TI".equals(tagId)) {
            message = new TostnetByissueInformationMessage();
        } else if ("TM".equals(tagId)) {
            message = new TostnetMarketInformationMessage();
        } else if ("LC".equals(tagId)) {
            message = new ControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
