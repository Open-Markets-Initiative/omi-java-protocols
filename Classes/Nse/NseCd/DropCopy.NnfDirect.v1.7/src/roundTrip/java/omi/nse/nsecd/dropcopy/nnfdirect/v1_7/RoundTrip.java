package omi.nse.nsecd.dropcopy.nnfdirect.v1_7;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.DcDownloadRequestMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.GiveupAppConfirmTmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.GiveupRejConfirmTmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.SignOnOutMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.SignonInMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeCancelConfirmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeCancelRejectMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeConfirmationMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeModifyConfirmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeModifyRejectMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.session.HeartbeatMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(DcDownloadRequestMessage::new);
        check(GiveupAppConfirmTmMessage::new);
        check(GiveupRejConfirmTmMessage::new);
        check(SignOnOutMessage::new);
        check(SignonInMessage::new);
        check(TradeCancelConfirmMessage::new);
        check(TradeCancelRejectMessage::new);
        check(TradeConfirmationMessage::new);
        check(TradeModifyConfirmMessage::new);
        check(TradeModifyRejectMessage::new);
        check(HeartbeatMessage::new);

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
