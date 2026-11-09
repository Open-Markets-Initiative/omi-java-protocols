package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.InitialOrderPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.InitialOrderPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The InitialOrderPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class InitialOrderPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "InitialOrderPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when InitialOrderPriceFractionIndicator is "A".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "B".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "C".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "D".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "E".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "F".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when InitialOrderPriceFractionIndicator is "G".
         */
        INITIAL_ORDER_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        INITIAL_ORDER_PRICE_NUMERIC_PAIR
    }

    private final InitialOrderPriceNegativeWholePair initialOrderPriceNegativeWholePair = new InitialOrderPriceNegativeWholePair();
    private final InitialOrderPriceNegativeTenPair initialOrderPriceNegativeTenPair = new InitialOrderPriceNegativeTenPair();
    private final InitialOrderPriceNegativeHundredPair initialOrderPriceNegativeHundredPair = new InitialOrderPriceNegativeHundredPair();
    private final InitialOrderPriceNegativeThousandPair initialOrderPriceNegativeThousandPair = new InitialOrderPriceNegativeThousandPair();
    private final InitialOrderPriceNegativeTenThousandPair initialOrderPriceNegativeTenThousandPair = new InitialOrderPriceNegativeTenThousandPair();
    private final InitialOrderPriceNegativeHundredThousandPair initialOrderPriceNegativeHundredThousandPair = new InitialOrderPriceNegativeHundredThousandPair();
    private final InitialOrderPriceNegativeMillionPair initialOrderPriceNegativeMillionPair = new InitialOrderPriceNegativeMillionPair();
    private final InitialOrderPriceNumericPair initialOrderPriceNumericPair = new InitialOrderPriceNumericPair();
    private Case selected = Case.INITIAL_ORDER_PRICE_NUMERIC_PAIR;

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
            case INITIAL_ORDER_PRICE_NEGATIVE_WHOLE_PAIR -> initialOrderPriceNegativeWholePair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_WHOLE);
            case INITIAL_ORDER_PRICE_NEGATIVE_TEN_PAIR -> initialOrderPriceNegativeTenPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_TEN);
            case INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_PAIR -> initialOrderPriceNegativeHundredPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_HUNDRED);
            case INITIAL_ORDER_PRICE_NEGATIVE_THOUSAND_PAIR -> initialOrderPriceNegativeThousandPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_THOUSAND);
            case INITIAL_ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> initialOrderPriceNegativeTenThousandPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> initialOrderPriceNegativeHundredThousandPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case INITIAL_ORDER_PRICE_NEGATIVE_MILLION_PAIR -> initialOrderPriceNegativeMillionPair.initialOrderPriceFractionIndicator().value(InitialOrderPriceFractionIndicator.NEGATIVE_MILLION);
            case INITIAL_ORDER_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the InitialOrderPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeWholePair initialOrderPriceNegativeWholePair() {
        return initialOrderPriceNegativeWholePair;
    }

    /**
     * Returns the InitialOrderPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeTenPair initialOrderPriceNegativeTenPair() {
        return initialOrderPriceNegativeTenPair;
    }

    /**
     * Returns the InitialOrderPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeHundredPair initialOrderPriceNegativeHundredPair() {
        return initialOrderPriceNegativeHundredPair;
    }

    /**
     * Returns the InitialOrderPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeThousandPair initialOrderPriceNegativeThousandPair() {
        return initialOrderPriceNegativeThousandPair;
    }

    /**
     * Returns the InitialOrderPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeTenThousandPair initialOrderPriceNegativeTenThousandPair() {
        return initialOrderPriceNegativeTenThousandPair;
    }

    /**
     * Returns the InitialOrderPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeHundredThousandPair initialOrderPriceNegativeHundredThousandPair() {
        return initialOrderPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the InitialOrderPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNegativeMillionPair initialOrderPriceNegativeMillionPair() {
        return initialOrderPriceNegativeMillionPair;
    }

    /**
     * Returns the InitialOrderPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public InitialOrderPriceNumericPair initialOrderPriceNumericPair() {
        return initialOrderPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case INITIAL_ORDER_PRICE_NEGATIVE_WHOLE_PAIR -> initialOrderPriceNegativeWholePair;
            case INITIAL_ORDER_PRICE_NEGATIVE_TEN_PAIR -> initialOrderPriceNegativeTenPair;
            case INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_PAIR -> initialOrderPriceNegativeHundredPair;
            case INITIAL_ORDER_PRICE_NEGATIVE_THOUSAND_PAIR -> initialOrderPriceNegativeThousandPair;
            case INITIAL_ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> initialOrderPriceNegativeTenThousandPair;
            case INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> initialOrderPriceNegativeHundredThousandPair;
            case INITIAL_ORDER_PRICE_NEGATIVE_MILLION_PAIR -> initialOrderPriceNegativeMillionPair;
            case INITIAL_ORDER_PRICE_NUMERIC_PAIR -> initialOrderPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.INITIAL_ORDER_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.INITIAL_ORDER_PRICE_NUMERIC_PAIR;
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
        initialOrderPriceNegativeWholePair.clear();
        initialOrderPriceNegativeTenPair.clear();
        initialOrderPriceNegativeHundredPair.clear();
        initialOrderPriceNegativeThousandPair.clear();
        initialOrderPriceNegativeTenThousandPair.clear();
        initialOrderPriceNegativeHundredThousandPair.clear();
        initialOrderPriceNegativeMillionPair.clear();
        initialOrderPriceNumericPair.clear();
        selected = Case.INITIAL_ORDER_PRICE_NUMERIC_PAIR;
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
        return other instanceof InitialOrderPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof InitialOrderPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
