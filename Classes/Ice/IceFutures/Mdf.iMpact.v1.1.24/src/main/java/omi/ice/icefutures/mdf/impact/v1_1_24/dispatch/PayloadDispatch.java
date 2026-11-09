package omi.ice.icefutures.mdf.impact.v1_1_24.dispatch;

import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.AddOrModifyOrderMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.AddPriceLevelMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.CancelledTradeMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.ChangePriceLevelMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.ClosePriceMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.DeleteOrderMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.DeletePriceLevelMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.EndOfDayMarketSummaryMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.FixingLockdownMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.FixingTransitionMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.IntervalPriceLimitNotificationMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.InvestigatedTradeMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarkerIndexPrices;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketEventMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketSnapshotMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketSnapshotOrderMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketSnapshotPriceLevelMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketStateChangeMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MarketStatisticsMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.MessageBundleMarker;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.NewExpiryMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.NewFuturesStrategyDefinitionMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.NewOptionsMarketDefinitionMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.NewOptionsStrategyDefinitionMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.OldStyleOptionsTradeAndMarketStatsMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.OpenInterestMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.OpenPriceMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.OptionOpenInterestMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.OptionSettlementPriceMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.PreOpenPriceIndicatorMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.RfqMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.SettlementPriceMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.SpecialFieldMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.SpotMarketTradeMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.StripInfoMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.SystemTextMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.messages.application.TradeMessage;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'C') {
            message = new MarketSnapshotMessage();
        } else if (messageType == 'G') {
            message = new TradeMessage();
        } else if (messageType == 'Y') {
            message = new SpotMarketTradeMessage();
        } else if (messageType == 'H') {
            message = new InvestigatedTradeMessage();
        } else if (messageType == 'I') {
            message = new CancelledTradeMessage();
        } else if (messageType == 'J') {
            message = new MarketStatisticsMessage();
        } else if (messageType == 'K') {
            message = new MarketStateChangeMessage();
        } else if (messageType == 'L') {
            message = new SystemTextMessage();
        } else if (messageType == 'M') {
            message = new OpenInterestMessage();
        } else if (messageType == 'N') {
            message = new OpenPriceMessage();
        } else if (messageType == 'c') {
            message = new ClosePriceMessage();
        } else if (messageType == 'O') {
            message = new SettlementPriceMessage();
        } else if (messageType == 'z') {
            message = new MarkerIndexPrices();
        } else if (messageType == 'u') {
            message = new EndOfDayMarketSummaryMessage();
        } else if (messageType == 'f') {
            message = new MarketEventMessage();
        } else if (messageType == 'g') {
            message = new PreOpenPriceIndicatorMessage();
        } else if (messageType == 'i') {
            message = new StripInfoMessage();
        } else if (messageType == 'V') {
            message = new IntervalPriceLimitNotificationMessage();
        } else if (messageType == '9') {
            message = new NewFuturesStrategyDefinitionMessage();
        } else if (messageType == 'R') {
            message = new NewExpiryMessage();
        } else if (messageType == 'b') {
            message = new SpecialFieldMessage();
        } else if (messageType == 'D') {
            message = new MarketSnapshotOrderMessage();
        } else if (messageType == 'E') {
            message = new AddOrModifyOrderMessage();
        } else if (messageType == 'F') {
            message = new DeleteOrderMessage();
        } else if (messageType == 'T') {
            message = new MessageBundleMarker();
        } else if (messageType == '3') {
            message = new FixingTransitionMessage();
        } else if (messageType == '4') {
            message = new FixingLockdownMessage();
        } else if (messageType == 'm') {
            message = new MarketSnapshotPriceLevelMessage();
        } else if (messageType == 't') {
            message = new AddPriceLevelMessage();
        } else if (messageType == 's') {
            message = new ChangePriceLevelMessage();
        } else if (messageType == 'r') {
            message = new DeletePriceLevelMessage();
        } else if (messageType == 'U') {
            message = new NewOptionsStrategyDefinitionMessage();
        } else if (messageType == 'l') {
            message = new NewOptionsMarketDefinitionMessage();
        } else if (messageType == 'k') {
            message = new RfqMessage();
        } else if (messageType == 'v') {
            message = new OptionOpenInterestMessage();
        } else if (messageType == 'w') {
            message = new OptionSettlementPriceMessage();
        } else if (messageType == 'W') {
            message = new OldStyleOptionsTradeAndMarketStatsMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
