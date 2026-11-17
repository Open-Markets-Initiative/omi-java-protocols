package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types;

import java.nio.charset.StandardCharsets;

/**
 * Fixed-width ASCII text read where it lies, without copying it into a String.
 *
 * <p>A view is immutable and valid for as long as the bytes it views are unchanged. The fill the field is padded with
 * is left out. {@link #toString()} copies the text, for when it is needed for longer.</p>
 */
public final class TextView implements CharSequence {

    private final byte[] buffer;

    private final int start;

    private final int length;

    /**
     * Creates a view of a field.
     *
     * @param buffer the bytes holding the field
     * @param index where the field starts
     * @param width the field's width in bytes
     * @param fill the byte the field is padded with
     * @param rightJustified whether the padding comes before the text rather than after it
     * @param trims whether the padding is left out of the text
     */
    public TextView(byte[] buffer, int index, int width, byte fill, boolean rightJustified, boolean trims) {
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
        return new String(buffer, start, length, StandardCharsets.ISO_8859_1);
    }
}
