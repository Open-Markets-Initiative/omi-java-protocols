package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.dispatch;

import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.CloseResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.Heartbeat;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.LoginResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.OpenResponse;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.ServerSeqMsg;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session.StreamAvail;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;

/**
 * Selects the message a Server Message branch holds by its Msg Type.
 */
public final class ServerMessageDispatch {

    private ServerMessageDispatch() {
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
        if (msgType == 514L) {
            message = new LoginResponse();
        } else if (msgType == 515L) {
            message = new StreamAvail();
        } else if (msgType == 516L) {
            message = new Heartbeat();
        } else if (msgType == 518L) {
            message = new OpenResponse();
        } else if (msgType == 520L) {
            message = new CloseResponse();
        } else if (msgType == 2309L) {
            message = new ServerSeqMsg();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
