package omi.iex.iexequities.deepplus.snap.v1_06.dispatch;

import java.util.Optional;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.AddOrderMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.ClearBookMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.OperationalHaltStatusMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.OrderDeleteMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.OrderExecutedMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.OrderModifyMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.RetailLiquidityIndicatorMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.SecurityDirectoryMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.SecurityEventMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.ShortSalePriceTestStatusMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.SystemEventMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.TradeBreakMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.TradeMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.TradingStatusMessage;
import omi.iex.iexequities.deepplus.snap.v1_06.types.Message;

/**
 * Selects the message a Iex Tp Message Data branch holds by its Iex Tp Message Type.
 */
public final class IexTpMessageDataDispatch {

    private IexTpMessageDataDispatch() {
    }

    /**
     * Decodes the message a Iex Tp Message Type selects.
     *
     * @param iexTpMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char iexTpMessageType, byte[] data, int offset, int end) {
        Message message;
        if (iexTpMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (iexTpMessageType == 'D') {
            message = new SecurityDirectoryMessage();
        } else if (iexTpMessageType == 'H') {
            message = new TradingStatusMessage();
        } else if (iexTpMessageType == 'I') {
            message = new RetailLiquidityIndicatorMessage();
        } else if (iexTpMessageType == 'O') {
            message = new OperationalHaltStatusMessage();
        } else if (iexTpMessageType == 'P') {
            message = new ShortSalePriceTestStatusMessage();
        } else if (iexTpMessageType == 'E') {
            message = new SecurityEventMessage();
        } else if (iexTpMessageType == 'a') {
            message = new AddOrderMessage();
        } else if (iexTpMessageType == 'M') {
            message = new OrderModifyMessage();
        } else if (iexTpMessageType == 'R') {
            message = new OrderDeleteMessage();
        } else if (iexTpMessageType == 'L') {
            message = new OrderExecutedMessage();
        } else if (iexTpMessageType == 'T') {
            message = new TradeMessage();
        } else if (iexTpMessageType == 'B') {
            message = new TradeBreakMessage();
        } else if (iexTpMessageType == 'C') {
            message = new ClearBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
