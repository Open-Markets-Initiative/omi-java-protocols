package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.dispatch;

import java.util.Optional;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.AddComplexInstrumentMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.CancelOrderMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.MassCancelMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.MemberKillSwitchRequestMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.ModifyTradeMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.NewCrossOrderMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.NewOrderLongFormMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.NewOrderShortFormMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.ReplaceOrderMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application.SubscriptionRequestMessage;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Unsequenced Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Unsequenced Message Type selects.
     *
     * @param unsequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char unsequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (unsequencedMessageType == 'A') {
            message = new NewOrderLongFormMessage();
        } else if (unsequencedMessageType == 'B') {
            message = new NewOrderShortFormMessage();
        } else if (unsequencedMessageType == 'R') {
            message = new ReplaceOrderMessage();
        } else if (unsequencedMessageType == 'C') {
            message = new CancelOrderMessage();
        } else if (unsequencedMessageType == 'U') {
            message = new MassCancelMessage();
        } else if (unsequencedMessageType == 'X') {
            message = new NewCrossOrderMessage();
        } else if (unsequencedMessageType == 'S') {
            message = new AddComplexInstrumentMessage();
        } else if (unsequencedMessageType == 'M') {
            message = new ModifyTradeMessage();
        } else if (unsequencedMessageType == 'K') {
            message = new MemberKillSwitchRequestMessage();
        } else if (unsequencedMessageType == 'F') {
            message = new SubscriptionRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
