package omi.iex.iexequities.deep.iextp.v1_06.fields;

import java.util.Objects;
import omi.iex.iexequities.deep.iextp.v1_06.types.ByteOps;
import omi.iex.iexequities.deep.iextp.v1_06.types.Field;
import omi.iex.iexequities.deep.iextp.v1_06.types.FieldKind;
import omi.iex.iexequities.deep.iextp.v1_06.types.PrintOptions;

/**
 * Sale Condition Flags
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class SaleConditionFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SaleConditionFlags";

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
     * Unused
     *
     * @return bits 0 through 2 of the container
     */
    public int unused() {
        return (int) (value & 0x7L);
    }

    /**
     * Trade resulting from a single-price cross
     *
     * @return bit 3 of the container
     */
    public boolean singlePriceCrossTrade() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Trade is not subject to Rule 611
     *
     * @return bit 4 of the container
     */
    public boolean tradeThroughExempt() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Odd Lot
     *
     * @return bit 5 of the container
     */
    public boolean oddLot() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Extended Hours Trade
     *
     * @return bit 6 of the container
     */
    public boolean extendedHours() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Intermarket Sweep Order
     *
     * @return bit 7 of the container
     */
    public boolean intermarketSweep() {
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
        if (!(other instanceof SaleConditionFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
