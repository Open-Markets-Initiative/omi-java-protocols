package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.ConversionFactorFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.ConversionFactorNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The ConversionFactorFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ConversionFactorFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ConversionFactorFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when ConversionFactorFractionIndicator is "A".
         */
        CONVERSION_FACTOR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "B".
         */
        CONVERSION_FACTOR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "C".
         */
        CONVERSION_FACTOR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "D".
         */
        CONVERSION_FACTOR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "E".
         */
        CONVERSION_FACTOR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "F".
         */
        CONVERSION_FACTOR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when ConversionFactorFractionIndicator is "G".
         */
        CONVERSION_FACTOR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        CONVERSION_FACTOR_NUMERIC_PAIR
    }

    private final ConversionFactorNegativeWholePair conversionFactorNegativeWholePair = new ConversionFactorNegativeWholePair();
    private final ConversionFactorNegativeTenPair conversionFactorNegativeTenPair = new ConversionFactorNegativeTenPair();
    private final ConversionFactorNegativeHundredPair conversionFactorNegativeHundredPair = new ConversionFactorNegativeHundredPair();
    private final ConversionFactorNegativeThousandPair conversionFactorNegativeThousandPair = new ConversionFactorNegativeThousandPair();
    private final ConversionFactorNegativeTenThousandPair conversionFactorNegativeTenThousandPair = new ConversionFactorNegativeTenThousandPair();
    private final ConversionFactorNegativeHundredThousandPair conversionFactorNegativeHundredThousandPair = new ConversionFactorNegativeHundredThousandPair();
    private final ConversionFactorNegativeMillionPair conversionFactorNegativeMillionPair = new ConversionFactorNegativeMillionPair();
    private final ConversionFactorNumericPair conversionFactorNumericPair = new ConversionFactorNumericPair();
    private Case selected = Case.CONVERSION_FACTOR_NUMERIC_PAIR;

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
            case CONVERSION_FACTOR_NEGATIVE_WHOLE_PAIR -> conversionFactorNegativeWholePair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_WHOLE);
            case CONVERSION_FACTOR_NEGATIVE_TEN_PAIR -> conversionFactorNegativeTenPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_TEN);
            case CONVERSION_FACTOR_NEGATIVE_HUNDRED_PAIR -> conversionFactorNegativeHundredPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_HUNDRED);
            case CONVERSION_FACTOR_NEGATIVE_THOUSAND_PAIR -> conversionFactorNegativeThousandPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_THOUSAND);
            case CONVERSION_FACTOR_NEGATIVE_TEN_THOUSAND_PAIR -> conversionFactorNegativeTenThousandPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case CONVERSION_FACTOR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> conversionFactorNegativeHundredThousandPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case CONVERSION_FACTOR_NEGATIVE_MILLION_PAIR -> conversionFactorNegativeMillionPair.conversionFactorFractionIndicator().value(ConversionFactorFractionIndicator.NEGATIVE_MILLION);
            case CONVERSION_FACTOR_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the ConversionFactorNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeWholePair conversionFactorNegativeWholePair() {
        return conversionFactorNegativeWholePair;
    }

    /**
     * Returns the ConversionFactorNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeTenPair conversionFactorNegativeTenPair() {
        return conversionFactorNegativeTenPair;
    }

    /**
     * Returns the ConversionFactorNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeHundredPair conversionFactorNegativeHundredPair() {
        return conversionFactorNegativeHundredPair;
    }

    /**
     * Returns the ConversionFactorNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeThousandPair conversionFactorNegativeThousandPair() {
        return conversionFactorNegativeThousandPair;
    }

    /**
     * Returns the ConversionFactorNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeTenThousandPair conversionFactorNegativeTenThousandPair() {
        return conversionFactorNegativeTenThousandPair;
    }

    /**
     * Returns the ConversionFactorNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeHundredThousandPair conversionFactorNegativeHundredThousandPair() {
        return conversionFactorNegativeHundredThousandPair;
    }

    /**
     * Returns the ConversionFactorNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNegativeMillionPair conversionFactorNegativeMillionPair() {
        return conversionFactorNegativeMillionPair;
    }

    /**
     * Returns the ConversionFactorNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConversionFactorNumericPair conversionFactorNumericPair() {
        return conversionFactorNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case CONVERSION_FACTOR_NEGATIVE_WHOLE_PAIR -> conversionFactorNegativeWholePair;
            case CONVERSION_FACTOR_NEGATIVE_TEN_PAIR -> conversionFactorNegativeTenPair;
            case CONVERSION_FACTOR_NEGATIVE_HUNDRED_PAIR -> conversionFactorNegativeHundredPair;
            case CONVERSION_FACTOR_NEGATIVE_THOUSAND_PAIR -> conversionFactorNegativeThousandPair;
            case CONVERSION_FACTOR_NEGATIVE_TEN_THOUSAND_PAIR -> conversionFactorNegativeTenThousandPair;
            case CONVERSION_FACTOR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> conversionFactorNegativeHundredThousandPair;
            case CONVERSION_FACTOR_NEGATIVE_MILLION_PAIR -> conversionFactorNegativeMillionPair;
            case CONVERSION_FACTOR_NUMERIC_PAIR -> conversionFactorNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.CONVERSION_FACTOR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.CONVERSION_FACTOR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.CONVERSION_FACTOR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.CONVERSION_FACTOR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.CONVERSION_FACTOR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.CONVERSION_FACTOR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.CONVERSION_FACTOR_NEGATIVE_MILLION_PAIR;
        }
        return Case.CONVERSION_FACTOR_NUMERIC_PAIR;
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
        conversionFactorNegativeWholePair.clear();
        conversionFactorNegativeTenPair.clear();
        conversionFactorNegativeHundredPair.clear();
        conversionFactorNegativeThousandPair.clear();
        conversionFactorNegativeTenThousandPair.clear();
        conversionFactorNegativeHundredThousandPair.clear();
        conversionFactorNegativeMillionPair.clear();
        conversionFactorNumericPair.clear();
        selected = Case.CONVERSION_FACTOR_NUMERIC_PAIR;
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
        return other instanceof ConversionFactorFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof ConversionFactorFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
