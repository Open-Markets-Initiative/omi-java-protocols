package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.dispatch;

import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application.LoginMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application.LogoutMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application.RetransmissionRequestMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;

/**
 * Selects the message a Client Message Body branch holds by its Client Message Type.
 */
public final class ClientMessageBodyDispatch {

    private ClientMessageBodyDispatch() {
    }

    /**
     * Decodes the message a Client Message Type selects.
     *
     * @param clientMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String clientMessageType, byte[] data, int offset, int end) {
        Message message;
        if ("LI".equals(clientMessageType)) {
            message = new LoginMessage();
        } else if ("LO".equals(clientMessageType)) {
            message = new LogoutMessage();
        } else if ("RT".equals(clientMessageType)) {
            message = new RetransmissionRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
