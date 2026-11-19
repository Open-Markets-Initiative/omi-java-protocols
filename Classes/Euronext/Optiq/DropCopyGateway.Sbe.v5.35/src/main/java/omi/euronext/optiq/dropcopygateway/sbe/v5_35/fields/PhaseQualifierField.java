package omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields;

import java.util.Objects;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.ByteOps;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.FieldKind;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * PhaseQualifier_set bit set
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class PhaseQualifierField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "PhaseQualifier";

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
     * NoQualifier
     *
     * @return bit 0 of the container
     */
    public boolean noQualifier() {
        return (value & 1L) != 0L;
    }

    /**
     * CallBBOOnly
     *
     * @return bit 1 of the container
     */
    public boolean callBboOnly() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * TradingAtLast
     *
     * @return bit 2 of the container
     */
    public boolean tradingAtLast() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * RandomUncrossing
     *
     * @return bit 3 of the container
     */
    public boolean randomUncrossing() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Suspended
     *
     * @return bit 4 of the container
     */
    public boolean suspended() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * WholesaleAllowed
     *
     * @return bit 5 of the container
     */
    public boolean wholesaleAllowed() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * StressedMarketConditions
     *
     * @return bit 6 of the container
     */
    public boolean stressedMarketConditions() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * ExceptionalMarketConditions
     *
     * @return bit 7 of the container
     */
    public boolean exceptionalMarketConditions() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * PriceImprovementOnly
     *
     * @return bit 8 of the container
     */
    public boolean priceImprovementOnly() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * QuotingPeriod
     *
     * @return bit 9 of the container
     */
    public boolean quotingPeriod() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * ExecutionPreventionAcrossAllFirms
     *
     * @return bit 10 of the container
     */
    public boolean executionPreventionAcrossAllFirms() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * 5 reserved bits
     *
     * @return bits 11 through 15 of the container
     */
    public int reserved() {
        return (int) ((value >>> 11) & 0x1FL);
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
        if (!(other instanceof PhaseQualifierField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
