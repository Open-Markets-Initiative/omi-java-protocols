package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.dispatch;

import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.ClientSeqMsg;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.Close;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.Heartbeat;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.LoginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.Open;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;

/**
 * Selects the message a Client Message branch holds by its Msg Type.
 */
public final class ClientMessageDispatch {

    private ClientMessageDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 513L) {
            message = new LoginMessage();
        } else if (msgType == 516L) {
            message = new Heartbeat();
        } else if (msgType == 517L) {
            message = new Open();
        } else if (msgType == 519L) {
            message = new Close();
        } else if (msgType == 2309L) {
            message = new ClientSeqMsg();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
