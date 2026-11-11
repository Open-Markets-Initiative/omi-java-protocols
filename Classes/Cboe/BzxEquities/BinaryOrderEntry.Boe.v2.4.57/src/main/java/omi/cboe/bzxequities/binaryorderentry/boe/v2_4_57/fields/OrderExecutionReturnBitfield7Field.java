package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * BitSet OrderExecution byte 7.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderExecutionReturnBitfield7Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderExecutionReturnBitfield7";

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
     * Order Execution Return Bitfield 7 Sub Liquidity Indicator
     *
     * @return bit 0 of the container
     */
    public boolean orderExecutionReturnBitfield7SubLiquidityIndicator() {
        return (value & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Trade Report Type Return
     *
     * @return bit 1 of the container
     */
    public boolean orderExecutionReturnBitfield7TradeReportTypeReturn() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Trade Publish Ind Return
     *
     * @return bit 2 of the container
     */
    public boolean orderExecutionReturnBitfield7TradePublishIndReturn() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Text
     *
     * @return bit 3 of the container
     */
    public boolean orderExecutionReturnBitfield7Text() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Bid
     *
     * @return bit 4 of the container
     */
    public boolean orderExecutionReturnBitfield7Bid() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Offer
     *
     * @return bit 5 of the container
     */
    public boolean orderExecutionReturnBitfield7Offer() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Large Size
     *
     * @return bit 6 of the container
     */
    public boolean orderExecutionReturnBitfield7LargeSize() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Order Execution Return Bitfield 7 Last Mkt
     *
     * @return bit 7 of the container
     */
    public boolean orderExecutionReturnBitfield7LastMkt() {
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
        if (!(other instanceof OrderExecutionReturnBitfield7Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
