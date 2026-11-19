package omi.cnsx.cse2.multicast.mmd.v1_6.dispatch;

import java.util.Optional;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.AddOrderMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.BestBidOfferMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.BrokenTradeMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.ClosingPriceMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.GeneralMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.OrderDeleteMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.OrderExecutedMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.OrderExecutedWithPriceMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.OrderReplaceMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.SymbolDirectoryMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.SymbolDynamicsMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.SystemEventMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.TimeMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.TradeMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.messages.application.TradingActionMessage;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.Message;

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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'T') {
            message = new TimeMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new SymbolDirectoryMessage();
        } else if (messageType == 'O') {
            message = new SymbolDynamicsMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'Q') {
            message = new BestBidOfferMessage();
        } else if (messageType == 'F') {
            message = new ClosingPriceMessage();
        } else if (messageType == 'G') {
            message = new GeneralMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
