package omi.moex.spectra.optinforeplay.simba.v9_12_0.fields;

import java.util.Objects;
import omi.moex.spectra.optinforeplay.simba.v9_12_0.types.ByteOps;
import omi.moex.spectra.optinforeplay.simba.v9_12_0.types.Field;
import omi.moex.spectra.optinforeplay.simba.v9_12_0.types.FieldKind;
import omi.moex.spectra.optinforeplay.simba.v9_12_0.types.PrintOptions;

/**
 * FlagsSet bit set
 *
 * <p>A 8-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class FlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

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

    private long value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public long value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(long value) {
        this.value = value;
        markSet(true);
    }

    /**
     * Unused FlagsSet 0
     *
     * @return bit 0 of the container
     */
    public boolean unusedFlagsSet0() {
        return (value & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 1
     *
     * @return bit 1 of the container
     */
    public boolean unusedFlagsSet1() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 2
     *
     * @return bit 2 of the container
     */
    public boolean unusedFlagsSet2() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 3
     *
     * @return bit 3 of the container
     */
    public boolean unusedFlagsSet3() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * AnonymousTrading
     *
     * @return bit 4 of the container
     */
    public boolean anonymousTrading() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * PrivateTrading
     *
     * @return bit 5 of the container
     */
    public boolean privateTrading() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 6
     *
     * @return bit 6 of the container
     */
    public boolean unusedFlagsSet6() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 7
     *
     * @return bit 7 of the container
     */
    public boolean unusedFlagsSet7() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * MultiLeg
     *
     * @return bit 8 of the container
     */
    public boolean multiLeg() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 9
     *
     * @return bit 9 of the container
     */
    public boolean unusedFlagsSet9() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 10
     *
     * @return bit 10 of the container
     */
    public boolean unusedFlagsSet10() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 11
     *
     * @return bit 11 of the container
     */
    public boolean unusedFlagsSet11() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 12
     *
     * @return bit 12 of the container
     */
    public boolean unusedFlagsSet12() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 13
     *
     * @return bit 13 of the container
     */
    public boolean unusedFlagsSet13() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 14
     *
     * @return bit 14 of the container
     */
    public boolean unusedFlagsSet14() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 15
     *
     * @return bit 15 of the container
     */
    public boolean unusedFlagsSet15() {
        return ((value >>> 15) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 16
     *
     * @return bit 16 of the container
     */
    public boolean unusedFlagsSet16() {
        return ((value >>> 16) & 1L) != 0L;
    }

    /**
     * Unused FlagsSet 17
     *
     * @return bit 17 of the container
     */
    public boolean unusedFlagsSet17() {
        return ((value >>> 17) & 1L) != 0L;
    }

    /**
     * Collateral
     *
     * @return bit 18 of the container
     */
    public boolean collateral() {
        return ((value >>> 18) & 1L) != 0L;
    }

    /**
     * IntradayExercise
     *
     * @return bit 19 of the container
     */
    public boolean intradayExercise() {
        return ((value >>> 19) & 1L) != 0L;
    }

    /**
     * 44 reserved bits
     *
     * @return bits 20 through 63 of the container
     */
    public long reserved() {
        return ((value >>> 20) & 0xFFFFFFFFFFFL);
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

        this.value = ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
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
        this.value = 0L;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Long.toHexString(value));
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
