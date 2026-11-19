package omi.nasdaq.gapdetection.utp.v2.dispatch;

import java.util.Optional;
import omi.nasdaq.gapdetection.utp.v2.messages.application.SequencedDataPacket;
import omi.nasdaq.gapdetection.utp.v2.messages.application.UnsequencedDataPacket;
import omi.nasdaq.gapdetection.utp.v2.messages.session.DebugPacket;
import omi.nasdaq.gapdetection.utp.v2.messages.session.LoginAcceptedPacket;
import omi.nasdaq.gapdetection.utp.v2.messages.session.LoginRejectedPacket;
import omi.nasdaq.gapdetection.utp.v2.messages.session.LoginRequestPacket;
import omi.nasdaq.gapdetection.utp.v2.types.Message;

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
        if (packetType == 'S') {
            message = new SequencedDataPacket();
        } else if (packetType == 'U') {
            message = new UnsequencedDataPacket();
        } else if (packetType == '+') {
            message = new DebugPacket();
        } else if (packetType == 'L') {
            message = new LoginRequestPacket();
        } else if (packetType == 'A') {
            message = new LoginAcceptedPacket();
        } else if (packetType == 'J') {
            message = new LoginRejectedPacket();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
