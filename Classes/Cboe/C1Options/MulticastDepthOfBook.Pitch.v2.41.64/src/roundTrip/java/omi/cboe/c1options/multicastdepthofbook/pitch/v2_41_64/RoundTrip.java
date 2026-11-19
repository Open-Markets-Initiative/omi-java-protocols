package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAddOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionCancelMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionNotificationMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionSummaryMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxAuctionTradeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxConstituentSymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxDeleteOrderMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxEndOfSession;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxModifyOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxModifyOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOptionsAuctionUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOrderExecutedAtPriceSizeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxOrderExecutedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxReduceSizeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxReduceSizeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxSoqStrikeRangeUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxSymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTimeMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTimeReferenceMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeBreakMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTradingStatusMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTransactionBeginMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxTransactionEndMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxUnitClearMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.messages.application.OxWidthUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(OxAddOrderExpandedMessage::new);
        check(OxAddOrderLongMessage::new);
        check(OxAddOrderShortMessage::new);
        check(OxAuctionCancelMessage::new);
        check(OxAuctionNotificationMessage::new);
        check(OxAuctionSummaryMessage::new);
        check(OxAuctionTradeMessage::new);
        check(OxConstituentSymbolMappingMessage::new);
        check(OxDeleteOrderMessage::new);
        check(OxEndOfSession::new);
        check(OxModifyOrderLongMessage::new);
        check(OxModifyOrderShortMessage::new);
        check(OxOptionsAuctionUpdateMessage::new);
        check(OxOrderExecutedAtPriceSizeMessage::new);
        check(OxOrderExecutedMessage::new);
        check(OxReduceSizeLongMessage::new);
        check(OxReduceSizeShortMessage::new);
        check(OxSoqStrikeRangeUpdateMessage::new);
        check(OxSymbolMappingMessage::new);
        check(OxTimeMessage::new);
        check(OxTimeReferenceMessage::new);
        check(OxTradeBreakMessage::new);
        check(OxTradeExpandedMessage::new);
        check(OxTradeLongMessage::new);
        check(OxTradeShortMessage::new);
        check(OxTradingStatusMessage::new);
        check(OxTransactionBeginMessage::new);
        check(OxTransactionEndMessage::new);
        check(OxUnitClearMessage::new);
        check(OxWidthUpdateMessage::new);

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
