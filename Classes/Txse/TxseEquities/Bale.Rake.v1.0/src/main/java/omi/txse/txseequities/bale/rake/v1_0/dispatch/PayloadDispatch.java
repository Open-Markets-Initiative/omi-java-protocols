package omi.txse.txseequities.bale.rake.v1_0.dispatch;

import java.util.Optional;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.AuctionBandWindowMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.AuctionPreambleMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.AuctionPrintMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.DefineSymbolMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.SymbolStatusMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.TopOfBookMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.TradeMessage;
import omi.txse.txseequities.bale.rake.v1_0.messages.application.TradingSessionStatusMessage;
import omi.txse.txseequities.bale.rake.v1_0.types.Message;

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
        if (messageType == 105L) {
            message = new TradingSessionStatusMessage();
        } else if (messageType == 115L) {
            message = new DefineSymbolMessage();
        } else if (messageType == 121L) {
            message = new SymbolStatusMessage();
        } else if (messageType == 120L) {
            message = new TradeMessage();
        } else if (messageType == 113L) {
            message = new TopOfBookMessage();
        } else if (messageType == 117L) {
            message = new AuctionPreambleMessage();
        } else if (messageType == 118L) {
            message = new AuctionBandWindowMessage();
        } else if (messageType == 110L) {
            message = new AuctionPrintMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
