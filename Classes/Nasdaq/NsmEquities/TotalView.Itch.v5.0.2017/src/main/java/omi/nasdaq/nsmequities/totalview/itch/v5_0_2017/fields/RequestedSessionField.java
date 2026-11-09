package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields;

import java.util.Objects;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.ByteOps;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.FieldKind;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.PrintOptions;

/**
 * Specifies the session the client would like to log into, or all blanks to log into the currently active session.
 *
 * <p>A 10-byte ASCII field, right-justified and padded with spaces. Leading padding is stripped on decode.</p>
 */
public final class RequestedSessionField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 10;

    /**
     * This field's declared name.
     */
    public static final String NAME = "RequestedSession";

    /**
     * The byte this field is left-padded with (spaces).
     */
    public static final byte PADDING = (byte) ' ';

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
        return FieldKind.STRING;
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

        this.value = ByteOps.asciiRightJustified(data, offset, BYTE_LENGTH, PADDING);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.putAsciiRightJustified(data, offset, BYTE_LENGTH, value, PADDING);
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
        if (!(other instanceof RequestedSessionField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
