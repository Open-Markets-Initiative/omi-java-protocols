package omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.dispatch;

import java.util.Optional;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.DeleteOrderMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.InstrumentDirectoryMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.InstrumentStatusMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.LoginRequestMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.LoginResponseMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.OrderBookClearMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.ReplayRequestMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.ReplayResponseMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.SiQuoteMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.messages.application.SystemEventMessage;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.types.Message;

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
        } else if (messageType == 68L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 121L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 71L) {
            message = new SiQuoteMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
