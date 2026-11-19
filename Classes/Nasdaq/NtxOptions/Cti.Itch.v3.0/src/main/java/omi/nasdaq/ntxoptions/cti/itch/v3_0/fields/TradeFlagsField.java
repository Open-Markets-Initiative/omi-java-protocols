package omi.nasdaq.ntxoptions.cti.itch.v3_0.fields;

import java.util.Objects;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.ByteOps;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.Field;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.FieldKind;
import omi.nasdaq.ntxoptions.cti.itch.v3_0.types.PrintOptions;

/**
 * Trade message symbol flags (2 bytes); bit 15 is the least significant bit. When available, only one of Bits 3, 4 and 5 will be set to 1 for an option.
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class TradeFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradeFlags";

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
     * Bits 6-15: Not Used
     *
     * @return bits 0 through 9 of the container
     */
    public int reservedTradeFlags() {
        return (int) (value & 0x3FFL);
    }

    /**
     * Bit 5: Quarterly Expiration (0=no, 1=yes). Will be available at a future date.
     *
     * @return bit 10 of the container
     */
    public boolean quarterlyExpiration() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Bit 4: Monthly Expiration (0=no, 1=yes). Will be available at a future date.
     *
     * @return bit 11 of the container
     */
    public boolean monthlyExpiration() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Bit 3: Weekly Expiration (0=no, 1=yes). Will be available at a future date.
     *
     * @return bit 12 of the container
     */
    public boolean weeklyExpiration() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Bit 2: Single Listed (0=no, 1=yes). Will be available at a future date.
     *
     * @return bit 13 of the container
     */
    public boolean singleListed() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Bit 1: Symbol In Make/Take Program (0=no, 1=yes)
     *
     * @return bit 14 of the container
     */
    public boolean makeTakeProgram() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Bit 0: Symbol in Penny Pilot (0=no, 1=yes)
     *
     * @return bit 15 of the container
     */
    public boolean pennyPilot() {
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
        if (!(other instanceof TradeFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
