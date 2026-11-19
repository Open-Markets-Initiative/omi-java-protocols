package omi.lseg.turquoise.replay.gtp.v26_3.dispatch;

import java.util.Optional;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.AddOrderIncrementalMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.AnalyticsMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.DeleteOrderMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.InstrumentDirectoryMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.InstrumentStatusMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.LoginRequestMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.LoginResponseMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.MifidIiOrderBookUpdateMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.MifidIiTradeCrossMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.MifidIiTradeMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.ModifyOrderMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.OrderBookClearMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.ReplayRequestMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.ReplayResponseMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.StatisticsMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.StatisticsUpdateMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.SystemEventMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.TopOfBookMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.TradeCrossMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.TradeMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.messages.application.TradeSummaryMessage;
import omi.lseg.turquoise.replay.gtp.v26_3.types.Message;

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
        } else if (messageType == 70L) {
            message = new AddOrderIncrementalMessage();
        } else if (messageType == 85L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 68L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 105L) {
            message = new TopOfBookMessage();
        } else if (messageType == 121L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 80L) {
            message = new TradeMessage();
        } else if (messageType == 113L) {
            message = new TradeCrossMessage();
        } else if (messageType == 119L) {
            message = new StatisticsMessage();
        } else if (messageType == 106L) {
            message = new StatisticsUpdateMessage();
        } else if (messageType == 81L) {
            message = new MifidIiTradeMessage();
        } else if (messageType == 86L) {
            message = new MifidIiTradeCrossMessage();
        } else if (messageType == 87L) {
            message = new TradeSummaryMessage();
        } else if (messageType == 97L) {
            message = new AnalyticsMessage();
        } else if (messageType == 98L) {
            message = new MifidIiOrderBookUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
