package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.PriceAlignmentInterestFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.PriceAlignmentInterestCNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The PriceAlignmentInterestCFractionPair branch: one of 8 records of 12 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PriceAlignmentInterestCFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PriceAlignmentInterestCFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "A".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "B".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "C".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "D".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "E".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "F".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PriceAlignmentInterestFractionIndicator is "G".
         */
        PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR
    }

    private final PriceAlignmentInterestCNegativeWholePair priceAlignmentInterestCNegativeWholePair = new PriceAlignmentInterestCNegativeWholePair();
    private final PriceAlignmentInterestCNegativeTenPair priceAlignmentInterestCNegativeTenPair = new PriceAlignmentInterestCNegativeTenPair();
    private final PriceAlignmentInterestCNegativeHundredPair priceAlignmentInterestCNegativeHundredPair = new PriceAlignmentInterestCNegativeHundredPair();
    private final PriceAlignmentInterestCNegativeThousandPair priceAlignmentInterestCNegativeThousandPair = new PriceAlignmentInterestCNegativeThousandPair();
    private final PriceAlignmentInterestCNegativeTenThousandPair priceAlignmentInterestCNegativeTenThousandPair = new PriceAlignmentInterestCNegativeTenThousandPair();
    private final PriceAlignmentInterestCNegativeHundredThousandPair priceAlignmentInterestCNegativeHundredThousandPair = new PriceAlignmentInterestCNegativeHundredThousandPair();
    private final PriceAlignmentInterestCNegativeMillionPair priceAlignmentInterestCNegativeMillionPair = new PriceAlignmentInterestCNegativeMillionPair();
    private final PriceAlignmentInterestCNumericPair priceAlignmentInterestCNumericPair = new PriceAlignmentInterestCNumericPair();
    private Case selected = Case.PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode, writing what its rule compares into that case's fields, so its bytes select it again.
     *
     * <p>The default case has no rule of its own, so its fields are left as they are.</p>
     *
     * @param value the case
     */
    public void select(Case value) {
        Objects.requireNonNull(value, "value");
        switch (value) {
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_WHOLE_PAIR -> priceAlignmentInterestCNegativeWholePair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_WHOLE);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_PAIR -> priceAlignmentInterestCNegativeTenPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_TEN);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_PAIR -> priceAlignmentInterestCNegativeHundredPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_HUNDRED);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_THOUSAND_PAIR -> priceAlignmentInterestCNegativeThousandPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_THOUSAND);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_THOUSAND_PAIR -> priceAlignmentInterestCNegativeTenThousandPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_THOUSAND_PAIR -> priceAlignmentInterestCNegativeHundredThousandPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_MILLION_PAIR -> priceAlignmentInterestCNegativeMillionPair.priceAlignmentInterestFractionIndicator().value(PriceAlignmentInterestFractionIndicator.NEGATIVE_MILLION);
            case PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeWholePair priceAlignmentInterestCNegativeWholePair() {
        return priceAlignmentInterestCNegativeWholePair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeTenPair priceAlignmentInterestCNegativeTenPair() {
        return priceAlignmentInterestCNegativeTenPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeHundredPair priceAlignmentInterestCNegativeHundredPair() {
        return priceAlignmentInterestCNegativeHundredPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeThousandPair priceAlignmentInterestCNegativeThousandPair() {
        return priceAlignmentInterestCNegativeThousandPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeTenThousandPair priceAlignmentInterestCNegativeTenThousandPair() {
        return priceAlignmentInterestCNegativeTenThousandPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeHundredThousandPair priceAlignmentInterestCNegativeHundredThousandPair() {
        return priceAlignmentInterestCNegativeHundredThousandPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNegativeMillionPair priceAlignmentInterestCNegativeMillionPair() {
        return priceAlignmentInterestCNegativeMillionPair;
    }

    /**
     * Returns the PriceAlignmentInterestCNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceAlignmentInterestCNumericPair priceAlignmentInterestCNumericPair() {
        return priceAlignmentInterestCNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_WHOLE_PAIR -> priceAlignmentInterestCNegativeWholePair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_PAIR -> priceAlignmentInterestCNegativeTenPair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_PAIR -> priceAlignmentInterestCNegativeHundredPair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_THOUSAND_PAIR -> priceAlignmentInterestCNegativeThousandPair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_THOUSAND_PAIR -> priceAlignmentInterestCNegativeTenThousandPair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_THOUSAND_PAIR -> priceAlignmentInterestCNegativeHundredThousandPair;
            case PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_MILLION_PAIR -> priceAlignmentInterestCNegativeMillionPair;
            case PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR -> priceAlignmentInterestCNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 11] == (byte) 'A') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 11] == (byte) 'B') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 11] == (byte) 'C') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 11] == (byte) 'D') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'E') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'F') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'G') {
            return Case.PRICE_ALIGNMENT_INTEREST_C_NEGATIVE_MILLION_PAIR;
        }
        return Case.PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR;
    }

    /**
     * Returns the declared padding runs: none, as no case of a branch holds padding.
     *
     * @return an empty array
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    public Optional<byte[]> raw() {
        return entry().raw();
    }

    @Override
    public boolean isDecoded() {
        return entry().isDecoded();
    }

    @Override
    public boolean isRecognized() {
        return entry().isRecognized();
    }

    @Override
    public boolean isValid() {
        return entry().isValid();
    }

    @Override
    public Optional<Field> failedAt() {
        return entry().failedAt();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return entry().parseFrom(data, offset, end);
        }
        Case chosen = caseFor(data, offset);
        if (chosen == null) {
            return false;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        return entry().encode(data, offset);
    }

    @Override
    public byte[] toBytes() {
        return entry().toBytes();
    }

    @Override
    public void clear() {
        priceAlignmentInterestCNegativeWholePair.clear();
        priceAlignmentInterestCNegativeTenPair.clear();
        priceAlignmentInterestCNegativeHundredPair.clear();
        priceAlignmentInterestCNegativeThousandPair.clear();
        priceAlignmentInterestCNegativeTenThousandPair.clear();
        priceAlignmentInterestCNegativeHundredThousandPair.clear();
        priceAlignmentInterestCNegativeMillionPair.clear();
        priceAlignmentInterestCNumericPair.clear();
        selected = Case.PRICE_ALIGNMENT_INTEREST_C_NUMERIC_PAIR;
    }

    @Override
    public List<Field> fields() {
        return entry().fields();
    }

    @Override
    public Optional<Field> field(String name) {
        return entry().field(name);
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        return other instanceof PriceAlignmentInterestCFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }
        entry().toFormattedString(builder, options);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof PriceAlignmentInterestCFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
