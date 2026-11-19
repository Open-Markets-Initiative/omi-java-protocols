package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields;

import java.util.Objects;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.ByteOps;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.FieldKind;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Indicates presence of values within RealTimeIndex fields
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class PresenceFlagsRealTimeIndexPresenceFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "PresenceFlagsRealTimeIndexPresenceFlags";

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
     * Has Trading Value
     *
     * @return bit 0 of the container
     */
    public boolean hasTradingValue() {
        return (value & 1L) != 0L;
    }

    /**
     * Has Index Value Bid
     *
     * @return bit 1 of the container
     */
    public boolean hasIndexValueBid() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Has Index Value Ask
     *
     * @return bit 2 of the container
     */
    public boolean hasIndexValueAsk() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Has Mid Spread Index
     *
     * @return bit 3 of the container
     */
    public boolean hasMidSpreadIndex() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Has Difference Central Spread
     *
     * @return bit 4 of the container
     */
    public boolean hasDifferenceCentralSpread() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bits 5 through 7 of the container
     */
    public int reserved() {
        return (int) ((value >>> 5) & 0x7L);
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
        if (!(other instanceof PresenceFlagsRealTimeIndexPresenceFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
