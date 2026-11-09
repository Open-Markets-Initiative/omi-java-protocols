package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.MinimumThresholdPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinimumThresholdPriceStrategyNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The MinimumThresholdPriceStrategyFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MinimumThresholdPriceStrategyFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MinimumThresholdPriceStrategyFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "A".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "B".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "C".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "D".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "E".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "F".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "G".
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR
    }

    private final MinimumThresholdPriceStrategyNegativeWholePair minimumThresholdPriceStrategyNegativeWholePair = new MinimumThresholdPriceStrategyNegativeWholePair();
    private final MinimumThresholdPriceStrategyNegativeTenPair minimumThresholdPriceStrategyNegativeTenPair = new MinimumThresholdPriceStrategyNegativeTenPair();
    private final MinimumThresholdPriceStrategyNegativeHundredPair minimumThresholdPriceStrategyNegativeHundredPair = new MinimumThresholdPriceStrategyNegativeHundredPair();
    private final MinimumThresholdPriceStrategyNegativeThousandPair minimumThresholdPriceStrategyNegativeThousandPair = new MinimumThresholdPriceStrategyNegativeThousandPair();
    private final MinimumThresholdPriceStrategyNegativeTenThousandPair minimumThresholdPriceStrategyNegativeTenThousandPair = new MinimumThresholdPriceStrategyNegativeTenThousandPair();
    private final MinimumThresholdPriceStrategyNegativeHundredThousandPair minimumThresholdPriceStrategyNegativeHundredThousandPair = new MinimumThresholdPriceStrategyNegativeHundredThousandPair();
    private final MinimumThresholdPriceStrategyNegativeMillionPair minimumThresholdPriceStrategyNegativeMillionPair = new MinimumThresholdPriceStrategyNegativeMillionPair();
    private final MinimumThresholdPriceStrategyNumericPair minimumThresholdPriceStrategyNumericPair = new MinimumThresholdPriceStrategyNumericPair();
    private Case selected = Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR;

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
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceStrategyNegativeWholePair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_WHOLE);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_PAIR -> minimumThresholdPriceStrategyNegativeTenPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceStrategyNegativeHundredPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeTenThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeHundredThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceStrategyNegativeMillionPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_MILLION);
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeWholePair minimumThresholdPriceStrategyNegativeWholePair() {
        return minimumThresholdPriceStrategyNegativeWholePair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeTenPair minimumThresholdPriceStrategyNegativeTenPair() {
        return minimumThresholdPriceStrategyNegativeTenPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeHundredPair minimumThresholdPriceStrategyNegativeHundredPair() {
        return minimumThresholdPriceStrategyNegativeHundredPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeThousandPair minimumThresholdPriceStrategyNegativeThousandPair() {
        return minimumThresholdPriceStrategyNegativeThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeTenThousandPair minimumThresholdPriceStrategyNegativeTenThousandPair() {
        return minimumThresholdPriceStrategyNegativeTenThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeHundredThousandPair minimumThresholdPriceStrategyNegativeHundredThousandPair() {
        return minimumThresholdPriceStrategyNegativeHundredThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNegativeMillionPair minimumThresholdPriceStrategyNegativeMillionPair() {
        return minimumThresholdPriceStrategyNegativeMillionPair;
    }

    /**
     * Returns the MinimumThresholdPriceStrategyNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceStrategyNumericPair minimumThresholdPriceStrategyNumericPair() {
        return minimumThresholdPriceStrategyNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceStrategyNegativeWholePair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_PAIR -> minimumThresholdPriceStrategyNegativeTenPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceStrategyNegativeHundredPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeThousandPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeTenThousandPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceStrategyNegativeHundredThousandPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceStrategyNegativeMillionPair;
            case MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR -> minimumThresholdPriceStrategyNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NEGATIVE_MILLION_PAIR;
        }
        return Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR;
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
        minimumThresholdPriceStrategyNegativeWholePair.clear();
        minimumThresholdPriceStrategyNegativeTenPair.clear();
        minimumThresholdPriceStrategyNegativeHundredPair.clear();
        minimumThresholdPriceStrategyNegativeThousandPair.clear();
        minimumThresholdPriceStrategyNegativeTenThousandPair.clear();
        minimumThresholdPriceStrategyNegativeHundredThousandPair.clear();
        minimumThresholdPriceStrategyNegativeMillionPair.clear();
        minimumThresholdPriceStrategyNumericPair.clear();
        selected = Case.MINIMUM_THRESHOLD_PRICE_STRATEGY_NUMERIC_PAIR;
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
        return other instanceof MinimumThresholdPriceStrategyFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MinimumThresholdPriceStrategyFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
