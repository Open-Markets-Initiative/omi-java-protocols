package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.dispatch;

import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.AccruedInterestTableEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.AuctionSummary;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.AuctionUpdate;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.CalendarException;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.CollarGroup;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.CollarTableEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.ExternalUnderlying;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.Heartbeat;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.IndexParams;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.IndexPortfolioEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.IndexSummary;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.IndexationTableEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.Instrument;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.InstrumentStatusChange;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.InstrumentSummary;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.MarketStructure;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.News;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderAdd;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderBookEvent;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderCancel;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderCollars;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderExecute;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.OrderModify;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.PositionReport;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.PriceLevelSnapshot;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.PriceUpdate;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.ProductSummary;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.RealTimeIndex;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TestEvent;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TickTableEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TopPriceLevelUpdate;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.Trade;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TradeCollars;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TradingPhaseScheduleEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.TradingSessionStatus;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.WeekPlan;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;

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
        if (messageType == 33L) {
            message = new WeekPlan();
        } else if (messageType == 35L) {
            message = new CalendarException();
        } else if (messageType == 32L) {
            message = new TickTableEntry();
        } else if (messageType == 108L) {
            message = new CollarTableEntry();
        } else if (messageType == 27L) {
            message = new TradingPhaseScheduleEntry();
        } else if (messageType == 275L) {
            message = new MarketStructure();
        } else if (messageType == 299L) {
            message = new CollarGroup();
        } else if (messageType == 806L) {
            message = new ExternalUnderlying();
        } else if (messageType == 279L) {
            message = new Instrument();
        } else if (messageType == 36L) {
            message = new AccruedInterestTableEntry();
        } else if (messageType == 37L) {
            message = new IndexationTableEntry();
        } else if (messageType == 503L) {
            message = new IndexParams();
        } else if (messageType == 502L) {
            message = new IndexPortfolioEntry();
        } else if (messageType == 270L) {
            message = new AuctionSummary();
        } else if (messageType == 268L) {
            message = new AuctionUpdate();
        } else if (messageType == 257L) {
            message = new PriceLevelSnapshot();
        } else if (messageType == 256L) {
            message = new TopPriceLevelUpdate();
        } else if (messageType == 38L) {
            message = new Trade();
        } else if (messageType == 801L) {
            message = new PositionReport();
        } else if (messageType == 26L) {
            message = new InstrumentStatusChange();
        } else if (messageType == 272L) {
            message = new OrderCollars();
        } else if (messageType == 273L) {
            message = new TradeCollars();
        } else if (messageType == 671L) {
            message = new InstrumentSummary();
        } else if (messageType == 672L) {
            message = new ProductSummary();
        } else if (messageType == 271L) {
            message = new PriceUpdate();
        } else if (messageType == 517L) {
            message = new News();
        } else if (messageType == 500L) {
            message = new RealTimeIndex();
        } else if (messageType == 501L) {
            message = new IndexSummary();
        } else if (messageType == 23L) {
            message = new TradingSessionStatus();
        } else if (messageType == 1L) {
            message = new Heartbeat();
        } else if (messageType == 8192L) {
            message = new TestEvent();
        } else if (messageType == 9L) {
            message = new OrderAdd();
        } else if (messageType == 10L) {
            message = new OrderModify();
        } else if (messageType == 11L) {
            message = new OrderCancel();
        } else if (messageType == 12L) {
            message = new OrderExecute();
        } else if (messageType == 410L) {
            message = new OrderBookEvent();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
