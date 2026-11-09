package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.PreviousSettlementPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.PreviousSettlementPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The PreviousSettlementPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PreviousSettlementPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PreviousSettlementPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "A".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "B".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "C".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "D".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "E".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "F".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PreviousSettlementPriceFractionIndicator is "G".
         */
        PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR
    }

    private final PreviousSettlementPriceNegativeWholePair previousSettlementPriceNegativeWholePair = new PreviousSettlementPriceNegativeWholePair();
    private final PreviousSettlementPriceNegativeTenPair previousSettlementPriceNegativeTenPair = new PreviousSettlementPriceNegativeTenPair();
    private final PreviousSettlementPriceNegativeHundredPair previousSettlementPriceNegativeHundredPair = new PreviousSettlementPriceNegativeHundredPair();
    private final PreviousSettlementPriceNegativeThousandPair previousSettlementPriceNegativeThousandPair = new PreviousSettlementPriceNegativeThousandPair();
    private final PreviousSettlementPriceNegativeTenThousandPair previousSettlementPriceNegativeTenThousandPair = new PreviousSettlementPriceNegativeTenThousandPair();
    private final PreviousSettlementPriceNegativeHundredThousandPair previousSettlementPriceNegativeHundredThousandPair = new PreviousSettlementPriceNegativeHundredThousandPair();
    private final PreviousSettlementPriceNegativeMillionPair previousSettlementPriceNegativeMillionPair = new PreviousSettlementPriceNegativeMillionPair();
    private final PreviousSettlementPriceNumericPair previousSettlementPriceNumericPair = new PreviousSettlementPriceNumericPair();
    private Case selected = Case.PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR;

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
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR -> previousSettlementPriceNegativeWholePair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_WHOLE);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR -> previousSettlementPriceNegativeTenPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_TEN);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR -> previousSettlementPriceNegativeHundredPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_HUNDRED);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR -> previousSettlementPriceNegativeThousandPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_THOUSAND);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> previousSettlementPriceNegativeTenThousandPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousSettlementPriceNegativeHundredThousandPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR -> previousSettlementPriceNegativeMillionPair.previousSettlementPriceFractionIndicator().value(PreviousSettlementPriceFractionIndicator.NEGATIVE_MILLION);
            case PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeWholePair previousSettlementPriceNegativeWholePair() {
        return previousSettlementPriceNegativeWholePair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeTenPair previousSettlementPriceNegativeTenPair() {
        return previousSettlementPriceNegativeTenPair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeHundredPair previousSettlementPriceNegativeHundredPair() {
        return previousSettlementPriceNegativeHundredPair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeThousandPair previousSettlementPriceNegativeThousandPair() {
        return previousSettlementPriceNegativeThousandPair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeTenThousandPair previousSettlementPriceNegativeTenThousandPair() {
        return previousSettlementPriceNegativeTenThousandPair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeHundredThousandPair previousSettlementPriceNegativeHundredThousandPair() {
        return previousSettlementPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the PreviousSettlementPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNegativeMillionPair previousSettlementPriceNegativeMillionPair() {
        return previousSettlementPriceNegativeMillionPair;
    }

    /**
     * Returns the PreviousSettlementPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PreviousSettlementPriceNumericPair previousSettlementPriceNumericPair() {
        return previousSettlementPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR -> previousSettlementPriceNegativeWholePair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR -> previousSettlementPriceNegativeTenPair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR -> previousSettlementPriceNegativeHundredPair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR -> previousSettlementPriceNegativeThousandPair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> previousSettlementPriceNegativeTenThousandPair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> previousSettlementPriceNegativeHundredThousandPair;
            case PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR -> previousSettlementPriceNegativeMillionPair;
            case PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR -> previousSettlementPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.PREVIOUS_SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR;
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
        previousSettlementPriceNegativeWholePair.clear();
        previousSettlementPriceNegativeTenPair.clear();
        previousSettlementPriceNegativeHundredPair.clear();
        previousSettlementPriceNegativeThousandPair.clear();
        previousSettlementPriceNegativeTenThousandPair.clear();
        previousSettlementPriceNegativeHundredThousandPair.clear();
        previousSettlementPriceNegativeMillionPair.clear();
        previousSettlementPriceNumericPair.clear();
        selected = Case.PREVIOUS_SETTLEMENT_PRICE_NUMERIC_PAIR;
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
        return other instanceof PreviousSettlementPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof PreviousSettlementPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
