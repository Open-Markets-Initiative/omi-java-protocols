package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccountCurrencySettingResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccountQueryResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccountRateBreachMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccountSettingsResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccumulatedValuesMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ApiPortRateBreachMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.LimitSettingsResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.MarketSegmentRestrictionResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.OrderBookRestrictionResponseMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.RejectMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;

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
        if (sequencedMessageType == 'Q') {
            message = new AccountQueryResponseMessage();
        } else if (sequencedMessageType == 'C') {
            message = new AccountSettingsResponseMessage();
        } else if (sequencedMessageType == 'R') {
            message = new OrderBookRestrictionResponseMessage();
        } else if (sequencedMessageType == 'S') {
            message = new MarketSegmentRestrictionResponseMessage();
        } else if (sequencedMessageType == 'L') {
            message = new LimitSettingsResponseMessage();
        } else if (sequencedMessageType == 'F') {
            message = new AccountCurrencySettingResponseMessage();
        } else if (sequencedMessageType == 'J') {
            message = new RejectMessage();
        } else if (sequencedMessageType == 'P') {
            message = new ApiPortRateBreachMessage();
        } else if (sequencedMessageType == 'B') {
            message = new AccountRateBreachMessage();
        } else if (sequencedMessageType == 'V') {
            message = new AccumulatedValuesMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
