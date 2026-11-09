package omi.nyse.texasequities.integratedfeed.pillar.v2_5_g;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.AddOrderMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.AddOrderRefreshMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.CrossCorrectionMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.CrossTradeMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.DeleteOrderMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.ImbalanceMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.ModifyOrderMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.NonDisplayedTradeMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.OrderExecutionMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.ReplaceOrderMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.RetailPriceImprovementMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.SecurityStatusMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.SequenceNumberResetMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.SourceTimeReferenceMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.SymbolClearMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.SymbolIndexMappingMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.messages.application.TradeCancelMessage;
import omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderMessage::new);
        check(AddOrderRefreshMessage::new);
        check(CrossCorrectionMessage::new);
        check(CrossTradeMessage::new);
        check(DeleteOrderMessage::new);
        check(ImbalanceMessage::new);
        check(ModifyOrderMessage::new);
        check(NonDisplayedTradeMessage::new);
        check(OrderExecutionMessage::new);
        check(ReplaceOrderMessage::new);
        check(RetailPriceImprovementMessage::new);
        check(SecurityStatusMessage::new);
        check(SequenceNumberResetMessage::new);
        check(SourceTimeReferenceMessage::new);
        check(SymbolClearMessage::new);
        check(SymbolIndexMappingMessage::new);
        check(TradeCancelMessage::new);

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
