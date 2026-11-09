package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.LegPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LegPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The LegPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class LegPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "LegPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when LegPriceFractionIndicator is "A".
         */
        LEG_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "B".
         */
        LEG_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "C".
         */
        LEG_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "D".
         */
        LEG_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "E".
         */
        LEG_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "F".
         */
        LEG_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when LegPriceFractionIndicator is "G".
         */
        LEG_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        LEG_PRICE_NUMERIC_PAIR
    }

    private final LegPriceNegativeWholePair legPriceNegativeWholePair = new LegPriceNegativeWholePair();
    private final LegPriceNegativeTenPair legPriceNegativeTenPair = new LegPriceNegativeTenPair();
    private final LegPriceNegativeHundredPair legPriceNegativeHundredPair = new LegPriceNegativeHundredPair();
    private final LegPriceNegativeThousandPair legPriceNegativeThousandPair = new LegPriceNegativeThousandPair();
    private final LegPriceNegativeTenThousandPair legPriceNegativeTenThousandPair = new LegPriceNegativeTenThousandPair();
    private final LegPriceNegativeHundredThousandPair legPriceNegativeHundredThousandPair = new LegPriceNegativeHundredThousandPair();
    private final LegPriceNegativeMillionPair legPriceNegativeMillionPair = new LegPriceNegativeMillionPair();
    private final LegPriceNumericPair legPriceNumericPair = new LegPriceNumericPair();
    private Case selected = Case.LEG_PRICE_NUMERIC_PAIR;

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
            case LEG_PRICE_NEGATIVE_WHOLE_PAIR -> legPriceNegativeWholePair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_WHOLE);
            case LEG_PRICE_NEGATIVE_TEN_PAIR -> legPriceNegativeTenPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_TEN);
            case LEG_PRICE_NEGATIVE_HUNDRED_PAIR -> legPriceNegativeHundredPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_HUNDRED);
            case LEG_PRICE_NEGATIVE_THOUSAND_PAIR -> legPriceNegativeThousandPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_THOUSAND);
            case LEG_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> legPriceNegativeTenThousandPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case LEG_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> legPriceNegativeHundredThousandPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case LEG_PRICE_NEGATIVE_MILLION_PAIR -> legPriceNegativeMillionPair.legPriceFractionIndicator().value(LegPriceFractionIndicator.NEGATIVE_MILLION);
            case LEG_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the LegPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeWholePair legPriceNegativeWholePair() {
        return legPriceNegativeWholePair;
    }

    /**
     * Returns the LegPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeTenPair legPriceNegativeTenPair() {
        return legPriceNegativeTenPair;
    }

    /**
     * Returns the LegPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeHundredPair legPriceNegativeHundredPair() {
        return legPriceNegativeHundredPair;
    }

    /**
     * Returns the LegPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeThousandPair legPriceNegativeThousandPair() {
        return legPriceNegativeThousandPair;
    }

    /**
     * Returns the LegPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeTenThousandPair legPriceNegativeTenThousandPair() {
        return legPriceNegativeTenThousandPair;
    }

    /**
     * Returns the LegPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeHundredThousandPair legPriceNegativeHundredThousandPair() {
        return legPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the LegPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNegativeMillionPair legPriceNegativeMillionPair() {
        return legPriceNegativeMillionPair;
    }

    /**
     * Returns the LegPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LegPriceNumericPair legPriceNumericPair() {
        return legPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case LEG_PRICE_NEGATIVE_WHOLE_PAIR -> legPriceNegativeWholePair;
            case LEG_PRICE_NEGATIVE_TEN_PAIR -> legPriceNegativeTenPair;
            case LEG_PRICE_NEGATIVE_HUNDRED_PAIR -> legPriceNegativeHundredPair;
            case LEG_PRICE_NEGATIVE_THOUSAND_PAIR -> legPriceNegativeThousandPair;
            case LEG_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> legPriceNegativeTenThousandPair;
            case LEG_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> legPriceNegativeHundredThousandPair;
            case LEG_PRICE_NEGATIVE_MILLION_PAIR -> legPriceNegativeMillionPair;
            case LEG_PRICE_NUMERIC_PAIR -> legPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.LEG_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.LEG_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.LEG_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.LEG_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.LEG_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.LEG_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.LEG_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.LEG_PRICE_NUMERIC_PAIR;
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
        legPriceNegativeWholePair.clear();
        legPriceNegativeTenPair.clear();
        legPriceNegativeHundredPair.clear();
        legPriceNegativeThousandPair.clear();
        legPriceNegativeTenThousandPair.clear();
        legPriceNegativeHundredThousandPair.clear();
        legPriceNegativeMillionPair.clear();
        legPriceNumericPair.clear();
        selected = Case.LEG_PRICE_NUMERIC_PAIR;
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
        return other instanceof LegPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof LegPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
