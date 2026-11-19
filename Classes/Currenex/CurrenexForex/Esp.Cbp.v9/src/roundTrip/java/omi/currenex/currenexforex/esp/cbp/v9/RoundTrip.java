package omi.currenex.currenexforex.esp.cbp.v9;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Heartbeat;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.InstrumentInfo;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.InstrumentInfoAck;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Logon;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.Logout;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.PriceCancelMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.PriceMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.RejectMessage;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.SubscriptionReply;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.SubscriptionRequest;
import omi.currenex.currenexforex.esp.cbp.v9.messages.application.TradeTickerMessage;
import omi.currenex.currenexforex.esp.cbp.v9.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(Heartbeat::new);
        check(InstrumentInfo::new);
        check(InstrumentInfoAck::new);
        check(Logon::new);
        check(Logout::new);
        check(PriceCancelMessage::new);
        check(PriceMessage::new);
        check(RejectMessage::new);
        check(SubscriptionReply::new);
        check(SubscriptionRequest::new);
        check(TradeTickerMessage::new);

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
