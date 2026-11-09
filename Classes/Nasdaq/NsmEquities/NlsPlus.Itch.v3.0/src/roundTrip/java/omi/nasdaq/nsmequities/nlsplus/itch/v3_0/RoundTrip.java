package omi.nasdaq.nsmequities.nlsplus.itch.v3_0;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.AdjustedClosingPriceMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.EndOfDayTradeSummaryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.IpoInformationMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.LongFormAdjustedClosingPriceMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.LongFormEndOfDayTradeSummaryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.LongFormTradeCancelErrorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.LongFormTradeCorrectionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.LongFormTradeReportMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.MwcbStatusMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.NextSharesEndOfDayTradeSummaryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.NextSharesTradeCancelErrorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.NextSharesTradeCorrectionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.NextSharesTradeReportMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.TradeReportMessage;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AdjustedClosingPriceMessage::new);
        check(EndOfDayTradeSummaryMessage::new);
        check(IpoInformationMessage::new);
        check(IpoQuotingPeriodUpdateMessage::new);
        check(LongFormAdjustedClosingPriceMessage::new);
        check(LongFormEndOfDayTradeSummaryMessage::new);
        check(LongFormTradeCancelErrorMessage::new);
        check(LongFormTradeCorrectionMessage::new);
        check(LongFormTradeReportMessage::new);
        check(MwcbDeclineLevelMessage::new);
        check(MwcbStatusMessage::new);
        check(NextSharesEndOfDayTradeSummaryMessage::new);
        check(NextSharesTradeCancelErrorMessage::new);
        check(NextSharesTradeCorrectionMessage::new);
        check(NextSharesTradeReportMessage::new);
        check(OperationalHaltMessage::new);
        check(RegShoShortSalePriceTestRestrictedIndicatorMessage::new);
        check(StockDirectoryMessage::new);
        check(StockTradingActionMessage::new);
        check(SystemEventMessage::new);
        check(TradeCancelErrorMessage::new);
        check(TradeCorrectionMessage::new);
        check(TradeReportMessage::new);

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
