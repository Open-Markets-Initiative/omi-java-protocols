package omi.nse.nsecd.dropcopy.nnfdirect.v1_7.dispatch;

import java.util.Optional;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.GiveupAppConfirmTmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.GiveupRejConfirmTmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.SignOnOutMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeCancelConfirmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeCancelRejectMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeConfirmationMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeModifyConfirmMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.TradeModifyRejectMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Message;

/**
 * Selects the message a Server Message Payload branch holds by its Transaction Code.
 */
public final class ServerMessagePayloadDispatch {

    private ServerMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Transaction Code selects.
     *
     * @param transactionCode the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long transactionCode, byte[] data, int offset, int end) {
        Message message;
        if (transactionCode == 2301L) {
            message = new SignOnOutMessage();
        } else if (transactionCode == 2222L) {
            message = new TradeConfirmationMessage();
        } else if (transactionCode == 2282L) {
            message = new TradeCancelConfirmMessage();
        } else if (transactionCode == 2286L) {
            message = new TradeCancelRejectMessage();
        } else if (transactionCode == 2287L) {
            message = new TradeModifyConfirmMessage();
        } else if (transactionCode == 2288L) {
            message = new TradeModifyRejectMessage();
        } else if (transactionCode == 4506L) {
            message = new GiveupAppConfirmTmMessage();
        } else if (transactionCode == 4507L) {
            message = new GiveupRejConfirmTmMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
