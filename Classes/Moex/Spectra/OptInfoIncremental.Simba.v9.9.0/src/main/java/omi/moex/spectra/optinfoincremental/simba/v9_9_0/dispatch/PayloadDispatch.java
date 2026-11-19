package omi.moex.spectra.optinfoincremental.simba.v9_9_0.dispatch;

import java.util.Optional;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.HeartbeatMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.SecurityDefinitionUpdateReportMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.SecurityGroupStatusMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.SecurityMassStatusMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.SecurityStatusMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.SequenceResetMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application.TradingSessionStatusMessage;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
        } else if (templateId == 2L) {
            message = new SequenceResetMessage();
        } else if (templateId == 28L) {
            message = new SecurityStatusMessage();
        } else if (templateId == 10L) {
            message = new SecurityDefinitionUpdateReportMessage();
        } else if (templateId == 26L) {
            message = new TradingSessionStatusMessage();
        } else if (templateId == 19L) {
            message = new SecurityMassStatusMessage();
        } else if (templateId == 22L) {
            message = new SecurityGroupStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
