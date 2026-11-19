package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.dispatch;

import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.IndexValueSnapshotMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.InstrumentTradingStatusIncrementalMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.MarketSummaryIncrementalMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.MarketSummarySnapshotMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.MultilegDefinitionIncrementalV2Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.MultilegDefinitionSnapshotV2Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.OrderBookIncrementalMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.OrderBookSnapshotMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.SingleInstrumentDefinitionIncrementalV2Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.SingleInstrumentDefinitionSnapshotV2Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.TradeBustMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.TradeCorrectMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application.TradesIncrementalMessage;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 3L) {
            message = new InstrumentTradingStatusIncrementalMessage();
        } else if (templateId == 4L) {
            message = new TradesIncrementalMessage();
        } else if (templateId == 5L) {
            message = new TradeCorrectMessage();
        } else if (templateId == 6L) {
            message = new TradeBustMessage();
        } else if (templateId == 7L) {
            message = new OrderBookIncrementalMessage();
        } else if (templateId == 8L) {
            message = new MarketSummaryIncrementalMessage();
        } else if (templateId == 11L) {
            message = new OrderBookSnapshotMessage();
        } else if (templateId == 12L) {
            message = new MarketSummarySnapshotMessage();
        } else if (templateId == 13L) {
            message = new IndexValueSnapshotMessage();
        } else if (templateId == 14L) {
            message = new SingleInstrumentDefinitionIncrementalV2Message();
        } else if (templateId == 15L) {
            message = new MultilegDefinitionIncrementalV2Message();
        } else if (templateId == 16L) {
            message = new SingleInstrumentDefinitionSnapshotV2Message();
        } else if (templateId == 17L) {
            message = new MultilegDefinitionSnapshotV2Message();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
