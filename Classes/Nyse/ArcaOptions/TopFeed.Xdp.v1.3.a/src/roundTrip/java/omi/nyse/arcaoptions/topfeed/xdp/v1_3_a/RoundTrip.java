package omi.nyse.arcaoptions.topfeed.xdp.v1_3_a;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightBoldRfqMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightCrossingRfqMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightImbalanceMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightQuoteMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightSeriesStatusMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightSummaryMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeCancelMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeCorrectionMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightImbalanceMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightQuoteMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightTradeMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.SeriesIndexMappingMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.StreamIdMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.UnderlyingIndexMappingMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application.UnderlyingStatusMessage;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(OutrightBoldRfqMessage::new);
        check(OutrightCrossingRfqMessage::new);
        check(OutrightImbalanceMessage::new);
        check(OutrightQuoteMessage::new);
        check(OutrightSeriesStatusMessage::new);
        check(OutrightSummaryMessage::new);
        check(OutrightTradeCancelMessage::new);
        check(OutrightTradeCorrectionMessage::new);
        check(OutrightTradeMessage::new);
        check(RefreshOutrightImbalanceMessage::new);
        check(RefreshOutrightQuoteMessage::new);
        check(RefreshOutrightTradeMessage::new);
        check(SequenceNumberResetMessage::new);
        check(SeriesIndexMappingMessage::new);
        check(StreamIdMessage::new);
        check(UnderlyingIndexMappingMessage::new);
        check(UnderlyingStatusMessage::new);

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
