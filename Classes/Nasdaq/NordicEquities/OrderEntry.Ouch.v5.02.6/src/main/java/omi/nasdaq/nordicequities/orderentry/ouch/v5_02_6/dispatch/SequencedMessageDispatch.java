package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.BrokenTradeMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.CancelPendingMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.CancelRejectedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.CancelledOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.ExecutedOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.GtcCancelledMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.MmoRefreshRequestMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.OrderAcceptedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.OrderReplacedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.OrderRestatedMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.PendingOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.RejectedOrderMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.ReplacePendingMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.ResponseToMmiNotificationMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.StreamStatusMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application.SystemEventMessage;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Message;

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
            message = new CancelledOrderMessage();
        } else if (sequencedMessageType == 'P') {
            message = new CancelPendingMessage();
        } else if (sequencedMessageType == 'N') {
            message = new ReplacePendingMessage();
        } else if (sequencedMessageType == 'E') {
            message = new ExecutedOrderMessage();
        } else if (sequencedMessageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectedOrderMessage();
        } else if (sequencedMessageType == 'I') {
            message = new CancelRejectedMessage();
        } else if (sequencedMessageType == 'T') {
            message = new OrderRestatedMessage();
        } else if (sequencedMessageType == 'W') {
            message = new MmoRefreshRequestMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new AccountQueryResponseMessage();
        } else if (sequencedMessageType == 'G') {
            message = new GtcCancelledMessage();
        } else if (sequencedMessageType == 'R') {
            message = new ResponseToMmiNotificationMessage();
        } else if (sequencedMessageType == 'M') {
            message = new PendingOrderMessage();
        } else if (sequencedMessageType == 'D') {
            message = new StreamStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
