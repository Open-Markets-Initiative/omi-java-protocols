package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.dispatch;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.AddOrderMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.ClearBookMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.OperationalHaltStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderDeleteMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderExecutedMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.OrderModifyMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.RetailLiquidityIndicatorMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityDirectoryMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.SecurityEventMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.ShortSalePriceTestStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.SystemEventMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeBreakMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradeMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application.TradingStatusMessage;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Message;

/**
 * Decodes the messages Message Data selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: the flyweight of the message's type is rewrapped and returned, so one returned is
 * valid until this decoder decodes the next message of its type. A decoder is not safe to share between threads.</p>
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
     * Creates a decoder and the flyweights it rewraps.
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
     * @return the message's flyweight, wrapping it, or null when this library decodes no message of that type
     * @throws omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.wrap(buffer, offset, end);
                return systemEventMessage;
            case 'D':
                securityDirectoryMessage.wrap(buffer, offset, end);
                return securityDirectoryMessage;
            case 'H':
                tradingStatusMessage.wrap(buffer, offset, end);
                return tradingStatusMessage;
            case 'I':
                retailLiquidityIndicatorMessage.wrap(buffer, offset, end);
                return retailLiquidityIndicatorMessage;
            case 'O':
                operationalHaltStatusMessage.wrap(buffer, offset, end);
                return operationalHaltStatusMessage;
            case 'P':
                shortSalePriceTestStatusMessage.wrap(buffer, offset, end);
                return shortSalePriceTestStatusMessage;
            case 'E':
                securityEventMessage.wrap(buffer, offset, end);
                return securityEventMessage;
            case 'a':
                addOrderMessage.wrap(buffer, offset, end);
                return addOrderMessage;
            case 'M':
                orderModifyMessage.wrap(buffer, offset, end);
                return orderModifyMessage;
            case 'R':
                orderDeleteMessage.wrap(buffer, offset, end);
                return orderDeleteMessage;
            case 'L':
                orderExecutedMessage.wrap(buffer, offset, end);
                return orderExecutedMessage;
            case 'T':
                tradeMessage.wrap(buffer, offset, end);
                return tradeMessage;
            case 'B':
                tradeBreakMessage.wrap(buffer, offset, end);
                return tradeBreakMessage;
            case 'C':
                clearBookMessage.wrap(buffer, offset, end);
                return clearBookMessage;
            default:
                return null;
        }
    }
}
