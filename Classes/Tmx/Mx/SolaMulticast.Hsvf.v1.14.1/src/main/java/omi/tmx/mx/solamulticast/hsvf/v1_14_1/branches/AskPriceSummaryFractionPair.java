package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceSummaryNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceSummaryFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceSummaryFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceSummaryFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_SUMMARY_NUMERIC_PAIR
    }

    private final AskPriceSummaryNegativeWholePair askPriceSummaryNegativeWholePair = new AskPriceSummaryNegativeWholePair();
    private final AskPriceSummaryNegativeTenPair askPriceSummaryNegativeTenPair = new AskPriceSummaryNegativeTenPair();
    private final AskPriceSummaryNegativeHundredPair askPriceSummaryNegativeHundredPair = new AskPriceSummaryNegativeHundredPair();
    private final AskPriceSummaryNegativeThousandPair askPriceSummaryNegativeThousandPair = new AskPriceSummaryNegativeThousandPair();
    private final AskPriceSummaryNegativeTenThousandPair askPriceSummaryNegativeTenThousandPair = new AskPriceSummaryNegativeTenThousandPair();
    private final AskPriceSummaryNegativeHundredThousandPair askPriceSummaryNegativeHundredThousandPair = new AskPriceSummaryNegativeHundredThousandPair();
    private final AskPriceSummaryNegativeMillionPair askPriceSummaryNegativeMillionPair = new AskPriceSummaryNegativeMillionPair();
    private final AskPriceSummaryNumericPair askPriceSummaryNumericPair = new AskPriceSummaryNumericPair();
    private Case selected = Case.ASK_PRICE_SUMMARY_NUMERIC_PAIR;

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
            case ASK_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR -> askPriceSummaryNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_SUMMARY_NEGATIVE_TEN_PAIR -> askPriceSummaryNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR -> askPriceSummaryNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR -> askPriceSummaryNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceSummaryNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceSummaryNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR -> askPriceSummaryNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_SUMMARY_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceSummaryNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeWholePair askPriceSummaryNegativeWholePair() {
        return askPriceSummaryNegativeWholePair;
    }

    /**
     * Returns the AskPriceSummaryNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeTenPair askPriceSummaryNegativeTenPair() {
        return askPriceSummaryNegativeTenPair;
    }

    /**
     * Returns the AskPriceSummaryNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeHundredPair askPriceSummaryNegativeHundredPair() {
        return askPriceSummaryNegativeHundredPair;
    }

    /**
     * Returns the AskPriceSummaryNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeThousandPair askPriceSummaryNegativeThousandPair() {
        return askPriceSummaryNegativeThousandPair;
    }

    /**
     * Returns the AskPriceSummaryNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeTenThousandPair askPriceSummaryNegativeTenThousandPair() {
        return askPriceSummaryNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceSummaryNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeHundredThousandPair askPriceSummaryNegativeHundredThousandPair() {
        return askPriceSummaryNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceSummaryNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNegativeMillionPair askPriceSummaryNegativeMillionPair() {
        return askPriceSummaryNegativeMillionPair;
    }

    /**
     * Returns the AskPriceSummaryNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceSummaryNumericPair askPriceSummaryNumericPair() {
        return askPriceSummaryNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR -> askPriceSummaryNegativeWholePair;
            case ASK_PRICE_SUMMARY_NEGATIVE_TEN_PAIR -> askPriceSummaryNegativeTenPair;
            case ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR -> askPriceSummaryNegativeHundredPair;
            case ASK_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR -> askPriceSummaryNegativeThousandPair;
            case ASK_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceSummaryNegativeTenThousandPair;
            case ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceSummaryNegativeHundredThousandPair;
            case ASK_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR -> askPriceSummaryNegativeMillionPair;
            case ASK_PRICE_SUMMARY_NUMERIC_PAIR -> askPriceSummaryNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_SUMMARY_NUMERIC_PAIR;
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
        askPriceSummaryNegativeWholePair.clear();
        askPriceSummaryNegativeTenPair.clear();
        askPriceSummaryNegativeHundredPair.clear();
        askPriceSummaryNegativeThousandPair.clear();
        askPriceSummaryNegativeTenThousandPair.clear();
        askPriceSummaryNegativeHundredThousandPair.clear();
        askPriceSummaryNegativeMillionPair.clear();
        askPriceSummaryNumericPair.clear();
        selected = Case.ASK_PRICE_SUMMARY_NUMERIC_PAIR;
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
        return other instanceof AskPriceSummaryFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceSummaryFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
