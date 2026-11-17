package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyAuctionMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyOpenClosedMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyTradingActionMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.SystemEventMessage;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Decodes the messages Payload selects by Message Type, into the one flyweight it holds for each.
 *
 * <p>Decoding allocates nothing: every field is copied into the flyweight of the message's type, which is returned,
 * so one returned is valid after its bytes are reused, until this decoder decodes the next message of its type. A
 * decoder is not safe to share between threads.</p>
 */
public final class PayloadDecoder {

    private final SystemEventMessage systemEventMessage = new SystemEventMessage();

    private final ComplexStrategyDirectoryMessage complexStrategyDirectoryMessage = new ComplexStrategyDirectoryMessage();

    private final StrategyTradingActionMessage strategyTradingActionMessage = new StrategyTradingActionMessage();

    private final StrategyOpenClosedMessage strategyOpenClosedMessage = new StrategyOpenClosedMessage();

    private final ComplexStrategyOrderOnBookMessage complexStrategyOrderOnBookMessage = new ComplexStrategyOrderOnBookMessage();

    private final ComplexStrategyAuctionMessage complexStrategyAuctionMessage = new ComplexStrategyAuctionMessage();

    /**
     * Creates a decoder and the flyweights it decodes into.
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
     * @return the message's flyweight, decoded, or null when this library decodes no message of that type
     * @throws omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                systemEventMessage.decode(buffer, offset, end);
                return systemEventMessage;
            case 'R':
                complexStrategyDirectoryMessage.decode(buffer, offset, end);
                return complexStrategyDirectoryMessage;
            case 'H':
                strategyTradingActionMessage.decode(buffer, offset, end);
                return strategyTradingActionMessage;
            case 'O':
                strategyOpenClosedMessage.decode(buffer, offset, end);
                return strategyOpenClosedMessage;
            case 'L':
                complexStrategyOrderOnBookMessage.decode(buffer, offset, end);
                return complexStrategyOrderOnBookMessage;
            case 'J':
                complexStrategyAuctionMessage.decode(buffer, offset, end);
                return complexStrategyAuctionMessage;
            default:
                return null;
        }
    }
}
