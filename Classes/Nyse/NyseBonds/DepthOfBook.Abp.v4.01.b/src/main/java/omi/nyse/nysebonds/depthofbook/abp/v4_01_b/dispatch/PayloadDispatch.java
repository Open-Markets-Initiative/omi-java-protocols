package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.dispatch;

import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.AddOrderMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.DeleteOrderMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.HeartbeatMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.ImbalanceMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.LoginAcceptedMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.LoginRejectedMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.ModifyOrderMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.SystemEventMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.TestResponseMessage;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'Q') {
            message = new LoginAcceptedMessage();
        } else if (messageType == 'R') {
            message = new LoginRejectedMessage();
        } else if (messageType == 'H') {
            message = new HeartbeatMessage();
        } else if (messageType == 'S') {
            message = new TestResponseMessage();
        } else if (messageType == 'N') {
            message = new AddOrderMessage();
        } else if (messageType == 'C') {
            message = new ModifyOrderMessage();
        } else if (messageType == 'K') {
            message = new DeleteOrderMessage();
        } else if (messageType == 'W') {
            message = new ImbalanceMessage();
        } else if (messageType == 'Y') {
            message = new SystemEventMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
