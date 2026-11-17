package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types;

import java.util.Objects;

/**
 * A view over bytes it does not own: each getter reads its field where it lies, so decoding copies nothing.
 *
 * <p>A view is immutable and never reused: a decoder creates one for each message, so one returned stays valid for
 * as long as the bytes it views are unchanged, and may be kept or handed to another thread. Copy out any value
 * needed after those bytes are reused.</p>
 */
public abstract class View {

    /**
     * The bytes viewed.
     */
    protected final byte[] buffer;

    /**
     * Where the record starts in {@link #buffer}.
     */
    protected final int offset;

    /**
     * Creates a view of a record, refusing too few bytes for the least length a record of its type can have.
     *
     * @param buffer the bytes holding the record
     * @param offset where the record starts
     * @param end where the bytes the record may occupy end
     * @param minimumLength the least length of a record of its type, in bytes
     * @throws DecodeException when fewer than minimumLength bytes lie between offset and end
     */
    protected View(byte[] buffer, int offset, int end, int minimumLength) {
        Objects.requireNonNull(buffer, "buffer");
        if (offset < 0 || end > buffer.length || end - offset < minimumLength) {
            throw tooShort(minimumLength, buffer, offset, end);
        }
        this.buffer = buffer;
        this.offset = offset;
    }

    /**
     * Refuses a record whose length, which its counts state, reaches past the bytes it was given.
     *
     * @param length the record's length in bytes
     * @param end where the bytes the record may occupy end
     * @throws DecodeException when fewer than length bytes lie between the record's start and end
     */
    protected final void requireLength(int length, int end) {
        if (end - offset < length) {
            throw tooShort(length, buffer, offset, end);
        }
    }

    private DecodeException tooShort(int needed, byte[] buffer, int offset, int end) {
        return new DecodeException(getClass().getSimpleName() + " needs " + needed
                + " bytes at " + offset + " but was given " + Math.max(0, end - offset) + " of " + buffer.length);
    }

    /**
     * Gets the length of the record, which a repeating group's count makes vary.
     *
     * @return its length in bytes
     */
    public abstract int byteLength();

    /**
     * Gets the bytes viewed.
     *
     * @return the bytes
     */
    public final byte[] buffer() {
        return buffer;
    }

    /**
     * Gets where the record starts in the bytes viewed.
     *
     * @return its offset
     */
    public final int offset() {
        return offset;
    }
}
