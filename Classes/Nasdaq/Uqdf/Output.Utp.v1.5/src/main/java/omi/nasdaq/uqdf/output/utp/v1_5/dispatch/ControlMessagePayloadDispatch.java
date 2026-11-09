package omi.nasdaq.uqdf.output.utp.v1_5.dispatch;

import java.util.Optional;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.EndOfDayMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.EndOfTransmissionsMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.MarketSessionCloseMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.MarketSessionOpenMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.QuoteWipeOutMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.StartOfDayMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;

/**
 * Selects the message a Control Message Payload branch holds by its Control Message Type.
 */
public final class ControlMessagePayloadDispatch {

    private ControlMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Control Message Type selects.
     *
     * @param controlMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char controlMessageType, byte[] data, int offset, int end) {
        Message message;
        if (controlMessageType == 'I') {
            message = new StartOfDayMessage();
        } else if (controlMessageType == 'J') {
            message = new EndOfDayMessage();
        } else if (controlMessageType == 'O') {
            message = new MarketSessionOpenMessage();
        } else if (controlMessageType == 'C') {
            message = new MarketSessionCloseMessage();
        } else if (controlMessageType == 'Z') {
            message = new EndOfTransmissionsMessage();
        } else if (controlMessageType == 'P') {
            message = new QuoteWipeOutMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
