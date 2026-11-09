package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.PrintOptions;

/**
 * BitSet PurgeOrder byte 1.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class PurgeOrderBitfield1Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "PurgeOrderBitfield1";

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
     * Purge Order Bitfield 1 Clearing Firm
     *
     * @return bit 0 of the container
     */
    public boolean purgeOrderBitfield1ClearingFirm() {
        return (value & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Reserved 2
     *
     * @return bit 1 of the container
     */
    public boolean purgeOrderBitfield1Reserved2() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Mass Cancel Inst
     *
     * @return bit 2 of the container
     */
    public boolean purgeOrderBitfield1MassCancelInst() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Reserved 8
     *
     * @return bit 3 of the container
     */
    public boolean purgeOrderBitfield1Reserved8() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Mass Cancel Id
     *
     * @return bit 4 of the container
     */
    public boolean purgeOrderBitfield1MassCancelId() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Reserved 32
     *
     * @return bit 5 of the container
     */
    public boolean purgeOrderBitfield1Reserved32() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Reserved 64
     *
     * @return bit 6 of the container
     */
    public boolean purgeOrderBitfield1Reserved64() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Purge Order Bitfield 1 Reserved 128
     *
     * @return bit 7 of the container
     */
    public boolean purgeOrderBitfield1Reserved128() {
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
        if (!(other instanceof PurgeOrderBitfield1Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
