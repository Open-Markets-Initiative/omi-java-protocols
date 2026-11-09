package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.DebugPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.EndOfSession;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.LoginAcceptedPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.LoginRejectedPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.SequencedDataPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.ServerHeartbeat;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Server Packet Type.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
    }

    /**
     * Decodes the message a Server Packet Type selects.
     *
     * @param serverPacketType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char serverPacketType, byte[] data, int offset, int end) {
        Message message;
        if (serverPacketType == '+') {
            message = new DebugPacket();
        } else if (serverPacketType == 'A') {
            message = new LoginAcceptedPacket();
        } else if (serverPacketType == 'J') {
            message = new LoginRejectedPacket();
        } else if (serverPacketType == 'S') {
            message = new SequencedDataPacket();
        } else if (serverPacketType == 'H') {
            message = new ServerHeartbeat();
        } else if (serverPacketType == 'Z') {
            message = new EndOfSession();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
