package omi.nse.nsecd.dropcopy.nnfdirect.v1_7.dispatch;

import java.util.Optional;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.DcDownloadRequestMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application.SignonInMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.session.HeartbeatMessage;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Message;

/**
 * Selects the message a Client Message Payload branch holds by its Transaction Code.
 */
public final class ClientMessagePayloadDispatch {

    private ClientMessagePayloadDispatch() {
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
        if (transactionCode == 2300L) {
            message = new SignonInMessage();
        } else if (transactionCode == 23506L) {
            message = new HeartbeatMessage();
        } else if (transactionCode == 8000L) {
            message = new DcDownloadRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
