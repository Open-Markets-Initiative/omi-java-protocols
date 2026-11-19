package omi.tmx.mx.solamulticast.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.enums.PreviousResetRateFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.PreviousResetRateNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * The PreviousResetRateFractionPair branch: one of 8 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PreviousResetRateFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PreviousResetRateFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PreviousResetRateFractionIndicator is "A".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "B".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "C".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "D".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "E".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "F".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PreviousResetRateFractionIndicator is "G".
         */
        PREVIOUS_RESET_RATE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PREVIOUS_RESET_RATE_NUMERIC_PAIR
    }

    private final PreviousResetRateNegativeWholePair previousResetRateNegativeWholePair = new PreviousResetRateNegativeWholePair();
    private final PreviousResetRateNegativeTenPair previousResetRateNegativeTenPair = new PreviousResetRateNegativeTenPair();
    private final PreviousResetRateNegativeHundredPair previousResetRateNegativeHundredPair = new PreviousResetRateNegativeHundredPair();
    private final PreviousResetRateNegativeThousandPair previousResetRateNegativeThousandPair = new PreviousResetRateNegativeThousandPair();
    private final PreviousResetRateNegativeTenThousandPair previousResetRateNegativeTenThousandPair = new PreviousResetRateNegativeTenThousandPair();
    private final PreviousResetRateNegativeHundredThousandPair previousResetRateNegativeHundredThousandPair = new PreviousResetRateNegativeHundredThousandPair();
    private final PreviousResetRateNegativeMillionPair previousResetRateNegativeMillionPair = new PreviousResetRateNegativeMillionPair();
    private final PreviousResetRateNumericPair previousResetRateNumericPair = new PreviousResetRateNumericPair();
    private Case selected = Case.PREVIOUS_RESET_RATE_NUMERIC_PAIR;

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
            case PREVIOUS_RESET_RATE_NEGATIVE_WHOLE_PAIR -> previousResetRateNegativeWholePair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_WHOLE);
            case PREVIOUS_RESET_RATE_NEGATIVE_TEN_PAIR -> previousResetRateNegativeTenPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_TEN);
            case PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_PAIR -> previousResetRateNegativeHundredPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_HUNDRED);
            case PREVIOUS_RESET_RATE_NEGATIVE_THOUSAND_PAIR -> previousResetRateNegativeThousandPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_THOUSAND);
            case PREVIOUS_RESET_RATE_NEGATIVE_TEN_THOUSAND_PAIR -> previousResetRateNegativeTenThousandPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousResetRateNegativeHundredThousandPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PREVIOUS_RESET_RATE_NEGATIVE_MILLION_PAIR -> previousResetRateNegativeMillionPair.previousResetRateFractionIndicator().value(PreviousResetRateFractionIndicator.NEGATIVE_MILLION);
            case PREVIOUS_RESET_RATE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PreviousResetRateNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeWholePair previousResetRateNegativeWholePair() {
        return previousResetRateNegativeWholePair;
    }

    /**
     * Returns the PreviousResetRateNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeTenPair previousResetRateNegativeTenPair() {
        return previousResetRateNegativeTenPair;
    }

    /**
     * Returns the PreviousResetRateNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeHundredPair previousResetRateNegativeHundredPair() {
        return previousResetRateNegativeHundredPair;
    }

    /**
     * Returns the PreviousResetRateNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeThousandPair previousResetRateNegativeThousandPair() {
        return previousResetRateNegativeThousandPair;
    }

    /**
     * Returns the PreviousResetRateNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeTenThousandPair previousResetRateNegativeTenThousandPair() {
        return previousResetRateNegativeTenThousandPair;
    }

    /**
     * Returns the PreviousResetRateNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeHundredThousandPair previousResetRateNegativeHundredThousandPair() {
        return previousResetRateNegativeHundredThousandPair;
    }

    /**
     * Returns the PreviousResetRateNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNegativeMillionPair previousResetRateNegativeMillionPair() {
        return previousResetRateNegativeMillionPair;
    }

    /**
     * Returns the PreviousResetRateNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousResetRateNumericPair previousResetRateNumericPair() {
        return previousResetRateNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PREVIOUS_RESET_RATE_NEGATIVE_WHOLE_PAIR -> previousResetRateNegativeWholePair;
            case PREVIOUS_RESET_RATE_NEGATIVE_TEN_PAIR -> previousResetRateNegativeTenPair;
            case PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_PAIR -> previousResetRateNegativeHundredPair;
            case PREVIOUS_RESET_RATE_NEGATIVE_THOUSAND_PAIR -> previousResetRateNegativeThousandPair;
            case PREVIOUS_RESET_RATE_NEGATIVE_TEN_THOUSAND_PAIR -> previousResetRateNegativeTenThousandPair;
            case PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousResetRateNegativeHundredThousandPair;
            case PREVIOUS_RESET_RATE_NEGATIVE_MILLION_PAIR -> previousResetRateNegativeMillionPair;
            case PREVIOUS_RESET_RATE_NUMERIC_PAIR -> previousResetRateNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 6] == (byte) 'A') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.PREVIOUS_RESET_RATE_NEGATIVE_MILLION_PAIR;
        }
        return Case.PREVIOUS_RESET_RATE_NUMERIC_PAIR;
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
        previousResetRateNegativeWholePair.clear();
        previousResetRateNegativeTenPair.clear();
        previousResetRateNegativeHundredPair.clear();
        previousResetRateNegativeThousandPair.clear();
        previousResetRateNegativeTenThousandPair.clear();
        previousResetRateNegativeHundredThousandPair.clear();
        previousResetRateNegativeMillionPair.clear();
        previousResetRateNumericPair.clear();
        selected = Case.PREVIOUS_RESET_RATE_NUMERIC_PAIR;
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
        return other instanceof PreviousResetRateFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof PreviousResetRateFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
