package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.dispatch;

import java.util.Optional;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.EndOfSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.ImpliedOrderUpdateMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.MarketStatMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.OpenInterestMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.OrderDeleteMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.OrderPutMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.OrderSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.OutrightInstrumentDefinitionMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.RetransmitRejectMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.RetransmitRequestMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.SpreadInstrumentDefinitionMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.SpreadTradeAmendMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.StartOfOutrightInstrumentSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.StartOfSpreadInstrumentSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradeAmendMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradeBustMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradeMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradeSessionVolumeMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradeSummaryMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application.TradingStatusUpdateMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.Message;

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
            message = new OutrightInstrumentDefinitionMessage();
        } else if (templateId == 11L) {
            message = new SpreadInstrumentDefinitionMessage();
        } else if (templateId == 17L) {
            message = new TradingStatusUpdateMessage();
        } else if (templateId == 20L) {
            message = new OrderPutMessage();
        } else if (templateId == 21L) {
            message = new OrderDeleteMessage();
        } else if (templateId == 22L) {
            message = new ImpliedOrderUpdateMessage();
        } else if (templateId == 33L) {
            message = new TradeSummaryMessage();
        } else if (templateId == 30L) {
            message = new TradeMessage();
        } else if (templateId == 31L) {
            message = new TradeAmendMessage();
        } else if (templateId == 34L) {
            message = new SpreadTradeAmendMessage();
        } else if (templateId == 32L) {
            message = new TradeBustMessage();
        } else if (templateId == 40L) {
            message = new MarketStatMessage();
        } else if (templateId == 41L) {
            message = new TradeSessionVolumeMessage();
        } else if (templateId == 42L) {
            message = new OpenInterestMessage();
        } else if (templateId == 110L) {
            message = new StartOfOutrightInstrumentSnapshotMessage();
        } else if (templateId == 111L) {
            message = new StartOfSpreadInstrumentSnapshotMessage();
        } else if (templateId == 120L) {
            message = new OrderSnapshotMessage();
        } else if (templateId == 122L) {
            message = new EndOfSnapshotMessage();
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
