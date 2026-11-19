package omi.jpx.tseequities.indexstatistics.flex.v19_5.dispatch;

import java.util.Optional;
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

/**
 * Selects the message a Payload branch holds by its Tag ID.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Tag ID selects.
     *
     * @param tagId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String tagId, byte[] data, int offset, int end) {
        Message message;
        if ("MV".equals(tagId)) {
            message = new MarketValueMessage();
        } else if ("YS".equals(tagId)) {
            message = new SimpleYieldMessage();
        } else if ("YW".equals(tagId)) {
            message = new WeightedYieldMessage();
        } else if ("AP".equals(tagId)) {
            message = new SimpleStockPriceAverageMessage();
        } else if ("AW".equals(tagId)) {
            message = new WeightedStockPriceAverageMessage();
        } else if ("AT".equals(tagId)) {
            message = new SimpleStockPriceAverageByIndustryMessage();
        } else if ("IY".equals(tagId)) {
            message = new JapaneseYenCbIndicatorMessage();
        } else if ("NC".equals(tagId)) {
            message = new NumberOfGainersDeclinersMessage();
        } else if ("TV".equals(tagId)) {
            message = new EstimatedTotalTradingVolumeMessage();
        } else if ("TA".equals(tagId)) {
            message = new EstimatedTotalTurnoverMessage();
        } else if ("VS".equals(tagId)) {
            message = new VwapByMarketMessage();
        } else if ("RO".equals(tagId)) {
            message = new RankingByTradingVolumeMessage();
        } else if ("RA".equals(tagId)) {
            message = new RankingByTurnoverMessage();
        } else if ("RC".equals(tagId)) {
            message = new RankingByNetChangeMessage();
        } else if ("RP".equals(tagId)) {
            message = new RankingByNetChangeRateMessage();
        } else if ("TS".equals(tagId)) {
            message = new TostnetStatisticsMessage();
        } else if ("4I".equals(tagId)) {
            message = new IndexOpenHighLowAndClosingPricesMessage();
        } else if ("SQ".equals(tagId)) {
            message = new SpecialQuotationMessage();
        } else if ("LC".equals(tagId)) {
            message = new ControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
