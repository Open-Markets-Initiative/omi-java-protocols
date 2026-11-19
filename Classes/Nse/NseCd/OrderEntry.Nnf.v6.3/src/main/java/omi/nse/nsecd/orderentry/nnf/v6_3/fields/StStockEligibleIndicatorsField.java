package omi.nse.nsecd.orderentry.nnf.v6_3.fields;

import java.util.Objects;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.ByteOps;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.FieldKind;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * St Stock Eligible Indicators
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class StStockEligibleIndicatorsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "StStockEligibleIndicators";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = false;

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
     * Reserved
     *
     * @return bits 0 through 12 of the container
     */
    public int reserved() {
        return (int) (value & 0x1FFFL);
    }

    /**
     * BooksMerged
     *
     * @return bit 13 of the container
     */
    public boolean booksMerged() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * This is not used
     *
     * @return bit 14 of the container
     */
    public boolean minimumFill() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * 1 All Or None
     *
     * @return bit 15 of the container
     */
    public boolean aon() {
        return ((value >>> 15) & 1L) != 0L;
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
        if (!(other instanceof StStockEligibleIndicatorsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
