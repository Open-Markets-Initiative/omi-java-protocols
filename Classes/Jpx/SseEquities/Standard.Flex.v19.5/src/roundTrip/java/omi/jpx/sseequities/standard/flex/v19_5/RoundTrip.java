package omi.jpx.sseequities.standard.flex.v19_5;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.ControlMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.MarketOrderMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.OpenHighLowAndCurrentPriceMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.OverUnderMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.ParityMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote10Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote1Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote2Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote3Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote4Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote5Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote6Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote7Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote8Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.Quote9Message;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.StatusInformationMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.TradingVolumeMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.TurnoverMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.UpdateNoMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.VwapMessage;
import omi.jpx.sseequities.standard.flex.v19_5.messages.application.YieldMessage;
import omi.jpx.sseequities.standard.flex.v19_5.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ControlMessage::new);
        check(MarketOrderMessage::new);
        check(OpenHighLowAndCurrentPriceMessage::new);
        check(OverUnderMessage::new);
        check(ParityMessage::new);
        check(Quote1Message::new);
        check(Quote10Message::new);
        check(Quote2Message::new);
        check(Quote3Message::new);
        check(Quote4Message::new);
        check(Quote5Message::new);
        check(Quote6Message::new);
        check(Quote7Message::new);
        check(Quote8Message::new);
        check(Quote9Message::new);
        check(StatusInformationMessage::new);
        check(TradingVolumeMessage::new);
        check(TurnoverMessage::new);
        check(UpdateNoMessage::new);
        check(VwapMessage::new);
        check(YieldMessage::new);

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
