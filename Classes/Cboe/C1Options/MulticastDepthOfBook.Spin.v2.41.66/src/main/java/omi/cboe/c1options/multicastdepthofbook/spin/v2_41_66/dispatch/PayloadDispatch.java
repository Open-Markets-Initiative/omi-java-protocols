package omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.dispatch;

import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AddOrderExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AddOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AddOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AuctionCancelMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AuctionNotificationMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AuctionSummaryMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.AuctionTradeMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.ConstituentSymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.DeleteOrderMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.EndOfSessionMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.InstrumentDefinitionFinishedMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.InstrumentDefinitionRequestMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.InstrumentDefinitionResponseMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.LoginMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.LoginResponseMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.ModifyOrderLongMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.ModifyOrderShortMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.OptionsAuctionUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.OrderExecutedAtPriceSizeMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.OrderExecutedMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.ReduceSizeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.ReduceSizeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SoqStrikeRangeUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SpinFinishedMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SpinImageAvailableMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SpinRequestMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SpinResponseMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.SymbolMappingMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TimeMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TradeBreakMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TradeExpandedMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TradeLongMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TradeShortMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TradingStatusMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TransactionBeginMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.TransactionEndMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.UnitClearMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.messages.application.WidthUpdateMessage;
import omi.cboe.c1options.multicastdepthofbook.spin.v2_41_66.types.Message;

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
        if (messageType == 1L) {
            message = new LoginMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 128L) {
            message = new SpinImageAvailableMessage();
        } else if (messageType == 129L) {
            message = new SpinRequestMessage();
        } else if (messageType == 130L) {
            message = new SpinResponseMessage();
        } else if (messageType == 131L) {
            message = new SpinFinishedMessage();
        } else if (messageType == 132L) {
            message = new InstrumentDefinitionRequestMessage();
        } else if (messageType == 133L) {
            message = new InstrumentDefinitionResponseMessage();
        } else if (messageType == 134L) {
            message = new InstrumentDefinitionFinishedMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 188L) {
            message = new TransactionBeginMessage();
        } else if (messageType == 189L) {
            message = new TransactionEndMessage();
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
        } else if (messageType == 48L) {
            message = new TradeExpandedMessage();
        } else if (messageType == 44L) {
            message = new TradeBreakMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else if (messageType == 46L) {
            message = new SymbolMappingMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 210L) {
            message = new WidthUpdateMessage();
        } else if (messageType == 209L) {
            message = new OptionsAuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 173L) {
            message = new AuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new AuctionCancelMessage();
        } else if (messageType == 175L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 157L) {
            message = new SoqStrikeRangeUpdateMessage();
        } else if (messageType == 158L) {
            message = new ConstituentSymbolMappingMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
