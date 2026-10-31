package omi.iex.iexequities.deepplus.iextp.v1_01.dispatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import omi.iex.iexequities.deepplus.iextp.v1_01.types.ByteOps;
import omi.iex.iexequities.deepplus.iextp.v1_01.types.Message;

/**
 * Walks a Packet: its headers, then each Message it counts, selected through {@link MessageDataDispatch}.
 */
public final class PacketDecoder {

    /**
     * The fixed length of the headers ahead of the first message.
     */
    public static final int HEADER_LENGTH = 40;

    /**
     * The fixed length of each message's own header.
     */
    public static final int MESSAGE_HEADER_LENGTH = 3;

    private PacketDecoder() {
    }

    /**
     * What a packet decoded to.
     *
     * @param messages the messages decoded, in wire order
     * @param undecoded how many messages were passed over because this library does not decode their type
     * @param complete whether every counted message lay inside the packet and they ended where it ends
     */
    public record Decoded(List<Message> messages, int undecoded, boolean complete) {

        /**
         * Holds an unmodifiable copy of the decoded messages.
         *
         * @param messages the messages decoded, in wire order
         * @param undecoded how many messages were passed over because this library does not decode their type
         * @param complete whether every counted message lay inside the packet and they ended where it ends
         */
        public Decoded {
            messages = List.copyOf(messages);
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
        if (offset < 0 || length < HEADER_LENGTH || offset + length > data.length) {
            return new Decoded(messages, 0, false);
        }

        int end = offset + length;
        long count = ByteOps.unsigned(data, offset + 14, 2, true);
        int position = offset + HEADER_LENGTH;
        int undecoded = 0;

        for (long index = 0; index < count; index++) {
            if (position + MESSAGE_HEADER_LENGTH > end) {
                return new Decoded(messages, undecoded, false);
            }

            long size = ByteOps.unsigned(data, position + 0, 2, true) + 2;
            if (size < MESSAGE_HEADER_LENGTH || size > end - position) {
                return new Decoded(messages, undecoded, false);
            }

            char messageType = (char) (data[position + 2] & 0xFF);
            Optional<Message> selected = MessageDataDispatch.decode(messageType, data, position + MESSAGE_HEADER_LENGTH);
            if (selected.isPresent()) {
                Message message = selected.get();
                if (!message.isDecoded() || MESSAGE_HEADER_LENGTH + message.byteLength() > size) {
                    return new Decoded(messages, undecoded, false);
                }
                messages.add(message);
            } else {
                undecoded++;
            }

            position += (int) size;
        }

        return new Decoded(messages, undecoded, position == end);
    }
}
