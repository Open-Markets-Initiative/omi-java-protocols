package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.dispatch;

import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.MassCancelRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.NewBulkQuoteMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.NewOrderSingleMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderCancelReplaceRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.OrderCancelRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.PurgeRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskActionRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application.RiskLimitUpdateRequestMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;

/**
 * Selects the message a Client Business Payload branch holds by its Template Id.
 */
public final class ClientBusinessPayloadDispatch {

    private ClientBusinessPayloadDispatch() {
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
        if (templateId == 1L) {
            message = new NewOrderSingleMessage();
        } else if (templateId == 2L) {
            message = new OrderCancelReplaceRequestMessage();
        } else if (templateId == 3L) {
            message = new OrderCancelRequestMessage();
        } else if (templateId == 4L) {
            message = new NewBulkQuoteMessage();
        } else if (templateId == 5L) {
            message = new MassCancelRequestMessage();
        } else if (templateId == 6L) {
            message = new PurgeRequestMessage();
        } else if (templateId == 51L) {
            message = new RiskLimitUpdateRequestMessage();
        } else if (templateId == 52L) {
            message = new RiskActionRequestMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
