package omi.hkex.sse.chinaconnectretrans.omd.v1_4.fields;

import java.util.Objects;
import omi.hkex.sse.chinaconnectretrans.omd.v1_4.types.Field;
import omi.hkex.sse.chinaconnectretrans.omd.v1_4.types.FieldKind;
import omi.hkex.sse.chinaconnectretrans.omd.v1_4.types.PrintOptions;

/**
 * Security name in Simplified Chinese using Unicode UTF-16LE encoding.
 *
 * <p>30 little-endian UTF-16 code units, left-justified and padded with null characters. Padding is stripped on decode. Each code unit is one char, unpaired surrogates included, so the bytes re-encode as they arrived.</p>
 */
public final class SecurityNameGbField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 60;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SecurityNameGb";

    /**
     * Whether each code unit is stored least significant byte first.
     */
    public static final boolean LITTLE_ENDIAN = true;

    /**
     * The code unit this field is right-padded with (null characters).
     */
    public static final char PADDING = '\u0000';

    private String value = "";

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, empty when the field has not decoded
     */
    public String value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * <p>Text longer than the field is truncated to its code units.</p>
     *
     * @param value the value to encode, or null to clear the field
     */
    public void value(String value) {
        this.value = value == null ? "" : value;
        markSet(value != null);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.UTF16_STRING;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    public boolean parse(byte[] data, int offset) {
        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        char[] units = new char[BYTE_LENGTH / 2];
        for (int unit = 0; unit < units.length; unit++) {
            int first = data[offset + 2 * unit] & 0xFF;
            int second = data[offset + 2 * unit + 1] & 0xFF;
            units[unit] = (char) (LITTLE_ENDIAN ? first | second << 8 : first << 8 | second);
        }
        int start = 0;
        int end = units.length;
        while (end > start && units[end - 1] == PADDING) {
            end--;
        }
        this.value = new String(units, start, end - start);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int units = BYTE_LENGTH / 2;
        int written = Math.min(value.length(), units);
        int start = 0;
        for (int unit = 0; unit < units; unit++) {
            char character = unit >= start && unit < start + written ? value.charAt(unit - start) : PADDING;
            data[offset + 2 * unit] = (byte) (LITTLE_ENDIAN ? character : character >>> 8);
            data[offset + 2 * unit + 1] = (byte) (LITTLE_ENDIAN ? character >>> 8 : character);
        }
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = "";
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append('\'').append(value).append('\'');
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityNameGbField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
