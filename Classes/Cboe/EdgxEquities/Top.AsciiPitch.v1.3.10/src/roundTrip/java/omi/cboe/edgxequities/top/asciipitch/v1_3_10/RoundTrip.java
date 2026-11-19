package omi.cboe.edgxequities.top.asciipitch.v1_3_10;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ClientHeartbeatMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExpandedAskUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExpandedBidUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExpandedSpinMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExpandedTradeMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExpandedTwoSidedUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExtendedAskUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExtendedBidUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExtendedSpinMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExtendedTradeMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ExtendedTwoSidedUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LogonAcceptedMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LogonMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LogonRejectedMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LongAskUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LongBidUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LongTradeMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.LongTwoSidedUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.MillisecondsMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.SecondsMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ServerHeartbeatMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ShortAskUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ShortBidUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ShortTradeMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.ShortTwoSidedUpdateMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.SpinDoneMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.TimeReferenceMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application.TradingStatusMessage;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ExpandedAskUpdateMessage::new);
        check(ExpandedBidUpdateMessage::new);
        check(ExpandedSpinMessage::new);
        check(ExpandedTradeMessage::new);
        check(ExpandedTwoSidedUpdateMessage::new);
        check(ExtendedAskUpdateMessage::new);
        check(ExtendedBidUpdateMessage::new);
        check(ExtendedSpinMessage::new);
        check(ExtendedTradeMessage::new);
        check(ExtendedTwoSidedUpdateMessage::new);
        check(LogonMessage::new);
        check(LogonRejectedMessage::new);
        check(LongAskUpdateMessage::new);
        check(LongBidUpdateMessage::new);
        check(LongTradeMessage::new);
        check(LongTwoSidedUpdateMessage::new);
        check(MillisecondsMessage::new);
        check(SecondsMessage::new);
        check(ShortAskUpdateMessage::new);
        check(ShortBidUpdateMessage::new);
        check(ShortTradeMessage::new);
        check(ShortTwoSidedUpdateMessage::new);
        check(TimeReferenceMessage::new);
        check(TradingStatusMessage::new);
        check(LogonAcceptedMessage::new);
        check(SpinDoneMessage::new);
        check(ServerHeartbeatMessage::new);
        check(ClientHeartbeatMessage::new);

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
