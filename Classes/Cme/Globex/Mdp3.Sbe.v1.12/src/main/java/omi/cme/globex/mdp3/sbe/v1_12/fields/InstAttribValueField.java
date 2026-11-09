package omi.cme.globex.mdp3.sbe.v1_12.fields;

import java.util.Objects;
import omi.cme.globex.mdp3.sbe.v1_12.types.ByteOps;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.FieldKind;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * InstAttribValue bit set
 *
 * <p>A 4-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class InstAttribValueField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "InstAttribValue";

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
     * ElectronicMatchEligible
     *
     * @return bit 0 of the container
     */
    public boolean electronicMatchEligible() {
        return (value & 1L) != 0L;
    }

    /**
     * OrderCrossEligible
     *
     * @return bit 1 of the container
     */
    public boolean orderCrossEligible() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * BlockTradeEligible
     *
     * @return bit 2 of the container
     */
    public boolean blockTradeEligible() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * EFPEligible
     *
     * @return bit 3 of the container
     */
    public boolean efpEligible() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * EBFEligible
     *
     * @return bit 4 of the container
     */
    public boolean ebfEligible() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * EFSEligible
     *
     * @return bit 5 of the container
     */
    public boolean efsEligible() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * EFREligible
     *
     * @return bit 6 of the container
     */
    public boolean efrEligible() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * OTCEligible
     *
     * @return bit 7 of the container
     */
    public boolean otcEligible() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * iLinkIndicativeMassQuotingEligible
     *
     * @return bit 8 of the container
     */
    public boolean ilinkIndicativeMassQuotingEligible() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * NegativeStrikeEligible
     *
     * @return bit 9 of the container
     */
    public boolean negativeStrikeEligible() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * NegativePriceOutrightEligible
     *
     * @return bit 10 of the container
     */
    public boolean negativePriceOutrightEligible() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * IsFractional
     *
     * @return bit 11 of the container
     */
    public boolean isFractional() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * VolatilityQuotedOption
     *
     * @return bit 12 of the container
     */
    public boolean volatilityQuotedOption() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * RFQCrossEligible
     *
     * @return bit 13 of the container
     */
    public boolean rfqCrossEligible() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * ZeroPriceOutrightEligible
     *
     * @return bit 14 of the container
     */
    public boolean zeroPriceOutrightEligible() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * DecayingProductEligibility
     *
     * @return bit 15 of the container
     */
    public boolean decayingProductEligibility() {
        return ((value >>> 15) & 1L) != 0L;
    }

    /**
     * VariableProductEligibility
     *
     * @return bit 16 of the container
     */
    public boolean variableProductEligibility() {
        return ((value >>> 16) & 1L) != 0L;
    }

    /**
     * DailyProductEligibility
     *
     * @return bit 17 of the container
     */
    public boolean dailyProductEligibility() {
        return ((value >>> 17) & 1L) != 0L;
    }

    /**
     * GTOrdersEligibility
     *
     * @return bit 18 of the container
     */
    public boolean gtOrdersEligibility() {
        return ((value >>> 18) & 1L) != 0L;
    }

    /**
     * ImpliedMatchingEligibility
     *
     * @return bit 19 of the container
     */
    public boolean impliedMatchingEligibility() {
        return ((value >>> 19) & 1L) != 0L;
    }

    /**
     * TriangulationEligible
     *
     * @return bit 20 of the container
     */
    public boolean triangulationEligible() {
        return ((value >>> 20) & 1L) != 0L;
    }

    /**
     * VariableCabEligible
     *
     * @return bit 21 of the container
     */
    public boolean variableCabEligible() {
        return ((value >>> 21) & 1L) != 0L;
    }

    /**
     * InvertedBook
     *
     * @return bit 22 of the container
     */
    public boolean invertedBook() {
        return ((value >>> 22) & 1L) != 0L;
    }

    /**
     * IsAoNInstrument
     *
     * @return bit 23 of the container
     */
    public boolean isAonInstrument() {
        return ((value >>> 23) & 1L) != 0L;
    }

    /**
     * SEFRegulated
     *
     * @return bit 24 of the container
     */
    public boolean sefRegulated() {
        return ((value >>> 24) & 1L) != 0L;
    }

    /**
     * MTFRegulated
     *
     * @return bit 25 of the container
     */
    public boolean mtfRegulated() {
        return ((value >>> 25) & 1L) != 0L;
    }

    /**
     * eFIXInstrument
     *
     * @return bit 26 of the container
     */
    public boolean efixInstrument() {
        return ((value >>> 26) & 1L) != 0L;
    }

    /**
     * HedgeInstrument
     *
     * @return bit 27 of the container
     */
    public boolean hedgeInstrument() {
        return ((value >>> 27) & 1L) != 0L;
    }

    /**
     * 4 reserved bits
     *
     * @return bits 28 through 31 of the container
     */
    public int reserved() {
        return (int) ((value >>> 28) & 0xFL);
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
        if (!(other instanceof InstAttribValueField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
