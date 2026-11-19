package omi.hkex.szse.chinaconnect.omd.v1_4.dispatch;

import java.util.Optional;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.DisasterRecoverySignalMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.MarketDefinitionMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.RefreshCompleteMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.SecurityDefinitionMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.SecurityStatusMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.SequenceResetMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.StatisticsMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.messages.application.TopOfBookMessage;
import omi.hkex.szse.chinaconnect.omd.v1_4.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 100L) {
            message = new SequenceResetMessage();
        } else if (msgType == 105L) {
            message = new DisasterRecoverySignalMessage();
        } else if (msgType == 610L) {
            message = new MarketDefinitionMessage();
        } else if (msgType == 203L) {
            message = new RefreshCompleteMessage();
        } else if (msgType == 611L) {
            message = new SecurityDefinitionMessage();
        } else if (msgType == 621L) {
            message = new SecurityStatusMessage();
        } else if (msgType == 660L) {
            message = new StatisticsMessage();
        } else if (msgType == 655L) {
            message = new TopOfBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
