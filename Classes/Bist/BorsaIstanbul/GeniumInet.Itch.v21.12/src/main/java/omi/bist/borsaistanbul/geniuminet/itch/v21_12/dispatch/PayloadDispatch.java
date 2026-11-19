package omi.bist.borsaistanbul.geniuminet.itch.v21_12.dispatch;

import java.util.Optional;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.AddOrderNoMpidAttribution;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.AddOrderWithMpidAttribution;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.CombinationOrderBookLeg;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.EquilibriumPriceUpdate;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderBookDirectory;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderBookFlushMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderBookStateMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderDeleteMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderExecutedMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderExecutedWithPriceMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.OrderReplaceMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.SecondsMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.ShortSellStatus;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.SystemEventMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.TickSizeTableEntry;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application.TradeMessage;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.Message;

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
            message = new SecondsMessage();
        } else if (messageType == 'R') {
            message = new OrderBookDirectory();
        } else if (messageType == 'M') {
            message = new CombinationOrderBookLeg();
        } else if (messageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (messageType == 'V') {
            message = new ShortSellStatus();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'A') {
            message = new AddOrderNoMpidAttribution();
        } else if (messageType == 'F') {
            message = new AddOrderWithMpidAttribution();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'Y') {
            message = new OrderBookFlushMessage();
        } else if (messageType == 'P') {
            message = new TradeMessage();
        } else if (messageType == 'Z') {
            message = new EquilibriumPriceUpdate();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
