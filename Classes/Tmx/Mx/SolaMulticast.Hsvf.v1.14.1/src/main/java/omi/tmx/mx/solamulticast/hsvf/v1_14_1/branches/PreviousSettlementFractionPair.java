package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.PreviousSettlementFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The PreviousSettlementFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PreviousSettlementFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PreviousSettlementFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PreviousSettlementFractionIndicator is "A".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "B".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "C".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "D".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "E".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "F".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementFractionIndicator is "G".
         */
        PREVIOUS_SETTLEMENT_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PREVIOUS_SETTLEMENT_NUMERIC_PAIR
    }

    private final PreviousSettlementNegativeWholePair previousSettlementNegativeWholePair = new PreviousSettlementNegativeWholePair();
    private final PreviousSettlementNegativeTenPair previousSettlementNegativeTenPair = new PreviousSettlementNegativeTenPair();
    private final PreviousSettlementNegativeHundredPair previousSettlementNegativeHundredPair = new PreviousSettlementNegativeHundredPair();
    private final PreviousSettlementNegativeThousandPair previousSettlementNegativeThousandPair = new PreviousSettlementNegativeThousandPair();
    private final PreviousSettlementNegativeTenThousandPair previousSettlementNegativeTenThousandPair = new PreviousSettlementNegativeTenThousandPair();
    private final PreviousSettlementNegativeHundredThousandPair previousSettlementNegativeHundredThousandPair = new PreviousSettlementNegativeHundredThousandPair();
    private final PreviousSettlementNegativeMillionPair previousSettlementNegativeMillionPair = new PreviousSettlementNegativeMillionPair();
    private final PreviousSettlementNumericPair previousSettlementNumericPair = new PreviousSettlementNumericPair();
    private Case selected = Case.PREVIOUS_SETTLEMENT_NUMERIC_PAIR;

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
            case PREVIOUS_SETTLEMENT_NEGATIVE_WHOLE_PAIR -> previousSettlementNegativeWholePair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_WHOLE);
            case PREVIOUS_SETTLEMENT_NEGATIVE_TEN_PAIR -> previousSettlementNegativeTenPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_TEN);
            case PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_PAIR -> previousSettlementNegativeHundredPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_HUNDRED);
            case PREVIOUS_SETTLEMENT_NEGATIVE_THOUSAND_PAIR -> previousSettlementNegativeThousandPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_THOUSAND);
            case PREVIOUS_SETTLEMENT_NEGATIVE_TEN_THOUSAND_PAIR -> previousSettlementNegativeTenThousandPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousSettlementNegativeHundredThousandPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PREVIOUS_SETTLEMENT_NEGATIVE_MILLION_PAIR -> previousSettlementNegativeMillionPair.previousSettlementFractionIndicator().value(PreviousSettlementFractionIndicator.NEGATIVE_MILLION);
            case PREVIOUS_SETTLEMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PreviousSettlementNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeWholePair previousSettlementNegativeWholePair() {
        return previousSettlementNegativeWholePair;
    }

    /**
     * Returns the PreviousSettlementNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeTenPair previousSettlementNegativeTenPair() {
        return previousSettlementNegativeTenPair;
    }

    /**
     * Returns the PreviousSettlementNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeHundredPair previousSettlementNegativeHundredPair() {
        return previousSettlementNegativeHundredPair;
    }

    /**
     * Returns the PreviousSettlementNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeThousandPair previousSettlementNegativeThousandPair() {
        return previousSettlementNegativeThousandPair;
    }

    /**
     * Returns the PreviousSettlementNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeTenThousandPair previousSettlementNegativeTenThousandPair() {
        return previousSettlementNegativeTenThousandPair;
    }

    /**
     * Returns the PreviousSettlementNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeHundredThousandPair previousSettlementNegativeHundredThousandPair() {
        return previousSettlementNegativeHundredThousandPair;
    }

    /**
     * Returns the PreviousSettlementNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNegativeMillionPair previousSettlementNegativeMillionPair() {
        return previousSettlementNegativeMillionPair;
    }

    /**
     * Returns the PreviousSettlementNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementNumericPair previousSettlementNumericPair() {
        return previousSettlementNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PREVIOUS_SETTLEMENT_NEGATIVE_WHOLE_PAIR -> previousSettlementNegativeWholePair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_TEN_PAIR -> previousSettlementNegativeTenPair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_PAIR -> previousSettlementNegativeHundredPair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_THOUSAND_PAIR -> previousSettlementNegativeThousandPair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_TEN_THOUSAND_PAIR -> previousSettlementNegativeTenThousandPair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousSettlementNegativeHundredThousandPair;
            case PREVIOUS_SETTLEMENT_NEGATIVE_MILLION_PAIR -> previousSettlementNegativeMillionPair;
            case PREVIOUS_SETTLEMENT_NUMERIC_PAIR -> previousSettlementNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.PREVIOUS_SETTLEMENT_NEGATIVE_MILLION_PAIR;
        }
        return Case.PREVIOUS_SETTLEMENT_NUMERIC_PAIR;
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
        previousSettlementNegativeWholePair.clear();
        previousSettlementNegativeTenPair.clear();
        previousSettlementNegativeHundredPair.clear();
        previousSettlementNegativeThousandPair.clear();
        previousSettlementNegativeTenThousandPair.clear();
        previousSettlementNegativeHundredThousandPair.clear();
        previousSettlementNegativeMillionPair.clear();
        previousSettlementNumericPair.clear();
        selected = Case.PREVIOUS_SETTLEMENT_NUMERIC_PAIR;
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
        return other instanceof PreviousSettlementFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof PreviousSettlementFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
