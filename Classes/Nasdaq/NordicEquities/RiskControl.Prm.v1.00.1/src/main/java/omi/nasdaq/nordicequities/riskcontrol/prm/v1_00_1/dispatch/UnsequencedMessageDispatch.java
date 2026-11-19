package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.AccountQueryMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ModifyAccountCurrencySettingMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ModifyAccountSettingsMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ModifyLimitSettingsMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ModifyMarketSegmentRestrictionMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application.ModifyOrderBookRestrictionMessage;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;

/**
 * Selects the message a Unsequenced Message branch holds by its Unsequenced Message Type.
 */
public final class UnsequencedMessageDispatch {

    private UnsequencedMessageDispatch() {
    }

    /**
     * Decodes the message a Unsequenced Message Type selects.
     *
     * @param unsequencedMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char unsequencedMessageType, byte[] data, int offset, int end) {
        Message message;
        if (unsequencedMessageType == 'Q') {
            message = new AccountQueryMessage();
        } else if (unsequencedMessageType == 'C') {
            message = new ModifyAccountSettingsMessage();
        } else if (unsequencedMessageType == 'R') {
            message = new ModifyOrderBookRestrictionMessage();
        } else if (unsequencedMessageType == 'S') {
            message = new ModifyMarketSegmentRestrictionMessage();
        } else if (unsequencedMessageType == 'L') {
            message = new ModifyLimitSettingsMessage();
        } else if (unsequencedMessageType == 'F') {
            message = new ModifyAccountCurrencySettingMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
