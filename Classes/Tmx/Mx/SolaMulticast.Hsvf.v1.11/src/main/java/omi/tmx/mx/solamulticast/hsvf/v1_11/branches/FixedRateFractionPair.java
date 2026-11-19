package omi.tmx.mx.solamulticast.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.enums.FixedRateFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.FixedRateNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * The FixedRateFractionPair branch: one of 8 records of 6 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class FixedRateFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 6;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "FixedRateFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when FixedRateFractionIndicator is "A".
         */
        FIXED_RATE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "B".
         */
        FIXED_RATE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "C".
         */
        FIXED_RATE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "D".
         */
        FIXED_RATE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "E".
         */
        FIXED_RATE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "F".
         */
        FIXED_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when FixedRateFractionIndicator is "G".
         */
        FIXED_RATE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        FIXED_RATE_NUMERIC_PAIR
    }

    private final FixedRateNegativeWholePair fixedRateNegativeWholePair = new FixedRateNegativeWholePair();
    private final FixedRateNegativeTenPair fixedRateNegativeTenPair = new FixedRateNegativeTenPair();
    private final FixedRateNegativeHundredPair fixedRateNegativeHundredPair = new FixedRateNegativeHundredPair();
    private final FixedRateNegativeThousandPair fixedRateNegativeThousandPair = new FixedRateNegativeThousandPair();
    private final FixedRateNegativeTenThousandPair fixedRateNegativeTenThousandPair = new FixedRateNegativeTenThousandPair();
    private final FixedRateNegativeHundredThousandPair fixedRateNegativeHundredThousandPair = new FixedRateNegativeHundredThousandPair();
    private final FixedRateNegativeMillionPair fixedRateNegativeMillionPair = new FixedRateNegativeMillionPair();
    private final FixedRateNumericPair fixedRateNumericPair = new FixedRateNumericPair();
    private Case selected = Case.FIXED_RATE_NUMERIC_PAIR;

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
            case FIXED_RATE_NEGATIVE_WHOLE_PAIR -> fixedRateNegativeWholePair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_WHOLE);
            case FIXED_RATE_NEGATIVE_TEN_PAIR -> fixedRateNegativeTenPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_TEN);
            case FIXED_RATE_NEGATIVE_HUNDRED_PAIR -> fixedRateNegativeHundredPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_HUNDRED);
            case FIXED_RATE_NEGATIVE_THOUSAND_PAIR -> fixedRateNegativeThousandPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_THOUSAND);
            case FIXED_RATE_NEGATIVE_TEN_THOUSAND_PAIR -> fixedRateNegativeTenThousandPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case FIXED_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> fixedRateNegativeHundredThousandPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case FIXED_RATE_NEGATIVE_MILLION_PAIR -> fixedRateNegativeMillionPair.fixedRateFractionIndicator().value(FixedRateFractionIndicator.NEGATIVE_MILLION);
            case FIXED_RATE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the FixedRateNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeWholePair fixedRateNegativeWholePair() {
        return fixedRateNegativeWholePair;
    }

    /**
     * Returns the FixedRateNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeTenPair fixedRateNegativeTenPair() {
        return fixedRateNegativeTenPair;
    }

    /**
     * Returns the FixedRateNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeHundredPair fixedRateNegativeHundredPair() {
        return fixedRateNegativeHundredPair;
    }

    /**
     * Returns the FixedRateNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeThousandPair fixedRateNegativeThousandPair() {
        return fixedRateNegativeThousandPair;
    }

    /**
     * Returns the FixedRateNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeTenThousandPair fixedRateNegativeTenThousandPair() {
        return fixedRateNegativeTenThousandPair;
    }

    /**
     * Returns the FixedRateNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeHundredThousandPair fixedRateNegativeHundredThousandPair() {
        return fixedRateNegativeHundredThousandPair;
    }

    /**
     * Returns the FixedRateNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNegativeMillionPair fixedRateNegativeMillionPair() {
        return fixedRateNegativeMillionPair;
    }

    /**
     * Returns the FixedRateNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FixedRateNumericPair fixedRateNumericPair() {
        return fixedRateNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case FIXED_RATE_NEGATIVE_WHOLE_PAIR -> fixedRateNegativeWholePair;
            case FIXED_RATE_NEGATIVE_TEN_PAIR -> fixedRateNegativeTenPair;
            case FIXED_RATE_NEGATIVE_HUNDRED_PAIR -> fixedRateNegativeHundredPair;
            case FIXED_RATE_NEGATIVE_THOUSAND_PAIR -> fixedRateNegativeThousandPair;
            case FIXED_RATE_NEGATIVE_TEN_THOUSAND_PAIR -> fixedRateNegativeTenThousandPair;
            case FIXED_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> fixedRateNegativeHundredThousandPair;
            case FIXED_RATE_NEGATIVE_MILLION_PAIR -> fixedRateNegativeMillionPair;
            case FIXED_RATE_NUMERIC_PAIR -> fixedRateNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 5] == (byte) 'A') {
            return Case.FIXED_RATE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 5] == (byte) 'B') {
            return Case.FIXED_RATE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 5] == (byte) 'C') {
            return Case.FIXED_RATE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 5] == (byte) 'D') {
            return Case.FIXED_RATE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 5] == (byte) 'E') {
            return Case.FIXED_RATE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 5] == (byte) 'F') {
            return Case.FIXED_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 5] == (byte) 'G') {
            return Case.FIXED_RATE_NEGATIVE_MILLION_PAIR;
        }
        return Case.FIXED_RATE_NUMERIC_PAIR;
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
        fixedRateNegativeWholePair.clear();
        fixedRateNegativeTenPair.clear();
        fixedRateNegativeHundredPair.clear();
        fixedRateNegativeThousandPair.clear();
        fixedRateNegativeTenThousandPair.clear();
        fixedRateNegativeHundredThousandPair.clear();
        fixedRateNegativeMillionPair.clear();
        fixedRateNumericPair.clear();
        selected = Case.FIXED_RATE_NUMERIC_PAIR;
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
        return other instanceof FixedRateFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof FixedRateFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
