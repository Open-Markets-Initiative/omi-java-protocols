package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.dispatch;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.AddOrderMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.ClearBookMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.OperationalHaltStatusMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderDeleteMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderExecutedMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderModifyMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.RetailLiquidityIndicatorMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityDirectoryMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityEventMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.ShortSalePriceTestStatusMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.SystemEventMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeBreakMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradingStatusMessage;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: every field is copied into the flyweight of the message's type, which is returned,
 * so one returned is valid after its bytes are reused, until this decoder decodes the next message of its type. A
 * decoder is not safe to share between threads.</p>
 */
public final class MessageDataDecoder {

    private final SystemEventMessage systemEventMessage = new SystemEventMessage();

    private final SecurityDirectoryMessage securityDirectoryMessage = new SecurityDirectoryMessage();

    private final TradingStatusMessage tradingStatusMessage = new TradingStatusMessage();

    private final RetailLiquidityIndicatorMessage retailLiquidityIndicatorMessage = new RetailLiquidityIndicatorMessage();

    private final OperationalHaltStatusMessage operationalHaltStatusMessage = new OperationalHaltStatusMessage();

    private final ShortSalePriceTestStatusMessage shortSalePriceTestStatusMessage = new ShortSalePriceTestStatusMessage();

    private final SecurityEventMessage securityEventMessage = new SecurityEventMessage();

    private final AddOrderMessage addOrderMessage = new AddOrderMessage();

    private final OrderModifyMessage orderModifyMessage = new OrderModifyMessage();

    private final OrderDeleteMessage orderDeleteMessage = new OrderDeleteMessage();

    private final OrderExecutedMessage orderExecutedMessage = new OrderExecutedMessage();

    private final TradeMessage tradeMessage = new TradeMessage();

    private final TradeBreakMessage tradeBreakMessage = new TradeBreakMessage();

    private final ClearBookMessage clearBookMessage = new ClearBookMessage();

    /**
     * Creates a decoder and the flyweights it decodes into.
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
     * @return the message's flyweight, decoded, or null when this library decodes no message of that type
     * @throws omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.decode(buffer, offset, end);
                return systemEventMessage;
            case 'D':
                securityDirectoryMessage.decode(buffer, offset, end);
                return securityDirectoryMessage;
            case 'H':
                tradingStatusMessage.decode(buffer, offset, end);
                return tradingStatusMessage;
            case 'I':
                retailLiquidityIndicatorMessage.decode(buffer, offset, end);
                return retailLiquidityIndicatorMessage;
            case 'O':
                operationalHaltStatusMessage.decode(buffer, offset, end);
                return operationalHaltStatusMessage;
            case 'P':
                shortSalePriceTestStatusMessage.decode(buffer, offset, end);
                return shortSalePriceTestStatusMessage;
            case 'E':
                securityEventMessage.decode(buffer, offset, end);
                return securityEventMessage;
            case 'a':
                addOrderMessage.decode(buffer, offset, end);
                return addOrderMessage;
            case 'M':
                orderModifyMessage.decode(buffer, offset, end);
                return orderModifyMessage;
            case 'R':
                orderDeleteMessage.decode(buffer, offset, end);
                return orderDeleteMessage;
            case 'L':
                orderExecutedMessage.decode(buffer, offset, end);
                return orderExecutedMessage;
            case 'T':
                tradeMessage.decode(buffer, offset, end);
                return tradeMessage;
            case 'B':
                tradeBreakMessage.decode(buffer, offset, end);
                return tradeBreakMessage;
            case 'C':
                clearBookMessage.decode(buffer, offset, end);
                return clearBookMessage;
            default:
                return null;
        }
    }
}
