package omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields;

import java.util.Objects;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.ByteOps;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.FieldKind;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.PrintOptions;

/**
 * InstrumentFlags bit set
 *
 * <p>A 4-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class FlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "Flags";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

    private int value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public int value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(int value) {
        this.value = value;
        markSet(true);
    }

    /**
     * isReversed
     *
     * @return bit 0 of the container
     */
    public boolean isReversed() {
        return (value & 1L) != 0L;
    }

    /**
     * isPutOption
     *
     * @return bit 1 of the container
     */
    public boolean isPutOption() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * isPerpetual
     *
     * @return bit 2 of the container
     */
    public boolean isPerpetual() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * 29 reserved bits
     *
     * @return bits 3 through 31 of the container
     */
    public int reserved() {
        return (int) ((value >>> 3) & 0x1FFFFFFFL);
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

        this.value = (int) ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
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
        this.value = 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
