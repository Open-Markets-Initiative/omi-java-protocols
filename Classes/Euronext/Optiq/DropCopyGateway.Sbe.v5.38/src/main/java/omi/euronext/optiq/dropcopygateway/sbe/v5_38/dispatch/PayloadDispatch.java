package omi.euronext.optiq.dropcopygateway.sbe.v5_38.dispatch;

import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcClearBookMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcDeclarationNewMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcMarketStatusChangeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcPriceUpdateMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcQuoteMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcQuoteRequestMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortDeclarationCancelMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortDeclarationFillMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortDeclarationRejectMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortOrderRejectMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortTradeCancellationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortTradeDeclarationCancellationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcShortTradeDeclarationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcStaticCollarsMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcTradeBustDeclarationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcTradeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.DcafqrfeMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.LongOrderMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.messages.application.TradeBustNotificationMessage;
import omi.euronext.optiq.dropcopygateway.sbe.v5_38.types.Message;

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
        if (templateId == 16001L) {
            message = new DcMarketStatusChangeMessage();
        } else if (templateId == 16003L) {
            message = new DcPriceUpdateMessage();
        } else if (templateId == 16006L) {
            message = new LongOrderMessage();
        } else if (templateId == 16010L) {
            message = new DcShortOrderRejectMessage();
        } else if (templateId == 16016L) {
            message = new DcShortTradeCancellationMessage();
        } else if (templateId == 16018L) {
            message = new DcStaticCollarsMessage();
        } else if (templateId == 16021L) {
            message = new TradeBustNotificationMessage();
        } else if (templateId == 16050L) {
            message = new DcQuoteMessage();
        } else if (templateId == 16051L) {
            message = new DcafqrfeMessage();
        } else if (templateId == 16052L) {
            message = new DcDeclarationNewMessage();
        } else if (templateId == 16053L) {
            message = new DcShortDeclarationRejectMessage();
        } else if (templateId == 16054L) {
            message = new DcShortDeclarationCancelMessage();
        } else if (templateId == 16055L) {
            message = new DcShortTradeDeclarationMessage();
        } else if (templateId == 16056L) {
            message = new DcShortTradeDeclarationCancellationMessage();
        } else if (templateId == 16057L) {
            message = new DcTradeBustDeclarationMessage();
        } else if (templateId == 16058L) {
            message = new DcTradeMessage();
        } else if (templateId == 16059L) {
            message = new DcShortDeclarationFillMessage();
        } else if (templateId == 16060L) {
            message = new DcQuoteRequestMessage();
        } else if (templateId == 16061L) {
            message = new DcClearBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
