package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.InstrumentDirectoryMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.InstrumentStatusMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.LoginRequestMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.LoginResponseMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.MifidIiTradeReportMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.RecoveryRequestMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.RecoveryResponseMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.ReplayAndRecoveryCompleteMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.StatisticsSnapshotMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.messages.application.SystemEventMessage;
import omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(InstrumentDirectoryMessage::new);
        check(InstrumentStatusMessage::new);
        check(LoginRequestMessage::new);
        check(LoginResponseMessage::new);
        check(MifidIiTradeReportMessage::new);
        check(RecoveryRequestMessage::new);
        check(RecoveryResponseMessage::new);
        check(ReplayAndRecoveryCompleteMessage::new);
        check(StatisticsSnapshotMessage::new);
        check(SystemEventMessage::new);

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
