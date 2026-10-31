package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields;

import java.util.Objects;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.ByteOps;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.FieldKind;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.PrintOptions;

/**
 * Specifies the next sequence number in ASCII the client wants to receive upon connection, or 0 to start receiving the most recently generated message.
 *
 * <p>A 20-byte ASCII field padded with spaces. Trailing padding is stripped on decode.</p>
 */
public final class RequestedSequenceNumberField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This field's declared name.
     */
    public static final String NAME = "RequestedSequenceNumber";

    /**
     * The byte this field is right-padded with (spaces).
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

        this.value = ByteOps.ascii(data, offset, BYTE_LENGTH, PADDING);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.putAscii(data, offset, BYTE_LENGTH, value, PADDING);
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
        if (!(other instanceof RequestedSequenceNumberField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
