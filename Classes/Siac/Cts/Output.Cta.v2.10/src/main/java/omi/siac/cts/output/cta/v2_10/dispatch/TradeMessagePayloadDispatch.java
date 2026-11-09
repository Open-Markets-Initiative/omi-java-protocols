package omi.siac.cts.output.cta.v2_10.dispatch;

import java.util.Optional;
import omi.siac.cts.output.cta.v2_10.messages.application.AuctionStatusMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalLongTradeMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalShortTradeMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalTradeCancelErrorMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.FractionalTradeCorrectionMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.LongTradeMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.ShortTradeMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.TradeCancelErrorMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.TradeCorrectionMessage;
import omi.siac.cts.output.cta.v2_10.messages.application.TradingStatusMessage;
import omi.siac.cts.output.cta.v2_10.types.Message;

/**
 * Selects the message a Trade Message Payload branch holds by its Trade Message Type.
 */
public final class TradeMessagePayloadDispatch {

    private TradeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Trade Message Type selects.
     *
     * @param tradeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char tradeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (tradeMessageType == 'A') {
            message = new AuctionStatusMessage();
        } else if (tradeMessageType == 'C') {
            message = new TradeCorrectionMessage();
        } else if (tradeMessageType == 'O') {
            message = new FractionalTradeCorrectionMessage();
        } else if (tradeMessageType == 'L') {
            message = new LongTradeMessage();
        } else if (tradeMessageType == 'R') {
            message = new FractionalLongTradeMessage();
        } else if (tradeMessageType == 'S') {
            message = new TradingStatusMessage();
        } else if (tradeMessageType == 'T') {
            message = new ShortTradeMessage();
        } else if (tradeMessageType == 'H') {
            message = new FractionalShortTradeMessage();
        } else if (tradeMessageType == 'X') {
            message = new TradeCancelErrorMessage();
        } else if (tradeMessageType == 'E') {
            message = new FractionalTradeCancelErrorMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
