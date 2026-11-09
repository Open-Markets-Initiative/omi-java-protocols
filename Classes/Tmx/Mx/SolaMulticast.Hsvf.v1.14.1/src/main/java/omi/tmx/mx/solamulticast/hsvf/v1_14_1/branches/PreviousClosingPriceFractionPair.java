package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.PreviousClosingPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousClosingPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The PreviousClosingPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PreviousClosingPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PreviousClosingPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "A".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "B".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "C".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "D".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "E".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "F".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PreviousClosingPriceFractionIndicator is "G".
         */
        PREVIOUS_CLOSING_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR
    }

    private final PreviousClosingPriceNegativeWholePair previousClosingPriceNegativeWholePair = new PreviousClosingPriceNegativeWholePair();
    private final PreviousClosingPriceNegativeTenPair previousClosingPriceNegativeTenPair = new PreviousClosingPriceNegativeTenPair();
    private final PreviousClosingPriceNegativeHundredPair previousClosingPriceNegativeHundredPair = new PreviousClosingPriceNegativeHundredPair();
    private final PreviousClosingPriceNegativeThousandPair previousClosingPriceNegativeThousandPair = new PreviousClosingPriceNegativeThousandPair();
    private final PreviousClosingPriceNegativeTenThousandPair previousClosingPriceNegativeTenThousandPair = new PreviousClosingPriceNegativeTenThousandPair();
    private final PreviousClosingPriceNegativeHundredThousandPair previousClosingPriceNegativeHundredThousandPair = new PreviousClosingPriceNegativeHundredThousandPair();
    private final PreviousClosingPriceNegativeMillionPair previousClosingPriceNegativeMillionPair = new PreviousClosingPriceNegativeMillionPair();
    private final PreviousClosingPriceNumericPair previousClosingPriceNumericPair = new PreviousClosingPriceNumericPair();
    private Case selected = Case.PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR;

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
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_WHOLE_PAIR -> previousClosingPriceNegativeWholePair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_WHOLE);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_PAIR -> previousClosingPriceNegativeTenPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_TEN);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR -> previousClosingPriceNegativeHundredPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_HUNDRED);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR -> previousClosingPriceNegativeThousandPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_THOUSAND);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> previousClosingPriceNegativeTenThousandPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousClosingPriceNegativeHundredThousandPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_MILLION_PAIR -> previousClosingPriceNegativeMillionPair.previousClosingPriceFractionIndicator().value(PreviousClosingPriceFractionIndicator.NEGATIVE_MILLION);
            case PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PreviousClosingPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeWholePair previousClosingPriceNegativeWholePair() {
        return previousClosingPriceNegativeWholePair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeTenPair previousClosingPriceNegativeTenPair() {
        return previousClosingPriceNegativeTenPair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeHundredPair previousClosingPriceNegativeHundredPair() {
        return previousClosingPriceNegativeHundredPair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeThousandPair previousClosingPriceNegativeThousandPair() {
        return previousClosingPriceNegativeThousandPair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeTenThousandPair previousClosingPriceNegativeTenThousandPair() {
        return previousClosingPriceNegativeTenThousandPair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeHundredThousandPair previousClosingPriceNegativeHundredThousandPair() {
        return previousClosingPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the PreviousClosingPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNegativeMillionPair previousClosingPriceNegativeMillionPair() {
        return previousClosingPriceNegativeMillionPair;
    }

    /**
     * Returns the PreviousClosingPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousClosingPriceNumericPair previousClosingPriceNumericPair() {
        return previousClosingPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_WHOLE_PAIR -> previousClosingPriceNegativeWholePair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_PAIR -> previousClosingPriceNegativeTenPair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR -> previousClosingPriceNegativeHundredPair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR -> previousClosingPriceNegativeThousandPair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> previousClosingPriceNegativeTenThousandPair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousClosingPriceNegativeHundredThousandPair;
            case PREVIOUS_CLOSING_PRICE_NEGATIVE_MILLION_PAIR -> previousClosingPriceNegativeMillionPair;
            case PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR -> previousClosingPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.PREVIOUS_CLOSING_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR;
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
        previousClosingPriceNegativeWholePair.clear();
        previousClosingPriceNegativeTenPair.clear();
        previousClosingPriceNegativeHundredPair.clear();
        previousClosingPriceNegativeThousandPair.clear();
        previousClosingPriceNegativeTenThousandPair.clear();
        previousClosingPriceNegativeHundredThousandPair.clear();
        previousClosingPriceNegativeMillionPair.clear();
        previousClosingPriceNumericPair.clear();
        selected = Case.PREVIOUS_CLOSING_PRICE_NUMERIC_PAIR;
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
        return other instanceof PreviousClosingPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof PreviousClosingPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
