package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch;

import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyAuctionMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyOpenClosedMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyTradingActionMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.SystemEventMessage;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Decodes the messages Payload selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: the flyweight of the message's type is rewrapped and returned, so one returned is
 * valid until this decoder decodes the next message of its type. A decoder is not safe to share between threads.</p>
 */
public final class PayloadDecoder {

    private final SystemEventMessage systemEventMessage = new SystemEventMessage();

    private final ComplexStrategyDirectoryMessage complexStrategyDirectoryMessage = new ComplexStrategyDirectoryMessage();

    private final StrategyTradingActionMessage strategyTradingActionMessage = new StrategyTradingActionMessage();

    private final StrategyOpenClosedMessage strategyOpenClosedMessage = new StrategyOpenClosedMessage();

    private final ComplexStrategyOrderOnBookMessage complexStrategyOrderOnBookMessage = new ComplexStrategyOrderOnBookMessage();

    private final ComplexStrategyAuctionMessage complexStrategyAuctionMessage = new ComplexStrategyAuctionMessage();

    /**
     * Creates a decoder and the flyweights it rewraps.
     */
    public PayloadDecoder() {
    }

    /**
     * Decodes one message.
     *
     * @param messageType the value selecting the message
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @return the message's flyweight, wrapping it, or null when this library decodes no message of that type
     * @throws omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.wrap(buffer, offset, end);
                return systemEventMessage;
            case 'R':
                complexStrategyDirectoryMessage.wrap(buffer, offset, end);
                return complexStrategyDirectoryMessage;
            case 'H':
                strategyTradingActionMessage.wrap(buffer, offset, end);
                return strategyTradingActionMessage;
            case 'O':
                strategyOpenClosedMessage.wrap(buffer, offset, end);
                return strategyOpenClosedMessage;
            case 'L':
                complexStrategyOrderOnBookMessage.wrap(buffer, offset, end);
                return complexStrategyOrderOnBookMessage;
            case 'J':
                complexStrategyAuctionMessage.wrap(buffer, offset, end);
                return complexStrategyAuctionMessage;
            default:
                return null;
        }
    }
}
