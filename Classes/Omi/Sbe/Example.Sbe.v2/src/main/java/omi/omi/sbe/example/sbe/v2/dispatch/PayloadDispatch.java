package omi.omi.sbe.example.sbe.v2.dispatch;

import java.util.Optional;
import omi.omi.sbe.example.sbe.v2.messages.application.EquityNbboQuoteMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.EquityTradeMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.InstrumentDefinitionMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.MarketStateMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraAdministrativeMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraControlMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraEndOfDaySummaryMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraLastSaleMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraNbboQuoteMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraOpenInterestMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OpraUnderlyingValueMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.OrderMessage;
import omi.omi.sbe.example.sbe.v2.messages.application.SecurityGroupStatusMessage;
import omi.omi.sbe.example.sbe.v2.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 16L) {
            message = new OpraNbboQuoteMessage();
        } else if (templateId == 17L) {
            message = new OpraLastSaleMessage();
        } else if (templateId == 18L) {
            message = new OpraOpenInterestMessage();
        } else if (templateId == 19L) {
            message = new OpraEndOfDaySummaryMessage();
        } else if (templateId == 20L) {
            message = new OrderMessage();
        } else if (templateId == 22L) {
            message = new MarketStateMessage();
        } else if (templateId == 24L) {
            message = new InstrumentDefinitionMessage();
        } else if (templateId == 25L) {
            message = new OpraAdministrativeMessage();
        } else if (templateId == 26L) {
            message = new OpraControlMessage();
        } else if (templateId == 27L) {
            message = new OpraUnderlyingValueMessage();
        } else if (templateId == 28L) {
            message = new EquityTradeMessage();
        } else if (templateId == 29L) {
            message = new EquityNbboQuoteMessage();
        } else if (templateId == 30L) {
            message = new SecurityGroupStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
