package omi.nairobi.nairobiequities.replay.mitch.v1_22.dispatch;

import java.util.Optional;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.AddAttributedOrderMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.AddOrderMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.AonInfoMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.AuctionInfoMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.AuctionTradeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.ConsolidatedStatisticsMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.DeletePricePointMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.ExtendedStatisticsMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.IndexMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.LoginRequestMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.LoginResponseMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.LogoutRequestMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.NewsMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OffBookTradeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OrderBookClearMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OrderDeletedMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OrderExecutedMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OrderExecutedWithPriceSizeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.OrderModifiedMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.RecoveryTradeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.ReplayRequestMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.ReplayResponseMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.StatisticsMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.SymbolDirectoryMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.SymbolStatusMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.SystemEventMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.TimeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.TopOfBookMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.TradeBreakMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.TradeCorrectionMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.TradeMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application.UpdatePricePointMessage;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Message;

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
            message = new LoginRequestMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 3L) {
            message = new ReplayRequestMessage();
        } else if (messageType == 4L) {
            message = new ReplayResponseMessage();
        } else if (messageType == 5L) {
            message = new LogoutRequestMessage();
        } else if (messageType == 84L) {
            message = new TimeMessage();
        } else if (messageType == 83L) {
            message = new SystemEventMessage();
        } else if (messageType == 82L) {
            message = new SymbolDirectoryMessage();
        } else if (messageType == 72L) {
            message = new SymbolStatusMessage();
        } else if (messageType == 65L) {
            message = new AddOrderMessage();
        } else if (messageType == 70L) {
            message = new AddAttributedOrderMessage();
        } else if (messageType == 68L) {
            message = new OrderDeletedMessage();
        } else if (messageType == 85L) {
            message = new OrderModifiedMessage();
        } else if (messageType == 121L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 69L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 67L) {
            message = new OrderExecutedWithPriceSizeMessage();
        } else if (messageType == 80L) {
            message = new TradeMessage();
        } else if (messageType == 81L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 120L) {
            message = new OffBookTradeMessage();
        } else if (messageType == 66L) {
            message = new TradeBreakMessage();
        } else if (messageType == 96L) {
            message = new TradeCorrectionMessage();
        } else if (messageType == 118L) {
            message = new RecoveryTradeMessage();
        } else if (messageType == 73L) {
            message = new AuctionInfoMessage();
        } else if (messageType == 119L) {
            message = new StatisticsMessage();
        } else if (messageType == 128L) {
            message = new ExtendedStatisticsMessage();
        } else if (messageType == 100L) {
            message = new ConsolidatedStatisticsMessage();
        } else if (messageType == 98L) {
            message = new IndexMessage();
        } else if (messageType == 101L) {
            message = new AonInfoMessage();
        } else if (messageType == 117L) {
            message = new NewsMessage();
        } else if (messageType == 115L) {
            message = new UpdatePricePointMessage();
        } else if (messageType == 114L) {
            message = new DeletePricePointMessage();
        } else if (messageType == 113L) {
            message = new TopOfBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
