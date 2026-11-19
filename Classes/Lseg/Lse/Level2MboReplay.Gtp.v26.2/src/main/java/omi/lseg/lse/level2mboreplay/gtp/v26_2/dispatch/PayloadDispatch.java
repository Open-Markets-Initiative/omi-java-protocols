package omi.lseg.lse.level2mboreplay.gtp.v26_2.dispatch;

import java.util.Optional;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.AddOrderMboMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.AddOrderShortMboMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.InstrumentDirectoryMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.InstrumentStatusMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.LoginRequestMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.LoginResponseMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.OrderBookClearMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.ReplayRequestMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.ReplayResponseMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.StatisticsMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.StatisticsUpdateMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.SystemEventMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.messages.application.TradeMessage;
import omi.lseg.lse.level2mboreplay.gtp.v26_2.types.Message;

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
        } else if (messageType == 3L) {
            message = new ReplayRequestMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 4L) {
            message = new ReplayResponseMessage();
        } else if (messageType == 131L) {
            message = new ReplayAndRecoveryCompleteMessage();
        } else if (messageType == 83L) {
            message = new SystemEventMessage();
        } else if (messageType == 112L) {
            message = new InstrumentDirectoryMessage();
        } else if (messageType == 72L) {
            message = new InstrumentStatusMessage();
        } else if (messageType == 65L) {
            message = new AddOrderMboMessage();
        } else if (messageType == 101L) {
            message = new AddOrderShortMboMessage();
        } else if (messageType == 121L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 80L) {
            message = new TradeMessage();
        } else if (messageType == 119L) {
            message = new StatisticsMessage();
        } else if (messageType == 106L) {
            message = new StatisticsUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
