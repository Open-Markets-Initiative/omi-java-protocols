package omi.hkex.hkexsecurities.indexrefresh.omd.v1_45.dispatch;

import java.util.Optional;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_45.messages.application.IndexDataMessage;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_45.messages.application.IndexDefinitionMessage;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_45.messages.application.RefreshCompleteMessage;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_45.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 70L) {
            message = new IndexDefinitionMessage();
        } else if (msgType == 71L) {
            message = new IndexDataMessage();
        } else if (msgType == 203L) {
            message = new RefreshCompleteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
