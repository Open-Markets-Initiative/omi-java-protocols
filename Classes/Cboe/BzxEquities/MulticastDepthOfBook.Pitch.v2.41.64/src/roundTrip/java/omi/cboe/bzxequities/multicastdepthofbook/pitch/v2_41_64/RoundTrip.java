package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderExpandedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAddOrderShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAuctionSummaryMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqAuctionUpdateMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqDeleteOrderMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqEndOfSession;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqModifyOrderLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqModifyOrderShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqOrderExecutedAtPriceSizeMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqOrderExecutedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqReduceSizeLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqReduceSizeShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqRetailPriceImprovementMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTimeMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeBreakMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeExpandedMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeLongMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradeShortMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqTradingStatusMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.messages.application.EqUnitClearMessage;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(EqAddOrderExpandedMessage::new);
        check(EqAddOrderLongMessage::new);
        check(EqAddOrderShortMessage::new);
        check(EqAuctionSummaryMessage::new);
        check(EqAuctionUpdateMessage::new);
        check(EqDeleteOrderMessage::new);
        check(EqEndOfSession::new);
        check(EqModifyOrderLongMessage::new);
        check(EqModifyOrderShortMessage::new);
        check(EqOrderExecutedAtPriceSizeMessage::new);
        check(EqOrderExecutedMessage::new);
        check(EqReduceSizeLongMessage::new);
        check(EqReduceSizeShortMessage::new);
        check(EqRetailPriceImprovementMessage::new);
        check(EqTimeMessage::new);
        check(EqTradeBreakMessage::new);
        check(EqTradeExpandedMessage::new);
        check(EqTradeLongMessage::new);
        check(EqTradeShortMessage::new);
        check(EqTradingStatusMessage::new);
        check(EqUnitClearMessage::new);

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
