package omi.sgx.titandt.depthofbook.itch.v1_4.dispatch;

import java.util.Optional;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.AddOrderMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.CombinationOrderBookDirectoryMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.EquilibriumPriceUpdateMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderBookDirectoryMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderBookStateMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderDeleteMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderExecutedMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderExecutedWithPriceMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.OrderReplaceMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.SecondsMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.SystemEventMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.TickSizeTableEntryMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.messages.application.TradeMessage;
import omi.sgx.titandt.depthofbook.itch.v1_4.types.Message;

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
            message = new OrderBookDirectoryMessage();
        } else if (messageType == 'M') {
            message = new CombinationOrderBookDirectoryMessage();
        } else if (messageType == 'L') {
            message = new TickSizeTableEntryMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'A') {
            message = new AddOrderMessage();
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
            message = new EquilibriumPriceUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
