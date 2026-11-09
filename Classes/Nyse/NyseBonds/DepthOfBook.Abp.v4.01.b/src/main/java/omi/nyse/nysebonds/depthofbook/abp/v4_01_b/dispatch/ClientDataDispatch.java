package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.dispatch;

import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.session.HeartbeatResponseMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.session.LoginMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.session.LogoffMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.session.TestRequestMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;

/**
 * Selects the message a Client Data branch holds by its Client Message Type.
 */
public final class ClientDataDispatch {

    private ClientDataDispatch() {
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
    public static Optional<Message> decode(char clientMessageType, byte[] data, int offset, int end) {
        Message message;
        if (clientMessageType == 'L') {
            message = new LoginMessage();
        } else if (clientMessageType == 'O') {
            message = new LogoffMessage();
        } else if (clientMessageType == 'H') {
            message = new HeartbeatResponseMessage();
        } else if (clientMessageType == 'T') {
            message = new TestRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
