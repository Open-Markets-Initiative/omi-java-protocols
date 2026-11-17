package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.dispatch;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.AddOrderMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.ClearBookMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.OperationalHaltStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderDeleteMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderExecutedMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.OrderModifyMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.RetailLiquidityIndicatorMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.SecurityDirectoryMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.SecurityEventMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.ShortSalePriceTestStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.SystemEventMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradeMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application.TradingStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, each into a view of its own.
 *
 * <p>A message returned is a new view, valid for as long as its bytes are unchanged. The decoder holds nothing, so
 * it may be shared between threads.</p>
 */
public final class MessageDataDecoder {

    /**
     * Creates a decoder.
     */
    public MessageDataDecoder() {
    }

    /**
     * Decodes one message.
     *
     * @param messageType the value selecting the message
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @return a view of the message, or null when this library decodes no message of that type
     * @throws omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                return new SystemEventMessage(buffer, offset, end);
            case 'D':
                return new SecurityDirectoryMessage(buffer, offset, end);
            case 'H':
                return new TradingStatusMessage(buffer, offset, end);
            case 'I':
                return new RetailLiquidityIndicatorMessage(buffer, offset, end);
            case 'O':
                return new OperationalHaltStatusMessage(buffer, offset, end);
            case 'P':
                return new ShortSalePriceTestStatusMessage(buffer, offset, end);
            case 'E':
                return new SecurityEventMessage(buffer, offset, end);
            case 'a':
                return new AddOrderMessage(buffer, offset, end);
            case 'M':
                return new OrderModifyMessage(buffer, offset, end);
            case 'R':
                return new OrderDeleteMessage(buffer, offset, end);
            case 'L':
                return new OrderExecutedMessage(buffer, offset, end);
            case 'T':
                return new TradeMessage(buffer, offset, end);
            case 'B':
                return new TradeBreakMessage(buffer, offset, end);
            case 'C':
                return new ClearBookMessage(buffer, offset, end);
            default:
                return null;
        }
    }
}
