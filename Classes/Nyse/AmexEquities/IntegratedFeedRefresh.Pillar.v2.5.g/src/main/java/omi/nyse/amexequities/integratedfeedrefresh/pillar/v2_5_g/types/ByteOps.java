package omi.nyse.amexequities.integratedfeedrefresh.pillar.v2_5_g.types;

import java.nio.charset.StandardCharsets;
import java.util.HexFormat;

/**
 * Endian-aware primitive reads and writes over a byte array.
 *
 * <p>Reads are generic over width so that non-standard integer widths — three, five, six
 * and seven bytes all occur in exchange protocols — decode through the same path as the
 * standard widths, with no special case at the call site.</p>
 *
 * <p>Every method assumes the caller has already bounds-checked the range it asks for.
 * Generated field classes perform that check once, before decoding.</p>
 */
public final class ByteOps {

    private ByteOps() {
    }

    /**
     * Reads {@code length} bytes as an unsigned integer.
     *
     * <p>A full eight-byte read returns the raw bit pattern, because Java has no wider
     * type to widen into. Compare such a result with {@link Long#compareUnsigned} and
     * format it with {@link Long#toUnsignedString}. Widths of one to seven bytes always
     * return the mathematical value.</p>
     *
     * @param data         the buffer to read from
     * @param offset       the index of the first byte of the value
     * @param length       the value width in bytes, from 1 to 8
     * @param littleEndian whether the value is stored least significant byte first
     * @return the decoded value
     */
    public static long unsigned(byte[] data, int offset, int length, boolean littleEndian) {
        long value = 0;
        if (littleEndian) {
            for (int index = length - 1; index >= 0; index--) {
                value = (value << 8) | (data[offset + index] & 0xFFL);
            }
        } else {
            for (int index = 0; index < length; index++) {
                value = (value << 8) | (data[offset + index] & 0xFFL);
            }
        }
        return value;
    }

    /**
     * Reads {@code length} bytes as a two's-complement signed integer, sign-extending
     * from the value's own width rather than from 64 bits.
     *
     * @param data         the buffer to read from
     * @param offset       the index of the first byte of the value
     * @param length       the value width in bytes, from 1 to 8
     * @param littleEndian whether the value is stored least significant byte first
     * @return the decoded value
     */
    public static long signed(byte[] data, int offset, int length, boolean littleEndian) {
        long value = unsigned(data, offset, length, littleEndian);
        if (length == Long.BYTES) {
            return value;
        }
        int shift = 64 - (length << 3);
        return (value << shift) >> shift;
    }

    /**
     * Writes the low {@code length} bytes of a value.
     *
     * @param data         the buffer to write into
     * @param offset       the index of the first byte of the value
     * @param length       the value width in bytes, from 1 to 8
     * @param value        the value to write; bits above the width are discarded
     * @param littleEndian whether the value is stored least significant byte first
     */
    public static void put(byte[] data, int offset, int length, long value, boolean littleEndian) {
        if (littleEndian) {
            for (int index = 0; index < length; index++) {
                data[offset + index] = (byte) (value >>> (index << 3));
            }
        } else {
            for (int index = 0; index < length; index++) {
                data[offset + index] = (byte) (value >>> ((length - 1 - index) << 3));
            }
        }
    }

    /**
     * Reads a fixed-length ASCII field, stripping trailing padding.
     *
     * <p>Decoded as ISO-8859-1 rather than US-ASCII. The two agree on every byte a
     * conforming field can hold, but US-ASCII maps anything above 0x7F to the
     * replacement character, which destroys the byte: the field would re-encode to
     * different bytes than it decoded, and report itself valid while doing so.
     * ISO-8859-1 maps all 256 byte values one to one, so a field carrying bytes
     * outside its declared encoding survives a decode and re-encode unchanged.
     * Use {@link Field#raw()} when the exact bytes matter.</p>
     *
     * @param data    the buffer to read from
     * @param offset  the index of the first byte of the field
     * @param length  the field width in bytes
     * @param padding the byte the field is right-padded with
     * @return the decoded text, empty when the field is entirely padding
     */
    public static String ascii(byte[] data, int offset, int length, byte padding) {
        int end = offset + length;
        while (end > offset && data[end - 1] == padding) {
            end--;
        }
        return new String(data, offset, end - offset, StandardCharsets.ISO_8859_1);
    }

    /**
     * Reads a fixed-length ASCII field whole, as a zero-filled field is, whose zeros may be part of its text.
     *
     * @param data    the buffer to read from
     * @param offset  the index of the first byte of the field
     * @param length  the field width in bytes
     * @return the decoded text
     */
    public static String ascii(byte[] data, int offset, int length) {
        return new String(data, offset, length, StandardCharsets.ISO_8859_1);
    }

    /**
     * Reads a fixed-length right-justified ASCII field, stripping leading padding.
     *
     * @param data    the buffer to read from
     * @param offset  the index of the first byte of the field
     * @param length  the field width in bytes
     * @param padding the byte the field is left-padded with
     * @return the decoded text, empty when the field is entirely padding
     */
    public static String asciiRightJustified(byte[] data, int offset, int length, byte padding) {
        int start = offset;
        while (start < offset + length && data[start] == padding) {
            start++;
        }
        return new String(data, start, offset + length - start, StandardCharsets.ISO_8859_1);
    }

    /**
     * Writes a fixed-length ASCII field, right-padding the remainder.
     *
     * <p>Text longer than the field is truncated to the field width, because the wire
     * layout is fixed and overrunning it would corrupt the following field.</p>
     *
     * @param data    the buffer to write into
     * @param offset  the index of the first byte of the field
     * @param length  the field width in bytes
     * @param value   the text to write; null is treated as empty
     * @param padding the byte to right-pad with
     */
    public static void putAscii(byte[] data, int offset, int length, String value, byte padding) {
        String text = value == null ? "" : value;
        int written = Math.min(text.length(), length);
        for (int index = 0; index < written; index++) {
            data[offset + index] = (byte) text.charAt(index);
        }
        for (int index = written; index < length; index++) {
            data[offset + index] = padding;
        }
    }

    /**
     * Writes a fixed-length right-justified ASCII field, left-padding the remainder.
     *
     * <p>Text longer than the field is truncated to the field width, as {@link #putAscii} truncates it.</p>
     *
     * @param data    the buffer to write into
     * @param offset  the index of the first byte of the field
     * @param length  the field width in bytes
     * @param value   the text to write; null is treated as empty
     * @param padding the byte to left-pad with
     */
    public static void putAsciiRightJustified(byte[] data, int offset, int length, String value, byte padding) {
        String text = value == null ? "" : value;
        int written = Math.min(text.length(), length);
        int start = offset + length - written;
        for (int index = offset; index < start; index++) {
            data[index] = padding;
        }
        for (int index = 0; index < written; index++) {
            data[start + index] = (byte) text.charAt(index);
        }
    }

    /**
     * Formats a byte range as uppercase hexadecimal, for diagnostic output.
     *
     * @param data   the buffer to read from
     * @param offset the index of the first byte
     * @param length the number of bytes to format
     * @return the formatted text
     */
    public static String hex(byte[] data, int offset, int length) {
        return HexFormat.of().withUpperCase().formatHex(data, offset, offset + length);
    }
}
