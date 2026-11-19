package omi.nse.nsecom.recovery.tbt.v7_0.dispatch;

import java.util.Optional;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.HeartbeatMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.NewOrderMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.NewSpreadOrderMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.OrderCancellationMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.OrderModificationMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.SpreadOrderCancellationMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.SpreadOrderModificationMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.SpreadTradeMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.TickDataRecoveryResponseMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.TradeCancelMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.messages.application.TradeMessage;
import omi.nse.nsecom.recovery.tbt.v7_0.types.Message;

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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'N') {
            message = new NewOrderMessage();
        } else if (messageType == 'M') {
            message = new OrderModificationMessage();
        } else if (messageType == 'X') {
            message = new OrderCancellationMessage();
        } else if (messageType == 'T') {
            message = new TradeMessage();
        } else if (messageType == 'G') {
            message = new NewSpreadOrderMessage();
        } else if (messageType == 'H') {
            message = new SpreadOrderModificationMessage();
        } else if (messageType == 'J') {
            message = new SpreadOrderCancellationMessage();
        } else if (messageType == 'K') {
            message = new SpreadTradeMessage();
        } else if (messageType == 'C') {
            message = new TradeCancelMessage();
        } else if (messageType == 'Z') {
            message = new HeartbeatMessage();
        } else if (messageType == 'Y') {
            message = new TickDataRecoveryResponseMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
