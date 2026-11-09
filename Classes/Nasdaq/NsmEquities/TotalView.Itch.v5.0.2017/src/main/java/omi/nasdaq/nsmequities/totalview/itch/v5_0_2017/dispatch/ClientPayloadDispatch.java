package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.ClientHeartbeat;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.DebugPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.LoginRequestPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.LogoutRequest;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.session.UnsequencedDataPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Client Packet Type.
 */
public final class ClientPayloadDispatch {

    private ClientPayloadDispatch() {
    }

    /**
     * Decodes the message a Client Packet Type selects.
     *
     * @param clientPacketType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char clientPacketType, byte[] data, int offset, int end) {
        Message message;
        if (clientPacketType == '+') {
            message = new DebugPacket();
        } else if (clientPacketType == 'L') {
            message = new LoginRequestPacket();
        } else if (clientPacketType == 'U') {
            message = new UnsequencedDataPacket();
        } else if (clientPacketType == 'R') {
            message = new ClientHeartbeat();
        } else if (clientPacketType == 'O') {
            message = new LogoutRequest();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
