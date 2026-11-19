package omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.dispatch;

import java.util.Optional;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.ClientHeartbeatMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.LoginRequestV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.LoginResponseV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.LogoutMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.LogoutRequestMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.QuoteCancelV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.QuoteRejectV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.QuoteStatusV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.QuoteV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.ReplayCompleteMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.ServerHeartbeatMessage;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.TradeCaptureConfirmV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.TradeCaptureReportAcknowledgmentV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.TradeCaptureReportDeclineV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.TradeCaptureReportRejectV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.messages.application.TradeCaptureReportV2Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.types.Message;

/**
 * Selects the message a Message branch holds by its Message Type.
 */
public final class MessageDispatch {

    private MessageDispatch() {
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
        if (messageType == 55L) {
            message = new LoginRequestV2Message();
        } else if (messageType == 2L) {
            message = new LogoutRequestMessage();
        } else if (messageType == 3L) {
            message = new ClientHeartbeatMessage();
        } else if (messageType == 36L) {
            message = new LoginResponseV2Message();
        } else if (messageType == 8L) {
            message = new LogoutMessage();
        } else if (messageType == 9L) {
            message = new ServerHeartbeatMessage();
        } else if (messageType == 19L) {
            message = new ReplayCompleteMessage();
        } else if (messageType == 60L) {
            message = new TradeCaptureReportV2Message();
        } else if (messageType == 61L) {
            message = new QuoteV2Message();
        } else if (messageType == 62L) {
            message = new QuoteCancelV2Message();
        } else if (messageType == 48L) {
            message = new TradeCaptureReportAcknowledgmentV2Message();
        } else if (messageType == 49L) {
            message = new TradeCaptureReportRejectV2Message();
        } else if (messageType == 50L) {
            message = new TradeCaptureConfirmV2Message();
        } else if (messageType == 51L) {
            message = new TradeCaptureReportDeclineV2Message();
        } else if (messageType == 63L) {
            message = new QuoteStatusV2Message();
        } else if (messageType == 64L) {
            message = new QuoteRejectV2Message();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
