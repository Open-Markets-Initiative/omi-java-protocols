package omi.jpx.nseequities.marketbyorder.flex.v1_3.dispatch;

import java.util.Optional;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.EndOfMessageMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.LoginRequestRetransmissionMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.LoginRequestSnapshotMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.LoginResultAcceptedMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.LoginResultRejectedMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application.MessageResponseMessage;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.types.Message;

/**
 * Selects the message a Tcp Payload branch holds by its Packet Type.
 */
public final class TcpPayloadDispatch {

    private TcpPayloadDispatch() {
    }

    /**
     * Decodes the message a Packet Type selects.
     *
     * @param packetType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char packetType, byte[] data, int offset, int end) {
        Message message;
        if (packetType == 'R') {
            message = new LoginRequestRetransmissionMessage();
        } else if (packetType == 'L') {
            message = new LoginRequestSnapshotMessage();
        } else if (packetType == 'A') {
            message = new LoginResultAcceptedMessage();
        } else if (packetType == 'J') {
            message = new LoginResultRejectedMessage();
        } else if (packetType == 'S') {
            message = new MessageResponseMessage();
        } else if (packetType == 'G') {
            message = new EndOfMessageMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
