package omi.nyse.amexoptions.topfeed.pillar.v1_2_k.dispatch;

import java.util.Optional;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.ComplexSeriesIndexMappingMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.HeartbeatResponseMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.MessageUnavailableMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsImbalanceMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsQuoteMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsStatusMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsTradeCancelMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsTradeCorrectionMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OptionsTradeMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OutrightSeriesIndexMappingMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.OutrightSeriesSummaryMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.RefreshHeaderMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.RefreshRequestMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.RequestResponseMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.RetransmissionRequestMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SecurityStatusMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SequenceNumberResetMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SeriesRfqMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SourceTimeReferenceMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SymbolClearMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SymbolIndexMappingMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.amexoptions.topfeed.pillar.v1_2_k.types.Message;

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
        } else if (messageType == 340L) {
            message = new OptionsQuoteMessage();
        } else if (messageType == 320L) {
            message = new OptionsTradeMessage();
        } else if (messageType == 321L) {
            message = new OptionsTradeCancelMessage();
        } else if (messageType == 322L) {
            message = new OptionsTradeCorrectionMessage();
        } else if (messageType == 305L) {
            message = new OptionsImbalanceMessage();
        } else if (messageType == 307L) {
            message = new SeriesRfqMessage();
        } else if (messageType == 323L) {
            message = new OutrightSeriesSummaryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
