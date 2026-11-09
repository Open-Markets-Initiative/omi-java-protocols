package omi.eurex.t7.eobi.fbe.v6_0.dispatch;

import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.AddComplexInstrument;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.AuctionBbo;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.AuctionClearingPrice;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.CrossRequest;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.ExecutionSummary;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.FullOrderExecution;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.Heartbeat;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.InstrumentStateChange;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.InstrumentSummary;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.OrderAdd;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.OrderDelete;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.OrderMassDelete;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.OrderModify;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.OrderModifySamePrio;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.PartialOrderExecution;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.ProductStateChange;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.ProductSummary;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.QuoteRequest;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.SnapshotOrder;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.TopOfBook;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.TradeReport;
import omi.eurex.t7.eobi.fbe.v6_0.messages.application.TradeReversal;
import omi.eurex.t7.eobi.fbe.v6_0.types.Message;

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
        if (templateId == 13400L) {
            message = new AddComplexInstrument();
        } else if (templateId == 13500L) {
            message = new AuctionBbo();
        } else if (templateId == 13501L) {
            message = new AuctionClearingPrice();
        } else if (templateId == 13502L) {
            message = new CrossRequest();
        } else if (templateId == 13202L) {
            message = new ExecutionSummary();
        } else if (templateId == 13104L) {
            message = new FullOrderExecution();
        } else if (templateId == 13001L) {
            message = new Heartbeat();
        } else if (templateId == 13301L) {
            message = new InstrumentStateChange();
        } else if (templateId == 13601L) {
            message = new InstrumentSummary();
        } else if (templateId == 13100L) {
            message = new OrderAdd();
        } else if (templateId == 13102L) {
            message = new OrderDelete();
        } else if (templateId == 13103L) {
            message = new OrderMassDelete();
        } else if (templateId == 13101L) {
            message = new OrderModify();
        } else if (templateId == 13106L) {
            message = new OrderModifySamePrio();
        } else if (templateId == 13105L) {
            message = new PartialOrderExecution();
        } else if (templateId == 13300L) {
            message = new ProductStateChange();
        } else if (templateId == 13600L) {
            message = new ProductSummary();
        } else if (templateId == 13503L) {
            message = new QuoteRequest();
        } else if (templateId == 13602L) {
            message = new SnapshotOrder();
        } else if (templateId == 13504L) {
            message = new TopOfBook();
        } else if (templateId == 13201L) {
            message = new TradeReport();
        } else if (templateId == 13200L) {
            message = new TradeReversal();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
