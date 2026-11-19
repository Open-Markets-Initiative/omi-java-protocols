package omi.tmx.tsx.level1.qrtmd.v2_8;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.CalculatedOpeningPriceMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.GeneralMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.IndicativePriceMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.MarketStateMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.MocImbalanceNotificationMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.MocPriceMovementDelayMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.QuoteMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.StockStateMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.SymbolStatusMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.TradeCancellationMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.TradeCorrectionMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.TradeMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.TradingTierStatusMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.messages.application.TsxTsxvClosingPriceMessage;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(CalculatedOpeningPriceMessage::new);
        check(GeneralMessage::new);
        check(IndicativePriceMessage::new);
        check(MarketStateMessage::new);
        check(MocImbalanceNotificationMessage::new);
        check(MocPriceMovementDelayMessage::new);
        check(QuoteMessage::new);
        check(StockStateMessage::new);
        check(SymbolStatusMessage::new);
        check(TradeCancellationMessage::new);
        check(TradeCorrectionMessage::new);
        check(TradeMessage::new);
        check(TradingTierStatusMessage::new);
        check(TsxTsxvClosingPriceMessage::new);

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
