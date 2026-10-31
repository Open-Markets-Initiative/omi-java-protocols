package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.ComplexStrategyTickerMessage;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.StrategyBestAskUpdate;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.StrategyBestBidAndAskUpdate;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.StrategyBestBidUpdate;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.StrategyOpenClosedMessage;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.StrategyTradingActionMessage;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application.SystemEventMessage;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ComplexStrategyTickerMessage::new, ComplexStrategyTickerMessage.padding());
        check(StrategyBestAskUpdate::new, StrategyBestAskUpdate.padding());
        check(StrategyBestBidAndAskUpdate::new, StrategyBestBidAndAskUpdate.padding());
        check(StrategyBestBidUpdate::new, StrategyBestBidUpdate.padding());
        check(StrategyOpenClosedMessage::new, StrategyOpenClosedMessage.padding());
        check(StrategyTradingActionMessage::new, StrategyTradingActionMessage.padding());
        check(SystemEventMessage::new, SystemEventMessage.padding());

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create, int[] padding) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        for (int run = 0; run < padding.length; run += 2) {
            Arrays.fill(wire, offset + padding[run], offset + padding[run] + padding[run + 1], (byte) 0);
        }
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));

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
