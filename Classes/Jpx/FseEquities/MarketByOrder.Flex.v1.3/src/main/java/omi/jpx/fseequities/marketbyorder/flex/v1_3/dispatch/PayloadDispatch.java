package omi.jpx.fseequities.marketbyorder.flex.v1_3.dispatch;

import java.util.Optional;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.AddOrderMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.CommunicationControlMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.ExecutionSummaryMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.OrderDeleteMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.OrderExecutedMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.OrderExecutedWithPriceMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.ResetMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.SecondsTimestampMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.messages.application.TradingStatusMessage;
import omi.jpx.fseequities.marketbyorder.flex.v1_3.types.Message;

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
        if (messageType == 'T') {
            message = new SecondsTimestampMessage();
        } else if (messageType == 'O') {
            message = new TradingStatusMessage();
        } else if (messageType == 'K') {
            message = new ExecutionSummaryMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'R') {
            message = new ResetMessage();
        } else if (messageType == 'L') {
            message = new CommunicationControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
