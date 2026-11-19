package omi.nyse.amexoptions.topfeed.xdp.v1_3_a.dispatch;

import java.util.Optional;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightBoldRfqMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightCrossingRfqMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightImbalanceMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightQuoteMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightSeriesStatusMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightSummaryMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeCancelMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeCorrectionMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightTradeMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightImbalanceMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightQuoteMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.RefreshOutrightTradeMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.SeriesIndexMappingMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.StreamIdMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.UnderlyingIndexMappingMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.UnderlyingStatusMessage;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 401L) {
            message = new OutrightQuoteMessage();
        } else if (messageType == 407L) {
            message = new OutrightTradeMessage();
        } else if (messageType == 409L) {
            message = new OutrightTradeCancelMessage();
        } else if (messageType == 411L) {
            message = new OutrightTradeCorrectionMessage();
        } else if (messageType == 413L) {
            message = new OutrightImbalanceMessage();
        } else if (messageType == 415L) {
            message = new OutrightCrossingRfqMessage();
        } else if (messageType == 471L) {
            message = new OutrightBoldRfqMessage();
        } else if (messageType == 417L) {
            message = new OutrightSummaryMessage();
        } else if (messageType == 419L) {
            message = new UnderlyingStatusMessage();
        } else if (messageType == 421L) {
            message = new OutrightSeriesStatusMessage();
        } else if (messageType == 501L) {
            message = new RefreshOutrightQuoteMessage();
        } else if (messageType == 507L) {
            message = new RefreshOutrightTradeMessage();
        } else if (messageType == 509L) {
            message = new RefreshOutrightImbalanceMessage();
        } else if (messageType == 435L) {
            message = new UnderlyingIndexMappingMessage();
        } else if (messageType == 437L) {
            message = new SeriesIndexMappingMessage();
        } else if (messageType == 455L) {
            message = new StreamIdMessage();
        } else if (messageType == 1L) {
            message = new SequenceNumberResetMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
