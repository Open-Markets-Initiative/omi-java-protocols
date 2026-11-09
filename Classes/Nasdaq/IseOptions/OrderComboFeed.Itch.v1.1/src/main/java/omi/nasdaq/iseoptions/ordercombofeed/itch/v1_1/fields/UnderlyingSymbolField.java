package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields;

import java.util.Objects;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.ByteOps;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Field;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.FieldKind;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.PrintOptions;

/**
 * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
 *
 * <p>A 13-byte ASCII field padded with spaces. Trailing padding is stripped on decode.</p>
 */
public final class UnderlyingSymbolField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 13;

    /**
     * This field's declared name.
     */
    public static final String NAME = "UnderlyingSymbol";

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
        if (!(other instanceof UnderlyingSymbolField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
