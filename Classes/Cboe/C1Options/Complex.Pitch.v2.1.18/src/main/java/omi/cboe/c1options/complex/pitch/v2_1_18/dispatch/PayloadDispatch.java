package omi.cboe.c1options.complex.pitch.v2_1_18.dispatch;

import java.util.Optional;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AddOrderExpandedMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AddOrderLongMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AddOrderShortMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AuctionCancelMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AuctionNotificationMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AuctionSummaryMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AuctionTradeMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.AuctionUpdateMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.ComplexInstrumentDefinitionExpandedMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.DeleteOrderMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.EndOfSessionMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.ModifyOrderLongMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.ModifyOrderShortMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.OrderExecutedAtPriceSizeMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.OrderExecutedMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.ReduceSizeLongMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.ReduceSizeShortMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.SymbolMappingMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TimeMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TradeLongMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TradeShortMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TradingStatusMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TransactionBegin;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.TransactionEndMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.messages.application.UnitClearMessage;
import omi.cboe.c1options.complex.pitch.v2_1_18.types.Message;

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
        if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 188L) {
            message = new TransactionBegin();
        } else if (messageType == 189L) {
            message = new TransactionEndMessage();
        } else if (messageType == 154L) {
            message = new ComplexInstrumentDefinitionExpandedMessage();
        } else if (messageType == 46L) {
            message = new SymbolMappingMessage();
        } else if (messageType == 33L) {
            message = new AddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new AddOrderShortMessage();
        } else if (messageType == 47L) {
            message = new AddOrderExpandedMessage();
        } else if (messageType == 35L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 36L) {
            message = new OrderExecutedAtPriceSizeMessage();
        } else if (messageType == 37L) {
            message = new ReduceSizeLongMessage();
        } else if (messageType == 38L) {
            message = new ReduceSizeShortMessage();
        } else if (messageType == 39L) {
            message = new ModifyOrderLongMessage();
        } else if (messageType == 40L) {
            message = new ModifyOrderShortMessage();
        } else if (messageType == 41L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 42L) {
            message = new TradeLongMessage();
        } else if (messageType == 43L) {
            message = new TradeShortMessage();
        } else if (messageType == 173L) {
            message = new AuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new AuctionCancelMessage();
        } else if (messageType == 175L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 209L) {
            message = new AuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
