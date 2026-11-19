package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AddComplexInstrumentResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ComplexInstrumentDirectoryMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.CrossOrderAcceptedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.InstrumentTradingActionMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MassCancelResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.MemberKillSwitchNotificationMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.ModifyTradeResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderAcceptedLongFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderAcceptedShortFormMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderCanceledMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderExecutedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.OrderReplacedMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.PendingResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.RejectMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SimpleInstrumentDirectoryMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SubscriptionResponseMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.TradeDetailsMessage;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;

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
        if (sequencedMessageType == 'z') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'o') {
            message = new SimpleInstrumentDirectoryMessage();
        } else if (sequencedMessageType == 's') {
            message = new ComplexInstrumentDirectoryMessage();
        } else if (sequencedMessageType == 'i') {
            message = new InstrumentTradingActionMessage();
        } else if (sequencedMessageType == 'n') {
            message = new AuctionNotificationMessage();
        } else if (sequencedMessageType == 'a') {
            message = new OrderAcceptedLongFormMessage();
        } else if (sequencedMessageType == 'b') {
            message = new OrderAcceptedShortFormMessage();
        } else if (sequencedMessageType == 'r') {
            message = new OrderReplacedMessage();
        } else if (sequencedMessageType == 'c') {
            message = new OrderCanceledMessage();
        } else if (sequencedMessageType == 'e') {
            message = new OrderExecutedMessage();
        } else if (sequencedMessageType == 't') {
            message = new TradeDetailsMessage();
        } else if (sequencedMessageType == 'x') {
            message = new CrossOrderAcceptedMessage();
        } else if (sequencedMessageType == 'k') {
            message = new MemberKillSwitchNotificationMessage();
        } else if (sequencedMessageType == 'u') {
            message = new MassCancelResponseMessage();
        } else if (sequencedMessageType == 'd') {
            message = new AddComplexInstrumentResponseMessage();
        } else if (sequencedMessageType == 'm') {
            message = new ModifyTradeResponseMessage();
        } else if (sequencedMessageType == 'f') {
            message = new SubscriptionResponseMessage();
        } else if (sequencedMessageType == 'j') {
            message = new RejectMessage();
        } else if (sequencedMessageType == 'p') {
            message = new PendingResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
