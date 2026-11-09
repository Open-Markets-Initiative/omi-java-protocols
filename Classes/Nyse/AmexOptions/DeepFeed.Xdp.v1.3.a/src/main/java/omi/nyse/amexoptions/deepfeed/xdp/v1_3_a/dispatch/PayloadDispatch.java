package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.dispatch;

import java.util.Optional;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.OutrightMarketDepthBuyMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.OutrightMarketDepthSellMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.OutrightSeriesStatusMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.RefreshOutrightMarketDepthBuyMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.RefreshOutrightMarketDepthSellMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.SequenceNumberResetMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.SeriesIndexMappingMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.StreamIdMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.UnderlyingIndexMappingMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application.UnderlyingStatusMessage;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Message;

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
        if (messageType == 403L) {
            message = new OutrightMarketDepthBuyMessage();
        } else if (messageType == 405L) {
            message = new OutrightMarketDepthSellMessage();
        } else if (messageType == 419L) {
            message = new UnderlyingStatusMessage();
        } else if (messageType == 421L) {
            message = new OutrightSeriesStatusMessage();
        } else if (messageType == 503L) {
            message = new RefreshOutrightMarketDepthBuyMessage();
        } else if (messageType == 505L) {
            message = new RefreshOutrightMarketDepthSellMessage();
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
