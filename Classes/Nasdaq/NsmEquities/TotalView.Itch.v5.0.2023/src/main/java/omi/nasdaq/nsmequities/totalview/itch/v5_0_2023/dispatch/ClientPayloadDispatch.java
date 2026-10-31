package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.session.LoginRequestPacket;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Message;

/**
 * Selects the message a Client Payload branch holds by its Client Packet Type.
 *
 * <p>Messages it may select that this library does not decode: DebugPacket, UnsequencedDataPacket.</p>
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
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char clientPacketType, byte[] data, int offset) {
        Message message;
        if (clientPacketType == 'L') {
            message = new LoginRequestPacket();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
