package omi.aquis.aquisstockexchange.snapshot.amd.v1_2_3.fields;

import java.util.Objects;
import omi.aquis.aquisstockexchange.snapshot.amd.v1_2_3.types.ByteOps;
import omi.aquis.aquisstockexchange.snapshot.amd.v1_2_3.types.Field;
import omi.aquis.aquisstockexchange.snapshot.amd.v1_2_3.types.FieldKind;
import omi.aquis.aquisstockexchange.snapshot.amd.v1_2_3.types.PrintOptions;

/**
 * Market status flags
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class MarketFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "MarketFlags";

    private byte value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public byte value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(byte value) {
        this.value = value;
        markSet(true);
    }

    /**
     * Continuous trading open or closed, which also states whether AoD is available
     *
     * @return bit 0 of the container
     */
    public boolean trading() {
        return (value & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bits 1 through 2 of the container
     */
    public int unused2() {
        return (int) ((value >>> 1) & 0x3L);
    }

    /**
     * Pre-open or pre-close market phase, read with the trading bit: pre-open when trading is closed, pre-close when it is open
     *
     * @return bit 3 of the container
     */
    public boolean preOpenClose() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bits 4 through 7 of the container
     */
    public int unused4() {
        return (int) ((value >>> 4) & 0xFL);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.BITFIELD;
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

        this.value = (byte) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
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
        this.value = (byte) 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value & 0xFF));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
