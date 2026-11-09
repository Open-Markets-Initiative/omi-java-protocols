package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.OpenPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OpenPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The OpenPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OpenPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OpenPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when OpenPriceFractionIndicator is "A".
         */
        OPEN_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "B".
         */
        OPEN_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "C".
         */
        OPEN_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "D".
         */
        OPEN_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "E".
         */
        OPEN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "F".
         */
        OPEN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when OpenPriceFractionIndicator is "G".
         */
        OPEN_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        OPEN_PRICE_NUMERIC_PAIR
    }

    private final OpenPriceNegativeWholePair openPriceNegativeWholePair = new OpenPriceNegativeWholePair();
    private final OpenPriceNegativeTenPair openPriceNegativeTenPair = new OpenPriceNegativeTenPair();
    private final OpenPriceNegativeHundredPair openPriceNegativeHundredPair = new OpenPriceNegativeHundredPair();
    private final OpenPriceNegativeThousandPair openPriceNegativeThousandPair = new OpenPriceNegativeThousandPair();
    private final OpenPriceNegativeTenThousandPair openPriceNegativeTenThousandPair = new OpenPriceNegativeTenThousandPair();
    private final OpenPriceNegativeHundredThousandPair openPriceNegativeHundredThousandPair = new OpenPriceNegativeHundredThousandPair();
    private final OpenPriceNegativeMillionPair openPriceNegativeMillionPair = new OpenPriceNegativeMillionPair();
    private final OpenPriceNumericPair openPriceNumericPair = new OpenPriceNumericPair();
    private Case selected = Case.OPEN_PRICE_NUMERIC_PAIR;

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
            case OPEN_PRICE_NEGATIVE_WHOLE_PAIR -> openPriceNegativeWholePair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_WHOLE);
            case OPEN_PRICE_NEGATIVE_TEN_PAIR -> openPriceNegativeTenPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_TEN);
            case OPEN_PRICE_NEGATIVE_HUNDRED_PAIR -> openPriceNegativeHundredPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_HUNDRED);
            case OPEN_PRICE_NEGATIVE_THOUSAND_PAIR -> openPriceNegativeThousandPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_THOUSAND);
            case OPEN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> openPriceNegativeTenThousandPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case OPEN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> openPriceNegativeHundredThousandPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case OPEN_PRICE_NEGATIVE_MILLION_PAIR -> openPriceNegativeMillionPair.openPriceFractionIndicator().value(OpenPriceFractionIndicator.NEGATIVE_MILLION);
            case OPEN_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the OpenPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeWholePair openPriceNegativeWholePair() {
        return openPriceNegativeWholePair;
    }

    /**
     * Returns the OpenPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeTenPair openPriceNegativeTenPair() {
        return openPriceNegativeTenPair;
    }

    /**
     * Returns the OpenPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeHundredPair openPriceNegativeHundredPair() {
        return openPriceNegativeHundredPair;
    }

    /**
     * Returns the OpenPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeThousandPair openPriceNegativeThousandPair() {
        return openPriceNegativeThousandPair;
    }

    /**
     * Returns the OpenPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeTenThousandPair openPriceNegativeTenThousandPair() {
        return openPriceNegativeTenThousandPair;
    }

    /**
     * Returns the OpenPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeHundredThousandPair openPriceNegativeHundredThousandPair() {
        return openPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the OpenPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNegativeMillionPair openPriceNegativeMillionPair() {
        return openPriceNegativeMillionPair;
    }

    /**
     * Returns the OpenPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OpenPriceNumericPair openPriceNumericPair() {
        return openPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case OPEN_PRICE_NEGATIVE_WHOLE_PAIR -> openPriceNegativeWholePair;
            case OPEN_PRICE_NEGATIVE_TEN_PAIR -> openPriceNegativeTenPair;
            case OPEN_PRICE_NEGATIVE_HUNDRED_PAIR -> openPriceNegativeHundredPair;
            case OPEN_PRICE_NEGATIVE_THOUSAND_PAIR -> openPriceNegativeThousandPair;
            case OPEN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> openPriceNegativeTenThousandPair;
            case OPEN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> openPriceNegativeHundredThousandPair;
            case OPEN_PRICE_NEGATIVE_MILLION_PAIR -> openPriceNegativeMillionPair;
            case OPEN_PRICE_NUMERIC_PAIR -> openPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.OPEN_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.OPEN_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.OPEN_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.OPEN_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.OPEN_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.OPEN_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.OPEN_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.OPEN_PRICE_NUMERIC_PAIR;
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
        openPriceNegativeWholePair.clear();
        openPriceNegativeTenPair.clear();
        openPriceNegativeHundredPair.clear();
        openPriceNegativeThousandPair.clear();
        openPriceNegativeTenThousandPair.clear();
        openPriceNegativeHundredThousandPair.clear();
        openPriceNegativeMillionPair.clear();
        openPriceNumericPair.clear();
        selected = Case.OPEN_PRICE_NUMERIC_PAIR;
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
        return other instanceof OpenPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OpenPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
