package omi.cme.ebs.spectrum.sbe.v12_0.dispatch;

import java.util.Optional;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.AdminHeartbeat;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.GlobalDayRoll;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.MdIncrementalRefreshSpectrum;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.MdIncrementalRefreshTicker;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.MdSnapshotRefreshSpectrum;
import omi.cme.ebs.spectrum.sbe.v12_0.messages.application.MdSnapshotRefreshTicker;
import omi.cme.ebs.spectrum.sbe.v12_0.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class TcpMessagePayloadDispatch {

    private TcpMessagePayloadDispatch() {
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
        if (templateId == 302L) {
            message = new AdminHeartbeat();
        } else if (templateId == 303L) {
            message = new MdIncrementalRefreshSpectrum();
        } else if (templateId == 304L) {
            message = new MdIncrementalRefreshTicker();
        } else if (templateId == 305L) {
            message = new MdSnapshotRefreshSpectrum();
        } else if (templateId == 306L) {
            message = new MdSnapshotRefreshTicker();
        } else if (templateId == 307L) {
            message = new GlobalDayRoll();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
