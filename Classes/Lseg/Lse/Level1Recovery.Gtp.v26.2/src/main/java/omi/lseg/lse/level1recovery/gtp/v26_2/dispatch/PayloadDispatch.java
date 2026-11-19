package omi.lseg.lse.level1recovery.gtp.v26_2.dispatch;

import java.util.Optional;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.InstrumentDirectoryEquitiesMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.InstrumentStatusMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.LoginRequestMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.LoginResponseMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.OrderBookClearMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.RecoveryRequestMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.RecoveryResponseMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.StatisticsSnapshotMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.SystemEventMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.TopOfBookMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.messages.application.TradeMessage;
import omi.lseg.lse.level1recovery.gtp.v26_2.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 1L) {
            message = new LoginRequestMessage();
        } else if (messageType == 129L) {
            message = new RecoveryRequestMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 130L) {
            message = new RecoveryResponseMessage();
        } else if (messageType == 131L) {
            message = new ReplayAndRecoveryCompleteMessage();
        } else if (messageType == 83L) {
            message = new SystemEventMessage();
        } else if (messageType == 72L) {
            message = new InstrumentStatusMessage();
        } else if (messageType == 105L) {
            message = new TopOfBookMessage();
        } else if (messageType == 121L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 80L) {
            message = new TradeMessage();
        } else if (messageType == 82L) {
            message = new InstrumentDirectoryEquitiesMessage();
        } else if (messageType == 107L) {
            message = new StatisticsSnapshotMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
