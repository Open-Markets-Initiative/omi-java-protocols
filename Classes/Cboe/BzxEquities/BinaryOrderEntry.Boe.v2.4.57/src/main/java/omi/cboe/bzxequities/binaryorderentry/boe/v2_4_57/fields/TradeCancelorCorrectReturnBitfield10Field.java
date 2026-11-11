package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * BitSet TradeCancelorCorrect byte 10.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class TradeCancelorCorrectReturnBitfield10Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradeCancelorCorrectReturnBitfield10";

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
     * Trade Cancelor Correct Return Bitfield 10 Cross Id
     *
     * @return bit 0 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10CrossId() {
        return (value & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Alloc Qty
     *
     * @return bit 1 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10AllocQty() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Give Up Firm Id
     *
     * @return bit 2 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10GiveUpFirmId() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Routing Firm Id
     *
     * @return bit 3 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10RoutingFirmId() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Waiver Type
     *
     * @return bit 4 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10WaiverType() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Cross Exclusion Indicator
     *
     * @return bit 5 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10CrossExclusionIndicator() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Price Formation
     *
     * @return bit 6 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10PriceFormation() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Trade Cancelor Correct Return Bitfield 10 Client Qualified Role
     *
     * @return bit 7 of the container
     */
    public boolean tradeCancelorCorrectReturnBitfield10ClientQualifiedRole() {
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
        if (!(other instanceof TradeCancelorCorrectReturnBitfield10Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
