package omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields;

import java.util.Objects;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.ByteOps;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.Field;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.FieldKind;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.PrintOptions;

/**
 * Additional order attributes. Applicable types may be defined by the marketplace. The field is a bit map, multiple values may be set simultaneously; 0 = Not applicable
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class ExchangeOrderTypeField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ExchangeOrderType";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = false;

    private short value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
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

    /**
     * Force (value 1)
     *
     * @return bit 0 of the container
     */
    public boolean force() {
        return (value & 1L) != 0L;
    }

    /**
     * Short Sell (value 2)
     *
     * @return bit 1 of the container
     */
    public boolean shortSell() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Market Bid (value 4)
     *
     * @return bit 2 of the container
     */
    public boolean marketBid() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Price Stabilization (value 8)
     *
     * @return bit 3 of the container
     */
    public boolean priceStabilization() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Override Crossing (value 16)
     *
     * @return bit 4 of the container
     */
    public boolean overrideCrossing() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Undisclosed (value 32)
     *
     * @return bit 5 of the container
     */
    public boolean undisclosed() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Reserved, values 64 through 512 are not stated
     *
     * @return bits 6 through 9 of the container
     */
    public int reservedBits7To() {
        return (int) ((value >>> 6) & 0xFL);
    }

    /**
     * Fill-and-kill immediately (value 1024)
     *
     * @return bit 10 of the container
     */
    public boolean fillAndKillImmediately() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Firm color disabled (value 2048)
     *
     * @return bit 11 of the container
     */
    public boolean firmColorDisabled() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Convert to aggressive, if locked market (value 4096)
     *
     * @return bit 12 of the container
     */
    public boolean convertToAggressive() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Reserved, values 8192 and above are not stated
     *
     * @return bits 13 through 15 of the container
     */
    public int reservedBits14To() {
        return (int) ((value >>> 13) & 0x7L);
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

        this.value = (short) ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, LITTLE_ENDIAN);
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

        builder.append("0x").append(Integer.toHexString(value & 0xFFFF));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeOrderTypeField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
