package omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.dispatch;

import java.util.Optional;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.AuctionCancelMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.AuctionNotificationMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.AuctionSummaryMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.AuctionTradeMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.EndOfSessionMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.OptionsAuctionUpdateMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.SymbolMappingMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.TimeMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.UnitClearMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.messages.application.WidthUpdateMessage;
import omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.types.Message;

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
        if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 173L) {
            message = new AuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new AuctionCancelMessage();
        } else if (messageType == 175L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 209L) {
            message = new OptionsAuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 210L) {
            message = new WidthUpdateMessage();
        } else if (messageType == 46L) {
            message = new SymbolMappingMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
