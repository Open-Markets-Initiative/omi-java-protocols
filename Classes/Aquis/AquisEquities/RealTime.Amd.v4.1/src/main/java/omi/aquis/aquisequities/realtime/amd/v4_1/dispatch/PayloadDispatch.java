package omi.aquis.aquisequities.realtime.amd.v4_1.dispatch;

import java.util.Optional;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.AodUpdateMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.HeartbeatMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.MacUpdateMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.OrderAddMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.OrderCancelMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.OrderModifyMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.SecurityDefinitionMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.SecurityStatusMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.TickTableDataMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.TradeBustMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.messages.application.TradeMessage;
import omi.aquis.aquisequities.realtime.amd.v4_1.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 1L) {
            message = new HeartbeatMessage();
        } else if (msgType == 2L) {
            message = new OrderAddMessage();
        } else if (msgType == 3L) {
            message = new OrderCancelMessage();
        } else if (msgType == 4L) {
            message = new OrderModifyMessage();
        } else if (msgType == 5L) {
            message = new TradeMessage();
        } else if (msgType == 6L) {
            message = new TradeBustMessage();
        } else if (msgType == 7L) {
            message = new TickTableDataMessage();
        } else if (msgType == 8L) {
            message = new SecurityDefinitionMessage();
        } else if (msgType == 9L) {
            message = new SecurityStatusMessage();
        } else if (msgType == 17L) {
            message = new AodUpdateMessage();
        } else if (msgType == 16L) {
            message = new MacUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
