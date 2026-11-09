package omi.siac.opra.output.obi.v6_2.dispatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.types.ByteOps;
import omi.siac.opra.output.obi.v6_2.types.Message;

/**
 * Walks a Packet: its headers, then each Message it counts, selected through the envelope its Message Category names: {@link AdministrativeMessagePayloadDispatch}, {@link ControlMessagePayloadDispatch}, {@link EquityAndIndexLastSaleMessagePayloadDispatch}, {@link OpenInterestMessagePayloadDispatch}, {@link EquityAndIndexEndOfDaySummaryMessagePayloadDispatch}, {@link LongEquityAndIndexQuoteMessagePayloadDispatch}, {@link ShortEquityAndIndexQuoteMessagePayloadDispatch}, {@link UnderlyingValueMessagePayloadDispatch}.
 */
public final class PacketDecoder {

    /**
     * The fixed length of the headers ahead of the first message.
     */
    public static final int HEADER_LENGTH = 21;

    /**
     * The fixed length of what follows the last message.
     */
    public static final int TRAILER_LENGTH = 0;

    /**
     * The fixed length of each message's own header.
     */
    public static final int MESSAGE_HEADER_LENGTH = 2;

    private PacketDecoder() {
    }

    /**
     * A decoded message and the bytes of its frame after it.
     *
     * @param message the message
     * @param bytes the bytes of its frame that followed it
     */
    public record Trailing(Message message, byte[] bytes) {
    }

    /**
     * What a packet decoded to.
     *
     * @param messages the messages decoded, in wire order
     * @param undecoded how many messages were passed over because this library does not decode their type
     * @param complete whether every message lay inside the packet and they ended where it ends
     * @param trailing the decoded messages that ended before their frame did
     * @param padding the decoded messages followed by their frame's padding
     */
    public record Decoded(List<Message> messages, int undecoded, boolean complete, List<Trailing> trailing, List<Trailing> padding) {

        /**
         * Holds unmodifiable copies of its lists.
         *
         * @param messages the messages decoded, in wire order
         * @param undecoded how many messages were passed over because this library does not decode their type
         * @param complete whether every message lay inside the packet and they ended where it ends
         * @param trailing the decoded messages that ended before their frame did
         * @param padding the decoded messages followed by their frame's padding
         */
        public Decoded {
            messages = List.copyOf(messages);
            trailing = List.copyOf(trailing);
            padding = List.copyOf(padding);
        }
    }

    /**
     * Decodes one packet.
     *
     * @param data the bytes holding the packet
     * @param offset where the packet starts
     * @param length the packet's length
     * @return the messages decoded, and whether the packet was walked to its end
     */
    public static Decoded decode(byte[] data, int offset, int length) {
        List<Message> messages = new ArrayList<>();
        List<Trailing> trailing = new ArrayList<>();
        List<Trailing> padding = new ArrayList<>();
        if (offset < 0 || length < HEADER_LENGTH + TRAILER_LENGTH || offset + length > data.length) {
            return new Decoded(messages, 0, false, trailing, padding);
        }

        int limit = offset + length - TRAILER_LENGTH;
        int position = offset + HEADER_LENGTH;
        int undecoded = 0;

        long count = ByteOps.unsigned(data, offset + 10, 1, false);

        for (long index = 0; index < count; index++) {
            if (position + MESSAGE_HEADER_LENGTH > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding);
            }

            int frameEnd = limit;

            char messageCategory = (char) (data[position + 1] & 0xFF);
            Optional<Message> selected;
            int envelope = 0;
            if (messageCategory == 'C') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = AdministrativeMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'H') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = ControlMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'a') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = EquityAndIndexLastSaleMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'd') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = OpenInterestMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'f') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = EquityAndIndexEndOfDaySummaryMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'k') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = LongEquityAndIndexQuoteMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'q') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = ShortEquityAndIndexQuoteMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (messageCategory == 'Y') {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = UnderlyingValueMessagePayloadDispatch.decode((char) (data[position + 2] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else {
                selected = Optional.empty();
            }
            if (selected.isPresent()) {
                Message message = selected.get();
                if (!message.isDecoded()) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                messages.add(message);
                int consumed = MESSAGE_HEADER_LENGTH + envelope + message.byteLength();
                if (consumed == 0) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                position += consumed;
            } else {
                undecoded++;
                return new Decoded(messages, undecoded, false, trailing, padding);
            }
        }

        return new Decoded(messages, undecoded, position == limit || (position < limit && limit - position < 2 && (limit - offset) % 2 == 0), trailing, padding);
    }
}
