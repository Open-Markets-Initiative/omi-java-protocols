package omi.euronext.optiq.orderentrygateway.sbe.v1_3.dispatch;

import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.AckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.AskForQuoteMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CancelReplaceMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CancelRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.CollarBreachConfirmationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationCancelAndRefusalMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationEntryRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.DeclarationNoticeMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FillMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FundPriceInputAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.FundPriceInputMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.HeartbeatMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.InstrumentSynchronizationListMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.KillMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LiquidityProviderCommandMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogonRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.LogoutMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.MassCancelAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.MassCancelMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.NewOrderMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OpenOrderRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OwnershipRequestAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.OwnershipRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.PriceInputMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuoteAckMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuoteRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.QuotesMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RequestForExecutionMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RfqMatchingStatusMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.RfqNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.SynchronizationTimeMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TechnicalRejectMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TestRequestMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.TradeBustNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.UserNotificationMessage;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;

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
        if (templateId == 1L) {
            message = new NewOrderMessage();
        } else if (templateId == 3L) {
            message = new AckMessage();
        } else if (templateId == 4L) {
            message = new FillMessage();
        } else if (templateId == 5L) {
            message = new KillMessage();
        } else if (templateId == 6L) {
            message = new CancelReplaceMessage();
        } else if (templateId == 7L) {
            message = new RejectMessage();
        } else if (templateId == 8L) {
            message = new QuotesMessage();
        } else if (templateId == 9L) {
            message = new QuoteAckMessage();
        } else if (templateId == 10L) {
            message = new QuoteRequestMessage();
        } else if (templateId == 12L) {
            message = new CancelRequestMessage();
        } else if (templateId == 13L) {
            message = new MassCancelMessage();
        } else if (templateId == 14L) {
            message = new MassCancelAckMessage();
        } else if (templateId == 15L) {
            message = new OpenOrderRequestMessage();
        } else if (templateId == 17L) {
            message = new OwnershipRequestAckMessage();
        } else if (templateId == 18L) {
            message = new OwnershipRequestMessage();
        } else if (templateId == 19L) {
            message = new TradeBustNotificationMessage();
        } else if (templateId == 20L) {
            message = new CollarBreachConfirmationMessage();
        } else if (templateId == 28L) {
            message = new PriceInputMessage();
        } else if (templateId == 32L) {
            message = new LiquidityProviderCommandMessage();
        } else if (templateId == 33L) {
            message = new AskForQuoteMessage();
        } else if (templateId == 34L) {
            message = new RequestForExecutionMessage();
        } else if (templateId == 35L) {
            message = new RfqNotificationMessage();
        } else if (templateId == 36L) {
            message = new RfqMatchingStatusMessage();
        } else if (templateId == 39L) {
            message = new UserNotificationMessage();
        } else if (templateId == 40L) {
            message = new DeclarationEntryMessage();
        } else if (templateId == 41L) {
            message = new DeclarationEntryAckMessage();
        } else if (templateId == 42L) {
            message = new DeclarationNoticeMessage();
        } else if (templateId == 43L) {
            message = new DeclarationCancelAndRefusalMessage();
        } else if (templateId == 44L) {
            message = new FundPriceInputMessage();
        } else if (templateId == 45L) {
            message = new FundPriceInputAckMessage();
        } else if (templateId == 46L) {
            message = new DeclarationEntryRejectMessage();
        } else if (templateId == 50L) {
            message = new InstrumentSynchronizationListMessage();
        } else if (templateId == 51L) {
            message = new SynchronizationTimeMessage();
        } else if (templateId == 100L) {
            message = new LogonMessage();
        } else if (templateId == 101L) {
            message = new LogonAckMessage();
        } else if (templateId == 102L) {
            message = new LogonRejectMessage();
        } else if (templateId == 103L) {
            message = new LogoutMessage();
        } else if (templateId == 106L) {
            message = new HeartbeatMessage();
        } else if (templateId == 107L) {
            message = new TestRequestMessage();
        } else if (templateId == 108L) {
            message = new TechnicalRejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
