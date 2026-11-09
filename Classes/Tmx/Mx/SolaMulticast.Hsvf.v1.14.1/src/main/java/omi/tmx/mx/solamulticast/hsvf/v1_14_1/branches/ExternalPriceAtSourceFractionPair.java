package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.ExternalPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ExternalPriceAtSourceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The ExternalPriceAtSourceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ExternalPriceAtSourceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ExternalPriceAtSourceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when ExternalPriceFractionIndicator is "A".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "B".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "C".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "D".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "E".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "F".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when ExternalPriceFractionIndicator is "G".
         */
        EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR
    }

    private final ExternalPriceAtSourceNegativeWholePair externalPriceAtSourceNegativeWholePair = new ExternalPriceAtSourceNegativeWholePair();
    private final ExternalPriceAtSourceNegativeTenPair externalPriceAtSourceNegativeTenPair = new ExternalPriceAtSourceNegativeTenPair();
    private final ExternalPriceAtSourceNegativeHundredPair externalPriceAtSourceNegativeHundredPair = new ExternalPriceAtSourceNegativeHundredPair();
    private final ExternalPriceAtSourceNegativeThousandPair externalPriceAtSourceNegativeThousandPair = new ExternalPriceAtSourceNegativeThousandPair();
    private final ExternalPriceAtSourceNegativeTenThousandPair externalPriceAtSourceNegativeTenThousandPair = new ExternalPriceAtSourceNegativeTenThousandPair();
    private final ExternalPriceAtSourceNegativeHundredThousandPair externalPriceAtSourceNegativeHundredThousandPair = new ExternalPriceAtSourceNegativeHundredThousandPair();
    private final ExternalPriceAtSourceNegativeMillionPair externalPriceAtSourceNegativeMillionPair = new ExternalPriceAtSourceNegativeMillionPair();
    private final ExternalPriceAtSourceNumericPair externalPriceAtSourceNumericPair = new ExternalPriceAtSourceNumericPair();
    private Case selected = Case.EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR;

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
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_WHOLE_PAIR -> externalPriceAtSourceNegativeWholePair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_WHOLE);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_PAIR -> externalPriceAtSourceNegativeTenPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_TEN);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_PAIR -> externalPriceAtSourceNegativeHundredPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_HUNDRED);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_THOUSAND_PAIR -> externalPriceAtSourceNegativeThousandPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_THOUSAND);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_THOUSAND_PAIR -> externalPriceAtSourceNegativeTenThousandPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> externalPriceAtSourceNegativeHundredThousandPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_MILLION_PAIR -> externalPriceAtSourceNegativeMillionPair.externalPriceFractionIndicator().value(ExternalPriceFractionIndicator.NEGATIVE_MILLION);
            case EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeWholePair externalPriceAtSourceNegativeWholePair() {
        return externalPriceAtSourceNegativeWholePair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeTenPair externalPriceAtSourceNegativeTenPair() {
        return externalPriceAtSourceNegativeTenPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeHundredPair externalPriceAtSourceNegativeHundredPair() {
        return externalPriceAtSourceNegativeHundredPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeThousandPair externalPriceAtSourceNegativeThousandPair() {
        return externalPriceAtSourceNegativeThousandPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeTenThousandPair externalPriceAtSourceNegativeTenThousandPair() {
        return externalPriceAtSourceNegativeTenThousandPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeHundredThousandPair externalPriceAtSourceNegativeHundredThousandPair() {
        return externalPriceAtSourceNegativeHundredThousandPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNegativeMillionPair externalPriceAtSourceNegativeMillionPair() {
        return externalPriceAtSourceNegativeMillionPair;
    }

    /**
     * Returns the ExternalPriceAtSourceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExternalPriceAtSourceNumericPair externalPriceAtSourceNumericPair() {
        return externalPriceAtSourceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_WHOLE_PAIR -> externalPriceAtSourceNegativeWholePair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_PAIR -> externalPriceAtSourceNegativeTenPair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_PAIR -> externalPriceAtSourceNegativeHundredPair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_THOUSAND_PAIR -> externalPriceAtSourceNegativeThousandPair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_THOUSAND_PAIR -> externalPriceAtSourceNegativeTenThousandPair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> externalPriceAtSourceNegativeHundredThousandPair;
            case EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_MILLION_PAIR -> externalPriceAtSourceNegativeMillionPair;
            case EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR -> externalPriceAtSourceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.EXTERNAL_PRICE_AT_SOURCE_NEGATIVE_MILLION_PAIR;
        }
        return Case.EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR;
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
        externalPriceAtSourceNegativeWholePair.clear();
        externalPriceAtSourceNegativeTenPair.clear();
        externalPriceAtSourceNegativeHundredPair.clear();
        externalPriceAtSourceNegativeThousandPair.clear();
        externalPriceAtSourceNegativeTenThousandPair.clear();
        externalPriceAtSourceNegativeHundredThousandPair.clear();
        externalPriceAtSourceNegativeMillionPair.clear();
        externalPriceAtSourceNumericPair.clear();
        selected = Case.EXTERNAL_PRICE_AT_SOURCE_NUMERIC_PAIR;
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
        return other instanceof ExternalPriceAtSourceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof ExternalPriceAtSourceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
