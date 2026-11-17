package omi.flyweight.iex.iexequities.tops.iextp.v1_64.types;

import java.nio.charset.StandardCharsets;

/**
 * Fixed-width ASCII text copied into bytes of its own, so it stays valid after the bytes it was read from are reused.
 *
 * <p>Each text field of a record owns one, which every decode copies into again, so it is valid until its record
 * decodes the next one. The fill the field is padded with is left out. {@link #toString()} copies the text, for when
 * it is needed for longer.</p>
 */
public final class Text implements CharSequence {

    private final byte[] bytes;

    private final byte fill;

    private final boolean rightJustified;

    private final boolean trims;

    private int start;

    private int length;

    /**
     * Creates the text of a field, empty until it is first copied.
     *
     * @param width the field's width in bytes
     * @param fill the byte the field is padded with
     * @param rightJustified whether the padding comes before the text rather than after it
     * @param trims whether the padding is left out of the text
     */
    public Text(int width, byte fill, boolean rightJustified, boolean trims) {
        this.bytes = new byte[width];
        this.fill = fill;
        this.rightJustified = rightJustified;
        this.trims = trims;
    }

    /**
     * Copies the field out of the bytes holding it.
     *
     * @param buffer the bytes holding the field
     * @param index where the field starts
     */
    public void copy(byte[] buffer, int index) {
        System.arraycopy(buffer, index, bytes, 0, bytes.length);
        int first = 0;
        int last = bytes.length;
        if (trims && rightJustified) {
            while (first < last && bytes[first] == fill) {
                first++;
            }
        } else if (trims) {
            while (last > first && bytes[last - 1] == fill) {
                last--;
            }
        }
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
        return (char) (bytes[start + index] & 0xFF);
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
        return new String(bytes, start, length, StandardCharsets.ISO_8859_1);
    }
}
