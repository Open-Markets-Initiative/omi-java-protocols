package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.dispatch;

import java.util.Optional;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AddOrderLongMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AddOrderShortMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AuctionCancelMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AuctionLiquidityMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AuctionNotificationMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AuctionSummaryMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.AuctionTradeMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.ComplexInstrumentDefinitionMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.DeleteOrderMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.EndOfDaySummaryMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.EndOfSession;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.FastStatusMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.FuturesInstrumentDefinitionMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.ModifyOrderLongMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.ModifyOrderShortMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.OpeningAuctionUpdateMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.OptionsInstrumentDefinitionMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.OrderExecutedAtPriceSizeMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.OrderExecutedMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.ReduceSizeLongMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.ReduceSizeShortMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.SettlementMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TimeMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TradeBreakMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TradeExtendedMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TradeLongMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TradeShortMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TradingStatusMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TransactionBeginMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.TransactionEndMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.UnitClearMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application.WidthUpdateMessage;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.Message;

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
        if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 64L) {
            message = new AddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new AddOrderShortMessage();
        } else if (messageType == 35L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 36L) {
            message = new OrderExecutedAtPriceSizeMessage();
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
        } else if (messageType == 65L) {
            message = new TradeLongMessage();
        } else if (messageType == 43L) {
            message = new TradeShortMessage();
        } else if (messageType == 50L) {
            message = new TradeExtendedMessage();
        } else if (messageType == 45L) {
            message = new EndOfSession();
        } else if (messageType == 188L) {
            message = new TransactionBeginMessage();
        } else if (messageType == 189L) {
            message = new TransactionEndMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 226L) {
            message = new FastStatusMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 209L) {
            message = new OpeningAuctionUpdateMessage();
        } else if (messageType == 173L) {
            message = new AuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new AuctionCancelMessage();
        } else if (messageType == 223L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 222L) {
            message = new AuctionLiquidityMessage();
        } else if (messageType == 210L) {
            message = new WidthUpdateMessage();
        } else if (messageType == 218L) {
            message = new FuturesInstrumentDefinitionMessage();
        } else if (messageType == 219L) {
            message = new OptionsInstrumentDefinitionMessage();
        } else if (messageType == 220L) {
            message = new ComplexInstrumentDefinitionMessage();
        } else if (messageType == 44L) {
            message = new TradeBreakMessage();
        } else if (messageType == 185L) {
            message = new SettlementMessage();
        } else if (messageType == 186L) {
            message = new EndOfDaySummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
