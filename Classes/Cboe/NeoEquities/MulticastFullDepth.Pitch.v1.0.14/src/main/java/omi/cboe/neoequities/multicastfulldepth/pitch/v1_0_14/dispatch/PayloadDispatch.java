package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.dispatch;

import java.util.Optional;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.AddOrderMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.AuctionSummaryMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.AuctionUpdateMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.DeleteOrderMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.EndOfSessionMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.InstrumentDirectoryMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.ModifyOrderMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.OrderExecutedMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.ReduceSizeMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.TradeBreakMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.TradeCorrectionMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.TradeMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.TradingStatusMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application.UnitClearMessage;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.types.Message;

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
        } else if (messageType == 96L) {
            message = new InstrumentDirectoryMessage();
        } else if (messageType == 97L) {
            message = new TradingStatusMessage();
        } else if (messageType == 98L) {
            message = new AddOrderMessage();
        } else if (messageType == 99L) {
            message = new ReduceSizeMessage();
        } else if (messageType == 100L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 101L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 102L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 103L) {
            message = new TradeMessage();
        } else if (messageType == 104L) {
            message = new TradeBreakMessage();
        } else if (messageType == 105L) {
            message = new TradeCorrectionMessage();
        } else if (messageType == 107L) {
            message = new AuctionUpdateMessage();
        } else if (messageType == 108L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
