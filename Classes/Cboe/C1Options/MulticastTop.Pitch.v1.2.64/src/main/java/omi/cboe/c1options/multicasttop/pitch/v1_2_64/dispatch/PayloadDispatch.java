package omi.cboe.c1options.multicasttop.pitch.v1_2_64.dispatch;

import java.util.Optional;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.AuctionSummaryMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.ConstituentSymbolMappingMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.EndOfSessionMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.OptionsAuctionUpdateMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.SingleSideUpdateExpandedLongMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.SingleSideUpdateExpandedShortMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.SoqStrikeRangeUpdateMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.SymbolMappingMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TimeMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TimeReferenceMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TopTradeMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TradingStatusMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TwoSideUpdateExpandedLongMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.TwoSideUpdateExpandedShortMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.UnitClearMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.messages.application.WidthUpdateMessage;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.types.Message;

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
        if (messageType == 177L) {
            message = new TimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 151L) {
            message = new UnitClearMessage();
        } else if (messageType == 46L) {
            message = new SymbolMappingMessage();
        } else if (messageType == 212L) {
            message = new SingleSideUpdateExpandedShortMessage();
        } else if (messageType == 213L) {
            message = new SingleSideUpdateExpandedLongMessage();
        } else if (messageType == 214L) {
            message = new TwoSideUpdateExpandedShortMessage();
        } else if (messageType == 215L) {
            message = new TwoSideUpdateExpandedLongMessage();
        } else if (messageType == 184L) {
            message = new TopTradeMessage();
        } else if (messageType == 209L) {
            message = new OptionsAuctionUpdateMessage();
        } else if (messageType == 150L) {
            message = new AuctionSummaryMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 210L) {
            message = new WidthUpdateMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else if (messageType == 157L) {
            message = new SoqStrikeRangeUpdateMessage();
        } else if (messageType == 158L) {
            message = new ConstituentSymbolMappingMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
