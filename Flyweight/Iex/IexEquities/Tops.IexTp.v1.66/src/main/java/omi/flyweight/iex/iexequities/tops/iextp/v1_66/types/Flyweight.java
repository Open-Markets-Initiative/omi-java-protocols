package omi.flyweight.iex.iexequities.tops.iextp.v1_66.types;

import java.util.Objects;

/**
 * A reusable record holding a copy of each field: decoding copies the fields out of the bytes, so it keeps no
 * reference to them, and they may be reused as soon as decoding returns.
 *
 * <p>A decoder holds one instance per message type and decodes into it again for each message of that type, so
 * decoding allocates nothing, and one returned is valid until the decoder decodes the next message of its type.
 * Copy out any value needed for longer. An instance is not safe to share between threads.</p>
 */
public abstract class Flyweight {

    private boolean decoded;

    /**
     * Creates a record holding nothing decoded.
     */
    protected Flyweight() {
    }

    /**
     * Gets the length of the record last decoded, which a repeating group's count makes vary.
     *
     * @return its length in bytes
     */
    public abstract int byteLength();

    /**
     * Gets the least length a record of this type can have, which decoding requires before it reads the counts that
     * make the record's length vary. A fixed record's is its length.
     *
     * @return its least length in bytes
     */
    protected int minimumByteLength() {
        return byteLength();
    }

    /**
     * Gets the length of the record the bytes hold, read from its counts where they lie, before anything is copied.
     *
     * @param buffer the bytes holding the record, at least its least length of them
     * @param offset where the record starts
     * @return its length in bytes
     */
    protected int lengthAt(byte[] buffer, int offset) {
        return minimumByteLength();
    }

    /**
     * Copies every field out of the bytes, which decoding has checked hold the whole record.
     *
     * @param buffer the bytes holding the record
     * @param offset where the record starts
     */
    protected abstract void read(byte[] buffer, int offset);

    /**
     * Decodes a record into this one, copying each of its fields. Bytes refused leave it holding nothing decoded.
     *
     * @param buffer the bytes holding the record
     * @param offset where the record starts
     * @param end where the bytes the record may occupy end
     * @throws DecodeException when the bytes between offset and end are fewer than the record's length
     */
    public final void decode(byte[] buffer, int offset, int end) {
        Objects.requireNonNull(buffer, "buffer");
        decoded = false;
        int minimum = minimumByteLength();
        if (offset < 0 || end > buffer.length || end - offset < minimum) {
            throw tooShort(minimum, buffer, offset, end);
        }

        // the counts are inside the bytes just checked, so the whole length can be read before anything is copied
        int length = lengthAt(buffer, offset);
        if (end - offset < length) {
            throw tooShort(length, buffer, offset, end);
        }
        read(buffer, offset);
        decoded = true;
    }

    private DecodeException tooShort(int needed, byte[] buffer, int offset, int end) {
        return new DecodeException(getClass().getSimpleName() + " needs " + needed
                + " bytes at " + offset + " but was given " + Math.max(0, end - offset) + " of " + buffer.length);
    }

    /**
     * Gets whether the record holds a decoded record, which a refused decode clears.
     *
     * @return whether it holds one
     */
    public final boolean isDecoded() {
        return decoded;
    }
}
