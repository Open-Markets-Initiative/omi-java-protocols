package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.MinPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.MinPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The MinPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MinPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MinPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when MinPriceFractionIndicator is "A".
         */
        MIN_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "B".
         */
        MIN_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "C".
         */
        MIN_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "D".
         */
        MIN_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "E".
         */
        MIN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "F".
         */
        MIN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when MinPriceFractionIndicator is "G".
         */
        MIN_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        MIN_PRICE_NUMERIC_PAIR
    }

    private final MinPriceNegativeWholePair minPriceNegativeWholePair = new MinPriceNegativeWholePair();
    private final MinPriceNegativeTenPair minPriceNegativeTenPair = new MinPriceNegativeTenPair();
    private final MinPriceNegativeHundredPair minPriceNegativeHundredPair = new MinPriceNegativeHundredPair();
    private final MinPriceNegativeThousandPair minPriceNegativeThousandPair = new MinPriceNegativeThousandPair();
    private final MinPriceNegativeTenThousandPair minPriceNegativeTenThousandPair = new MinPriceNegativeTenThousandPair();
    private final MinPriceNegativeHundredThousandPair minPriceNegativeHundredThousandPair = new MinPriceNegativeHundredThousandPair();
    private final MinPriceNegativeMillionPair minPriceNegativeMillionPair = new MinPriceNegativeMillionPair();
    private final MinPriceNumericPair minPriceNumericPair = new MinPriceNumericPair();
    private Case selected = Case.MIN_PRICE_NUMERIC_PAIR;

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
            case MIN_PRICE_NEGATIVE_WHOLE_PAIR -> minPriceNegativeWholePair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_WHOLE);
            case MIN_PRICE_NEGATIVE_TEN_PAIR -> minPriceNegativeTenPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_TEN);
            case MIN_PRICE_NEGATIVE_HUNDRED_PAIR -> minPriceNegativeHundredPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_HUNDRED);
            case MIN_PRICE_NEGATIVE_THOUSAND_PAIR -> minPriceNegativeThousandPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_THOUSAND);
            case MIN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> minPriceNegativeTenThousandPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case MIN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minPriceNegativeHundredThousandPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case MIN_PRICE_NEGATIVE_MILLION_PAIR -> minPriceNegativeMillionPair.minPriceFractionIndicator().value(MinPriceFractionIndicator.NEGATIVE_MILLION);
            case MIN_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the MinPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeWholePair minPriceNegativeWholePair() {
        return minPriceNegativeWholePair;
    }

    /**
     * Returns the MinPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeTenPair minPriceNegativeTenPair() {
        return minPriceNegativeTenPair;
    }

    /**
     * Returns the MinPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeHundredPair minPriceNegativeHundredPair() {
        return minPriceNegativeHundredPair;
    }

    /**
     * Returns the MinPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeThousandPair minPriceNegativeThousandPair() {
        return minPriceNegativeThousandPair;
    }

    /**
     * Returns the MinPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeTenThousandPair minPriceNegativeTenThousandPair() {
        return minPriceNegativeTenThousandPair;
    }

    /**
     * Returns the MinPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeHundredThousandPair minPriceNegativeHundredThousandPair() {
        return minPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the MinPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNegativeMillionPair minPriceNegativeMillionPair() {
        return minPriceNegativeMillionPair;
    }

    /**
     * Returns the MinPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinPriceNumericPair minPriceNumericPair() {
        return minPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case MIN_PRICE_NEGATIVE_WHOLE_PAIR -> minPriceNegativeWholePair;
            case MIN_PRICE_NEGATIVE_TEN_PAIR -> minPriceNegativeTenPair;
            case MIN_PRICE_NEGATIVE_HUNDRED_PAIR -> minPriceNegativeHundredPair;
            case MIN_PRICE_NEGATIVE_THOUSAND_PAIR -> minPriceNegativeThousandPair;
            case MIN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> minPriceNegativeTenThousandPair;
            case MIN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> minPriceNegativeHundredThousandPair;
            case MIN_PRICE_NEGATIVE_MILLION_PAIR -> minPriceNegativeMillionPair;
            case MIN_PRICE_NUMERIC_PAIR -> minPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.MIN_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.MIN_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.MIN_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.MIN_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.MIN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.MIN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.MIN_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.MIN_PRICE_NUMERIC_PAIR;
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
        minPriceNegativeWholePair.clear();
        minPriceNegativeTenPair.clear();
        minPriceNegativeHundredPair.clear();
        minPriceNegativeThousandPair.clear();
        minPriceNegativeTenThousandPair.clear();
        minPriceNegativeHundredThousandPair.clear();
        minPriceNegativeMillionPair.clear();
        minPriceNumericPair.clear();
        selected = Case.MIN_PRICE_NUMERIC_PAIR;
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
        return other instanceof MinPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MinPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
