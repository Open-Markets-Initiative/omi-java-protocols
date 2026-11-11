package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * BitSet OrderRejected byte 13.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderRejectedReturnBitfield13Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderRejectedReturnBitfield13";

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
     * Order Rejected Return Bitfield 13 Cum Qty
     *
     * @return bit 0 of the container
     */
    public boolean orderRejectedReturnBitfield13CumQty() {
        return (value & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Day Order Qty
     *
     * @return bit 1 of the container
     */
    public boolean orderRejectedReturnBitfield13DayOrderQty() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Day Cum Qty
     *
     * @return bit 2 of the container
     */
    public boolean orderRejectedReturnBitfield13DayCumQty() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Avg Px
     *
     * @return bit 3 of the container
     */
    public boolean orderRejectedReturnBitfield13AvgPx() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Day Avg Px
     *
     * @return bit 4 of the container
     */
    public boolean orderRejectedReturnBitfield13DayAvgPx() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Pending Status
     *
     * @return bit 5 of the container
     */
    public boolean orderRejectedReturnBitfield13PendingStatus() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Drill Thru Protection
     *
     * @return bit 6 of the container
     */
    public boolean orderRejectedReturnBitfield13DrillThruProtection() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Order Rejected Return Bitfield 13 Multileg Reporting Type
     *
     * @return bit 7 of the container
     */
    public boolean orderRejectedReturnBitfield13MultilegReportingType() {
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
        if (!(other instanceof OrderRejectedReturnBitfield13Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
