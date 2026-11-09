package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.AddOrderLongMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.AddOrderShortMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.DeleteOrderMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.EndOfDaySummaryMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.EndOfSessionMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.FuturesInstrumentDefinitionMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.ModifyOrderLongMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.ModifyOrderShortMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.OrderExecutedMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.ReduceSizeLongMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.ReduceSizeShortMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.SettlementMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TimeMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TimeReferenceMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TradeBreakMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TradeLongMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TradeShortMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TradingStatusMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TransactionBegin;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.TransactionEnd;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.UnitClearMessage;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Message;

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
        if (messageType == 177L) {
            message = new TimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 187L) {
            message = new FuturesInstrumentDefinitionMessage();
        } else if (messageType == 33L) {
            message = new AddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new AddOrderShortMessage();
        } else if (messageType == 35L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 37L) {
            message = new ReduceSizeLongMessage();
        } else if (messageType == 38L) {
            message = new ReduceSizeShortMessage();
        } else if (messageType == 39L) {
            message = new ModifyOrderLongMessage();
        } else if (messageType == 40L) {
            message = new ModifyOrderShortMessage();
        } else if (messageType == 41L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 42L) {
            message = new TradeLongMessage();
        } else if (messageType == 43L) {
            message = new TradeShortMessage();
        } else if (messageType == 188L) {
            message = new TransactionBegin();
        } else if (messageType == 189L) {
            message = new TransactionEnd();
        } else if (messageType == 44L) {
            message = new TradeBreakMessage();
        } else if (messageType == 185L) {
            message = new SettlementMessage();
        } else if (messageType == 186L) {
            message = new EndOfDaySummaryMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
