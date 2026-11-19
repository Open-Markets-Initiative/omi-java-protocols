package omi.cboe.c2options.binaryorderentry.boe.v2_10.fields;

import java.util.Objects;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.ByteOps;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.FieldKind;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * BitSet NewOrderCrossMultileg byte 4.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NewOrderCrossMultilegBitfield4Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NewOrderCrossMultilegBitfield4";

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
     * New Order Cross Multileg Bitfield 4 Equity Party Id
     *
     * @return bit 0 of the container
     */
    public boolean newOrderCrossMultilegBitfield4EquityPartyId() {
        return (value & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Equity Leg Short Sell
     *
     * @return bit 1 of the container
     */
    public boolean newOrderCrossMultilegBitfield4EquityLegShortSell() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Reserved 4
     *
     * @return bit 2 of the container
     */
    public boolean newOrderCrossMultilegBitfield4Reserved4() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Reserved 8
     *
     * @return bit 3 of the container
     */
    public boolean newOrderCrossMultilegBitfield4Reserved8() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Drill Thru Protection
     *
     * @return bit 4 of the container
     */
    public boolean newOrderCrossMultilegBitfield4DrillThruProtection() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Reserved 32
     *
     * @return bit 5 of the container
     */
    public boolean newOrderCrossMultilegBitfield4Reserved32() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Equity Ex Destination
     *
     * @return bit 6 of the container
     */
    public boolean newOrderCrossMultilegBitfield4EquityExDestination() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * New Order Cross Multileg Bitfield 4 Compression
     *
     * @return bit 7 of the container
     */
    public boolean newOrderCrossMultilegBitfield4Compression() {
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
        if (!(other instanceof NewOrderCrossMultilegBitfield4Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
