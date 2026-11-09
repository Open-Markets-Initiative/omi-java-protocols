package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.dispatch;

import java.util.Optional;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexCrossingRfqMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexCubeRfqMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexQuoteMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexStatusMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexSymbolDefinitionMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.ComplexTradeMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.RefreshComplexQuoteMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.RefreshComplexTradeMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application.StreamIdMessage;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Message;

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
        if (messageType == 423L) {
            message = new ComplexQuoteMessage();
        } else if (messageType == 425L) {
            message = new ComplexTradeMessage();
        } else if (messageType == 429L) {
            message = new ComplexCrossingRfqMessage();
        } else if (messageType == 472L) {
            message = new ComplexCubeRfqMessage();
        } else if (messageType == 433L) {
            message = new ComplexStatusMessage();
        } else if (messageType == 511L) {
            message = new RefreshComplexQuoteMessage();
        } else if (messageType == 513L) {
            message = new RefreshComplexTradeMessage();
        } else if (messageType == 439L) {
            message = new ComplexSymbolDefinitionMessage();
        } else if (messageType == 455L) {
            message = new StreamIdMessage();
        } else if (messageType == 1L) {
            message = new SequenceNumberResetMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
