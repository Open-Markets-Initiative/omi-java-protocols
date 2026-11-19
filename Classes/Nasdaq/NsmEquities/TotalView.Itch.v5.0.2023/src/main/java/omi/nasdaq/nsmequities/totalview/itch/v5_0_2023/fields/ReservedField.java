package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields;

import java.util.Objects;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.FieldKind;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.PrintOptions;

/**
 * Reserved
 *
 * <p>A single ASCII character stored as one byte.</p>
 */
public final class ReservedField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "Reserved";

    private char value;

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public char value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(char value) {
        this.value = value;
        markSet(true);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.CHAR;
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

        this.value = (char) (data[offset] & 0xFF);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        data[offset] = (byte) value;
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = '\0';
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
        if (!(other instanceof ReservedField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
