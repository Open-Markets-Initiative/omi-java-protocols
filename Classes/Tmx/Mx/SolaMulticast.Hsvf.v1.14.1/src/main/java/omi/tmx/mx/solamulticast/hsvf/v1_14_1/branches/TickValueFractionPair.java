package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.TickValueFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickValueNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The TickValueFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class TickValueFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "TickValueFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when TickValueFractionIndicator is "A".
         */
        TICK_VALUE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "B".
         */
        TICK_VALUE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "C".
         */
        TICK_VALUE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "D".
         */
        TICK_VALUE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "E".
         */
        TICK_VALUE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "F".
         */
        TICK_VALUE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when TickValueFractionIndicator is "G".
         */
        TICK_VALUE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        TICK_VALUE_NUMERIC_PAIR
    }

    private final TickValueNegativeWholePair tickValueNegativeWholePair = new TickValueNegativeWholePair();
    private final TickValueNegativeTenPair tickValueNegativeTenPair = new TickValueNegativeTenPair();
    private final TickValueNegativeHundredPair tickValueNegativeHundredPair = new TickValueNegativeHundredPair();
    private final TickValueNegativeThousandPair tickValueNegativeThousandPair = new TickValueNegativeThousandPair();
    private final TickValueNegativeTenThousandPair tickValueNegativeTenThousandPair = new TickValueNegativeTenThousandPair();
    private final TickValueNegativeHundredThousandPair tickValueNegativeHundredThousandPair = new TickValueNegativeHundredThousandPair();
    private final TickValueNegativeMillionPair tickValueNegativeMillionPair = new TickValueNegativeMillionPair();
    private final TickValueNumericPair tickValueNumericPair = new TickValueNumericPair();
    private Case selected = Case.TICK_VALUE_NUMERIC_PAIR;

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
            case TICK_VALUE_NEGATIVE_WHOLE_PAIR -> tickValueNegativeWholePair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_WHOLE);
            case TICK_VALUE_NEGATIVE_TEN_PAIR -> tickValueNegativeTenPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_TEN);
            case TICK_VALUE_NEGATIVE_HUNDRED_PAIR -> tickValueNegativeHundredPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_HUNDRED);
            case TICK_VALUE_NEGATIVE_THOUSAND_PAIR -> tickValueNegativeThousandPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_THOUSAND);
            case TICK_VALUE_NEGATIVE_TEN_THOUSAND_PAIR -> tickValueNegativeTenThousandPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case TICK_VALUE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickValueNegativeHundredThousandPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case TICK_VALUE_NEGATIVE_MILLION_PAIR -> tickValueNegativeMillionPair.tickValueFractionIndicator().value(TickValueFractionIndicator.NEGATIVE_MILLION);
            case TICK_VALUE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the TickValueNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeWholePair tickValueNegativeWholePair() {
        return tickValueNegativeWholePair;
    }

    /**
     * Returns the TickValueNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeTenPair tickValueNegativeTenPair() {
        return tickValueNegativeTenPair;
    }

    /**
     * Returns the TickValueNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeHundredPair tickValueNegativeHundredPair() {
        return tickValueNegativeHundredPair;
    }

    /**
     * Returns the TickValueNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeThousandPair tickValueNegativeThousandPair() {
        return tickValueNegativeThousandPair;
    }

    /**
     * Returns the TickValueNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeTenThousandPair tickValueNegativeTenThousandPair() {
        return tickValueNegativeTenThousandPair;
    }

    /**
     * Returns the TickValueNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeHundredThousandPair tickValueNegativeHundredThousandPair() {
        return tickValueNegativeHundredThousandPair;
    }

    /**
     * Returns the TickValueNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNegativeMillionPair tickValueNegativeMillionPair() {
        return tickValueNegativeMillionPair;
    }

    /**
     * Returns the TickValueNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickValueNumericPair tickValueNumericPair() {
        return tickValueNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case TICK_VALUE_NEGATIVE_WHOLE_PAIR -> tickValueNegativeWholePair;
            case TICK_VALUE_NEGATIVE_TEN_PAIR -> tickValueNegativeTenPair;
            case TICK_VALUE_NEGATIVE_HUNDRED_PAIR -> tickValueNegativeHundredPair;
            case TICK_VALUE_NEGATIVE_THOUSAND_PAIR -> tickValueNegativeThousandPair;
            case TICK_VALUE_NEGATIVE_TEN_THOUSAND_PAIR -> tickValueNegativeTenThousandPair;
            case TICK_VALUE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickValueNegativeHundredThousandPair;
            case TICK_VALUE_NEGATIVE_MILLION_PAIR -> tickValueNegativeMillionPair;
            case TICK_VALUE_NUMERIC_PAIR -> tickValueNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.TICK_VALUE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.TICK_VALUE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.TICK_VALUE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.TICK_VALUE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.TICK_VALUE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.TICK_VALUE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.TICK_VALUE_NEGATIVE_MILLION_PAIR;
        }
        return Case.TICK_VALUE_NUMERIC_PAIR;
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
        tickValueNegativeWholePair.clear();
        tickValueNegativeTenPair.clear();
        tickValueNegativeHundredPair.clear();
        tickValueNegativeThousandPair.clear();
        tickValueNegativeTenThousandPair.clear();
        tickValueNegativeHundredThousandPair.clear();
        tickValueNegativeMillionPair.clear();
        tickValueNumericPair.clear();
        selected = Case.TICK_VALUE_NUMERIC_PAIR;
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
        return other instanceof TickValueFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof TickValueFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
