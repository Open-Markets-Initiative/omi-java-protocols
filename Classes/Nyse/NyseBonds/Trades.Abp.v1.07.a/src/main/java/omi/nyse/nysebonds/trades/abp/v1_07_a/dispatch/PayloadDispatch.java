package omi.nyse.nysebonds.trades.abp.v1_07_a.dispatch;

import java.util.Optional;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.HeartbeatMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.LastSaleMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.LoginAcceptedMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.LoginRejectedMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.NyseBondClosingPriceMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.TestResponseMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application.TradeBustOrCorrectionMessage;
import omi.nyse.nysebonds.trades.abp.v1_07_a.types.Message;

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
        } else if (messageType == 'X') {
            message = new LastSaleMessage();
        } else if (messageType == 'U') {
            message = new TradeBustOrCorrectionMessage();
        } else if (messageType == 'Z') {
            message = new NyseBondClosingPriceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
