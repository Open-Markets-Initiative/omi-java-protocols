package omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.enums.MinimumThresholdPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.MinimumThresholdPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.PrintOptions;

/**
 * The MinimumThresholdPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MinimumThresholdPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MinimumThresholdPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "A".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "B".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "C".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "D".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "E".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "F".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "G".
         */
        MINIMUM_THRESHOLD_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR
    }

    private final MinimumThresholdPriceNegativeWholePair minimumThresholdPriceNegativeWholePair = new MinimumThresholdPriceNegativeWholePair();
    private final MinimumThresholdPriceNegativeTenPair minimumThresholdPriceNegativeTenPair = new MinimumThresholdPriceNegativeTenPair();
    private final MinimumThresholdPriceNegativeHundredPair minimumThresholdPriceNegativeHundredPair = new MinimumThresholdPriceNegativeHundredPair();
    private final MinimumThresholdPriceNegativeThousandPair minimumThresholdPriceNegativeThousandPair = new MinimumThresholdPriceNegativeThousandPair();
    private final MinimumThresholdPriceNegativeTenThousandPair minimumThresholdPriceNegativeTenThousandPair = new MinimumThresholdPriceNegativeTenThousandPair();
    private final MinimumThresholdPriceNegativeHundredThousandPair minimumThresholdPriceNegativeHundredThousandPair = new MinimumThresholdPriceNegativeHundredThousandPair();
    private final MinimumThresholdPriceNegativeMillionPair minimumThresholdPriceNegativeMillionPair = new MinimumThresholdPriceNegativeMillionPair();
    private final MinimumThresholdPriceNumericPair minimumThresholdPriceNumericPair = new MinimumThresholdPriceNumericPair();
    private Case selected = Case.MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR;

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
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceNegativeWholePair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_WHOLE);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_PAIR -> minimumThresholdPriceNegativeTenPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceNegativeHundredPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceNegativeThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceNegativeTenThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceNegativeHundredThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceNegativeMillionPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_MILLION);
            case MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeWholePair minimumThresholdPriceNegativeWholePair() {
        return minimumThresholdPriceNegativeWholePair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeTenPair minimumThresholdPriceNegativeTenPair() {
        return minimumThresholdPriceNegativeTenPair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeHundredPair minimumThresholdPriceNegativeHundredPair() {
        return minimumThresholdPriceNegativeHundredPair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeThousandPair minimumThresholdPriceNegativeThousandPair() {
        return minimumThresholdPriceNegativeThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeTenThousandPair minimumThresholdPriceNegativeTenThousandPair() {
        return minimumThresholdPriceNegativeTenThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeHundredThousandPair minimumThresholdPriceNegativeHundredThousandPair() {
        return minimumThresholdPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNegativeMillionPair minimumThresholdPriceNegativeMillionPair() {
        return minimumThresholdPriceNegativeMillionPair;
    }

    /**
     * Returns the MinimumThresholdPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceNumericPair minimumThresholdPriceNumericPair() {
        return minimumThresholdPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceNegativeWholePair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_PAIR -> minimumThresholdPriceNegativeTenPair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceNegativeHundredPair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceNegativeThousandPair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceNegativeTenThousandPair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceNegativeHundredThousandPair;
            case MINIMUM_THRESHOLD_PRICE_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceNegativeMillionPair;
            case MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR -> minimumThresholdPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.MINIMUM_THRESHOLD_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR;
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
        minimumThresholdPriceNegativeWholePair.clear();
        minimumThresholdPriceNegativeTenPair.clear();
        minimumThresholdPriceNegativeHundredPair.clear();
        minimumThresholdPriceNegativeThousandPair.clear();
        minimumThresholdPriceNegativeTenThousandPair.clear();
        minimumThresholdPriceNegativeHundredThousandPair.clear();
        minimumThresholdPriceNegativeMillionPair.clear();
        minimumThresholdPriceNumericPair.clear();
        selected = Case.MINIMUM_THRESHOLD_PRICE_NUMERIC_PAIR;
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
        return other instanceof MinimumThresholdPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MinimumThresholdPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
