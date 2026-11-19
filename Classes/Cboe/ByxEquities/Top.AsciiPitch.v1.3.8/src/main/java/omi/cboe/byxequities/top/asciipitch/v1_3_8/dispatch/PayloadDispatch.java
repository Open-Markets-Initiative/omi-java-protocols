package omi.cboe.byxequities.top.asciipitch.v1_3_8.dispatch;

import java.util.Optional;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ClientHeartbeatMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExpandedAskUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExpandedBidUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExpandedSpinMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExpandedTradeMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExpandedTwoSidedUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExtendedAskUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExtendedBidUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExtendedSpinMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExtendedTradeMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ExtendedTwoSidedUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LogonAcceptedMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LogonMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LogonRejectedMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LongAskUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LongBidUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LongTradeMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.LongTwoSidedUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.MillisecondsMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.SecondsMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ServerHeartbeatMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ShortAskUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ShortBidUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ShortTradeMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.ShortTwoSidedUpdateMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.SpinDoneMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.messages.application.TradingStatusMessage;
import omi.cboe.byxequities.top.asciipitch.v1_3_8.types.Message;

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
        if (messageType == 'L') {
            message = new LogonMessage();
        } else if (messageType == 'J') {
            message = new LogonRejectedMessage();
        } else if (messageType == 'T') {
            message = new SecondsMessage();
        } else if (messageType == 'M') {
            message = new MillisecondsMessage();
        } else if (messageType == 'C') {
            message = new LogonAcceptedMessage();
        } else if (messageType == 's') {
            message = new ExpandedSpinMessage();
        } else if (messageType == 'S') {
            message = new ExtendedSpinMessage();
        } else if (messageType == 'D') {
            message = new SpinDoneMessage();
        } else if (messageType == 'H') {
            message = new ServerHeartbeatMessage();
        } else if (messageType == 'R') {
            message = new ClientHeartbeatMessage();
        } else if (messageType == 'E') {
            message = new ExpandedBidUpdateMessage();
        } else if (messageType == 'B') {
            message = new LongBidUpdateMessage();
        } else if (messageType == 'b') {
            message = new ShortBidUpdateMessage();
        } else if (messageType == 'N') {
            message = new ExtendedBidUpdateMessage();
        } else if (messageType == 'e') {
            message = new ExpandedAskUpdateMessage();
        } else if (messageType == 'A') {
            message = new LongAskUpdateMessage();
        } else if (messageType == 'a') {
            message = new ShortAskUpdateMessage();
        } else if (messageType == 'n') {
            message = new ExtendedAskUpdateMessage();
        } else if (messageType == 'F') {
            message = new ExpandedTwoSidedUpdateMessage();
        } else if (messageType == 'U') {
            message = new LongTwoSidedUpdateMessage();
        } else if (messageType == 'u') {
            message = new ShortTwoSidedUpdateMessage();
        } else if (messageType == 'd') {
            message = new ExtendedTwoSidedUpdateMessage();
        } else if (messageType == 'f') {
            message = new ExpandedTradeMessage();
        } else if (messageType == 'V') {
            message = new LongTradeMessage();
        } else if (messageType == 'v') {
            message = new ShortTradeMessage();
        } else if (messageType == 'r') {
            message = new ExtendedTradeMessage();
        } else if (messageType == 't') {
            message = new TradingStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
