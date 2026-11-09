package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.LastPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.LastPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The LastPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class LastPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "LastPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when LastPriceFractionIndicator is "A".
         */
        LAST_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "B".
         */
        LAST_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "C".
         */
        LAST_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "D".
         */
        LAST_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "E".
         */
        LAST_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "F".
         */
        LAST_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "G".
         */
        LAST_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        LAST_PRICE_NUMERIC_PAIR
    }

    private final LastPriceNegativeWholePair lastPriceNegativeWholePair = new LastPriceNegativeWholePair();
    private final LastPriceNegativeTenPair lastPriceNegativeTenPair = new LastPriceNegativeTenPair();
    private final LastPriceNegativeHundredPair lastPriceNegativeHundredPair = new LastPriceNegativeHundredPair();
    private final LastPriceNegativeThousandPair lastPriceNegativeThousandPair = new LastPriceNegativeThousandPair();
    private final LastPriceNegativeTenThousandPair lastPriceNegativeTenThousandPair = new LastPriceNegativeTenThousandPair();
    private final LastPriceNegativeHundredThousandPair lastPriceNegativeHundredThousandPair = new LastPriceNegativeHundredThousandPair();
    private final LastPriceNegativeMillionPair lastPriceNegativeMillionPair = new LastPriceNegativeMillionPair();
    private final LastPriceNumericPair lastPriceNumericPair = new LastPriceNumericPair();
    private Case selected = Case.LAST_PRICE_NUMERIC_PAIR;

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
            case LAST_PRICE_NEGATIVE_WHOLE_PAIR -> lastPriceNegativeWholePair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_WHOLE);
            case LAST_PRICE_NEGATIVE_TEN_PAIR -> lastPriceNegativeTenPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_TEN);
            case LAST_PRICE_NEGATIVE_HUNDRED_PAIR -> lastPriceNegativeHundredPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_HUNDRED);
            case LAST_PRICE_NEGATIVE_THOUSAND_PAIR -> lastPriceNegativeThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_THOUSAND);
            case LAST_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> lastPriceNegativeTenThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case LAST_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> lastPriceNegativeHundredThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case LAST_PRICE_NEGATIVE_MILLION_PAIR -> lastPriceNegativeMillionPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_MILLION);
            case LAST_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the LastPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeWholePair lastPriceNegativeWholePair() {
        return lastPriceNegativeWholePair;
    }

    /**
     * Returns the LastPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeTenPair lastPriceNegativeTenPair() {
        return lastPriceNegativeTenPair;
    }

    /**
     * Returns the LastPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeHundredPair lastPriceNegativeHundredPair() {
        return lastPriceNegativeHundredPair;
    }

    /**
     * Returns the LastPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeThousandPair lastPriceNegativeThousandPair() {
        return lastPriceNegativeThousandPair;
    }

    /**
     * Returns the LastPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeTenThousandPair lastPriceNegativeTenThousandPair() {
        return lastPriceNegativeTenThousandPair;
    }

    /**
     * Returns the LastPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeHundredThousandPair lastPriceNegativeHundredThousandPair() {
        return lastPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the LastPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNegativeMillionPair lastPriceNegativeMillionPair() {
        return lastPriceNegativeMillionPair;
    }

    /**
     * Returns the LastPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceNumericPair lastPriceNumericPair() {
        return lastPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case LAST_PRICE_NEGATIVE_WHOLE_PAIR -> lastPriceNegativeWholePair;
            case LAST_PRICE_NEGATIVE_TEN_PAIR -> lastPriceNegativeTenPair;
            case LAST_PRICE_NEGATIVE_HUNDRED_PAIR -> lastPriceNegativeHundredPair;
            case LAST_PRICE_NEGATIVE_THOUSAND_PAIR -> lastPriceNegativeThousandPair;
            case LAST_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> lastPriceNegativeTenThousandPair;
            case LAST_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> lastPriceNegativeHundredThousandPair;
            case LAST_PRICE_NEGATIVE_MILLION_PAIR -> lastPriceNegativeMillionPair;
            case LAST_PRICE_NUMERIC_PAIR -> lastPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.LAST_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.LAST_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.LAST_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.LAST_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.LAST_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.LAST_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.LAST_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.LAST_PRICE_NUMERIC_PAIR;
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
        lastPriceNegativeWholePair.clear();
        lastPriceNegativeTenPair.clear();
        lastPriceNegativeHundredPair.clear();
        lastPriceNegativeThousandPair.clear();
        lastPriceNegativeTenThousandPair.clear();
        lastPriceNegativeHundredThousandPair.clear();
        lastPriceNegativeMillionPair.clear();
        lastPriceNumericPair.clear();
        selected = Case.LAST_PRICE_NUMERIC_PAIR;
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
        return other instanceof LastPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof LastPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
