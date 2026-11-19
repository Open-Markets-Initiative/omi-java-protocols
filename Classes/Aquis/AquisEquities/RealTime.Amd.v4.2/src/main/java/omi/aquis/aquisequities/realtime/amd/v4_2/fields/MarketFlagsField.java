package omi.aquis.aquisequities.realtime.amd.v4_2.fields;

import java.util.Objects;
import omi.aquis.aquisequities.realtime.amd.v4_2.types.ByteOps;
import omi.aquis.aquisequities.realtime.amd.v4_2.types.Field;
import omi.aquis.aquisequities.realtime.amd.v4_2.types.FieldKind;
import omi.aquis.aquisequities.realtime.amd.v4_2.types.PrintOptions;

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
     * Continuous trading open or closed
     *
     * @return bit 0 of the container
     */
    public boolean trading() {
        return (value & 1L) != 0L;
    }

    /**
     * MaC open or closed
     *
     * @return bit 1 of the container
     */
    public boolean macOpen() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * MaC locked down or not
     *
     * @return bit 2 of the container
     */
    public boolean macRun() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Spare
     *
     * @return bits 3 through 4 of the container
     */
    public int unused2() {
        return (int) ((value >>> 3) & 0x3L);
    }

    /**
     * MaC+ open or closed
     *
     * @return bit 5 of the container
     */
    public boolean macplusOpen() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * MaC+ locked down or not
     *
     * @return bit 6 of the container
     */
    public boolean macplusRun() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bit 7 of the container
     */
    public boolean unused1() {
        return ((value >>> 7) & 1L) != 0L;
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
