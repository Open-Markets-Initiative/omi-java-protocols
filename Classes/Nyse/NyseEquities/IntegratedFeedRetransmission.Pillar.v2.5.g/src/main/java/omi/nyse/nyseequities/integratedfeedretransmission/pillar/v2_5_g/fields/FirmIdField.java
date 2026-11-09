package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.fields;

import java.util.Objects;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.types.ByteOps;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.types.Field;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.types.FieldKind;
import omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.types.PrintOptions;

/**
 * The market participant's firm ID.
 *
 * <p>A 5-byte ASCII field padded with spaces. Trailing padding is stripped on decode.</p>
 */
public final class FirmIdField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 5;

    /**
     * This field's declared name.
     */
    public static final String NAME = "FirmId";

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
        if (!(other instanceof FirmIdField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
