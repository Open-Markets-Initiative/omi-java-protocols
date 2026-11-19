package omi.asianext.asianextderivatives.realtime.amd.v1_3.dispatch;

import java.util.Optional;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.HeartbeatMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.OrderAddMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.OrderCancelMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.OrderModifyMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.SecurityDefinitionFuturesMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.SecurityDefinitionMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.SecurityDefinitionOptionsMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.SecurityStatusMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.SequenceNumberResetMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.TickTableDataMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.TradeBustMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application.TradeMessage;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Message;

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
        } else if (msgType == 29L) {
            message = new SequenceNumberResetMessage();
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
        } else if (msgType == 30L) {
            message = new SecurityDefinitionFuturesMessage();
        } else if (msgType == 32L) {
            message = new SecurityDefinitionOptionsMessage();
        } else if (msgType == 9L) {
            message = new SecurityStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
