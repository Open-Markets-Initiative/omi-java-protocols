package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.dispatch;

import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.CancelOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.CancelRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ClientHeartbeatMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ComplexInstrumentAcceptedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ComplexInstrumentRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.CrossOrderAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.CrossOrderCancelledMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.CrossOrderRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.LoginRequestV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.LoginResponseV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.LogoutMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.LogoutRequestMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ModifyOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.NewComplexInstrumentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.NewComplexOrderMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.NewOrderCrossMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.NewOrderCrossMultilegMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.NewOrderV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderAcknowledgmentV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderCancelledV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderExecutionV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderModifiedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.OrderRestatedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.PurgeOrdersMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.PurgeRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteCancelledMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteExecutionMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteRestatedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteUpdateAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteUpdateMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ReplayCompleteMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ResetRiskAcknowledgmentMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ResetRiskMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.ServerHeartbeatMessage;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCancelOrCorrectV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCaptureConfirmV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCaptureReportAcknowledgmentV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCaptureReportDeclineV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCaptureReportRejectV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.TradeCaptureReportV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application.UserModifyRejectedV2Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;

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
        } else if (messageType == 56L) {
            message = new NewOrderV2Message();
        } else if (messageType == 122L) {
            message = new NewOrderCrossMessage();
        } else if (messageType == 75L) {
            message = new NewComplexOrderMessage();
        } else if (messageType == 133L) {
            message = new NewOrderCrossMultilegMessage();
        } else if (messageType == 57L) {
            message = new CancelOrderV2Message();
        } else if (messageType == 58L) {
            message = new ModifyOrderV2Message();
        } else if (messageType == 123L) {
            message = new QuoteUpdateMessage();
        } else if (messageType == 71L) {
            message = new PurgeOrdersMessage();
        } else if (messageType == 86L) {
            message = new ResetRiskMessage();
        } else if (messageType == 76L) {
            message = new NewComplexInstrumentMessage();
        } else if (messageType == 60L) {
            message = new TradeCaptureReportV2Message();
        } else if (messageType == 37L) {
            message = new OrderAcknowledgmentV2Message();
        } else if (messageType == 124L) {
            message = new CrossOrderAcknowledgmentMessage();
        } else if (messageType == 125L) {
            message = new QuoteUpdateAcknowledgmentMessage();
        } else if (messageType == 38L) {
            message = new OrderRejectedV2Message();
        } else if (messageType == 126L) {
            message = new CrossOrderRejectedMessage();
        } else if (messageType == 127L) {
            message = new QuoteUpdateRejectedMessage();
        } else if (messageType == 39L) {
            message = new OrderModifiedV2Message();
        } else if (messageType == 40L) {
            message = new OrderRestatedMessage();
        } else if (messageType == 128L) {
            message = new QuoteRestatedMessage();
        } else if (messageType == 41L) {
            message = new UserModifyRejectedV2Message();
        } else if (messageType == 42L) {
            message = new OrderCancelledV2Message();
        } else if (messageType == 129L) {
            message = new QuoteCancelledMessage();
        } else if (messageType == 130L) {
            message = new CrossOrderCancelledMessage();
        } else if (messageType == 43L) {
            message = new CancelRejectedV2Message();
        } else if (messageType == 44L) {
            message = new OrderExecutionV2Message();
        } else if (messageType == 131L) {
            message = new QuoteExecutionMessage();
        } else if (messageType == 45L) {
            message = new TradeCancelOrCorrectV2Message();
        } else if (messageType == 72L) {
            message = new PurgeRejectedMessage();
        } else if (messageType == 87L) {
            message = new ResetRiskAcknowledgmentMessage();
        } else if (messageType == 54L) {
            message = new MassCancelAcknowledgmentMessage();
        } else if (messageType == 77L) {
            message = new ComplexInstrumentAcceptedMessage();
        } else if (messageType == 78L) {
            message = new ComplexInstrumentRejectedMessage();
        } else if (messageType == 48L) {
            message = new TradeCaptureReportAcknowledgmentV2Message();
        } else if (messageType == 49L) {
            message = new TradeCaptureReportRejectV2Message();
        } else if (messageType == 50L) {
            message = new TradeCaptureConfirmV2Message();
        } else if (messageType == 51L) {
            message = new TradeCaptureReportDeclineV2Message();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
