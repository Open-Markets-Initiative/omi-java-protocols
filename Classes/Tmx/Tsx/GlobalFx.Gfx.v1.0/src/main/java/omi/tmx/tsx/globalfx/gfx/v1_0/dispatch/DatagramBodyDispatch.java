package omi.tmx.tsx.globalfx.gfx.v1_0.dispatch;

import java.util.Optional;
import omi.tmx.tsx.globalfx.gfx.v1_0.messages.application.ReferencePriceFxSpot;
import omi.tmx.tsx.globalfx.gfx.v1_0.types.Message;

/**
 * Selects the message a Datagram Body branch holds by its Msg Type.
 */
public final class DatagramBodyDispatch {

    private DatagramBodyDispatch() {
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
    public static Optional<Message> decode(char msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == '#') {
            message = new ReferencePriceFxSpot();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
