package omi.siac.opra.output.obi.v6_3_a.dispatch;

import java.util.Optional;
import omi.siac.opra.output.obi.v6_3_a.messages.application.EquityAndIndexLastSaleMessage;
import omi.siac.opra.output.obi.v6_3_a.types.Message;

/**
 * Selects the message a Equity And Index Last Sale Message Payload branch holds by its Equity And Index Last Sale Message Type.
 */
public final class EquityAndIndexLastSaleMessagePayloadDispatch {

    private EquityAndIndexLastSaleMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Equity And Index Last Sale Message Type selects.
     *
     * @param equityAndIndexLastSaleMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char equityAndIndexLastSaleMessageType, byte[] data, int offset, int end) {
        Message message;
        if (equityAndIndexLastSaleMessageType == 'A') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'B') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'C') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'D') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'E') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'F') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'G') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'H') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'I') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'J') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'K') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'L') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'M') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'N') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'O') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'P') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'Q') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'R') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'S') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'T') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'X') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'a') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'b') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'c') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'd') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'e') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'f') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'g') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'h') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'i') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'j') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'k') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'l') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'm') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'n') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'o') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'p') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'q') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'r') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 's') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 't') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'u') {
            message = new EquityAndIndexLastSaleMessage();
        } else if (equityAndIndexLastSaleMessageType == 'v') {
            message = new EquityAndIndexLastSaleMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
