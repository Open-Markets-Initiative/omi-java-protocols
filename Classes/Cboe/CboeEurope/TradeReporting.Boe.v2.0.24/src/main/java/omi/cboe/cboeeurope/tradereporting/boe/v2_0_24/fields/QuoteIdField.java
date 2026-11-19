package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields;

import java.util.Objects;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.ByteOps;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.FieldKind;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.PrintOptions;

/**
 * Corresponds to QuoteID (117) in Cboe FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Cboe only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
 *
 * <p>A 20-byte ASCII field padded with null characters. Trailing padding is stripped on decode.</p>
 */
public final class QuoteIdField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This field's declared name.
     */
    public static final String NAME = "QuoteId";

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
        if (!(other instanceof QuoteIdField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
