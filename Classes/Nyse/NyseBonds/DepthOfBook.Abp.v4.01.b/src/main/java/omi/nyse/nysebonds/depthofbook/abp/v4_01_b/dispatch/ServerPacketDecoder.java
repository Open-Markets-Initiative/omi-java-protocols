package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.dispatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.ByteOps;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;

/**
 * Walks a Message: its headers, then the message it holds, selected through {@link PayloadDispatch}.
 */
public final class ServerPacketDecoder {

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
    public static final int MESSAGE_HEADER_LENGTH = 4;

    private ServerPacketDecoder() {
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

        if (position <= limit) {
            if (position + MESSAGE_HEADER_LENGTH > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding);
            }

            int frameEnd = limit;

            char messageType = (char) (data[position + 2] & 0xFF);
            Optional<Message> selected = PayloadDispatch.decode(messageType, data, position + MESSAGE_HEADER_LENGTH, frameEnd);
            if (selected.isPresent()) {
                Message message = selected.get();
                if (!message.isDecoded()) {
                    return new Decoded(messages, undecoded, false, trailing, padding);
                }
                messages.add(message);
                int consumed = MESSAGE_HEADER_LENGTH + message.byteLength();
                position += consumed;
            } else {
                undecoded++;
                position = limit;
            }
        }

        return new Decoded(messages, undecoded, position == limit, trailing, padding);
    }
}
