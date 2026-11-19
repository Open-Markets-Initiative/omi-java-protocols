package omi.nse.nsecd.orderentry.nnf.v6_3.fields;

import java.util.Objects;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.ByteOps;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.FieldKind;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class AdditionalOrderFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "AdditionalOrderFlags";

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
     * Reserved
     *
     * @return bit 0 of the container
     */
    public boolean additionalOrderFlagsReserved1() {
        return (value & 1L) != 0L;
    }

    /**
     * 1 Cancel on Logoff
     *
     * @return bit 1 of the container
     */
    public boolean col() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bit 2 of the container
     */
    public boolean additionalOrderFlagsReserved3() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bit 3 of the container
     */
    public boolean additionalOrderFlagsReserved4() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * 0 Cancel order resulting in self trade as per default action by the exchange
     *
     * @return bit 4 of the container
     */
    public boolean stpc() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bits 5 through 7 of the container
     */
    public int additionalOrderFlagsReserved68() {
        return (int) ((value >>> 5) & 0x7L);
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
        if (!(other instanceof AdditionalOrderFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
