package omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.dispatch;

import java.util.Optional;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.AuctionSummaryMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.AuctionUpdateMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.CalculatedValueMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.EndOfSessionMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.SingleSideUpdateMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.TopTradeMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.TradingStatusMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.TwoSideUpdateMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application.UnitClearMessage;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 59L) {
            message = new TradingStatusMessage();
        } else if (messageType == 228L) {
            message = new SingleSideUpdateMessage();
        } else if (messageType == 229L) {
            message = new TwoSideUpdateMessage();
        } else if (messageType == 230L) {
            message = new TopTradeMessage();
        } else if (messageType == 227L) {
            message = new CalculatedValueMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else if (messageType == 149L) {
            message = new AuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
