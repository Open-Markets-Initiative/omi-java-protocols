package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.BusinessRejectMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.ExecutionReportMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.HeartbeatMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.LogonMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.LogonResponseMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.LogoutMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.MissedMessageRequestAckMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.MissedMessageRequestMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.NewsMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.OrderCancelRejectMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.OrderMassCancelReportMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.RejectMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.SecurityDefinitionResponseMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.SystemStatusMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application.TransmissionCompleteMessage;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BusinessRejectMessage::new);
        check(ExecutionReportMessage::new);
        check(LogonMessage::new);
        check(LogonResponseMessage::new);
        check(LogoutMessage::new);
        check(MissedMessageRequestAckMessage::new);
        check(MissedMessageRequestMessage::new);
        check(NewsMessage::new);
        check(OrderCancelRejectMessage::new);
        check(OrderMassCancelReportMessage::new);
        check(RejectMessage::new);
        check(SecurityDefinitionResponseMessage::new);
        check(SystemStatusMessage::new);
        check(TransmissionCompleteMessage::new);
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
