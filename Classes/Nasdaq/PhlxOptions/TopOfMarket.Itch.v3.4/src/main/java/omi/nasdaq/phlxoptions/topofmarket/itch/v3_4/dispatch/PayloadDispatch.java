package omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.BrokenTradeReportMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.LongBestAskUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.LongBestBidAndAskUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.LongBestBidUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.OptionsDirectoryMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.SecurityOpenClosedMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.ShortBestAskUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.ShortBestBidAndAskUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.ShortBestBidUpdateMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.TimestampMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.TradeReportMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.TradingActionMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.types.Message;

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
            message = new TimestampMessage();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'D') {
            message = new OptionsDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'O') {
            message = new SecurityOpenClosedMessage();
        } else if (messageType == 'q') {
            message = new ShortBestBidAndAskUpdateMessage();
        } else if (messageType == 'Q') {
            message = new LongBestBidAndAskUpdateMessage();
        } else if (messageType == 'a') {
            message = new ShortBestAskUpdateMessage();
        } else if (messageType == 'b') {
            message = new ShortBestBidUpdateMessage();
        } else if (messageType == 'A') {
            message = new LongBestAskUpdateMessage();
        } else if (messageType == 'B') {
            message = new LongBestBidUpdateMessage();
        } else if (messageType == 'R') {
            message = new TradeReportMessage();
        } else if (messageType == 'X') {
            message = new BrokenTradeReportMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
