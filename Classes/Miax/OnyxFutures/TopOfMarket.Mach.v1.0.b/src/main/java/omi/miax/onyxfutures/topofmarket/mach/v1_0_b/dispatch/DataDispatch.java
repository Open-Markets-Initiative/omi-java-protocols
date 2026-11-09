package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.dispatch;

import java.util.Optional;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.BestBidAndOfferMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.ComplexInstrumentDefinitionMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.InstrumentTradingStatusNotificationMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.LastSaleMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.SimpleInstrumentDefinitionMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.SystemStateMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.TradeCancelMessage;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Message;

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
        } else if (messageType == 2L) {
            message = new ComplexInstrumentDefinitionMessage();
        } else if (messageType == 3L) {
            message = new SystemStateMessage();
        } else if (messageType == 4L) {
            message = new InstrumentTradingStatusNotificationMessage();
        } else if (messageType == 15L) {
            message = new BestBidAndOfferMessage();
        } else if (messageType == 16L) {
            message = new LastSaleMessage();
        } else if (messageType == 14L) {
            message = new TradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
