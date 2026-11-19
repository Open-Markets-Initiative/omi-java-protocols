package omi.coinbase.deribit.marketdataapi.sbe.v1_0.dispatch;

import java.util.Optional;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.AskDeleteMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.AskPutMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.AskQtyReducedMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.BidDeleteMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.BidPutMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.BidQtyReducedMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.BlockTradeMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.EndOfCycleMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.IndexDefinitionMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.InstrumentDefinitionMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.InstrumentInfoMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.InstrumentRefMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.InstrumentStatusUpdateMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.RetransmitRejectMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.RetransmitRequestMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.SnapshotHeaderMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.SnapshotTrailerMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.TradeMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application.TradeSummaryMessage;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.types.Message;

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
        if (templateId == 10L) {
            message = new InstrumentDefinitionMessage();
        } else if (templateId == 11L) {
            message = new IndexDefinitionMessage();
        } else if (templateId == 14L) {
            message = new InstrumentInfoMessage();
        } else if (templateId == 15L) {
            message = new InstrumentRefMessage();
        } else if (templateId == 16L) {
            message = new InstrumentStatusUpdateMessage();
        } else if (templateId == 20L) {
            message = new BidPutMessage();
        } else if (templateId == 21L) {
            message = new AskPutMessage();
        } else if (templateId == 22L) {
            message = new BidQtyReducedMessage();
        } else if (templateId == 23L) {
            message = new AskQtyReducedMessage();
        } else if (templateId == 24L) {
            message = new BidDeleteMessage();
        } else if (templateId == 25L) {
            message = new AskDeleteMessage();
        } else if (templateId == 30L) {
            message = new TradeSummaryMessage();
        } else if (templateId == 31L) {
            message = new TradeMessage();
        } else if (templateId == 33L) {
            message = new BlockTradeMessage();
        } else if (templateId == 100L) {
            message = new SnapshotHeaderMessage();
        } else if (templateId == 101L) {
            message = new SnapshotTrailerMessage();
        } else if (templateId == 119L) {
            message = new EndOfCycleMessage();
        } else if (templateId == 200L) {
            message = new RetransmitRequestMessage();
        } else if (templateId == 202L) {
            message = new RetransmitRejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
