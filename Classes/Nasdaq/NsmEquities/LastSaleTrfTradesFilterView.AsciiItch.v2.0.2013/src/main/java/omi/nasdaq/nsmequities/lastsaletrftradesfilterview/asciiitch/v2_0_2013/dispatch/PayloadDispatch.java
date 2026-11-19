package omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.messages.application.TradeCancelErrorMessage;
import omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.messages.application.TradeCorrectionMessage;
import omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.messages.application.TradeReportMessage;
import omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.types.Message;

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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelErrorMessage();
        } else if (messageType == 'C') {
            message = new TradeCorrectionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
