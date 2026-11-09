package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.dispatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.ByteOps;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;

/**
 * Walks a Packet: its headers, then each Mach Message until its bytes run out, selected through the envelope its Packet Type names: {@link DataDispatch}.
 */
public final class PacketDecoder {

    /**
     * The fixed length of the headers ahead of the first message.
     */
    public static final int HEADER_LENGTH = 0;

    /**
     * The fixed length of what follows the last message.
     */
    public static final int TRAILER_LENGTH = 0;

    /**
     * The fixed length of each message's own header.
     */
    public static final int MESSAGE_HEADER_LENGTH = 12;

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

        while (position < limit) {
            if (position + 11 > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding);
            }

            long packetType = ByteOps.unsigned(data, position + 10, 1, false);
            if (packetType == 0L || packetType == 1L || packetType == 2L) {
                position += 12;
                continue;
            }

            if (position + MESSAGE_HEADER_LENGTH > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding);
            }

            long size = ByteOps.unsigned(data, position + 8, 2, true);
            if (size < MESSAGE_HEADER_LENGTH || size > limit - position) {
                return new Decoded(messages, undecoded, false, trailing, padding);
            }

            int frameEnd = position + (int) size;

            Optional<Message> selected;
            int envelope = 0;
            if (packetType == 3L) {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = DataDispatch.decode((char) (data[position + 12] & 0xFF), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else {
                selected = Optional.empty();
            }
            if (selected.isPresent()) {
                Message message = selected.get();
                if (!message.isDecoded()) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                messages.add(message);
                int consumed = position + MESSAGE_HEADER_LENGTH + envelope + message.byteLength();
                if (consumed < frameEnd) {
                    trailing.add(new Trailing(message, Arrays.copyOfRange(data, consumed, frameEnd)));
                }
            } else {
                undecoded++;
            }
            position = frameEnd;
        }

        return new Decoded(messages, undecoded, position == limit, trailing, padding);
    }
}
