package omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AddOrderExpandedMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AddOrderLongMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AddOrderShortMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AuctionCancelMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AuctionNotificationMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AuctionSummaryMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.AuctionTradeMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.ConstituentSymbolMappingMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.DeleteOrderMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.EndOfSessionMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.ModifyOrderLongMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.ModifyOrderShortMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.OptionsAuctionUpdateMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.OrderExecutedAtPriceSizeMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.OrderExecutedMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.ReduceSizeLongMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.ReduceSizeShortMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.SoqStrikeRangeUpdateMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.SymbolMappingMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TimeMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TradeBreakMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TradeExpandedMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TradeLongMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TradeShortMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TradingStatusMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TransactionBeginMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.TransactionEndMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.UnitClearMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.messages.application.WidthUpdateMessage;
import omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderExpandedMessage::new);
        check(AddOrderLongMessage::new);
        check(AddOrderShortMessage::new);
        check(AuctionCancelMessage::new);
        check(AuctionNotificationMessage::new);
        check(AuctionSummaryMessage::new);
        check(AuctionTradeMessage::new);
        check(ConstituentSymbolMappingMessage::new);
        check(DeleteOrderMessage::new);
        check(EndOfSessionMessage::new);
        check(ModifyOrderLongMessage::new);
        check(ModifyOrderShortMessage::new);
        check(OptionsAuctionUpdateMessage::new);
        check(OrderExecutedAtPriceSizeMessage::new);
        check(OrderExecutedMessage::new);
        check(ReduceSizeLongMessage::new);
        check(ReduceSizeShortMessage::new);
        check(SoqStrikeRangeUpdateMessage::new);
        check(SymbolMappingMessage::new);
        check(TimeMessage::new);
        check(TradeBreakMessage::new);
        check(TradeExpandedMessage::new);
        check(TradeLongMessage::new);
        check(TradeShortMessage::new);
        check(TradingStatusMessage::new);
        check(TransactionBeginMessage::new);
        check(TransactionEndMessage::new);
        check(UnitClearMessage::new);
        check(WidthUpdateMessage::new);

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
