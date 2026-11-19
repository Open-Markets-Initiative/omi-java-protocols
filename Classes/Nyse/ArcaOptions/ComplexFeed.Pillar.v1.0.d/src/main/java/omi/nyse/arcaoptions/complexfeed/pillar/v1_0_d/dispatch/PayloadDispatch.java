package omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.dispatch;

import java.util.Optional;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.ComplexSeriesIndexMappingMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.HeartbeatResponseMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.MessageUnavailableMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.OptionsQuoteMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.OptionsStatusMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.OptionsTradeMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.OutrightSeriesIndexMappingMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.RefreshHeaderMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.RefreshRequestMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.RequestResponseMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.RetransmissionRequestMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SecurityStatusMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SequenceNumberResetMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SeriesRfqMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SymbolClearMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SymbolIndexMappingMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.messages.application.TimeReferenceMessage;
import omi.nyse.arcaoptions.complexfeed.pillar.v1_0_d.types.Message;

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
            message = new TimeReferenceMessage();
        } else if (messageType == 3L) {
            message = new SymbolIndexMappingMessage();
        } else if (messageType == 10L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 11L) {
            message = new RequestResponseMessage();
        } else if (messageType == 12L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 13L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 15L) {
            message = new RefreshRequestMessage();
        } else if (messageType == 31L) {
            message = new MessageUnavailableMessage();
        } else if (messageType == 32L) {
            message = new SymbolClearMessage();
        } else if (messageType == 34L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 35L) {
            message = new RefreshHeaderMessage();
        } else if (messageType == 50L) {
            message = new OutrightSeriesIndexMappingMessage();
        } else if (messageType == 51L) {
            message = new OptionsStatusMessage();
        } else if (messageType == 60L) {
            message = new ComplexSeriesIndexMappingMessage();
        } else if (messageType == 340L) {
            message = new OptionsQuoteMessage();
        } else if (messageType == 320L) {
            message = new OptionsTradeMessage();
        } else if (messageType == 307L) {
            message = new SeriesRfqMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
