package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields;

import java.util.Objects;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.FieldKind;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

/**
 * Controls the behavior of the OrderQty field. Using “R” allows for a TPH to ensure that in-flight fills or cancels do not result in unwanted additional size exposure. NULL (0x00) = New quote size will be set to value of OrderQty. R = Reduce outstanding size of quote by the OrderQty provided. When using “R”, if the resulting size is zero or negative, then the quote is cancelled. TPHs are expected to track the remaining quantity of each quote as resulting size is not included on the Quote Update Acknowledgement message.
 *
 * <p>A single ASCII character stored as one byte.</p>
 */
public final class SizeModifierField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SizeModifier";

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
        if (!(other instanceof SizeModifierField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
