package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyAuctionMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyDirectoryMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyOpenClosedMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.StrategyTradingActionMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.SystemEventMessage;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Decodes the messages Payload selects by Message Type, each into a view of its own.
 *
 * <p>A message returned is a new view, valid for as long as its bytes are unchanged. The decoder holds nothing, so
 * it may be shared between threads.</p>
 */
public final class PayloadDecoder {

    /**
     * Creates a decoder.
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
     * @return a view of the message, or null when this library decodes no message of that type
     * @throws omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException when the bytes are too few for the message selected
     */
    public Message decode(char messageType, byte[] buffer, int offset, int end) {
        switch (messageType) {
            case 'S':
                return new SystemEventMessage(buffer, offset, end);
            case 'R':
                return new ComplexStrategyDirectoryMessage(buffer, offset, end);
            case 'H':
                return new StrategyTradingActionMessage(buffer, offset, end);
            case 'O':
                return new StrategyOpenClosedMessage(buffer, offset, end);
            case 'L':
                return new ComplexStrategyOrderOnBookMessage(buffer, offset, end);
            case 'J':
                return new ComplexStrategyAuctionMessage(buffer, offset, end);
            default:
                return null;
        }
    }
}
