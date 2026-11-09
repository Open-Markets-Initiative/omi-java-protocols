package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.dispatch;

import java.util.Optional;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.GapFillMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.HeartbeatMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.LoggedOutMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.LogonConfMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.LogonMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.LogoutMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.ResendRequestMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.TestRequestMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Message;

/**
 * Selects the message a Session Payload branch holds by its Template Id.
 */
public final class SessionPayloadDispatch {

    private SessionPayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 100L) {
            message = new LogonMessage();
        } else if (templateId == 200L) {
            message = new LogonConfMessage();
        } else if (templateId == 101L) {
            message = new LogoutMessage();
        } else if (templateId == 201L) {
            message = new LoggedOutMessage();
        } else if (templateId == 10L) {
            message = new HeartbeatMessage();
        } else if (templateId == 11L) {
            message = new TestRequestMessage();
        } else if (templateId == 102L) {
            message = new ResendRequestMessage();
        } else if (templateId == 202L) {
            message = new GapFillMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
