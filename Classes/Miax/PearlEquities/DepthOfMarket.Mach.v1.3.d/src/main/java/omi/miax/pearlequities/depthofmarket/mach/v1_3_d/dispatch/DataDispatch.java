package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.AddOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.DeleteOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.ModifyOrderMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.OrderExecutionMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SecurityTradingStatusNotificationMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SymbolClearMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SymbolUpdateMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SystemStateMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.SystemTimeMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.TradeCancelMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application.TradeMessage;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;

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
        if (messageType == 49L) {
            message = new SystemTimeMessage();
        } else if (messageType == 1L) {
            message = new SymbolUpdateMessage();
        } else if (messageType == 83L) {
            message = new SystemStateMessage();
        } else if (messageType == 4L) {
            message = new SecurityTradingStatusNotificationMessage();
        } else if (messageType == 5L) {
            message = new SymbolClearMessage();
        } else if (messageType == 20L) {
            message = new AddOrderMessage();
        } else if (messageType == 21L) {
            message = new ModifyOrderMessage();
        } else if (messageType == 23L) {
            message = new DeleteOrderMessage();
        } else if (messageType == 24L) {
            message = new OrderExecutionMessage();
        } else if (messageType == 10L) {
            message = new TradeMessage();
        } else if (messageType == 11L) {
            message = new TradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
