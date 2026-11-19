package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields;

import java.util.Objects;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.ByteOps;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.FieldKind;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.PrintOptions;

/**
 * Server specified identifier of the order
 *
 * <p>A 12-byte ASCII field padded with null characters. Trailing padding is stripped on decode.</p>
 */
public final class OrderIdField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderId";

    /**
     * The byte this field is right-padded with (null characters).
     */
    public static final byte PADDING = 0;

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
        if (!(other instanceof OrderIdField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
