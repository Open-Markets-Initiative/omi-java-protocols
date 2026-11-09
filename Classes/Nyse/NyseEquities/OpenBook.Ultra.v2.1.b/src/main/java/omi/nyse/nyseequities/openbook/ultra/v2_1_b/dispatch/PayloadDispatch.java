package omi.nyse.nyseequities.openbook.ultra.v2_1_b.dispatch;

import java.util.Optional;
import java.util.OptionalLong;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.BookRefreshRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.DeltaUpdateMessages;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.ExtendedBookRefreshRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.FullUpdateMessages;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatResponseMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.HeartbeatSubscriptionMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.RequestResponseMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.RetransmissionRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.SequenceNumberResetMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.SymbolIndexMappingRequestMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.UnavailableMessage;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 *
 * <p>Messages it may select that this library does not decode: SymbolIndexMappingResponseMessages.</p>
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects, given none of the values outside it that its rules read.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        return decode(messageType, OptionalLong.empty(), data, offset, end);
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param messageCountInput the MessageCount outside the message, where its reader has it
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long messageType, OptionalLong messageCountInput, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 1L) {
            message = new SequenceNumberResetMessage();
        } else if (messageType == 2L) {
            message = new HeartbeatMessage();
        } else if (messageType == 5L) {
            message = new UnavailableMessage();
        } else if (messageType == 10L) {
            message = new RequestResponseMessage();
        } else if (messageType == 19L) {
            message = new HeartbeatSubscriptionMessage();
        } else if (messageType == 20L) {
            message = new RetransmissionRequestMessage();
        } else if (messageType == 22L) {
            message = new BookRefreshRequestMessage();
        } else if (messageType == 24L) {
            message = new HeartbeatResponseMessage();
        } else if (messageType == 27L) {
            message = new ExtendedBookRefreshRequestMessage();
        } else if (messageType == 34L) {
            message = new SymbolIndexMappingRequestMessage();
        } else if (messageType == 230L) {
            message = new FullUpdateMessages();
        } else if (messageType == 231L) {
            message = new DeltaUpdateMessages();
        } else {
            return Optional.empty();
        }

        if (message instanceof FullUpdateMessages selected && messageCountInput.isPresent()) {
            selected.messageCountInput(messageCountInput.getAsLong());
        }
        if (message instanceof DeltaUpdateMessages selected && messageCountInput.isPresent()) {
            selected.messageCountInput(messageCountInput.getAsLong());
        }
        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
