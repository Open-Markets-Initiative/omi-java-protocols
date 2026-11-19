package omi.moex.spectra.orderslogreplay.simba.v9_12_0.dispatch;

import java.util.Optional;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.messages.application.HeartbeatMessage;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.messages.application.LogonMessage;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.messages.application.LogoutMessage;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.Message;

/**
 * Selects the message a Server Session Payload branch holds by its Template Id.
 */
public final class ServerSessionPayloadDispatch {

    private ServerSessionPayloadDispatch() {
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
        if (templateId == 1L) {
            message = new HeartbeatMessage();
        } else if (templateId == 1000L) {
            message = new LogonMessage();
        } else if (templateId == 1001L) {
            message = new LogoutMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
