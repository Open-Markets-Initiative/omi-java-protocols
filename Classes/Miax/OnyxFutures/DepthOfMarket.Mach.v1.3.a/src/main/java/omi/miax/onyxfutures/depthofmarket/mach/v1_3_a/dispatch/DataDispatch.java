package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.dispatch;

import java.util.Optional;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.AddOrderMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.AnticipatedOpeningPriceMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.ComplexInstrumentDefinitionDeprecatedMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.ComplexInstrumentDefinitionMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.DeleteOrderMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.InstrumentClearMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.InstrumentTradingStatusNotificationMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.ModifyOrderMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.OpenInterestUpdateMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.OrderExecutionMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.SettlementPriceUpdateMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.SimpleInstrumentDefinitionMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.SystemStateMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.TotalVolumeUpdateMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application.TradeCancelMessage;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Message;

/**
 * Selects the message a Data branch holds by its Message Type.
 */
public final class DataDispatch {

    private DataDispatch() {
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
        if (messageType == 1L) {
            message = new SimpleInstrumentDefinitionMessage();
        } else if (messageType == 17L) {
            message = new ComplexInstrumentDefinitionMessage();
        } else if (messageType == 2L) {
            message = new ComplexInstrumentDefinitionDeprecatedMessage();
        } else if (messageType == 3L) {
            message = new SystemStateMessage();
        } else if (messageType == 4L) {
            message = new InstrumentTradingStatusNotificationMessage();
        } else if (messageType == 5L) {
            message = new AnticipatedOpeningPriceMessage();
        } else if (messageType == 6L) {
            message = new SettlementPriceUpdateMessage();
        } else if (messageType == 7L) {
            message = new OpenInterestUpdateMessage();
        } else if (messageType == 8L) {
            message = new TotalVolumeUpdateMessage();
        } else if (messageType == 9L) {
            message = new InstrumentClearMessage();
        } else if (messageType == 10L) {
            message = new AddOrderMessage();
        } else if (messageType == 11L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 12L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 13L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 14L) {
            message = new TradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
