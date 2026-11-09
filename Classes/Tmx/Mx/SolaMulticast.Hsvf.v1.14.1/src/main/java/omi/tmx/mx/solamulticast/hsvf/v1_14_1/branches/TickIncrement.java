package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.TickIncrementFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickIncrementRawPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The TickIncrement branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Contains the Tick Table Short Name if available. If so, field starts with TT=. Otherwise, indicates precision with which the price of an order limit can be expressed</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class TickIncrement implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "TickIncrement";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when TickIncrementFractionIndicator is "0", or when TickIncrementFractionIndicator is "1", or when TickIncrementFractionIndicator is "2", or when TickIncrementFractionIndicator is "3", or when TickIncrementFractionIndicator is "4", or when TickIncrementFractionIndicator is "5", or when TickIncrementFractionIndicator is "6", or when TickIncrementFractionIndicator is "7", or when TickIncrementFractionIndicator is "8", or when TickIncrementFractionIndicator is "9", or when TickIncrementFractionIndicator is "Z", or when TickIncrementFractionIndicator is "Y", or when TickIncrementFractionIndicator is "X", or when TickIncrementFractionIndicator is "W", or when TickIncrementFractionIndicator is "V", or when TickIncrementFractionIndicator is "U".
         */
        TICK_INCREMENT_NUMERIC_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "A".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "B".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "C".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "D".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "E".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "F".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when TickIncrementFractionIndicator is "G".
         */
        TICK_INCREMENT_NUMERIC_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        TICK_INCREMENT_RAW_PAIR
    }

    private final TickIncrementNumericPair tickIncrementNumericPair = new TickIncrementNumericPair();
    private final TickIncrementNumericNegativeWholePair tickIncrementNumericNegativeWholePair = new TickIncrementNumericNegativeWholePair();
    private final TickIncrementNumericNegativeTenPair tickIncrementNumericNegativeTenPair = new TickIncrementNumericNegativeTenPair();
    private final TickIncrementNumericNegativeHundredPair tickIncrementNumericNegativeHundredPair = new TickIncrementNumericNegativeHundredPair();
    private final TickIncrementNumericNegativeThousandPair tickIncrementNumericNegativeThousandPair = new TickIncrementNumericNegativeThousandPair();
    private final TickIncrementNumericNegativeTenThousandPair tickIncrementNumericNegativeTenThousandPair = new TickIncrementNumericNegativeTenThousandPair();
    private final TickIncrementNumericNegativeHundredThousandPair tickIncrementNumericNegativeHundredThousandPair = new TickIncrementNumericNegativeHundredThousandPair();
    private final TickIncrementNumericNegativeMillionPair tickIncrementNumericNegativeMillionPair = new TickIncrementNumericNegativeMillionPair();
    private final TickIncrementRawPair tickIncrementRawPair = new TickIncrementRawPair();
    private Case selected = Case.TICK_INCREMENT_RAW_PAIR;

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
            case TICK_INCREMENT_NUMERIC_PAIR -> tickIncrementNumericPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.WHOLE);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_WHOLE_PAIR -> tickIncrementNumericNegativeWholePair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_WHOLE);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_PAIR -> tickIncrementNumericNegativeTenPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_TEN);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_PAIR -> tickIncrementNumericNegativeHundredPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_HUNDRED);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_THOUSAND_PAIR -> tickIncrementNumericNegativeThousandPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_THOUSAND);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> tickIncrementNumericNegativeTenThousandPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickIncrementNumericNegativeHundredThousandPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case TICK_INCREMENT_NUMERIC_NEGATIVE_MILLION_PAIR -> tickIncrementNumericNegativeMillionPair.tickIncrementFractionIndicator().value(TickIncrementFractionIndicator.NEGATIVE_MILLION);
            case TICK_INCREMENT_RAW_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the TickIncrementNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericPair tickIncrementNumericPair() {
        return tickIncrementNumericPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeWholePair tickIncrementNumericNegativeWholePair() {
        return tickIncrementNumericNegativeWholePair;
    }

    /**
     * Returns the TickIncrementNumericNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeTenPair tickIncrementNumericNegativeTenPair() {
        return tickIncrementNumericNegativeTenPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeHundredPair tickIncrementNumericNegativeHundredPair() {
        return tickIncrementNumericNegativeHundredPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeThousandPair tickIncrementNumericNegativeThousandPair() {
        return tickIncrementNumericNegativeThousandPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeTenThousandPair tickIncrementNumericNegativeTenThousandPair() {
        return tickIncrementNumericNegativeTenThousandPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeHundredThousandPair tickIncrementNumericNegativeHundredThousandPair() {
        return tickIncrementNumericNegativeHundredThousandPair;
    }

    /**
     * Returns the TickIncrementNumericNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementNumericNegativeMillionPair tickIncrementNumericNegativeMillionPair() {
        return tickIncrementNumericNegativeMillionPair;
    }

    /**
     * Returns the TickIncrementRawPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickIncrementRawPair tickIncrementRawPair() {
        return tickIncrementRawPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case TICK_INCREMENT_NUMERIC_PAIR -> tickIncrementNumericPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_WHOLE_PAIR -> tickIncrementNumericNegativeWholePair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_PAIR -> tickIncrementNumericNegativeTenPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_PAIR -> tickIncrementNumericNegativeHundredPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_THOUSAND_PAIR -> tickIncrementNumericNegativeThousandPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> tickIncrementNumericNegativeTenThousandPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickIncrementNumericNegativeHundredThousandPair;
            case TICK_INCREMENT_NUMERIC_NEGATIVE_MILLION_PAIR -> tickIncrementNumericNegativeMillionPair;
            case TICK_INCREMENT_RAW_PAIR -> tickIncrementRawPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) '0') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '1') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '2') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '3') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '4') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '5') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '6') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '7') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '8') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) '9') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.TICK_INCREMENT_NUMERIC_NEGATIVE_MILLION_PAIR;
        }
        if (data[offset + 7] == (byte) 'Z') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'Y') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'X') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'W') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'V') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        if (data[offset + 7] == (byte) 'U') {
            return Case.TICK_INCREMENT_NUMERIC_PAIR;
        }
        return Case.TICK_INCREMENT_RAW_PAIR;
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
        tickIncrementNumericPair.clear();
        tickIncrementNumericNegativeWholePair.clear();
        tickIncrementNumericNegativeTenPair.clear();
        tickIncrementNumericNegativeHundredPair.clear();
        tickIncrementNumericNegativeThousandPair.clear();
        tickIncrementNumericNegativeTenThousandPair.clear();
        tickIncrementNumericNegativeHundredThousandPair.clear();
        tickIncrementNumericNegativeMillionPair.clear();
        tickIncrementRawPair.clear();
        selected = Case.TICK_INCREMENT_RAW_PAIR;
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
        return other instanceof TickIncrement branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof TickIncrement branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
