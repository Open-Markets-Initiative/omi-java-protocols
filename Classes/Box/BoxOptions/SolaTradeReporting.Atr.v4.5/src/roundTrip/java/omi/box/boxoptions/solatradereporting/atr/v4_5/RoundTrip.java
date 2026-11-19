package omi.box.boxoptions.solatradereporting.atr.v4_5;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.AcknowledgementMessage;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.Allocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.AllocationCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.CircuitAssurance;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.CircuitResponse;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ClientSignon;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ClientSignonAcknowledgment;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.DeleteAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.DeleteGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.EndOfTrading;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ErrorMessage;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.GiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.GiveUpCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ModifyAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.ModifyGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.NewAllocation;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.NewGiveUp;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.RestartAccepted;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.RestartRequest;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.StartOfDay;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.StartOfDayAcknowledgement;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.Trade;
import omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application.TradeCancel;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(Allocation::new);
        check(AllocationCancel::new);
        check(ClientSignon::new);
        check(ClientSignonAcknowledgment::new);
        check(DeleteAllocation::new);
        check(DeleteGiveUp::new);
        check(ErrorMessage::new);
        check(GiveUp::new);
        check(GiveUpCancel::new);
        check(ModifyAllocation::new);
        check(ModifyGiveUp::new);
        check(NewAllocation::new);
        check(NewGiveUp::new);
        check(RestartRequest::new);
        check(Trade::new);
        check(TradeCancel::new);
        check(StartOfDayAcknowledgement::new);
        check(CircuitResponse::new);
        check(StartOfDay::new);
        check(CircuitAssurance::new);
        check(RestartAccepted::new);
        check(EndOfTrading::new);
        check(AcknowledgementMessage::new);

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
