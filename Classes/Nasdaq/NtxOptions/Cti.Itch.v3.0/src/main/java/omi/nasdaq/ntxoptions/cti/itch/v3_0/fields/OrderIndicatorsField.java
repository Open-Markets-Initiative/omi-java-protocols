package omi.nasdaq.ntxoptions.cti.itch.v3_0.fields;

import java.util.Objects;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.ByteOps;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.Field;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.FieldKind;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.PrintOptions;

/**
 * Same side order indicators (2 bytes); bit 15 is the least significant bit. Directed/Preferenced, Post Only, ISE Directed and MKT Order indicators are not available for Manual Trades, Trade Correction and Cancels.
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderIndicatorsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderIndicators";

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
     * Bits 5-15: not used
     *
     * @return bits 0 through 10 of the container
     */
    public int reservedOrderIndicators() {
        return (int) (value & 0x7FFL);
    }

    /**
     * Bit 4: ISE Directed Order
     *
     * @return bit 11 of the container
     */
    public boolean iseDirectedOrder() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Bit 3: MKT Order (0-no, 1-yes)
     *
     * @return bit 12 of the container
     */
    public boolean mktOrder() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Bit 2: Post Only/ALO (0-no, 1-yes)
     *
     * @return bit 13 of the container
     */
    public boolean postOnlyAlo() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Bit 1: Directed/Preferenced (0-no, 1-yes)
     *
     * @return bit 14 of the container
     */
    public boolean directedPreferenced() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Bit 0: FBMS order (0-no, 1-yes)
     *
     * @return bit 15 of the container
     */
    public boolean fbmsOrder() {
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
        if (!(other instanceof OrderIndicatorsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
