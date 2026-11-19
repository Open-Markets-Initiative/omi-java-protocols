package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.MinimumThresholdPriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.MinimumThresholdPriceOptionsNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The MinimumThresholdPriceOptionsFractionPair branch: one of 8 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MinimumThresholdPriceOptionsFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MinimumThresholdPriceOptionsFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "A".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "B".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "C".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "D".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "E".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "F".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when MinimumThresholdPriceFractionIndicator is "G".
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR
    }

    private final MinimumThresholdPriceOptionsNegativeWholePair minimumThresholdPriceOptionsNegativeWholePair = new MinimumThresholdPriceOptionsNegativeWholePair();
    private final MinimumThresholdPriceOptionsNegativeTenPair minimumThresholdPriceOptionsNegativeTenPair = new MinimumThresholdPriceOptionsNegativeTenPair();
    private final MinimumThresholdPriceOptionsNegativeHundredPair minimumThresholdPriceOptionsNegativeHundredPair = new MinimumThresholdPriceOptionsNegativeHundredPair();
    private final MinimumThresholdPriceOptionsNegativeThousandPair minimumThresholdPriceOptionsNegativeThousandPair = new MinimumThresholdPriceOptionsNegativeThousandPair();
    private final MinimumThresholdPriceOptionsNegativeTenThousandPair minimumThresholdPriceOptionsNegativeTenThousandPair = new MinimumThresholdPriceOptionsNegativeTenThousandPair();
    private final MinimumThresholdPriceOptionsNegativeHundredThousandPair minimumThresholdPriceOptionsNegativeHundredThousandPair = new MinimumThresholdPriceOptionsNegativeHundredThousandPair();
    private final MinimumThresholdPriceOptionsNegativeMillionPair minimumThresholdPriceOptionsNegativeMillionPair = new MinimumThresholdPriceOptionsNegativeMillionPair();
    private final MinimumThresholdPriceOptionsNumericPair minimumThresholdPriceOptionsNumericPair = new MinimumThresholdPriceOptionsNumericPair();
    private Case selected = Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR;

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
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceOptionsNegativeWholePair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_WHOLE);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_PAIR -> minimumThresholdPriceOptionsNegativeTenPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceOptionsNegativeHundredPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeTenThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeHundredThousandPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceOptionsNegativeMillionPair.minimumThresholdPriceFractionIndicator().value(MinimumThresholdPriceFractionIndicator.NEGATIVE_MILLION);
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeWholePair minimumThresholdPriceOptionsNegativeWholePair() {
        return minimumThresholdPriceOptionsNegativeWholePair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeTenPair minimumThresholdPriceOptionsNegativeTenPair() {
        return minimumThresholdPriceOptionsNegativeTenPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeHundredPair minimumThresholdPriceOptionsNegativeHundredPair() {
        return minimumThresholdPriceOptionsNegativeHundredPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeThousandPair minimumThresholdPriceOptionsNegativeThousandPair() {
        return minimumThresholdPriceOptionsNegativeThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeTenThousandPair minimumThresholdPriceOptionsNegativeTenThousandPair() {
        return minimumThresholdPriceOptionsNegativeTenThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeHundredThousandPair minimumThresholdPriceOptionsNegativeHundredThousandPair() {
        return minimumThresholdPriceOptionsNegativeHundredThousandPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNegativeMillionPair minimumThresholdPriceOptionsNegativeMillionPair() {
        return minimumThresholdPriceOptionsNegativeMillionPair;
    }

    /**
     * Returns the MinimumThresholdPriceOptionsNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinimumThresholdPriceOptionsNumericPair minimumThresholdPriceOptionsNumericPair() {
        return minimumThresholdPriceOptionsNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_WHOLE_PAIR -> minimumThresholdPriceOptionsNegativeWholePair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_PAIR -> minimumThresholdPriceOptionsNegativeTenPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_PAIR -> minimumThresholdPriceOptionsNegativeHundredPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeThousandPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeTenThousandPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minimumThresholdPriceOptionsNegativeHundredThousandPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_MILLION_PAIR -> minimumThresholdPriceOptionsNegativeMillionPair;
            case MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR -> minimumThresholdPriceOptionsNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 6] == (byte) 'A') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NEGATIVE_MILLION_PAIR;
        }
        return Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR;
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
        minimumThresholdPriceOptionsNegativeWholePair.clear();
        minimumThresholdPriceOptionsNegativeTenPair.clear();
        minimumThresholdPriceOptionsNegativeHundredPair.clear();
        minimumThresholdPriceOptionsNegativeThousandPair.clear();
        minimumThresholdPriceOptionsNegativeTenThousandPair.clear();
        minimumThresholdPriceOptionsNegativeHundredThousandPair.clear();
        minimumThresholdPriceOptionsNegativeMillionPair.clear();
        minimumThresholdPriceOptionsNumericPair.clear();
        selected = Case.MINIMUM_THRESHOLD_PRICE_OPTIONS_NUMERIC_PAIR;
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
        return other instanceof MinimumThresholdPriceOptionsFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MinimumThresholdPriceOptionsFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
