package omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields;

import java.util.Objects;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.ByteOps;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.Field;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.FieldKind;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.PrintOptions;

/**
 * MDFlagsSet bit set
 *
 * <p>A 8-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class MdFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This field's declared name.
     */
    public static final String NAME = "MdFlags";

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
     * Day
     *
     * @return bit 0 of the container
     */
    public boolean day() {
        return (value & 1L) != 0L;
    }

    /**
     * IOC
     *
     * @return bit 1 of the container
     */
    public boolean ioc() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * NonQuote
     *
     * @return bit 2 of the container
     */
    public boolean nonQuote() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 3
     *
     * @return bit 3 of the container
     */
    public boolean unusedMdFlagsSet3() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 4
     *
     * @return bit 4 of the container
     */
    public boolean unusedMdFlagsSet4() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 5
     *
     * @return bit 5 of the container
     */
    public boolean unusedMdFlagsSet5() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 6
     *
     * @return bit 6 of the container
     */
    public boolean unusedMdFlagsSet6() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 7
     *
     * @return bit 7 of the container
     */
    public boolean unusedMdFlagsSet7() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 8
     *
     * @return bit 8 of the container
     */
    public boolean unusedMdFlagsSet8() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 9
     *
     * @return bit 9 of the container
     */
    public boolean unusedMdFlagsSet9() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 10
     *
     * @return bit 10 of the container
     */
    public boolean unusedMdFlagsSet10() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 11
     *
     * @return bit 11 of the container
     */
    public boolean unusedMdFlagsSet11() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * EndOfTransaction
     *
     * @return bit 12 of the container
     */
    public boolean endOfTransaction() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * DueToCrossCancel
     *
     * @return bit 13 of the container
     */
    public boolean dueToCrossCancel() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * SecondLeg
     *
     * @return bit 14 of the container
     */
    public boolean secondLeg() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 15
     *
     * @return bit 15 of the container
     */
    public boolean unusedMdFlagsSet15() {
        return ((value >>> 15) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 16
     *
     * @return bit 16 of the container
     */
    public boolean unusedMdFlagsSet16() {
        return ((value >>> 16) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 17
     *
     * @return bit 17 of the container
     */
    public boolean unusedMdFlagsSet17() {
        return ((value >>> 17) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 18
     *
     * @return bit 18 of the container
     */
    public boolean unusedMdFlagsSet18() {
        return ((value >>> 18) & 1L) != 0L;
    }

    /**
     * FOK
     *
     * @return bit 19 of the container
     */
    public boolean fok() {
        return ((value >>> 19) & 1L) != 0L;
    }

    /**
     * Replace
     *
     * @return bit 20 of the container
     */
    public boolean replace() {
        return ((value >>> 20) & 1L) != 0L;
    }

    /**
     * Cancel
     *
     * @return bit 21 of the container
     */
    public boolean cancel() {
        return ((value >>> 21) & 1L) != 0L;
    }

    /**
     * MassCancel
     *
     * @return bit 22 of the container
     */
    public boolean massCancel() {
        return ((value >>> 22) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 23
     *
     * @return bit 23 of the container
     */
    public boolean unusedMdFlagsSet23() {
        return ((value >>> 23) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 24
     *
     * @return bit 24 of the container
     */
    public boolean unusedMdFlagsSet24() {
        return ((value >>> 24) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 25
     *
     * @return bit 25 of the container
     */
    public boolean unusedMdFlagsSet25() {
        return ((value >>> 25) & 1L) != 0L;
    }

    /**
     * Negotiated
     *
     * @return bit 26 of the container
     */
    public boolean negotiated() {
        return ((value >>> 26) & 1L) != 0L;
    }

    /**
     * MultiLeg
     *
     * @return bit 27 of the container
     */
    public boolean multiLeg() {
        return ((value >>> 27) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 28
     *
     * @return bit 28 of the container
     */
    public boolean unusedMdFlagsSet28() {
        return ((value >>> 28) & 1L) != 0L;
    }

    /**
     * CrossTrade
     *
     * @return bit 29 of the container
     */
    public boolean crossTrade() {
        return ((value >>> 29) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 30
     *
     * @return bit 30 of the container
     */
    public boolean unusedMdFlagsSet30() {
        return ((value >>> 30) & 1L) != 0L;
    }

    /**
     * NegotiatedMatchByRef
     *
     * @return bit 31 of the container
     */
    public boolean negotiatedMatchByRef() {
        return ((value >>> 31) & 1L) != 0L;
    }

    /**
     * COD
     *
     * @return bit 32 of the container
     */
    public boolean cod() {
        return ((value >>> 32) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 33
     *
     * @return bit 33 of the container
     */
    public boolean unusedMdFlagsSet33() {
        return ((value >>> 33) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 34
     *
     * @return bit 34 of the container
     */
    public boolean unusedMdFlagsSet34() {
        return ((value >>> 34) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 35
     *
     * @return bit 35 of the container
     */
    public boolean unusedMdFlagsSet35() {
        return ((value >>> 35) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 36
     *
     * @return bit 36 of the container
     */
    public boolean unusedMdFlagsSet36() {
        return ((value >>> 36) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 37
     *
     * @return bit 37 of the container
     */
    public boolean unusedMdFlagsSet37() {
        return ((value >>> 37) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 38
     *
     * @return bit 38 of the container
     */
    public boolean unusedMdFlagsSet38() {
        return ((value >>> 38) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 39
     *
     * @return bit 39 of the container
     */
    public boolean unusedMdFlagsSet39() {
        return ((value >>> 39) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 40
     *
     * @return bit 40 of the container
     */
    public boolean unusedMdFlagsSet40() {
        return ((value >>> 40) & 1L) != 0L;
    }

    /**
     * ActiveSide
     *
     * @return bit 41 of the container
     */
    public boolean activeSide() {
        return ((value >>> 41) & 1L) != 0L;
    }

    /**
     * PassiveSide
     *
     * @return bit 42 of the container
     */
    public boolean passiveSide() {
        return ((value >>> 42) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 43
     *
     * @return bit 43 of the container
     */
    public boolean unusedMdFlagsSet43() {
        return ((value >>> 43) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 44
     *
     * @return bit 44 of the container
     */
    public boolean unusedMdFlagsSet44() {
        return ((value >>> 44) & 1L) != 0L;
    }

    /**
     * Synthetic
     *
     * @return bit 45 of the container
     */
    public boolean synthetic() {
        return ((value >>> 45) & 1L) != 0L;
    }

    /**
     * RFS
     *
     * @return bit 46 of the container
     */
    public boolean rfs() {
        return ((value >>> 46) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 47
     *
     * @return bit 47 of the container
     */
    public boolean unusedMdFlagsSet47() {
        return ((value >>> 47) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 48
     *
     * @return bit 48 of the container
     */
    public boolean unusedMdFlagsSet48() {
        return ((value >>> 48) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 49
     *
     * @return bit 49 of the container
     */
    public boolean unusedMdFlagsSet49() {
        return ((value >>> 49) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 50
     *
     * @return bit 50 of the container
     */
    public boolean unusedMdFlagsSet50() {
        return ((value >>> 50) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 51
     *
     * @return bit 51 of the container
     */
    public boolean unusedMdFlagsSet51() {
        return ((value >>> 51) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 52
     *
     * @return bit 52 of the container
     */
    public boolean unusedMdFlagsSet52() {
        return ((value >>> 52) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 53
     *
     * @return bit 53 of the container
     */
    public boolean unusedMdFlagsSet53() {
        return ((value >>> 53) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 54
     *
     * @return bit 54 of the container
     */
    public boolean unusedMdFlagsSet54() {
        return ((value >>> 54) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 55
     *
     * @return bit 55 of the container
     */
    public boolean unusedMdFlagsSet55() {
        return ((value >>> 55) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 56
     *
     * @return bit 56 of the container
     */
    public boolean unusedMdFlagsSet56() {
        return ((value >>> 56) & 1L) != 0L;
    }

    /**
     * SyntheticPassive
     *
     * @return bit 57 of the container
     */
    public boolean syntheticPassive() {
        return ((value >>> 57) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 58
     *
     * @return bit 58 of the container
     */
    public boolean unusedMdFlagsSet58() {
        return ((value >>> 58) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 59
     *
     * @return bit 59 of the container
     */
    public boolean unusedMdFlagsSet59() {
        return ((value >>> 59) & 1L) != 0L;
    }

    /**
     * BOC
     *
     * @return bit 60 of the container
     */
    public boolean boc() {
        return ((value >>> 60) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 61
     *
     * @return bit 61 of the container
     */
    public boolean unusedMdFlagsSet61() {
        return ((value >>> 61) & 1L) != 0L;
    }

    /**
     * DuringDiscreteAuction
     *
     * @return bit 62 of the container
     */
    public boolean duringDiscreteAuction() {
        return ((value >>> 62) & 1L) != 0L;
    }

    /**
     * Unused MDFlagsSet 63
     *
     * @return bit 63 of the container
     */
    public boolean unusedMdFlagsSet63() {
        return ((value >>> 63) & 1L) != 0L;
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
        if (!(other instanceof MdFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
