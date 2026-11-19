package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.dispatch;

import java.util.Optional;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.ExecutionReportMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.HeartbeatMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.LogonMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.LogonReplyMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.LogoutMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.MissedMessageReportMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.MissedMessageRequestAckMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.MissedMessageRequestMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.OrderMassCancelReportMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.QuoteAckMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.QuoteRequestMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.QuoteRequestRejectMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.QuoteResponseMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.QuoteStatusReportMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.RejectMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.RfqExecutionReportMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.RfqQuoteMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application.SystemStatusMessage;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Message;

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
        if (messageType == 'A') {
            message = new LogonMessage();
        } else if (messageType == 'B') {
            message = new LogonReplyMessage();
        } else if (messageType == '5') {
            message = new LogoutMessage();
        } else if (messageType == '0') {
            message = new HeartbeatMessage();
        } else if (messageType == 'M') {
            message = new MissedMessageRequestMessage();
        } else if (messageType == 'N') {
            message = new MissedMessageRequestAckMessage();
        } else if (messageType == 'P') {
            message = new MissedMessageReportMessage();
        } else if (messageType == '3') {
            message = new RejectMessage();
        } else if (messageType == 'n') {
            message = new SystemStatusMessage();
        } else if (messageType == '8') {
            message = new ExecutionReportMessage();
        } else if (messageType == 'r') {
            message = new OrderMassCancelReportMessage();
        } else if (messageType == 'a') {
            message = new QuoteRequestMessage();
        } else if (messageType == 'c') {
            message = new QuoteStatusReportMessage();
        } else if (messageType == 'b') {
            message = new QuoteRequestRejectMessage();
        } else if (messageType == 'd') {
            message = new RfqQuoteMessage();
        } else if (messageType == 'e') {
            message = new QuoteAckMessage();
        } else if (messageType == 'f') {
            message = new QuoteResponseMessage();
        } else if (messageType == 'g') {
            message = new RfqExecutionReportMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
