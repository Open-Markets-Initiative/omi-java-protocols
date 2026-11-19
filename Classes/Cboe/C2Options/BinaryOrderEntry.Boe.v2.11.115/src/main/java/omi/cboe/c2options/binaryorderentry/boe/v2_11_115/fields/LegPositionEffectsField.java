package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields;

import java.util.Objects;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.ByteOps;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.FieldKind;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Indicates status of the client position in the option for each complex option leg. This value String of characters ‘O’, ‘C’, and ‘N’, equal in length to the number of option legs of the instrument. If an equity leg is present it will always be the last leg, and the position effect must be set to ‘N’. This field can be used for complex instruments with up to 12 legs. For more than 12 legs, fill this field with spaces (0x20) and use the optional LegPositionEffectsExt field. O=Open C=Close N=None* *Orders with Capacity = M or ‘N’ will not be required to specify a position effect on their orders or may specify a value of ‘N’, in which case&lt;blank&gt; will be sent to clearing. If the leg is limited to closing only transactions, only Capacity = M will be permitted to submit OpenClose = O if the order has TimeInForce= ‘3’ (IOC) and RoutingInst = B.
 *
 * <p>A 12-byte ASCII field padded with null characters. Trailing padding is stripped on decode.</p>
 */
public final class LegPositionEffectsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This field's declared name.
     */
    public static final String NAME = "LegPositionEffects";

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
        if (!(other instanceof LegPositionEffectsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
