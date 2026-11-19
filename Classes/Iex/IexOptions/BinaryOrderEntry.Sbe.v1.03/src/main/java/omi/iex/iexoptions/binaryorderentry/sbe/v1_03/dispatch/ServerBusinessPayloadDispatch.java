package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.dispatch;

import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.ApplicationLayerRejectMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.BulkQuoteAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.ExecutionReportMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.InstrumentRefDataMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.MarketMakerSymbolAppointmentMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.MassCancelAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.MpidConfigurationAcknowledgementMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.NewIocQuoteAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.OrderAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.OrderCancelAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.PurgeAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.QuoteCanceledMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.QuoteRestatedMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.RiskControlAcknowledgmentMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.RiskControlAlertMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.SessionConfigurationAcknowledgementMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.TradeBustCorrectMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.UnderlyingRefDataMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.UnsolicitedModifyAckMessage;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;

/**
 * Selects the message a Server Business Payload branch holds by its Template Id.
 */
public final class ServerBusinessPayloadDispatch {

    private ServerBusinessPayloadDispatch() {
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
        if (templateId == 101L) {
            message = new OrderAckMessage();
        } else if (templateId == 102L) {
            message = new UnsolicitedModifyAckMessage();
        } else if (templateId == 103L) {
            message = new OrderCancelAckMessage();
        } else if (templateId == 104L) {
            message = new MassCancelAckMessage();
        } else if (templateId == 105L) {
            message = new BulkQuoteAckMessage();
        } else if (templateId == 106L) {
            message = new NewIocQuoteAckMessage();
        } else if (templateId == 107L) {
            message = new QuoteRestatedMessage();
        } else if (templateId == 108L) {
            message = new QuoteCanceledMessage();
        } else if (templateId == 109L) {
            message = new PurgeAckMessage();
        } else if (templateId == 110L) {
            message = new ExecutionReportMessage();
        } else if (templateId == 111L) {
            message = new TradeBustCorrectMessage();
        } else if (templateId == 112L) {
            message = new ApplicationLayerRejectMessage();
        } else if (templateId == 151L) {
            message = new UnderlyingRefDataMessage();
        } else if (templateId == 152L) {
            message = new InstrumentRefDataMessage();
        } else if (templateId == 153L) {
            message = new MpidConfigurationAcknowledgementMessage();
        } else if (templateId == 154L) {
            message = new MarketMakerSymbolAppointmentMessage();
        } else if (templateId == 155L) {
            message = new SessionConfigurationAcknowledgementMessage();
        } else if (templateId == 156L) {
            message = new RiskControlAcknowledgmentMessage();
        } else if (templateId == 157L) {
            message = new RiskControlAlertMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
