package omi.nasdaq.ntxoptions.cti.itch.v3_0.dispatch;

import java.util.Optional;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.messages.application.CancelTradeMessage;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.messages.application.OptionsDirectoryMessage;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.messages.application.SecurityTradingActionMessage;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.messages.application.SystemEventMessage;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.messages.application.TradeMessage;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.Message;

/**
 * Selects the message a Sequenced Message branch holds by its Sequenced Message Type.
 */
public final class SequencedMessageDispatch {

    private SequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Sequenced Message Type selects.
     *
     * @param sequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char sequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (sequencedMessageType == 'S') {
            message = new SystemEventMessage();
        } else if (sequencedMessageType == 'D') {
            message = new OptionsDirectoryMessage();
        } else if (sequencedMessageType == 'H') {
            message = new SecurityTradingActionMessage();
        } else if (sequencedMessageType == 'T') {
            message = new TradeMessage();
        } else if (sequencedMessageType == 'V') {
            message = new CancelTradeMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
