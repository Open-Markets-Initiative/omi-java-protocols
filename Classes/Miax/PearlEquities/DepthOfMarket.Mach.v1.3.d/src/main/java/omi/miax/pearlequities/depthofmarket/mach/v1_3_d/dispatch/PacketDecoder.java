package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.dispatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.ByteOps;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;

/**
 * Walks a Udp Packet: its headers, then each Mach Message until its bytes run out, selected through the envelope its Mach Packet Type names: {@link DataDispatch}.
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

            long machPacketType = ByteOps.unsigned(data, position + 10, 1, false);
            if (machPacketType == 0L || machPacketType == 1L || machPacketType == 2L) {
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
            if (machPacketType == 3L) {
                envelope = 1;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                selected = DataDispatch.decode(ByteOps.unsigned(data, position + 12, 1, false), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
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
