package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.PrintOptions;

/**
 * BitSet NewOrder byte 8.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NewOrderBitfield8Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NewOrderBitfield8";

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
     * New Order Bitfield 8 Reserved 1
     *
     * @return bit 0 of the container
     */
    public boolean newOrderBitfield8Reserved1() {
        return (value & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Reserved 2
     *
     * @return bit 1 of the container
     */
    public boolean newOrderBitfield8Reserved2() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Clearing Optional Data
     *
     * @return bit 2 of the container
     */
    public boolean newOrderBitfield8ClearingOptionalData() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Client Id Attr
     *
     * @return bit 3 of the container
     */
    public boolean newOrderBitfield8ClientIdAttr() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Frequent Trader Id
     *
     * @return bit 4 of the container
     */
    public boolean newOrderBitfield8FrequentTraderId() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Compression
     *
     * @return bit 5 of the container
     */
    public boolean newOrderBitfield8Compression() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Floor Destination
     *
     * @return bit 6 of the container
     */
    public boolean newOrderBitfield8FloorDestination() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 8 Floor Routing Inst
     *
     * @return bit 7 of the container
     */
    public boolean newOrderBitfield8FloorRoutingInst() {
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
        if (!(other instanceof NewOrderBitfield8Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
