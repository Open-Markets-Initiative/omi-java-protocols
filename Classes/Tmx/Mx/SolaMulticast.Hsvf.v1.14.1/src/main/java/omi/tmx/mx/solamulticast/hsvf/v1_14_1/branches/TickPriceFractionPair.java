package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.TickPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TickPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The TickPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class TickPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "TickPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when TickPriceFractionIndicator is "A".
         */
        TICK_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "B".
         */
        TICK_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "C".
         */
        TICK_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "D".
         */
        TICK_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "E".
         */
        TICK_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "F".
         */
        TICK_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when TickPriceFractionIndicator is "G".
         */
        TICK_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        TICK_PRICE_NUMERIC_PAIR
    }

    private final TickPriceNegativeWholePair tickPriceNegativeWholePair = new TickPriceNegativeWholePair();
    private final TickPriceNegativeTenPair tickPriceNegativeTenPair = new TickPriceNegativeTenPair();
    private final TickPriceNegativeHundredPair tickPriceNegativeHundredPair = new TickPriceNegativeHundredPair();
    private final TickPriceNegativeThousandPair tickPriceNegativeThousandPair = new TickPriceNegativeThousandPair();
    private final TickPriceNegativeTenThousandPair tickPriceNegativeTenThousandPair = new TickPriceNegativeTenThousandPair();
    private final TickPriceNegativeHundredThousandPair tickPriceNegativeHundredThousandPair = new TickPriceNegativeHundredThousandPair();
    private final TickPriceNegativeMillionPair tickPriceNegativeMillionPair = new TickPriceNegativeMillionPair();
    private final TickPriceNumericPair tickPriceNumericPair = new TickPriceNumericPair();
    private Case selected = Case.TICK_PRICE_NUMERIC_PAIR;

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
            case TICK_PRICE_NEGATIVE_WHOLE_PAIR -> tickPriceNegativeWholePair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_WHOLE);
            case TICK_PRICE_NEGATIVE_TEN_PAIR -> tickPriceNegativeTenPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_TEN);
            case TICK_PRICE_NEGATIVE_HUNDRED_PAIR -> tickPriceNegativeHundredPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_HUNDRED);
            case TICK_PRICE_NEGATIVE_THOUSAND_PAIR -> tickPriceNegativeThousandPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_THOUSAND);
            case TICK_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> tickPriceNegativeTenThousandPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case TICK_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickPriceNegativeHundredThousandPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case TICK_PRICE_NEGATIVE_MILLION_PAIR -> tickPriceNegativeMillionPair.tickPriceFractionIndicator().value(TickPriceFractionIndicator.NEGATIVE_MILLION);
            case TICK_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the TickPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeWholePair tickPriceNegativeWholePair() {
        return tickPriceNegativeWholePair;
    }

    /**
     * Returns the TickPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeTenPair tickPriceNegativeTenPair() {
        return tickPriceNegativeTenPair;
    }

    /**
     * Returns the TickPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeHundredPair tickPriceNegativeHundredPair() {
        return tickPriceNegativeHundredPair;
    }

    /**
     * Returns the TickPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeThousandPair tickPriceNegativeThousandPair() {
        return tickPriceNegativeThousandPair;
    }

    /**
     * Returns the TickPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeTenThousandPair tickPriceNegativeTenThousandPair() {
        return tickPriceNegativeTenThousandPair;
    }

    /**
     * Returns the TickPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeHundredThousandPair tickPriceNegativeHundredThousandPair() {
        return tickPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the TickPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNegativeMillionPair tickPriceNegativeMillionPair() {
        return tickPriceNegativeMillionPair;
    }

    /**
     * Returns the TickPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TickPriceNumericPair tickPriceNumericPair() {
        return tickPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case TICK_PRICE_NEGATIVE_WHOLE_PAIR -> tickPriceNegativeWholePair;
            case TICK_PRICE_NEGATIVE_TEN_PAIR -> tickPriceNegativeTenPair;
            case TICK_PRICE_NEGATIVE_HUNDRED_PAIR -> tickPriceNegativeHundredPair;
            case TICK_PRICE_NEGATIVE_THOUSAND_PAIR -> tickPriceNegativeThousandPair;
            case TICK_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> tickPriceNegativeTenThousandPair;
            case TICK_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tickPriceNegativeHundredThousandPair;
            case TICK_PRICE_NEGATIVE_MILLION_PAIR -> tickPriceNegativeMillionPair;
            case TICK_PRICE_NUMERIC_PAIR -> tickPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.TICK_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.TICK_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.TICK_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.TICK_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.TICK_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.TICK_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.TICK_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.TICK_PRICE_NUMERIC_PAIR;
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
        tickPriceNegativeWholePair.clear();
        tickPriceNegativeTenPair.clear();
        tickPriceNegativeHundredPair.clear();
        tickPriceNegativeThousandPair.clear();
        tickPriceNegativeTenThousandPair.clear();
        tickPriceNegativeHundredThousandPair.clear();
        tickPriceNegativeMillionPair.clear();
        tickPriceNumericPair.clear();
        selected = Case.TICK_PRICE_NUMERIC_PAIR;
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
        return other instanceof TickPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof TickPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
