package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.OpeningPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpeningPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The OpeningPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OpeningPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OpeningPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when OpeningPriceFractionIndicator is "A".
         */
        OPENING_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "B".
         */
        OPENING_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "C".
         */
        OPENING_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "D".
         */
        OPENING_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "E".
         */
        OPENING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "F".
         */
        OPENING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when OpeningPriceFractionIndicator is "G".
         */
        OPENING_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        OPENING_PRICE_NUMERIC_PAIR
    }

    private final OpeningPriceNegativeWholePair openingPriceNegativeWholePair = new OpeningPriceNegativeWholePair();
    private final OpeningPriceNegativeTenPair openingPriceNegativeTenPair = new OpeningPriceNegativeTenPair();
    private final OpeningPriceNegativeHundredPair openingPriceNegativeHundredPair = new OpeningPriceNegativeHundredPair();
    private final OpeningPriceNegativeThousandPair openingPriceNegativeThousandPair = new OpeningPriceNegativeThousandPair();
    private final OpeningPriceNegativeTenThousandPair openingPriceNegativeTenThousandPair = new OpeningPriceNegativeTenThousandPair();
    private final OpeningPriceNegativeHundredThousandPair openingPriceNegativeHundredThousandPair = new OpeningPriceNegativeHundredThousandPair();
    private final OpeningPriceNegativeMillionPair openingPriceNegativeMillionPair = new OpeningPriceNegativeMillionPair();
    private final OpeningPriceNumericPair openingPriceNumericPair = new OpeningPriceNumericPair();
    private Case selected = Case.OPENING_PRICE_NUMERIC_PAIR;

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
            case OPENING_PRICE_NEGATIVE_WHOLE_PAIR -> openingPriceNegativeWholePair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_WHOLE);
            case OPENING_PRICE_NEGATIVE_TEN_PAIR -> openingPriceNegativeTenPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_TEN);
            case OPENING_PRICE_NEGATIVE_HUNDRED_PAIR -> openingPriceNegativeHundredPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_HUNDRED);
            case OPENING_PRICE_NEGATIVE_THOUSAND_PAIR -> openingPriceNegativeThousandPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_THOUSAND);
            case OPENING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> openingPriceNegativeTenThousandPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case OPENING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> openingPriceNegativeHundredThousandPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case OPENING_PRICE_NEGATIVE_MILLION_PAIR -> openingPriceNegativeMillionPair.openingPriceFractionIndicator().value(OpeningPriceFractionIndicator.NEGATIVE_MILLION);
            case OPENING_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the OpeningPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeWholePair openingPriceNegativeWholePair() {
        return openingPriceNegativeWholePair;
    }

    /**
     * Returns the OpeningPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeTenPair openingPriceNegativeTenPair() {
        return openingPriceNegativeTenPair;
    }

    /**
     * Returns the OpeningPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeHundredPair openingPriceNegativeHundredPair() {
        return openingPriceNegativeHundredPair;
    }

    /**
     * Returns the OpeningPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeThousandPair openingPriceNegativeThousandPair() {
        return openingPriceNegativeThousandPair;
    }

    /**
     * Returns the OpeningPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeTenThousandPair openingPriceNegativeTenThousandPair() {
        return openingPriceNegativeTenThousandPair;
    }

    /**
     * Returns the OpeningPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeHundredThousandPair openingPriceNegativeHundredThousandPair() {
        return openingPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the OpeningPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNegativeMillionPair openingPriceNegativeMillionPair() {
        return openingPriceNegativeMillionPair;
    }

    /**
     * Returns the OpeningPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpeningPriceNumericPair openingPriceNumericPair() {
        return openingPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case OPENING_PRICE_NEGATIVE_WHOLE_PAIR -> openingPriceNegativeWholePair;
            case OPENING_PRICE_NEGATIVE_TEN_PAIR -> openingPriceNegativeTenPair;
            case OPENING_PRICE_NEGATIVE_HUNDRED_PAIR -> openingPriceNegativeHundredPair;
            case OPENING_PRICE_NEGATIVE_THOUSAND_PAIR -> openingPriceNegativeThousandPair;
            case OPENING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> openingPriceNegativeTenThousandPair;
            case OPENING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> openingPriceNegativeHundredThousandPair;
            case OPENING_PRICE_NEGATIVE_MILLION_PAIR -> openingPriceNegativeMillionPair;
            case OPENING_PRICE_NUMERIC_PAIR -> openingPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.OPENING_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.OPENING_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.OPENING_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.OPENING_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.OPENING_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.OPENING_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.OPENING_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.OPENING_PRICE_NUMERIC_PAIR;
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
        openingPriceNegativeWholePair.clear();
        openingPriceNegativeTenPair.clear();
        openingPriceNegativeHundredPair.clear();
        openingPriceNegativeThousandPair.clear();
        openingPriceNegativeTenThousandPair.clear();
        openingPriceNegativeHundredThousandPair.clear();
        openingPriceNegativeMillionPair.clear();
        openingPriceNumericPair.clear();
        selected = Case.OPENING_PRICE_NUMERIC_PAIR;
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
        return other instanceof OpeningPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OpeningPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
