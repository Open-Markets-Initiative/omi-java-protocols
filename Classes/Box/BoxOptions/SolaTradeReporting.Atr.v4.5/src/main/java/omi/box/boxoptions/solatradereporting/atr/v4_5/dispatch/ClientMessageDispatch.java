package omi.box.boxoptions.solatradereporting.atr.v4_5.dispatch;

import java.util.Optional;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.CircuitResponse;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ClientSignon;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.DeleteAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.DeleteGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ModifyAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ModifyGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.NewAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.NewGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.RestartRequest;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.StartOfDayAcknowledgement;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;

/**
 * Selects the message a Client Message branch holds by its Message Type.
 */
public final class ClientMessageDispatch {

    private ClientMessageDispatch() {
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
        if ("01".equals(messageType)) {
            message = new StartOfDayAcknowledgement();
        } else if ("03".equals(messageType)) {
            message = new CircuitResponse();
        } else if ("04".equals(messageType)) {
            message = new RestartRequest();
        } else if ("09".equals(messageType)) {
            message = new ClientSignon();
        } else if ("42".equals(messageType)) {
            message = new NewAllocation();
        } else if ("43".equals(messageType)) {
            message = new ModifyAllocation();
        } else if ("44".equals(messageType)) {
            message = new DeleteAllocation();
        } else if ("52".equals(messageType)) {
            message = new NewGiveUp();
        } else if ("53".equals(messageType)) {
            message = new ModifyGiveUp();
        } else if ("54".equals(messageType)) {
            message = new DeleteGiveUp();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
