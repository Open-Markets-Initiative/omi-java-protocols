package omi.currenex.currenexforex.esp.cbp.v9.dispatch;

import java.util.Optional;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Heartbeat;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.InstrumentInfo;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.InstrumentInfoAck;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Logon;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Logout;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.PriceCancelMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.PriceMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.RejectMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.SubscriptionReply;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.SubscriptionRequest;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.TradeTickerMessage;
import omi.currenex.currenexforex.esp.cbp.v9.types.Message;

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
            message = new Logon();
        } else if (messageType == 'B') {
            message = new Logout();
        } else if (messageType == 'C') {
            message = new Heartbeat();
        } else if (messageType == 'D') {
            message = new InstrumentInfo();
        } else if (messageType == 'E') {
            message = new InstrumentInfoAck();
        } else if (messageType == 'F') {
            message = new SubscriptionRequest();
        } else if (messageType == 'G') {
            message = new SubscriptionReply();
        } else if (messageType == 'H') {
            message = new PriceMessage();
        } else if (messageType == 'I') {
            message = new PriceCancelMessage();
        } else if (messageType == 'J') {
            message = new TradeTickerMessage();
        } else if (messageType == 'K') {
            message = new RejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
