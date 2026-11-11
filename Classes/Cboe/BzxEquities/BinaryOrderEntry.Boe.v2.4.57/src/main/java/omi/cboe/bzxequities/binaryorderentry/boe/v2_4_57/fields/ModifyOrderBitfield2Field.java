package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * BitSet ModifyOrder byte 2.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class ModifyOrderBitfield2Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ModifyOrderBitfield2";

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
     * Modify Order Bitfield 2 Max Floor
     *
     * @return bit 0 of the container
     */
    public boolean modifyOrderBitfield2MaxFloor() {
        return (value & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Stop Px
     *
     * @return bit 1 of the container
     */
    public boolean modifyOrderBitfield2StopPx() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Routing Firm Id
     *
     * @return bit 2 of the container
     */
    public boolean modifyOrderBitfield2RoutingFirmId() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Manual Order Indicator
     *
     * @return bit 3 of the container
     */
    public boolean modifyOrderBitfield2ManualOrderIndicator() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Operator Id
     *
     * @return bit 4 of the container
     */
    public boolean modifyOrderBitfield2OperatorId() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Frequent Trader Id
     *
     * @return bit 5 of the container
     */
    public boolean modifyOrderBitfield2FrequentTraderId() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Reserved
     *
     * @return bit 6 of the container
     */
    public boolean modifyOrderBitfield2Reserved() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Modify Order Bitfield 2 Locate Broker
     *
     * @return bit 7 of the container
     */
    public boolean modifyOrderBitfield2LocateBroker() {
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
        if (!(other instanceof ModifyOrderBitfield2Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
