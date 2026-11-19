package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.dispatch;

import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application.ErrorMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application.LoginAcknowledgementMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application.LogoutAcknowledgementMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application.RetransmissionBeginMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application.RetransmissionEndMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;

/**
 * Selects the message a Server Message branch holds by its Message Type.
 *
 * <p>Messages it may select that this library does not decode: RetransmittedMessage.</p>
 */
public final class ServerMessageDispatch {

    private ServerMessageDispatch() {
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
    public static Optional<Message> decode(String messageType, byte[] data, int offset, int end) {
        Message message;
        if ("KI".equals(messageType)) {
            message = new LoginAcknowledgementMessage();
        } else if ("KO".equals(messageType)) {
            message = new LogoutAcknowledgementMessage();
        } else if ("RB".equals(messageType)) {
            message = new RetransmissionBeginMessage();
        } else if ("RE".equals(messageType)) {
            message = new RetransmissionEndMessage();
        } else if ("ER".equals(messageType)) {
            message = new ErrorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
