package omi.memx.memxequities.commonheader.tcp.v1_2.dispatch;

import java.util.Optional;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.LoginRequestMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.ReplayAllRequestMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.ReplayRequestMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.StreamRequestMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.UnsequencedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.types.Message;

/**
 * Selects the message a Client Data branch holds by its Message Type.
 */
public final class ClientDataDispatch {

    private ClientDataDispatch() {
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
        if (messageType == 100L) {
            message = new LoginRequestMessage();
        } else if (messageType == 101L) {
            message = new ReplayRequestMessage();
        } else if (messageType == 102L) {
            message = new ReplayAllRequestMessage();
        } else if (messageType == 103L) {
            message = new StreamRequestMessage();
        } else if (messageType == 104L) {
            message = new UnsequencedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
