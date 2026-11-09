package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.HighPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.HighPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The HighPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class HighPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "HighPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when HighPriceFractionIndicator is "A".
         */
        HIGH_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "B".
         */
        HIGH_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "C".
         */
        HIGH_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "D".
         */
        HIGH_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "E".
         */
        HIGH_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "F".
         */
        HIGH_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when HighPriceFractionIndicator is "G".
         */
        HIGH_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        HIGH_PRICE_NUMERIC_PAIR
    }

    private final HighPriceNegativeWholePair highPriceNegativeWholePair = new HighPriceNegativeWholePair();
    private final HighPriceNegativeTenPair highPriceNegativeTenPair = new HighPriceNegativeTenPair();
    private final HighPriceNegativeHundredPair highPriceNegativeHundredPair = new HighPriceNegativeHundredPair();
    private final HighPriceNegativeThousandPair highPriceNegativeThousandPair = new HighPriceNegativeThousandPair();
    private final HighPriceNegativeTenThousandPair highPriceNegativeTenThousandPair = new HighPriceNegativeTenThousandPair();
    private final HighPriceNegativeHundredThousandPair highPriceNegativeHundredThousandPair = new HighPriceNegativeHundredThousandPair();
    private final HighPriceNegativeMillionPair highPriceNegativeMillionPair = new HighPriceNegativeMillionPair();
    private final HighPriceNumericPair highPriceNumericPair = new HighPriceNumericPair();
    private Case selected = Case.HIGH_PRICE_NUMERIC_PAIR;

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
            case HIGH_PRICE_NEGATIVE_WHOLE_PAIR -> highPriceNegativeWholePair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_WHOLE);
            case HIGH_PRICE_NEGATIVE_TEN_PAIR -> highPriceNegativeTenPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_TEN);
            case HIGH_PRICE_NEGATIVE_HUNDRED_PAIR -> highPriceNegativeHundredPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_HUNDRED);
            case HIGH_PRICE_NEGATIVE_THOUSAND_PAIR -> highPriceNegativeThousandPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_THOUSAND);
            case HIGH_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> highPriceNegativeTenThousandPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case HIGH_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> highPriceNegativeHundredThousandPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case HIGH_PRICE_NEGATIVE_MILLION_PAIR -> highPriceNegativeMillionPair.highPriceFractionIndicator().value(HighPriceFractionIndicator.NEGATIVE_MILLION);
            case HIGH_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the HighPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeWholePair highPriceNegativeWholePair() {
        return highPriceNegativeWholePair;
    }

    /**
     * Returns the HighPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeTenPair highPriceNegativeTenPair() {
        return highPriceNegativeTenPair;
    }

    /**
     * Returns the HighPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeHundredPair highPriceNegativeHundredPair() {
        return highPriceNegativeHundredPair;
    }

    /**
     * Returns the HighPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeThousandPair highPriceNegativeThousandPair() {
        return highPriceNegativeThousandPair;
    }

    /**
     * Returns the HighPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeTenThousandPair highPriceNegativeTenThousandPair() {
        return highPriceNegativeTenThousandPair;
    }

    /**
     * Returns the HighPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeHundredThousandPair highPriceNegativeHundredThousandPair() {
        return highPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the HighPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNegativeMillionPair highPriceNegativeMillionPair() {
        return highPriceNegativeMillionPair;
    }

    /**
     * Returns the HighPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HighPriceNumericPair highPriceNumericPair() {
        return highPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case HIGH_PRICE_NEGATIVE_WHOLE_PAIR -> highPriceNegativeWholePair;
            case HIGH_PRICE_NEGATIVE_TEN_PAIR -> highPriceNegativeTenPair;
            case HIGH_PRICE_NEGATIVE_HUNDRED_PAIR -> highPriceNegativeHundredPair;
            case HIGH_PRICE_NEGATIVE_THOUSAND_PAIR -> highPriceNegativeThousandPair;
            case HIGH_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> highPriceNegativeTenThousandPair;
            case HIGH_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> highPriceNegativeHundredThousandPair;
            case HIGH_PRICE_NEGATIVE_MILLION_PAIR -> highPriceNegativeMillionPair;
            case HIGH_PRICE_NUMERIC_PAIR -> highPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.HIGH_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.HIGH_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.HIGH_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.HIGH_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.HIGH_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.HIGH_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.HIGH_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.HIGH_PRICE_NUMERIC_PAIR;
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
        highPriceNegativeWholePair.clear();
        highPriceNegativeTenPair.clear();
        highPriceNegativeHundredPair.clear();
        highPriceNegativeThousandPair.clear();
        highPriceNegativeTenThousandPair.clear();
        highPriceNegativeHundredThousandPair.clear();
        highPriceNegativeMillionPair.clear();
        highPriceNumericPair.clear();
        selected = Case.HIGH_PRICE_NUMERIC_PAIR;
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
        return other instanceof HighPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof HighPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
