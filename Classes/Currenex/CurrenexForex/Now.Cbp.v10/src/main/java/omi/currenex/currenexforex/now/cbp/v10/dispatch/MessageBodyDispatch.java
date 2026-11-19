package omi.currenex.currenexforex.now.cbp.v10.dispatch;

import java.util.Optional;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.DepthOfBookMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.HeartBeatMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.InstrumentInfo;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.InstrumentInfoAckMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.LogonMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.LogoutMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.MassSubscriptionReplyMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.MassSubscriptionRequestMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.MidActivityIndicatorMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.PaidGivenMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.RejectMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.SubscriptionReplyMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.SubscriptionRequestMessage;
import omi.currenex.currenexforex.now.cbp.v10.messages.application.WamrWithConfidenceFactorMessage;
import omi.currenex.currenexforex.now.cbp.v10.types.Message;

/**
 * Selects the message a Message Body branch holds by its Message Type.
 */
public final class MessageBodyDispatch {

    private MessageBodyDispatch() {
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
        if (messageType == 'A') {
            message = new LogonMessage();
        } else if (messageType == 'B') {
            message = new LogoutMessage();
        } else if (messageType == 'C') {
            message = new HeartBeatMessage();
        } else if (messageType == 'D') {
            message = new InstrumentInfo();
        } else if (messageType == 'E') {
            message = new InstrumentInfoAckMessage();
        } else if (messageType == 'X') {
            message = new SubscriptionRequestMessage();
        } else if (messageType == 'Y') {
            message = new MassSubscriptionRequestMessage();
        } else if (messageType == 'G') {
            message = new SubscriptionReplyMessage();
        } else if (messageType == 'Z') {
            message = new MassSubscriptionReplyMessage();
        } else if (messageType == 'd') {
            message = new DepthOfBookMessage();
        } else if (messageType == 'k') {
            message = new PaidGivenMessage();
        } else if (messageType == 'r') {
            message = new WamrWithConfidenceFactorMessage();
        } else if (messageType == 'x') {
            message = new MidActivityIndicatorMessage();
        } else if (messageType == 'K') {
            message = new RejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
