package omi.iex.iexequities.deepplus.iextp.v1_01.dispatch;

import java.util.Optional;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.AddOrderMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.ClearBookMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.OperationalHaltStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderDeleteMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderExecutedMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderModifyMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.RetailLiquidityIndicatorMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.SecurityDirectoryMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.SecurityEventMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.ShortSalePriceTestStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.SystemEventMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradeBreakMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradeMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradingStatusMessage;
import omi.iex.iexequities.deepplus.iextp.v1_01.types.Message;

/**
 * Selects the message a Message Data branch holds by its Message Type.
 */
public final class MessageDataDispatch {

    private MessageDataDispatch() {
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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'D') {
            message = new SecurityDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingStatusMessage();
        } else if (messageType == 'I') {
            message = new RetailLiquidityIndicatorMessage();
        } else if (messageType == 'O') {
            message = new OperationalHaltStatusMessage();
        } else if (messageType == 'P') {
            message = new ShortSalePriceTestStatusMessage();
        } else if (messageType == 'E') {
            message = new SecurityEventMessage();
        } else if (messageType == 'a') {
            message = new AddOrderMessage();
        } else if (messageType == 'M') {
            message = new OrderModifyMessage();
        } else if (messageType == 'R') {
            message = new OrderDeleteMessage();
        } else if (messageType == 'L') {
            message = new OrderExecutedMessage();
        } else if (messageType == 'T') {
            message = new TradeMessage();
        } else if (messageType == 'B') {
            message = new TradeBreakMessage();
        } else if (messageType == 'C') {
            message = new ClearBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
