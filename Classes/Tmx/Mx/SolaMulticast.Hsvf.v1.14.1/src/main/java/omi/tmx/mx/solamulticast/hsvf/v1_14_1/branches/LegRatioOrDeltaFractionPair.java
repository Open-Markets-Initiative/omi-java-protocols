package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.LegRatioOrDeltaFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegRatioOrDeltaNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The LegRatioOrDeltaFractionPair branch: one of 8 records of 5 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class LegRatioOrDeltaFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 5;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "LegRatioOrDeltaFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "A".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "B".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_TEN_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "C".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "D".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "E".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "F".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when LegRatioOrDeltaFractionIndicator is "G".
         */
        LEG_RATIO_OR_DELTA_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        LEG_RATIO_OR_DELTA_NUMERIC_PAIR
    }

    private final LegRatioOrDeltaNegativeWholePair legRatioOrDeltaNegativeWholePair = new LegRatioOrDeltaNegativeWholePair();
    private final LegRatioOrDeltaNegativeTenPair legRatioOrDeltaNegativeTenPair = new LegRatioOrDeltaNegativeTenPair();
    private final LegRatioOrDeltaNegativeHundredPair legRatioOrDeltaNegativeHundredPair = new LegRatioOrDeltaNegativeHundredPair();
    private final LegRatioOrDeltaNegativeThousandPair legRatioOrDeltaNegativeThousandPair = new LegRatioOrDeltaNegativeThousandPair();
    private final LegRatioOrDeltaNegativeTenThousandPair legRatioOrDeltaNegativeTenThousandPair = new LegRatioOrDeltaNegativeTenThousandPair();
    private final LegRatioOrDeltaNegativeHundredThousandPair legRatioOrDeltaNegativeHundredThousandPair = new LegRatioOrDeltaNegativeHundredThousandPair();
    private final LegRatioOrDeltaNegativeMillionPair legRatioOrDeltaNegativeMillionPair = new LegRatioOrDeltaNegativeMillionPair();
    private final LegRatioOrDeltaNumericPair legRatioOrDeltaNumericPair = new LegRatioOrDeltaNumericPair();
    private Case selected = Case.LEG_RATIO_OR_DELTA_NUMERIC_PAIR;

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
            case LEG_RATIO_OR_DELTA_NEGATIVE_WHOLE_PAIR -> legRatioOrDeltaNegativeWholePair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_WHOLE);
            case LEG_RATIO_OR_DELTA_NEGATIVE_TEN_PAIR -> legRatioOrDeltaNegativeTenPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_TEN);
            case LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_PAIR -> legRatioOrDeltaNegativeHundredPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_HUNDRED);
            case LEG_RATIO_OR_DELTA_NEGATIVE_THOUSAND_PAIR -> legRatioOrDeltaNegativeThousandPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_THOUSAND);
            case LEG_RATIO_OR_DELTA_NEGATIVE_TEN_THOUSAND_PAIR -> legRatioOrDeltaNegativeTenThousandPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_THOUSAND_PAIR -> legRatioOrDeltaNegativeHundredThousandPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case LEG_RATIO_OR_DELTA_NEGATIVE_MILLION_PAIR -> legRatioOrDeltaNegativeMillionPair.legRatioOrDeltaFractionIndicator().value(LegRatioOrDeltaFractionIndicator.NEGATIVE_MILLION);
            case LEG_RATIO_OR_DELTA_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeWholePair legRatioOrDeltaNegativeWholePair() {
        return legRatioOrDeltaNegativeWholePair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeTenPair legRatioOrDeltaNegativeTenPair() {
        return legRatioOrDeltaNegativeTenPair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeHundredPair legRatioOrDeltaNegativeHundredPair() {
        return legRatioOrDeltaNegativeHundredPair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeThousandPair legRatioOrDeltaNegativeThousandPair() {
        return legRatioOrDeltaNegativeThousandPair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeTenThousandPair legRatioOrDeltaNegativeTenThousandPair() {
        return legRatioOrDeltaNegativeTenThousandPair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeHundredThousandPair legRatioOrDeltaNegativeHundredThousandPair() {
        return legRatioOrDeltaNegativeHundredThousandPair;
    }

    /**
     * Returns the LegRatioOrDeltaNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNegativeMillionPair legRatioOrDeltaNegativeMillionPair() {
        return legRatioOrDeltaNegativeMillionPair;
    }

    /**
     * Returns the LegRatioOrDeltaNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegRatioOrDeltaNumericPair legRatioOrDeltaNumericPair() {
        return legRatioOrDeltaNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case LEG_RATIO_OR_DELTA_NEGATIVE_WHOLE_PAIR -> legRatioOrDeltaNegativeWholePair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_TEN_PAIR -> legRatioOrDeltaNegativeTenPair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_PAIR -> legRatioOrDeltaNegativeHundredPair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_THOUSAND_PAIR -> legRatioOrDeltaNegativeThousandPair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_TEN_THOUSAND_PAIR -> legRatioOrDeltaNegativeTenThousandPair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_THOUSAND_PAIR -> legRatioOrDeltaNegativeHundredThousandPair;
            case LEG_RATIO_OR_DELTA_NEGATIVE_MILLION_PAIR -> legRatioOrDeltaNegativeMillionPair;
            case LEG_RATIO_OR_DELTA_NUMERIC_PAIR -> legRatioOrDeltaNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 4] == (byte) 'A') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 4] == (byte) 'B') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 4] == (byte) 'C') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 4] == (byte) 'D') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 4] == (byte) 'E') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 4] == (byte) 'F') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 4] == (byte) 'G') {
            return Case.LEG_RATIO_OR_DELTA_NEGATIVE_MILLION_PAIR;
        }
        return Case.LEG_RATIO_OR_DELTA_NUMERIC_PAIR;
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
        legRatioOrDeltaNegativeWholePair.clear();
        legRatioOrDeltaNegativeTenPair.clear();
        legRatioOrDeltaNegativeHundredPair.clear();
        legRatioOrDeltaNegativeThousandPair.clear();
        legRatioOrDeltaNegativeTenThousandPair.clear();
        legRatioOrDeltaNegativeHundredThousandPair.clear();
        legRatioOrDeltaNegativeMillionPair.clear();
        legRatioOrDeltaNumericPair.clear();
        selected = Case.LEG_RATIO_OR_DELTA_NUMERIC_PAIR;
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
        return other instanceof LegRatioOrDeltaFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof LegRatioOrDeltaFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
