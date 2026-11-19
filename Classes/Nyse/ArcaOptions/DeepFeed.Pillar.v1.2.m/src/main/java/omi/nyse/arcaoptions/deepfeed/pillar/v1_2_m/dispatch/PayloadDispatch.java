package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.dispatch;

import java.util.Optional;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.ComplexSeriesIndexMappingMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.HeartbeatResponseMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.MessageUnavailableMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsAddOrderMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsAddOrderRefreshMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsCrossTradeMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsDeleteOrderMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsImbalanceMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsModifyOrderMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsNonDisplayedTradeMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsOrderExecutionMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsOutrightSeriesSummaryMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsReplaceOrderMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsSeriesRfqMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsStatusMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OptionsTradeCancelMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.OutrightSeriesIndexMappingMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.RefreshHeaderMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.RefreshRequestMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.RequestResponseMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.RetransmissionRequestMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SecurityStatusMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SequenceNumberResetMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SourceTimeReferenceMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SymbolClearMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SymbolIndexMappingMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.types.Message;

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
        if (messageType == 1L) {
            message = new SequenceNumberResetMessage();
        } else if (messageType == 2L) {
            message = new SourceTimeReferenceMessage();
        } else if (messageType == 3L) {
            message = new SymbolIndexMappingMessage();
        } else if (messageType == 32L) {
            message = new SymbolClearMessage();
        } else if (messageType == 34L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 50L) {
            message = new OutrightSeriesIndexMappingMessage();
        } else if (messageType == 51L) {
            message = new OptionsStatusMessage();
        } else if (messageType == 60L) {
            message = new ComplexSeriesIndexMappingMessage();
        } else if (messageType == 10L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 15L) {
            message = new RefreshRequestMessage();
        } else if (messageType == 13L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 31L) {
            message = new MessageUnavailableMessage();
        } else if (messageType == 11L) {
            message = new RequestResponseMessage();
        } else if (messageType == 12L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 300L) {
            message = new OptionsAddOrderMessage();
        } else if (messageType == 301L) {
            message = new OptionsModifyOrderMessage();
        } else if (messageType == 302L) {
            message = new OptionsDeleteOrderMessage();
        } else if (messageType == 303L) {
            message = new OptionsOrderExecutionMessage();
        } else if (messageType == 304L) {
            message = new OptionsReplaceOrderMessage();
        } else if (messageType == 305L) {
            message = new OptionsImbalanceMessage();
        } else if (messageType == 306L) {
            message = new OptionsAddOrderRefreshMessage();
        } else if (messageType == 307L) {
            message = new OptionsSeriesRfqMessage();
        } else if (messageType == 310L) {
            message = new OptionsNonDisplayedTradeMessage();
        } else if (messageType == 311L) {
            message = new OptionsCrossTradeMessage();
        } else if (messageType == 312L) {
            message = new OptionsTradeCancelMessage();
        } else if (messageType == 323L) {
            message = new OptionsOutrightSeriesSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
