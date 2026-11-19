package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields;

import java.util.Objects;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.ByteOps;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.FieldKind;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.PrintOptions;

/**
 * Packed qualifier bits
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class LiquidityAttributesField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "LiquidityAttributes";

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
     * Reserved
     *
     * @return bits 0 through 2 of the container
     */
    public int reserved() {
        return (int) (value & 0x7L);
    }

    /**
     * Liquidity Indicator
     *
     * @return bits 3 through 4 of the container
     */
    public int liquidityIndicator() {
        return (int) ((value >>> 3) & 0x3L);
    }

    /**
     * Liquidity Internalized
     *
     * @return bit 5 of the container
     */
    public boolean liquidityInternalized() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Liquidity Top Of Book
     *
     * @return bit 6 of the container
     */
    public boolean liquidityTopOfBook() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Liquidity Self Trade
     *
     * @return bit 7 of the container
     */
    public boolean liquiditySelfTrade() {
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
        if (!(other instanceof LiquidityAttributesField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
