package omi.jpx.tseequities.indexstatistics.flex.v19_5;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.ControlMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.EstimatedTotalTradingVolumeMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.EstimatedTotalTurnoverMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.IndexOpenHighLowAndClosingPricesMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.JapaneseYenCbIndicatorMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.MarketValueMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.NumberOfGainersDeclinersMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.RankingByNetChangeMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.RankingByNetChangeRateMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.RankingByTradingVolumeMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.RankingByTurnoverMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.SimpleStockPriceAverageByIndustryMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.SimpleStockPriceAverageMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.SimpleYieldMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.SpecialQuotationMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.TostnetStatisticsMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.VwapByMarketMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.WeightedStockPriceAverageMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application.WeightedYieldMessage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(ControlMessage::new);
        check(EstimatedTotalTradingVolumeMessage::new);
        check(EstimatedTotalTurnoverMessage::new);
        check(IndexOpenHighLowAndClosingPricesMessage::new);
        check(JapaneseYenCbIndicatorMessage::new);
        check(MarketValueMessage::new);
        check(NumberOfGainersDeclinersMessage::new);
        check(RankingByNetChangeMessage::new);
        check(RankingByNetChangeRateMessage::new);
        check(RankingByTradingVolumeMessage::new);
        check(RankingByTurnoverMessage::new);
        check(SimpleStockPriceAverageByIndustryMessage::new);
        check(SimpleStockPriceAverageMessage::new);
        check(SimpleYieldMessage::new);
        check(SpecialQuotationMessage::new);
        check(TostnetStatisticsMessage::new);
        check(VwapByMarketMessage::new);
        check(WeightedStockPriceAverageMessage::new);
        check(WeightedYieldMessage::new);

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
