package omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.dispatch;

import java.util.Optional;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.ExtendedStockDirectoryMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.QuoteMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.StockDirectoryMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.StockStatusMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.SystemEventMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.TradeBustMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.TradeCorrectionMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.messages.application.TradeReportMessage;
import omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.types.Message;

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
        if (messageType == 'W') {
            message = new QuoteMessage();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'N') {
            message = new TradeBustMessage();
        } else if (messageType == 'M') {
            message = new TradeCorrectionMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'r') {
            message = new ExtendedStockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
