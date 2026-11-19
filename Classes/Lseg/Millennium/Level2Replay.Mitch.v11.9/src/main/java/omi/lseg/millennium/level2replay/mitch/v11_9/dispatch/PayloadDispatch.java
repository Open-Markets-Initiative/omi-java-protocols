package omi.lseg.millennium.level2replay.mitch.v11_9.dispatch;

import java.util.Optional;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.AddAttributedOrderMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.AddOrderMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.AuctionInfoMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.AuctionTradeMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.LoginRequestMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.LoginResponseMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.LogoutRequestMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.OrderBookClearMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.OrderDeletedMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.OrderExecutedMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.OrderExecutedWithPriceSizeMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.OrderModifiedMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.ReplayRequestMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.ReplayResponseMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.StatisticsMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.SymbolDirectoryMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.SymbolStatusMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.SystemEventMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.TimeMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.TopOfBookMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.messages.application.TradeMessage;
import omi.lseg.millennium.level2replay.mitch.v11_9.types.Message;

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
        } else if (messageType == 73L) {
            message = new AuctionInfoMessage();
        } else if (messageType == 119L) {
            message = new StatisticsMessage();
        } else if (messageType == 113L) {
            message = new TopOfBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
