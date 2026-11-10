package omi.miax.pearlequities.expressorders.meo.v2_6.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.ClientHeartbeat;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.GoodbyePacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LoginRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LoginResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.LogoutRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.RetransmissionRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.ServerHeartbeat;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.SynchronizationComplete;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.TestPacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.session.TradingSessionUpdate;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

/**
 * Selects the message a Esesm Payload branch holds by its Esesm Packet Type.
 *
 * <p>Messages it may select that this library does not decode: SequencedDataPacket, UnsequencedDataPacket.</p>
 */
public final class EsesmPayloadDispatch {

    private EsesmPayloadDispatch() {
    }

    /**
     * Decodes the message a Esesm Packet Type selects.
     *
     * @param esesmPacketType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char esesmPacketType, byte[] data, int offset, int end) {
        Message message;
        if (esesmPacketType == 'l') {
            message = new LoginRequest();
        } else if (esesmPacketType == 'r') {
            message = new LoginResponse();
        } else if (esesmPacketType == 'c') {
            message = new SynchronizationComplete();
        } else if (esesmPacketType == 'a') {
            message = new RetransmissionRequest();
        } else if (esesmPacketType == 'X') {
            message = new LogoutRequest();
        } else if (esesmPacketType == 'G') {
            message = new GoodbyePacket();
        } else if (esesmPacketType == 'u') {
            message = new TradingSessionUpdate();
        } else if (esesmPacketType == '0') {
            message = new ServerHeartbeat();
        } else if (esesmPacketType == '1') {
            message = new ClientHeartbeat();
        } else if (esesmPacketType == 'T') {
            message = new TestPacket();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
