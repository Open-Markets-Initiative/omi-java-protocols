package omi.box.boxoptions.solatradereporting.atr.v4_5.dispatch;

import java.util.Optional;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.AcknowledgementMessage;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.Allocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.AllocationCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.CircuitAssurance;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ClientSignonAcknowledgment;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.EndOfTrading;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ErrorMessage;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.GiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.GiveUpCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.RestartAccepted;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.StartOfDay;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.Trade;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.TradeCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;

/**
 * Selects the message a Server Message branch holds by its Message Type.
 */
public final class ServerMessageDispatch {

    private ServerMessageDispatch() {
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
    public static Optional<Message> decode(String messageType, byte[] data, int offset, int end) {
        Message message;
        if ("00".equals(messageType)) {
            message = new StartOfDay();
        } else if ("02".equals(messageType)) {
            message = new CircuitAssurance();
        } else if ("05".equals(messageType)) {
            message = new RestartAccepted();
        } else if ("08".equals(messageType)) {
            message = new EndOfTrading();
        } else if ("10".equals(messageType)) {
            message = new ClientSignonAcknowledgment();
        } else if ("30".equals(messageType)) {
            message = new Trade();
        } else if ("31".equals(messageType)) {
            message = new TradeCancel();
        } else if ("40".equals(messageType)) {
            message = new Allocation();
        } else if ("41".equals(messageType)) {
            message = new AllocationCancel();
        } else if ("50".equals(messageType)) {
            message = new GiveUp();
        } else if ("51".equals(messageType)) {
            message = new GiveUpCancel();
        } else if ("98".equals(messageType)) {
            message = new AcknowledgementMessage();
        } else if ("99".equals(messageType)) {
            message = new ErrorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
