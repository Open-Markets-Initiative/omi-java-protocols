package omi.cboe.edgxoptions.complextop.pitch.v1_1_54.dispatch;

import java.util.Optional;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.AuctionSummaryMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.ComplexInstrumentDefinitionExpandedMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.EndOfSessionMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.OptionsAuctionUpdateMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.SingleSideUpdateExpandedLongMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.SingleSideUpdateExpandedShortMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.SymbolMappingMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.TimeMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.TopTradeMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.TradingStatusMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.TwoSideUpdateExpandedLongMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.TwoSideUpdateExpandedShortMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.messages.application.UnitClearMessage;
import omi.cboe.edgxoptions.complextop.pitch.v1_1_54.types.Message;

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
        } else if (messageType == 154L) {
            message = new ComplexInstrumentDefinitionExpandedMessage();
        } else if (messageType == 47L) {
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
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
