package omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.EndOfDaySummaryMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.EndOfSessionMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.FuturesInstrumentDefinitionMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.FuturesVarianceSymbolMappingMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.MarketSnapshotLongMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.MarketSnapshotShortMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.OpenInterestMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.PriceLimitsMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.SettlementMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.SingleSideUpdateLongMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.SingleSideUpdateShortMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TimeMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TimeReferenceMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TopTradeMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TradingStatusMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TwoSideUpdateLongMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.TwoSideUpdateShortMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.messages.application.UnitClearMessage;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_22.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 177L) {
            message = new TimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 187L) {
            message = new FuturesInstrumentDefinitionMessage();
        } else if (messageType == 250L) {
            message = new FuturesVarianceSymbolMappingMessage();
        } else if (messageType == 190L) {
            message = new PriceLimitsMessage();
        } else if (messageType == 178L) {
            message = new MarketSnapshotShortMessage();
        } else if (messageType == 179L) {
            message = new MarketSnapshotLongMessage();
        } else if (messageType == 180L) {
            message = new SingleSideUpdateShortMessage();
        } else if (messageType == 181L) {
            message = new SingleSideUpdateLongMessage();
        } else if (messageType == 182L) {
            message = new TwoSideUpdateShortMessage();
        } else if (messageType == 183L) {
            message = new TwoSideUpdateLongMessage();
        } else if (messageType == 184L) {
            message = new TopTradeMessage();
        } else if (messageType == 185L) {
            message = new SettlementMessage();
        } else if (messageType == 186L) {
            message = new EndOfDaySummaryMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 211L) {
            message = new OpenInterestMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
