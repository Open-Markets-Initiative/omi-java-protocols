package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields;

import java.util.Objects;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.ByteOps;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Field;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.FieldKind;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.PrintOptions;

/**
 * The current trading session ID of the corresponding Matching Engine
 */
public final class TradingSessionIdField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradingSessionId";

    private short value;

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public short value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(short value) {
        this.value = value;
        markSet(true);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.UNSIGNED_INTEGER;
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

        this.value = (short) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, false);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = (short) 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append(value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingSessionIdField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
