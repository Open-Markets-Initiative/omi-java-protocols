package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.ClosingPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ClosingPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The ClosingPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ClosingPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ClosingPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when ClosingPriceFractionIndicator is "A".
         */
        CLOSING_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "B".
         */
        CLOSING_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "C".
         */
        CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "D".
         */
        CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "E".
         */
        CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "F".
         */
        CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when ClosingPriceFractionIndicator is "G".
         */
        CLOSING_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        CLOSING_PRICE_NUMERIC_PAIR
    }

    private final ClosingPriceNegativeWholePair closingPriceNegativeWholePair = new ClosingPriceNegativeWholePair();
    private final ClosingPriceNegativeTenPair closingPriceNegativeTenPair = new ClosingPriceNegativeTenPair();
    private final ClosingPriceNegativeHundredPair closingPriceNegativeHundredPair = new ClosingPriceNegativeHundredPair();
    private final ClosingPriceNegativeThousandPair closingPriceNegativeThousandPair = new ClosingPriceNegativeThousandPair();
    private final ClosingPriceNegativeTenThousandPair closingPriceNegativeTenThousandPair = new ClosingPriceNegativeTenThousandPair();
    private final ClosingPriceNegativeHundredThousandPair closingPriceNegativeHundredThousandPair = new ClosingPriceNegativeHundredThousandPair();
    private final ClosingPriceNegativeMillionPair closingPriceNegativeMillionPair = new ClosingPriceNegativeMillionPair();
    private final ClosingPriceNumericPair closingPriceNumericPair = new ClosingPriceNumericPair();
    private Case selected = Case.CLOSING_PRICE_NUMERIC_PAIR;

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
            case CLOSING_PRICE_NEGATIVE_WHOLE_PAIR -> closingPriceNegativeWholePair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_WHOLE);
            case CLOSING_PRICE_NEGATIVE_TEN_PAIR -> closingPriceNegativeTenPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_TEN);
            case CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR -> closingPriceNegativeHundredPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_HUNDRED);
            case CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR -> closingPriceNegativeThousandPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_THOUSAND);
            case CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> closingPriceNegativeTenThousandPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> closingPriceNegativeHundredThousandPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case CLOSING_PRICE_NEGATIVE_MILLION_PAIR -> closingPriceNegativeMillionPair.closingPriceFractionIndicator().value(ClosingPriceFractionIndicator.NEGATIVE_MILLION);
            case CLOSING_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the ClosingPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeWholePair closingPriceNegativeWholePair() {
        return closingPriceNegativeWholePair;
    }

    /**
     * Returns the ClosingPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeTenPair closingPriceNegativeTenPair() {
        return closingPriceNegativeTenPair;
    }

    /**
     * Returns the ClosingPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeHundredPair closingPriceNegativeHundredPair() {
        return closingPriceNegativeHundredPair;
    }

    /**
     * Returns the ClosingPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeThousandPair closingPriceNegativeThousandPair() {
        return closingPriceNegativeThousandPair;
    }

    /**
     * Returns the ClosingPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeTenThousandPair closingPriceNegativeTenThousandPair() {
        return closingPriceNegativeTenThousandPair;
    }

    /**
     * Returns the ClosingPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeHundredThousandPair closingPriceNegativeHundredThousandPair() {
        return closingPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the ClosingPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNegativeMillionPair closingPriceNegativeMillionPair() {
        return closingPriceNegativeMillionPair;
    }

    /**
     * Returns the ClosingPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ClosingPriceNumericPair closingPriceNumericPair() {
        return closingPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case CLOSING_PRICE_NEGATIVE_WHOLE_PAIR -> closingPriceNegativeWholePair;
            case CLOSING_PRICE_NEGATIVE_TEN_PAIR -> closingPriceNegativeTenPair;
            case CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR -> closingPriceNegativeHundredPair;
            case CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR -> closingPriceNegativeThousandPair;
            case CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> closingPriceNegativeTenThousandPair;
            case CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> closingPriceNegativeHundredThousandPair;
            case CLOSING_PRICE_NEGATIVE_MILLION_PAIR -> closingPriceNegativeMillionPair;
            case CLOSING_PRICE_NUMERIC_PAIR -> closingPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.CLOSING_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.CLOSING_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.CLOSING_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.CLOSING_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.CLOSING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.CLOSING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.CLOSING_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.CLOSING_PRICE_NUMERIC_PAIR;
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
        closingPriceNegativeWholePair.clear();
        closingPriceNegativeTenPair.clear();
        closingPriceNegativeHundredPair.clear();
        closingPriceNegativeThousandPair.clear();
        closingPriceNegativeTenThousandPair.clear();
        closingPriceNegativeHundredThousandPair.clear();
        closingPriceNegativeMillionPair.clear();
        closingPriceNumericPair.clear();
        selected = Case.CLOSING_PRICE_NUMERIC_PAIR;
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
        return other instanceof ClosingPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof ClosingPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
