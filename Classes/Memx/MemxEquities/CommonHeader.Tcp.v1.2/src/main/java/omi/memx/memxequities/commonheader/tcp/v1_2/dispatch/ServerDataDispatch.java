package omi.memx.memxequities.commonheader.tcp.v1_2.dispatch;

import java.util.Optional;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.LoginAcceptedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.LoginRejectedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.ReplayBeginMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.ReplayCompleteMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.ReplayRejectedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.SequencedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.StartOfSessionMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.StreamBeginMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.StreamCompleteMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.StreamRejectedMessage;
import omi.memx.memxequities.commonheader.tcp.v1_2.types.Message;

/**
 * Selects the message a Server Data branch holds by its Message Type.
 */
public final class ServerDataDispatch {

    private ServerDataDispatch() {
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
        if (messageType == 1L) {
            message = new LoginAcceptedMessage();
        } else if (messageType == 2L) {
            message = new LoginRejectedMessage();
        } else if (messageType == 3L) {
            message = new StartOfSessionMessage();
        } else if (messageType == 5L) {
            message = new ReplayBeginMessage();
        } else if (messageType == 6L) {
            message = new ReplayRejectedMessage();
        } else if (messageType == 7L) {
            message = new ReplayCompleteMessage();
        } else if (messageType == 8L) {
            message = new StreamBeginMessage();
        } else if (messageType == 9L) {
            message = new StreamRejectedMessage();
        } else if (messageType == 10L) {
            message = new StreamCompleteMessage();
        } else if (messageType == 11L) {
            message = new SequencedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
