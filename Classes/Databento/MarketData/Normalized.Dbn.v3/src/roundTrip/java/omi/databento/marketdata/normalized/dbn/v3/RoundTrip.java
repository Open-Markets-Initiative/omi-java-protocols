package omi.databento.marketdata.normalized.dbn.v3;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.BboMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.CbboMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.Cmbp1Msg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.ErrorMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.ImbalanceMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.InstrumentDefMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.MboMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.Mbp10Msg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.Mbp1Msg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.OhlcvMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.StatMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.StatusMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.SymbolMappingMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.SystemMsg;
import omi.databento.marketdata.normalized.dbn.v3.messages.application.TradeMsg;
import omi.databento.marketdata.normalized.dbn.v3.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BboMsg::new);
        check(CbboMsg::new);
        check(Cmbp1Msg::new);
        check(ErrorMsg::new);
        check(ImbalanceMsg::new);
        check(InstrumentDefMsg::new);
        check(MboMsg::new);
        check(Mbp1Msg::new);
        check(Mbp10Msg::new);
        check(OhlcvMsg::new);
        check(StatMsg::new);
        check(StatusMsg::new);
        check(SymbolMappingMsg::new);
        check(SystemMsg::new);
        check(TradeMsg::new);

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
