package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.dispatch;

import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.CancelRejectMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.CorrectedTradeMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.OrderAcceptedMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.OrderCanceledMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.OrderExecutedMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.OrderReplacedMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.OrderRestatedMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.RejectedOrderMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.StpCanceledMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application.SystemEventMessage;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'A') {
            message = new OrderAcceptedMessage();
        } else if (sequencedMessageType == 'U') {
            message = new OrderReplacedMessage();
        } else if (sequencedMessageType == 'C') {
            message = new OrderCanceledMessage();
        } else if (sequencedMessageType == 'D') {
            message = new StpCanceledMessage();
        } else if (sequencedMessageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 'B') {
            message = new CorrectedTradeMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedOrderMessage();
        } else if (sequencedMessageType == 'I') {
            message = new CancelRejectMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderRestatedMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new AccountQueryResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
