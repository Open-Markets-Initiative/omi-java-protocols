package omi.txse.txseequities.seed.rake.v1_0.dispatch;

import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.CancelRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.DefineSymbolMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.LimitOrderAcceptedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.LimitOrderRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MarketOrderAcceptedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MarketOrderRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MassCancelAcceptedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MassCancelRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.MassCancelResultMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.ModifyRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.OrderCanceledMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.OrderExecutedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.OrderModifiedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.OrderReplacedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.OrderRestatedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.ReplaceRejectedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.SelfMatchPreventedMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.SymbolStatusMessage;
import omi.txse.txseequities.seed.rake.v1_0.messages.application.TradingSessionStatusMessage;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
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
        if (messageType == 105L) {
            message = new TradingSessionStatusMessage();
        } else if (messageType == 115L) {
            message = new DefineSymbolMessage();
        } else if (messageType == 121L) {
            message = new SymbolStatusMessage();
        } else if (messageType == 73L) {
            message = new LimitOrderAcceptedMessage();
        } else if (messageType == 85L) {
            message = new LimitOrderRejectedMessage();
        } else if (messageType == 68L) {
            message = new MarketOrderAcceptedMessage();
        } else if (messageType == 84L) {
            message = new MarketOrderRejectedMessage();
        } else if (messageType == 88L) {
            message = new OrderCanceledMessage();
        } else if (messageType == 87L) {
            message = new CancelRejectedMessage();
        } else if (messageType == 89L) {
            message = new OrderModifiedMessage();
        } else if (messageType == 78L) {
            message = new ModifyRejectedMessage();
        } else if (messageType == 74L) {
            message = new OrderReplacedMessage();
        } else if (messageType == 75L) {
            message = new ReplaceRejectedMessage();
        } else if (messageType == 69L) {
            message = new OrderExecutedMessage();
        } else if (messageType == 70L) {
            message = new OrderRestatedMessage();
        } else if (messageType == 90L) {
            message = new SelfMatchPreventedMessage();
        } else if (messageType == 79L) {
            message = new MassCancelAcceptedMessage();
        } else if (messageType == 80L) {
            message = new MassCancelRejectedMessage();
        } else if (messageType == 81L) {
            message = new MassCancelResultMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
