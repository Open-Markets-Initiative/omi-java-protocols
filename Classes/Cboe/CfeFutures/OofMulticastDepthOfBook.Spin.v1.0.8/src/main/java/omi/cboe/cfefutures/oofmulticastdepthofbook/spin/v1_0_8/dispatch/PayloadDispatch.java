package omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.AddOrderLongMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.AddOrderShortMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.ComplexInstrumentDefinitionExpandedMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.EndOfDaySummaryMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.InstrumentDefinitionFinishedMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.InstrumentDefinitionRequestMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.InstrumentDefinitionResponseMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.LoginMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.LoginResponseMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.OofSymbolMappingMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.SettlementMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.SpinFinishedMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.SpinImageAvailableMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.SpinRequestMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.SpinResponseMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.TimeMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.TimeReferenceMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.messages.application.TradingStatusMessage;
import omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.types.Message;

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
        } else if (messageType == 249L) {
            message = new OofSymbolMappingMessage();
        } else if (messageType == 154L) {
            message = new ComplexInstrumentDefinitionExpandedMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 33L) {
            message = new AddOrderLongMessage();
        } else if (messageType == 34L) {
            message = new AddOrderShortMessage();
        } else if (messageType == 185L) {
            message = new SettlementMessage();
        } else if (messageType == 186L) {
            message = new EndOfDaySummaryMessage();
        } else if (messageType == 1L) {
            message = new LoginMessage();
        } else if (messageType == 2L) {
            message = new LoginResponseMessage();
        } else if (messageType == 128L) {
            message = new SpinImageAvailableMessage();
        } else if (messageType == 129L) {
            message = new SpinRequestMessage();
        } else if (messageType == 130L) {
            message = new SpinResponseMessage();
        } else if (messageType == 131L) {
            message = new SpinFinishedMessage();
        } else if (messageType == 132L) {
            message = new InstrumentDefinitionRequestMessage();
        } else if (messageType == 133L) {
            message = new InstrumentDefinitionResponseMessage();
        } else if (messageType == 134L) {
            message = new InstrumentDefinitionFinishedMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
