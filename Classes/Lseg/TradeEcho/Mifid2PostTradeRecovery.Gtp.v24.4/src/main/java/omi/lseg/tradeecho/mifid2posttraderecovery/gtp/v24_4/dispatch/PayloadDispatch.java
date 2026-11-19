package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.dispatch;

import java.util.Optional;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.InstrumentDirectoryMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.InstrumentStatusMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.LoginRequestMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.LoginResponseMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.MifidIiTradeReportMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.RecoveryRequestMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.RecoveryResponseMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.StatisticsSnapshotMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.SystemEventMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.types.Message;

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
        } else if (messageType == 112L) {
            message = new InstrumentDirectoryMessage();
        } else if (messageType == 72L) {
            message = new InstrumentStatusMessage();
        } else if (messageType == 107L) {
            message = new StatisticsSnapshotMessage();
        } else if (messageType == 84L) {
            message = new MifidIiTradeReportMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
