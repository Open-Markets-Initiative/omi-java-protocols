package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.dispatch;

import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.AddOrderNoMpid;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.AddOrderWithMpid;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.CombinationOrderbookLeg;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.EquilibriumPriceUpdate;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderBookDirectory;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderBookStateMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderDeleteMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderExecutedMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderExecutedWithPriceMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.OrderReplaceMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.SecondsMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.SystemEventMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.TickSizeTableEntry;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application.TradeMessage;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.Message;

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
            message = new CombinationOrderbookLeg();
        } else if (messageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'A') {
            message = new AddOrderNoMpid();
        } else if (messageType == 'F') {
            message = new AddOrderWithMpid();
        } else if (messageType == 'E') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'C') {
            message = new OrderExecutedWithPriceMessage();
        } else if (messageType == 'U') {
            message = new OrderReplaceMessage();
        } else if (messageType == 'D') {
            message = new OrderDeleteMessage();
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
