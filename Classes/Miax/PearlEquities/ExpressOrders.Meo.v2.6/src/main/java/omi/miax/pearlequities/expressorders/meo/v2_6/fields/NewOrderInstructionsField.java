package omi.miax.pearlequities.expressorders.meo.v2_6.fields;

import java.util.Objects;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.ByteOps;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Field;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.FieldKind;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.PrintOptions;

/**
 * New Order Instructions
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NewOrderInstructionsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NewOrderInstructions";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

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
     * Side
     *
     * @return bit 0 of the container
     */
    public boolean side() {
        return (value & 1L) != 0L;
    }

    /**
     * Short Sale Indicator
     *
     * @return bits 1 through 2 of the container
     */
    public int shortSaleIndicator() {
        return (int) ((value >>> 1) & 0x3L);
    }

    /**
     * Displayed
     *
     * @return bit 3 of the container
     */
    public boolean displayed() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * PostOnly
     *
     * @return bit 4 of the container
     */
    public boolean postOnly() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Locate Required
     *
     * @return bit 5 of the container
     */
    public boolean locateRequired() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * ISO
     *
     * @return bit 6 of the container
     */
    public boolean iso() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Retail Order
     *
     * @return bit 7 of the container
     */
    public boolean retailOrder() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Attributable Order
     *
     * @return bits 8 through 9 of the container
     */
    public int attributableOrder() {
        return (int) ((value >>> 8) & 0x3L);
    }

    /**
     * Attributable Order
     *
     * @return bits 10 through 11 of the container
     */
    public int minQtyExecType() {
        return (int) ((value >>> 10) & 0x3L);
    }

    /**
     * Cancel Order if NOT a NBBO Setter
     *
     * @return bit 12 of the container
     */
    public boolean cancelOrderIfNotANbboSetter() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Reserved for future use
     *
     * @return bits 13 through 15 of the container
     */
    public int unused() {
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
        if (!(other instanceof NewOrderInstructionsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
