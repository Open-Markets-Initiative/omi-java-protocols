package omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.BestBidAndAskUpdateLongFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.BestBidAndAskUpdateShortFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.BestBidOrAskUpdateLongFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.BestBidOrAskUpdateShortFormMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.BrokenTradeReportMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.DerivativeDirectoryMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.SystemEventMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.TradeReportMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.messages.application.TradingActionMessage;
import omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.types.Message;

/**
 * Selects the message a Udp Payload branch holds by its Message Type.
 */
public final class UdpPayloadDispatch {

    private UdpPayloadDispatch() {
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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new DerivativeDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingActionMessage();
        } else if (messageType == 'q') {
            message = new BestBidAndAskUpdateShortFormMessage();
        } else if (messageType == 'Q') {
            message = new BestBidAndAskUpdateLongFormMessage();
        } else if (messageType == 'b') {
            message = new BestBidOrAskUpdateShortFormMessage();
        } else if (messageType == 'B') {
            message = new BestBidOrAskUpdateLongFormMessage();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'X') {
            message = new BrokenTradeReportMessage();
        } else if (messageType == 'a') {
            message = new BestBidOrAskUpdateShortFormMessage();
        } else if (messageType == 'A') {
            message = new BestBidOrAskUpdateLongFormMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
