package omi.asx.asxderivatives.t24.itch.v1_13.fields;

import java.util.Objects;
import omi.asx.asxderivatives.t24.itch.v1_13.types.ByteOps;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.FieldKind;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Bitwise flags indicating which fields have been adjusted
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class MarketUpdatesField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "MarketUpdates";

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
     * Has Opening Trade Price Changed
     *
     * @return bit 0 of the container
     */
    public boolean openingTradePrice() {
        return (value & 1L) != 0L;
    }

    /**
     * Has Highest Traded Price Changed
     *
     * @return bit 1 of the container
     */
    public boolean highestTradedPrice() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Has Lowest Traded Price Changed
     *
     * @return bit 2 of the container
     */
    public boolean lowestTradedPrice() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Has Total Traded Volume and Total Trades Changed
     *
     * @return bit 3 of the container
     */
    public boolean totalTradedVolumeAndTotalTrades() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Has Last Traded Price Changed
     *
     * @return bit 4 of the container
     */
    public boolean lastTradedPrice() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Last Traded Volume
     *
     * @return bit 5 of the container
     */
    public boolean lastTradedVolume() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * All Fields
     *
     * @return bits 6 through 7 of the container
     */
    public int allFields() {
        return (int) ((value >>> 6) & 0x3L);
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
        if (!(other instanceof MarketUpdatesField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
