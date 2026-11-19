package omi.bse.bseindia.eobi.fbe.v1_4.dispatch;

import java.util.Optional;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.AddComplexInstrumentMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.AuctionBestBidOfferMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.AuctionClearingPriceMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.ExecutionSummaryMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.FullOrderExecutionMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.HeartbeatMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.InstrumentInfoMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.InstrumentStateChangeMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.InstrumentSummaryMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.LppRangeMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.OrderAddMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.OrderDeleteMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.OrderMassDeleteMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.OrderModifyMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.OrderModifySamePriorityMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.PartialOrderExecutionMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.ProductStateChangeMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.ProductSummaryMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.SnapshotOrderMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.TopOfBookMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.TradeReversalMessage;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Message;

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
        if (templateId == 13001L) {
            message = new HeartbeatMessage();
        } else if (templateId == 13600L) {
            message = new ProductSummaryMessage();
        } else if (templateId == 13602L) {
            message = new SnapshotOrderMessage();
        } else if (templateId == 13601L) {
            message = new InstrumentSummaryMessage();
        } else if (templateId == 13500L) {
            message = new AuctionBestBidOfferMessage();
        } else if (templateId == 13501L) {
            message = new AuctionClearingPriceMessage();
        } else if (templateId == 13504L) {
            message = new TopOfBookMessage();
        } else if (templateId == 13100L) {
            message = new OrderAddMessage();
        } else if (templateId == 13101L) {
            message = new OrderModifyMessage();
        } else if (templateId == 13106L) {
            message = new OrderModifySamePriorityMessage();
        } else if (templateId == 13102L) {
            message = new OrderDeleteMessage();
        } else if (templateId == 13103L) {
            message = new OrderMassDeleteMessage();
        } else if (templateId == 13105L) {
            message = new PartialOrderExecutionMessage();
        } else if (templateId == 13104L) {
            message = new FullOrderExecutionMessage();
        } else if (templateId == 13200L) {
            message = new TradeReversalMessage();
        } else if (templateId == 13202L) {
            message = new ExecutionSummaryMessage();
        } else if (templateId == 13203L) {
            message = new InstrumentInfoMessage();
        } else if (templateId == 13204L) {
            message = new LppRangeMessage();
        } else if (templateId == 13300L) {
            message = new ProductStateChangeMessage();
        } else if (templateId == 13301L) {
            message = new InstrumentStateChangeMessage();
        } else if (templateId == 13400L) {
            message = new AddComplexInstrumentMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
