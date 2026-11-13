package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.dispatch;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.DecodeException;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;

/**
 * Walks a Packet: its headers, then each message it counts, decoded through {@link MessageDataDecoder}.
 *
 * <p>Start it on a packet, then take each message from {@link #next()} until it returns null. Nothing is allocated:
 * a message returned is a flyweight its decoder rewraps, valid until the next message of its type is decoded, and
 * only while the packet's bytes are unchanged. A decoder is not safe to share between threads.</p>
 */
public final class PacketDecoder {

    /**
     * The fixed length of the headers ahead of the first message.
     */
    public static final int HEADER_LENGTH = 40;

    /**
     * The fixed length of what follows the last message.
     */
    public static final int TRAILER_LENGTH = 0;

    /**
     * The fixed length of each message's own header.
     */
    public static final int MESSAGE_HEADER_LENGTH = 3;

    private final MessageDataDecoder decoder = new MessageDataDecoder();

    private byte[] buffer;

    private int position;

    private int limit;

    private long count;

    private long remaining;

    private int undecoded;

    /**
     * Creates a packet decoder and the message decoder it selects through.
     */
    public PacketDecoder() {
    }

    /**
     * Starts on a packet, reading its headers.
     *
     * @param packet the bytes holding the packet
     * @param offset where the packet starts
     * @param length the packet's length
     * @return whether the packet holds its headers, so its messages can be taken
     */
    public boolean start(byte[] packet, int offset, int length) {
        buffer = null;
        count = 0L;
        remaining = 0L;
        undecoded = 0;
        if (offset < 0 || length < HEADER_LENGTH + TRAILER_LENGTH || offset > packet.length - length) {
            return false;
        }
        buffer = packet;
        position = offset + HEADER_LENGTH;
        limit = offset + length - TRAILER_LENGTH;
        count = Codec.getUnsignedLE(buffer, offset + 14, 2);
        remaining = count;
        return true;
    }

    /**
     * Takes the next message this library decodes, stepping over any it does not.
     *
     * @return the message's flyweight, or null when the packet holds no more
     * @throws DecodeException when a frame reaches past the packet, or is too short for its message
     */
    public Message next() {
        while (remaining > 0L) {
            remaining--;
            if (position + MESSAGE_HEADER_LENGTH > limit) {
                throw new DecodeException("a frame header reaches past the packet at " + position);
            }
            long size = Codec.getUnsignedLE(buffer, position + 0, 2) + 2;
            if (size < MESSAGE_HEADER_LENGTH || size > limit - position) {
                throw new DecodeException("a frame of " + size + " bytes does not fit the packet at " + position);
            }
            int frame = position;
            position += (int) size;
            char messageType = (char) (buffer[frame + 2] & 0xFF);
            Message message = decoder.decode(messageType, buffer, frame + MESSAGE_HEADER_LENGTH, position);
            if (message != null) {
                return message;
            }
            undecoded++;
        }
        return null;
    }

    /**
     * Gets how many messages the packet's header counts.
     *
     * @return the count
     */
    public long count() {
        return count;
    }

    /**
     * Gets how many messages were stepped over, since this library decodes no message of their type.
     *
     * @return the count stepped over
     */
    public int undecoded() {
        return undecoded;
    }

    /**
     * Gets whether every counted message has been taken and they ended where the packet does.
     *
     * @return whether the packet was walked to its end
     */
    public boolean complete() {
        return buffer != null && remaining == 0L && position == limit;
    }
}
