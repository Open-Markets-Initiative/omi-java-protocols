package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types;

import java.nio.charset.StandardCharsets;

/**
 * Fixed-width ASCII text read where it lies, without copying it into a String.
 *
 * <p>Each text field of a flyweight owns one view and repoints it at every read, so the view is valid only as long
 * as the flyweight that returned it. The fill the field is padded with is left out. {@link #toString()} copies the
 * text, for when it is needed for longer.</p>
 */
public final class TextView implements CharSequence {

    private final int width;

    private final byte fill;

    private final boolean rightJustified;

    private final boolean trims;

    private byte[] buffer;

    private int start;

    private int length;

    /**
     * Creates a view of a field.
     *
     * @param width the field's width in bytes
     * @param fill the byte the field is padded with
     * @param rightJustified whether the padding comes before the text rather than after it
     * @param trims whether the padding is left out of the text
     */
    public TextView(int width, byte fill, boolean rightJustified, boolean trims) {
        this.width = width;
        this.fill = fill;
        this.rightJustified = rightJustified;
        this.trims = trims;
    }

    /**
     * Points the view at the field.
     *
     * @param buffer the bytes holding the field
     * @param index where the field starts
     * @return this view
     */
    public TextView wrap(byte[] buffer, int index) {
        int first = index;
        int last = index + width;
        if (trims && rightJustified) {
            while (first < last && buffer[first] == fill) {
                first++;
            }
        } else if (trims) {
            while (last > first && buffer[last - 1] == fill) {
                last--;
            }
        }
        this.buffer = buffer;
        this.start = first;
        this.length = last - first;
        return this;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(index);
        }
        return (char) (buffer[start + index] & 0xFF);
    }

    @Override
    public CharSequence subSequence(int from, int to) {
        return toString().substring(from, to);
    }

    /**
     * Compares the text with other characters, allocating nothing.
     *
     * @param other the characters compared
     * @return whether they are the same characters
     */
    public boolean contentEquals(CharSequence other) {
        if (other == null || other.length() != length) {
            return false;
        }
        for (int index = 0; index < length; index++) {
            if (charAt(index) != other.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return buffer == null ? "" : new String(buffer, start, length, StandardCharsets.ISO_8859_1);
    }
}
