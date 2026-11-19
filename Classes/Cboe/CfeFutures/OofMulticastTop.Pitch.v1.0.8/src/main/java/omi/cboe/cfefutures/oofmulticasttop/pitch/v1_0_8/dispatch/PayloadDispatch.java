package omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.ComplexInstrumentDefinitionExpandedMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.EndOfDaySummaryMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.EndOfSessionMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.OofSymbolMappingMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.SettlementMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.SingleSideUpdateLongMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.SingleSideUpdateShortMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TimeMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TimeReferenceMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TopTradeMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TradingStatusMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TwoSideUpdateLongMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.TwoSideUpdateShortMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application.UnitClearMessage;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Message;

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
        } else if (messageType == 249L) {
            message = new OofSymbolMappingMessage();
        } else if (messageType == 154L) {
            message = new ComplexInstrumentDefinitionExpandedMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 180L) {
            message = new SingleSideUpdateShortMessage();
        } else if (messageType == 181L) {
            message = new SingleSideUpdateLongMessage();
        } else if (messageType == 182L) {
            message = new TwoSideUpdateShortMessage();
        } else if (messageType == 183L) {
            message = new TwoSideUpdateLongMessage();
        } else if (messageType == 184L) {
            message = new TopTradeMessage();
        } else if (messageType == 185L) {
            message = new SettlementMessage();
        } else if (messageType == 186L) {
            message = new EndOfDaySummaryMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
