package omi.tmx.tsxalpha.level1.qrtmd.v2_1.dispatch;

import java.util.Optional;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.GeneralMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.MarketStateMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.QuoteMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.StockStateMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.SymbolStatusMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.TradeCancellationMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.TradeCorrectionMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.TradeMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.messages.application.TradingTierStatusMessage;
import omi.tmx.tsxalpha.level1.qrtmd.v2_1.types.Message;

/**
 * Selects the message a Message Body branch holds by its Message Type.
 */
public final class MessageBodyDispatch {

    private MessageBodyDispatch() {
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
    public static Optional<Message> decode(String messageType, byte[] data, int offset, int end) {
        Message message;
        if ("A ".equals(messageType)) {
            message = new TradeMessage();
        } else if ("B ".equals(messageType)) {
            message = new SymbolStatusMessage();
        } else if ("D ".equals(messageType)) {
            message = new StockStateMessage();
        } else if ("E ".equals(messageType)) {
            message = new QuoteMessage();
        } else if ("G ".equals(messageType)) {
            message = new GeneralMessage();
        } else if ("H ".equals(messageType)) {
            message = new TradeCancellationMessage();
        } else if ("S ".equals(messageType)) {
            message = new MarketStateMessage();
        } else if ("T ".equals(messageType)) {
            message = new TradingTierStatusMessage();
        } else if ("X ".equals(messageType)) {
            message = new TradeCorrectionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
