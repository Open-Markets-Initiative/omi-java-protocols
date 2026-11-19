package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
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

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AccruedInterestTableEntry::new);
        check(AuctionSummary::new);
        check(AuctionUpdate::new);
        check(CalendarException::new);
        check(CollarGroup::new);
        check(CollarTableEntry::new);
        check(ExternalUnderlying::new);
        check(IndexParams::new);
        check(IndexPortfolioEntry::new);
        check(IndexSummary::new);
        check(IndexationTableEntry::new);
        check(Instrument::new);
        check(InstrumentStatusChange::new);
        check(InstrumentSummary::new);
        check(MarketStructure::new);
        check(News::new);
        check(OrderAdd::new);
        check(OrderBookEvent::new);
        check(OrderCancel::new);
        check(OrderCollars::new);
        check(OrderExecute::new);
        check(OrderModify::new);
        check(PositionReport::new);
        check(PriceLevelSnapshot::new);
        check(PriceUpdate::new);
        check(ProductSummary::new);
        check(RealTimeIndex::new);
        check(TestEvent::new);
        check(TickTableEntry::new);
        check(TopPriceLevelUpdate::new);
        check(Trade::new);
        check(TradeCollars::new);
        check(TradingPhaseScheduleEntry::new);
        check(TradingSessionStatus::new);
        check(WeekPlan::new);
        check(Heartbeat::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
