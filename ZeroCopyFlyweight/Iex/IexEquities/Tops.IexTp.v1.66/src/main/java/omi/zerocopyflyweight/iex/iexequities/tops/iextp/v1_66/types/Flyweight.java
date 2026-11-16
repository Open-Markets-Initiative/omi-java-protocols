package omi.zerocopyflyweight.iex.iexequities.tops.iextp.v1_66.types;

import java.util.Objects;

/**
 * A view over bytes it does not own: wrapping it points it at a message, and each getter reads its field from
 * there, so decoding copies nothing and allocates nothing.
 *
 * <p>A flyweight is valid only while the bytes it wraps are unchanged. A decoder rewraps the same instance for
 * each message of its type, so one it returned is valid until it decodes the next message of that type. Copy out
 * any value needed for longer.</p>
 */
public abstract class Flyweight {

    /**
     * The bytes wrapped, or null before the first wrap and after a reset.
     */
    protected byte[] buffer;

    /**
     * Where the message starts in {@link #buffer}.
     */
    protected int offset;

    /**
     * Creates a flyweight wrapping nothing.
     */
    protected Flyweight() {
    }

    /**
     * Gets the length of the message wrapped, which a repeating group's count makes vary.
     *
     * @return its length in bytes
     */
    public abstract int byteLength();

    /**
     * Gets the least length a message of this type can have, which wrapping requires before it reads the counts that
     * make the message's length vary. A fixed message's is its length.
     *
     * @return its least length in bytes
     */
    protected int minimumByteLength() {
        return byteLength();
    }

    /**
     * Points the flyweight at a message. Bytes refused leave it wrapping nothing.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #byteLength()} bytes lie between offset and end
     */
    public void wrap(byte[] buffer, int offset, int end) {
        Objects.requireNonNull(buffer, "buffer");
        if (offset < 0 || end > buffer.length || end - offset < minimumByteLength()) {
            reset();
            throw tooShort(minimumByteLength(), buffer, offset, end);
        }
        this.buffer = buffer;
        this.offset = offset;

        // the counts are inside the bytes just checked, so the whole length can be read now
        int length = byteLength();
        if (end - offset < length) {
            reset();
            throw tooShort(length, buffer, offset, end);
        }
    }

    private DecodeException tooShort(int needed, byte[] buffer, int offset, int end) {
        return new DecodeException(getClass().getSimpleName() + " needs " + needed
                + " bytes at " + offset + " but was given " + Math.max(0, end - offset) + " of " + buffer.length);
    }

    /**
     * Gets whether the flyweight wraps a message.
     *
     * @return whether it wraps one
     */
    public final boolean isWrapped() {
        return buffer != null;
    }

    /**
     * Gets the bytes wrapped.
     *
     * @return the bytes, or null when nothing is wrapped
     */
    public final byte[] buffer() {
        return buffer;
    }

    /**
     * Gets where the message starts in the bytes wrapped.
     *
     * @return its offset
     */
    public final int offset() {
        return offset;
    }

    /**
     * Lets go of the bytes wrapped, so the flyweight keeps nothing alive.
     */
    public void reset() {
        buffer = null;
        offset = 0;
    }
}
