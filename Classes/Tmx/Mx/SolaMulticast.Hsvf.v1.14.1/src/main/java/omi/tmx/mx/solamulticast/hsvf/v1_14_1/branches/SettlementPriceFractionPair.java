package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.SettlementPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SettlementPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The SettlementPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class SettlementPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "SettlementPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when SettlementPriceFractionIndicator is "A".
         */
        SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "B".
         */
        SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "C".
         */
        SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "D".
         */
        SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "E".
         */
        SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "F".
         */
        SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "G".
         */
        SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        SETTLEMENT_PRICE_NUMERIC_PAIR
    }

    private final SettlementPriceNegativeWholePair settlementPriceNegativeWholePair = new SettlementPriceNegativeWholePair();
    private final SettlementPriceNegativeTenPair settlementPriceNegativeTenPair = new SettlementPriceNegativeTenPair();
    private final SettlementPriceNegativeHundredPair settlementPriceNegativeHundredPair = new SettlementPriceNegativeHundredPair();
    private final SettlementPriceNegativeThousandPair settlementPriceNegativeThousandPair = new SettlementPriceNegativeThousandPair();
    private final SettlementPriceNegativeTenThousandPair settlementPriceNegativeTenThousandPair = new SettlementPriceNegativeTenThousandPair();
    private final SettlementPriceNegativeHundredThousandPair settlementPriceNegativeHundredThousandPair = new SettlementPriceNegativeHundredThousandPair();
    private final SettlementPriceNegativeMillionPair settlementPriceNegativeMillionPair = new SettlementPriceNegativeMillionPair();
    private final SettlementPriceNumericPair settlementPriceNumericPair = new SettlementPriceNumericPair();
    private Case selected = Case.SETTLEMENT_PRICE_NUMERIC_PAIR;

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
            case SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR -> settlementPriceNegativeWholePair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_WHOLE);
            case SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR -> settlementPriceNegativeTenPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_TEN);
            case SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR -> settlementPriceNegativeHundredPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_HUNDRED);
            case SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR -> settlementPriceNegativeThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_THOUSAND);
            case SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> settlementPriceNegativeTenThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> settlementPriceNegativeHundredThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR -> settlementPriceNegativeMillionPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_MILLION);
            case SETTLEMENT_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the SettlementPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeWholePair settlementPriceNegativeWholePair() {
        return settlementPriceNegativeWholePair;
    }

    /**
     * Returns the SettlementPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeTenPair settlementPriceNegativeTenPair() {
        return settlementPriceNegativeTenPair;
    }

    /**
     * Returns the SettlementPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeHundredPair settlementPriceNegativeHundredPair() {
        return settlementPriceNegativeHundredPair;
    }

    /**
     * Returns the SettlementPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeThousandPair settlementPriceNegativeThousandPair() {
        return settlementPriceNegativeThousandPair;
    }

    /**
     * Returns the SettlementPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeTenThousandPair settlementPriceNegativeTenThousandPair() {
        return settlementPriceNegativeTenThousandPair;
    }

    /**
     * Returns the SettlementPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeHundredThousandPair settlementPriceNegativeHundredThousandPair() {
        return settlementPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the SettlementPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNegativeMillionPair settlementPriceNegativeMillionPair() {
        return settlementPriceNegativeMillionPair;
    }

    /**
     * Returns the SettlementPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceNumericPair settlementPriceNumericPair() {
        return settlementPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR -> settlementPriceNegativeWholePair;
            case SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR -> settlementPriceNegativeTenPair;
            case SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR -> settlementPriceNegativeHundredPair;
            case SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR -> settlementPriceNegativeThousandPair;
            case SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> settlementPriceNegativeTenThousandPair;
            case SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> settlementPriceNegativeHundredThousandPair;
            case SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR -> settlementPriceNegativeMillionPair;
            case SETTLEMENT_PRICE_NUMERIC_PAIR -> settlementPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.SETTLEMENT_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.SETTLEMENT_PRICE_NUMERIC_PAIR;
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
        settlementPriceNegativeWholePair.clear();
        settlementPriceNegativeTenPair.clear();
        settlementPriceNegativeHundredPair.clear();
        settlementPriceNegativeThousandPair.clear();
        settlementPriceNegativeTenThousandPair.clear();
        settlementPriceNegativeHundredThousandPair.clear();
        settlementPriceNegativeMillionPair.clear();
        settlementPriceNumericPair.clear();
        selected = Case.SETTLEMENT_PRICE_NUMERIC_PAIR;
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
        return other instanceof SettlementPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof SettlementPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
