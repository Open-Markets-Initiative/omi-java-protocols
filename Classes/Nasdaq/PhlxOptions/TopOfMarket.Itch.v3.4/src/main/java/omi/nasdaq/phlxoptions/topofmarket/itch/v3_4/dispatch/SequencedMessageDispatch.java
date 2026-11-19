package omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.dispatch;

import java.util.Optional;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.BrokenTradeReportMessage;
import omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.messages.application.EndOfReplaySequenceMessage;
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
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'T') {
            message = new TimestampMessage();
        } else if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OptionsDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new TradingActionMessage();
        } else if (sequencedMessageType == 'O') {
            message = new SecurityOpenClosedMessage();
        } else if (sequencedMessageType == 'q') {
            message = new ShortBestBidAndAskUpdateMessage();
        } else if (sequencedMessageType == 'Q') {
            message = new LongBestBidAndAskUpdateMessage();
        } else if (sequencedMessageType == 'a') {
            message = new ShortBestAskUpdateMessage();
        } else if (sequencedMessageType == 'b') {
            message = new ShortBestBidUpdateMessage();
        } else if (sequencedMessageType == 'A') {
            message = new LongBestAskUpdateMessage();
        } else if (sequencedMessageType == 'B') {
            message = new LongBestBidUpdateMessage();
        } else if (sequencedMessageType == 'R') {
            message = new TradeReportMessage();
        } else if (sequencedMessageType == 'X') {
            message = new BrokenTradeReportMessage();
        } else if (sequencedMessageType == 'M') {
            message = new EndOfReplaySequenceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
