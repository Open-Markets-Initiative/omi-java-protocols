package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.StrikePriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.StrikePriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The StrikePriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class StrikePriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "StrikePriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when StrikePriceFractionIndicator is "A".
         */
        STRIKE_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "B".
         */
        STRIKE_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "C".
         */
        STRIKE_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "D".
         */
        STRIKE_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "E".
         */
        STRIKE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "F".
         */
        STRIKE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "G".
         */
        STRIKE_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        STRIKE_PRICE_NUMERIC_PAIR
    }

    private final StrikePriceNegativeWholePair strikePriceNegativeWholePair = new StrikePriceNegativeWholePair();
    private final StrikePriceNegativeTenPair strikePriceNegativeTenPair = new StrikePriceNegativeTenPair();
    private final StrikePriceNegativeHundredPair strikePriceNegativeHundredPair = new StrikePriceNegativeHundredPair();
    private final StrikePriceNegativeThousandPair strikePriceNegativeThousandPair = new StrikePriceNegativeThousandPair();
    private final StrikePriceNegativeTenThousandPair strikePriceNegativeTenThousandPair = new StrikePriceNegativeTenThousandPair();
    private final StrikePriceNegativeHundredThousandPair strikePriceNegativeHundredThousandPair = new StrikePriceNegativeHundredThousandPair();
    private final StrikePriceNegativeMillionPair strikePriceNegativeMillionPair = new StrikePriceNegativeMillionPair();
    private final StrikePriceNumericPair strikePriceNumericPair = new StrikePriceNumericPair();
    private Case selected = Case.STRIKE_PRICE_NUMERIC_PAIR;

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
            case STRIKE_PRICE_NEGATIVE_WHOLE_PAIR -> strikePriceNegativeWholePair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_WHOLE);
            case STRIKE_PRICE_NEGATIVE_TEN_PAIR -> strikePriceNegativeTenPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_TEN);
            case STRIKE_PRICE_NEGATIVE_HUNDRED_PAIR -> strikePriceNegativeHundredPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_HUNDRED);
            case STRIKE_PRICE_NEGATIVE_THOUSAND_PAIR -> strikePriceNegativeThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_THOUSAND);
            case STRIKE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> strikePriceNegativeTenThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case STRIKE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> strikePriceNegativeHundredThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case STRIKE_PRICE_NEGATIVE_MILLION_PAIR -> strikePriceNegativeMillionPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_MILLION);
            case STRIKE_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the StrikePriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeWholePair strikePriceNegativeWholePair() {
        return strikePriceNegativeWholePair;
    }

    /**
     * Returns the StrikePriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeTenPair strikePriceNegativeTenPair() {
        return strikePriceNegativeTenPair;
    }

    /**
     * Returns the StrikePriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeHundredPair strikePriceNegativeHundredPair() {
        return strikePriceNegativeHundredPair;
    }

    /**
     * Returns the StrikePriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeThousandPair strikePriceNegativeThousandPair() {
        return strikePriceNegativeThousandPair;
    }

    /**
     * Returns the StrikePriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeTenThousandPair strikePriceNegativeTenThousandPair() {
        return strikePriceNegativeTenThousandPair;
    }

    /**
     * Returns the StrikePriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeHundredThousandPair strikePriceNegativeHundredThousandPair() {
        return strikePriceNegativeHundredThousandPair;
    }

    /**
     * Returns the StrikePriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNegativeMillionPair strikePriceNegativeMillionPair() {
        return strikePriceNegativeMillionPair;
    }

    /**
     * Returns the StrikePriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceNumericPair strikePriceNumericPair() {
        return strikePriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case STRIKE_PRICE_NEGATIVE_WHOLE_PAIR -> strikePriceNegativeWholePair;
            case STRIKE_PRICE_NEGATIVE_TEN_PAIR -> strikePriceNegativeTenPair;
            case STRIKE_PRICE_NEGATIVE_HUNDRED_PAIR -> strikePriceNegativeHundredPair;
            case STRIKE_PRICE_NEGATIVE_THOUSAND_PAIR -> strikePriceNegativeThousandPair;
            case STRIKE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> strikePriceNegativeTenThousandPair;
            case STRIKE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> strikePriceNegativeHundredThousandPair;
            case STRIKE_PRICE_NEGATIVE_MILLION_PAIR -> strikePriceNegativeMillionPair;
            case STRIKE_PRICE_NUMERIC_PAIR -> strikePriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.STRIKE_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.STRIKE_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.STRIKE_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.STRIKE_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.STRIKE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.STRIKE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.STRIKE_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.STRIKE_PRICE_NUMERIC_PAIR;
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
        strikePriceNegativeWholePair.clear();
        strikePriceNegativeTenPair.clear();
        strikePriceNegativeHundredPair.clear();
        strikePriceNegativeThousandPair.clear();
        strikePriceNegativeTenThousandPair.clear();
        strikePriceNegativeHundredThousandPair.clear();
        strikePriceNegativeMillionPair.clear();
        strikePriceNumericPair.clear();
        selected = Case.STRIKE_PRICE_NUMERIC_PAIR;
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
        return other instanceof StrikePriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof StrikePriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
