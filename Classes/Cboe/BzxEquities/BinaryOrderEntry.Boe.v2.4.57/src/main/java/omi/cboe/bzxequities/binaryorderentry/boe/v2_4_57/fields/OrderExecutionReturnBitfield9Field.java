package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * BitSet OrderExecution byte 9.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderExecutionReturnBitfield9Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderExecutionReturnBitfield9";

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
     * Order Execution Return Bitfield 9 Marketing Fee Code
     *
     * @return bit 0 of the container
     */
    public boolean orderExecutionReturnBitfield9MarketingFeeCode() {
        return (value & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Target Party Id
     *
     * @return bit 1 of the container
     */
    public boolean orderExecutionReturnBitfield9TargetPartyId() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Auction Id
     *
     * @return bit 2 of the container
     */
    public boolean orderExecutionReturnBitfield9AuctionId() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Order Category
     *
     * @return bit 3 of the container
     */
    public boolean orderExecutionReturnBitfield9OrderCategory() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Liquidity Provision
     *
     * @return bit 4 of the container
     */
    public boolean orderExecutionReturnBitfield9LiquidityProvision() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Cmta Number
     *
     * @return bit 5 of the container
     */
    public boolean orderExecutionReturnBitfield9CmtaNumber() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Cross Type
     *
     * @return bit 6 of the container
     */
    public boolean orderExecutionReturnBitfield9CrossType() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 9 Cross Prioritization
     *
     * @return bit 7 of the container
     */
    public boolean orderExecutionReturnBitfield9CrossPrioritization() {
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
        if (!(other instanceof OrderExecutionReturnBitfield9Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
