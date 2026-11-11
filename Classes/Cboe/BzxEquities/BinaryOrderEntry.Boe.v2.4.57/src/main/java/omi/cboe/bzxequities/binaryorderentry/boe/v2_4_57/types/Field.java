package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types;

import java.util.Arrays;
import java.util.Optional;

/**
 * The base type for generated fields.
 *
 * <p>Each field in a protocol has one final leaf class extending this type. A leaf class
 * exposes its decoded value through a typed accessor; this base carries the state common
 * to all of them.</p>
 *
 * <p>Instances are mutable and are reused across parses. They are not thread-safe.</p>
 */
public abstract class Field {

    /** The buffer this field was last decoded from, or null when no decode has occurred. */
    private byte[] buffer;

    /** The index within {@link #buffer} this field was decoded from. */
    private int bufferOffset;

    /** Whether the last decode attempt read this field's bytes successfully. */
    private boolean decoded;

    /** Whether this field holds a value, whether decoded from bytes or supplied by a setter. */
    private boolean valued;

    /**
     * Returns this field's declared name, as the protocol specification writes it.
     *
     * @return the field name
     */
    public abstract String name();

    /**
     * Returns this field's wire and value archetype.
     *
     * @return the field kind
     */
    public abstract FieldKind kind();

    /**
     * Returns this field's fixed width on the wire.
     *
     * @return the width in bytes
     */
    public abstract int byteLength();

    /**
     * Decodes this field from a buffer.
     *
     * <p>Returns false and leaves the field undecoded when the buffer holds fewer bytes
     * than the field's width. A value the protocol does not declare still decodes: use
     * {@link #isRecognized()} to test for one.</p>
     *
     * @param data   the buffer to decode from
     * @param offset the index of this field's first byte
     * @return true when the field decoded
     */
    public abstract boolean parse(byte[] data, int offset);

    /**
     * Encodes this field into a buffer, writing nothing when it does not fit.
     *
     * @param data   the buffer to encode into
     * @param offset the index of this field's first byte
     * @return the index just past the encoded field
     * @throws IndexOutOfBoundsException when the field does not fit at offset
     */
    public abstract int encode(byte[] data, int offset);

    /**
     * Appends this field's formatted representation.
     *
     * <p>A field always renders on one line and never changes the indentation depth.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    public abstract void toFormattedString(StringBuilder builder, PrintOptions options);

    /**
     * Returns whether this field decoded from its bytes.
     *
     * <p>A field whose value came from a setter rather than the wire holds a value but
     * did not decode. Test {@link #hasValue()} to cover both.</p>
     *
     * @return true when the last decode succeeded
     */
    public final boolean isDecoded() {
        return decoded;
    }

    /**
     * Returns whether this field holds a value.
     *
     * <p>True after a successful decode and after a setter supplies one, so a message
     * built in memory reports, renders and compares as a decoded one does. A field
     * that was never decoded still has no bytes to show: {@link #raw()} is empty
     * and {@link #isDecoded()} is false.</p>
     *
     * @return true when the field holds a value
     */
    public final boolean hasValue() {
        return valued;
    }

    /**
     * Returns whether this field holds a value the protocol declares.
     *
     * <p>Only enum fields can fail this test while holding a value; every other field
     * accepts any bit pattern of its width. A nullable sentinel counts as
     * recognized.</p>
     *
     * @return true when the field's value is a declared one
     */
    public boolean isRecognized() {
        return valued;
    }

    /**
     * Returns whether this field holds a structurally sound value.
     *
     * <p>An unrecognized enum value is a semantic problem, not a structural one, so it
     * does not make this test fail. Test {@link #isRecognized()} as well when the value
     * matters.</p>
     *
     * @return true when the field holds a value
     */
    public boolean isValid() {
        return valued;
    }

    /**
     * Returns a copy of the bytes this field was decoded from.
     *
     * <p>Decoding retains a reference to the caller's buffer rather than copying it, so
     * this method allocates and the result reflects the buffer's <em>current</em>
     * contents. Call it before reusing the buffer for the next message.</p>
     *
     * @return the field's bytes, or empty when no decode has occurred
     */
    public final Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(Arrays.copyOfRange(buffer, bufferOffset, bufferOffset + byteLength()));
    }

    /**
     * Resets this field to its undecoded state.
     *
     * <p>Leaf classes override this to clear their typed value as well, and must call
     * {@code super.reset()}.</p>
     */
    public void reset() {
        buffer = null;
        bufferOffset = 0;
        decoded = false;
        valued = false;
    }

    /**
     * Records a successful decode. Leaf classes call this after reading their value.
     *
     * @param data   the buffer decoded from
     * @param offset the index of this field's first byte
     */
    protected final void markDecoded(byte[] data, int offset) {
        this.buffer = data;
        this.bufferOffset = offset;
        this.decoded = true;
        this.valued = true;
    }

    /**
     * Records whether this field holds a value, after a setter supplied or cleared one.
     * Leaf classes call this from their value mutators.
     *
     * @param present whether the setter supplied a value
     */
    protected final void markSet(boolean present) {
        this.valued = present;
    }

    /**
     * Returns this field's formatted representation.
     *
     * @param options the display options
     * @return the formatted text
     */
    public final String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Returns this field's formatted representation with the default display options.
     *
     * @return the formatted text
     */
    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }
}
