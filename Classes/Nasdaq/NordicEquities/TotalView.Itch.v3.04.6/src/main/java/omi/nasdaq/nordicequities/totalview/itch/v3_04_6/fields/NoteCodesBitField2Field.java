package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields;

import java.util.Objects;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.ByteOps;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.FieldKind;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.PrintOptions;

/**
 * Note codes, logical Or is used to identify multiple note codes
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NoteCodesBitField2Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NoteCodesBitField2";

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
     * Br Company Bankruptcy
     *
     * @return bit 0 of the container
     */
    public boolean brCompanyBankruptcy() {
        return (value & 1L) != 0L;
    }

    /**
     * Su Suspension
     *
     * @return bit 1 of the container
     */
    public boolean suSuspension() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Rl Removal From Listing In Process
     *
     * @return bit 2 of the container
     */
    public boolean rlRemovalFromListingInProcess() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Sl Other Surveillance List Reason
     *
     * @return bit 3 of the container
     */
    public boolean slOtherSurveillanceListReason() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * To A Significant Reverse Takeover Pending
     *
     * @return bit 4 of the container
     */
    public boolean toASignificantReverseTakeoverPending() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Cs Cent Shares
     *
     * @return bit 5 of the container
     */
    public boolean csCentShares() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Rs Reversed Split
     *
     * @return bit 6 of the container
     */
    public boolean rsReversedSplit() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Bs Excluding Comb Bonus Split
     *
     * @return bit 7 of the container
     */
    public boolean bsExcludingCombBonusSplit() {
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
        if (!(other instanceof NoteCodesBitField2Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
