package omi.lseg.turquoise.level2incremental.gtp.v24_4.dispatch;

import java.util.Optional;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.AddOrderIncrementalMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.InstrumentDirectoryMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.InstrumentStatusMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.OrderBookClearMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.OrderDeleteMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.OrderModifyMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.StatisticsMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.StatisticsUpdateMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.SystemEventMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.TradeCrossMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.TradeMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.messages.application.TradeSummaryMessage;
import omi.lseg.turquoise.level2incremental.gtp.v24_4.types.Message;

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
        if (messageType == 83L) {
            message = new SystemEventMessage();
        } else if (messageType == 112L) {
            message = new InstrumentDirectoryMessage();
        } else if (messageType == 72L) {
            message = new InstrumentStatusMessage();
        } else if (messageType == 70L) {
            message = new AddOrderIncrementalMessage();
        } else if (messageType == 85L) {
            message = new OrderModifyMessage();
        } else if (messageType == 68L) {
            message = new OrderDeleteMessage();
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
        } else if (messageType == 87L) {
            message = new TradeSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
