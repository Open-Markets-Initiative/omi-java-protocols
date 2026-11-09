package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.MaximumThresholdPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MaximumThresholdPriceFuturesNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The MaximumThresholdPriceFuturesFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MaximumThresholdPriceFuturesFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MaximumThresholdPriceFuturesFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "A".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "B".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "C".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "D".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "E".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "F".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when MaximumThresholdPriceFractionIndicator is "G".
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR
    }

    private final MaximumThresholdPriceFuturesNegativeWholePair maximumThresholdPriceFuturesNegativeWholePair = new MaximumThresholdPriceFuturesNegativeWholePair();
    private final MaximumThresholdPriceFuturesNegativeTenPair maximumThresholdPriceFuturesNegativeTenPair = new MaximumThresholdPriceFuturesNegativeTenPair();
    private final MaximumThresholdPriceFuturesNegativeHundredPair maximumThresholdPriceFuturesNegativeHundredPair = new MaximumThresholdPriceFuturesNegativeHundredPair();
    private final MaximumThresholdPriceFuturesNegativeThousandPair maximumThresholdPriceFuturesNegativeThousandPair = new MaximumThresholdPriceFuturesNegativeThousandPair();
    private final MaximumThresholdPriceFuturesNegativeTenThousandPair maximumThresholdPriceFuturesNegativeTenThousandPair = new MaximumThresholdPriceFuturesNegativeTenThousandPair();
    private final MaximumThresholdPriceFuturesNegativeHundredThousandPair maximumThresholdPriceFuturesNegativeHundredThousandPair = new MaximumThresholdPriceFuturesNegativeHundredThousandPair();
    private final MaximumThresholdPriceFuturesNegativeMillionPair maximumThresholdPriceFuturesNegativeMillionPair = new MaximumThresholdPriceFuturesNegativeMillionPair();
    private final MaximumThresholdPriceFuturesNumericPair maximumThresholdPriceFuturesNumericPair = new MaximumThresholdPriceFuturesNumericPair();
    private Case selected = Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR;

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
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_WHOLE_PAIR -> maximumThresholdPriceFuturesNegativeWholePair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_WHOLE);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_PAIR -> maximumThresholdPriceFuturesNegativeTenPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_TEN);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_PAIR -> maximumThresholdPriceFuturesNegativeHundredPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeThousandPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_THOUSAND);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeTenThousandPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeHundredThousandPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_MILLION_PAIR -> maximumThresholdPriceFuturesNegativeMillionPair.maximumThresholdPriceFractionIndicator().value(MaximumThresholdPriceFractionIndicator.NEGATIVE_MILLION);
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeWholePair maximumThresholdPriceFuturesNegativeWholePair() {
        return maximumThresholdPriceFuturesNegativeWholePair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeTenPair maximumThresholdPriceFuturesNegativeTenPair() {
        return maximumThresholdPriceFuturesNegativeTenPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeHundredPair maximumThresholdPriceFuturesNegativeHundredPair() {
        return maximumThresholdPriceFuturesNegativeHundredPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeThousandPair maximumThresholdPriceFuturesNegativeThousandPair() {
        return maximumThresholdPriceFuturesNegativeThousandPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeTenThousandPair maximumThresholdPriceFuturesNegativeTenThousandPair() {
        return maximumThresholdPriceFuturesNegativeTenThousandPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeHundredThousandPair maximumThresholdPriceFuturesNegativeHundredThousandPair() {
        return maximumThresholdPriceFuturesNegativeHundredThousandPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNegativeMillionPair maximumThresholdPriceFuturesNegativeMillionPair() {
        return maximumThresholdPriceFuturesNegativeMillionPair;
    }

    /**
     * Returns the MaximumThresholdPriceFuturesNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaximumThresholdPriceFuturesNumericPair maximumThresholdPriceFuturesNumericPair() {
        return maximumThresholdPriceFuturesNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_WHOLE_PAIR -> maximumThresholdPriceFuturesNegativeWholePair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_PAIR -> maximumThresholdPriceFuturesNegativeTenPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_PAIR -> maximumThresholdPriceFuturesNegativeHundredPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeThousandPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeTenThousandPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_THOUSAND_PAIR -> maximumThresholdPriceFuturesNegativeHundredThousandPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_MILLION_PAIR -> maximumThresholdPriceFuturesNegativeMillionPair;
            case MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR -> maximumThresholdPriceFuturesNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NEGATIVE_MILLION_PAIR;
        }
        return Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR;
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
        maximumThresholdPriceFuturesNegativeWholePair.clear();
        maximumThresholdPriceFuturesNegativeTenPair.clear();
        maximumThresholdPriceFuturesNegativeHundredPair.clear();
        maximumThresholdPriceFuturesNegativeThousandPair.clear();
        maximumThresholdPriceFuturesNegativeTenThousandPair.clear();
        maximumThresholdPriceFuturesNegativeHundredThousandPair.clear();
        maximumThresholdPriceFuturesNegativeMillionPair.clear();
        maximumThresholdPriceFuturesNumericPair.clear();
        selected = Case.MAXIMUM_THRESHOLD_PRICE_FUTURES_NUMERIC_PAIR;
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
        return other instanceof MaximumThresholdPriceFuturesFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MaximumThresholdPriceFuturesFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
