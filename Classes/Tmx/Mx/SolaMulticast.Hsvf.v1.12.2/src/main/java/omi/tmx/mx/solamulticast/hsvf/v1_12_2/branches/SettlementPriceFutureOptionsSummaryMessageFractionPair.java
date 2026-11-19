package omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.enums.SettlementPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.SettlementPriceFutureOptionsSummaryMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.PrintOptions;

/**
 * The SettlementPriceFutureOptionsSummaryMessageFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class SettlementPriceFutureOptionsSummaryMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "SettlementPriceFutureOptionsSummaryMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when SettlementPriceFractionIndicator is "A".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "B".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "C".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "D".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "E".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "F".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when SettlementPriceFractionIndicator is "G".
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR
    }

    private final SettlementPriceFutureOptionsSummaryMessageNegativeWholePair settlementPriceFutureOptionsSummaryMessageNegativeWholePair = new SettlementPriceFutureOptionsSummaryMessageNegativeWholePair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeTenPair settlementPriceFutureOptionsSummaryMessageNegativeTenPair = new SettlementPriceFutureOptionsSummaryMessageNegativeTenPair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeHundredPair settlementPriceFutureOptionsSummaryMessageNegativeHundredPair = new SettlementPriceFutureOptionsSummaryMessageNegativeHundredPair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeThousandPair settlementPriceFutureOptionsSummaryMessageNegativeThousandPair = new SettlementPriceFutureOptionsSummaryMessageNegativeThousandPair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair = new SettlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair = new SettlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair();
    private final SettlementPriceFutureOptionsSummaryMessageNegativeMillionPair settlementPriceFutureOptionsSummaryMessageNegativeMillionPair = new SettlementPriceFutureOptionsSummaryMessageNegativeMillionPair();
    private final SettlementPriceFutureOptionsSummaryMessageNumericPair settlementPriceFutureOptionsSummaryMessageNumericPair = new SettlementPriceFutureOptionsSummaryMessageNumericPair();
    private Case selected = Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;

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
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeWholePair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_WHOLE);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeTenPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_TEN);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeHundredPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_HUNDRED);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_THOUSAND);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeMillionPair.settlementPriceFractionIndicator().value(SettlementPriceFractionIndicator.NEGATIVE_MILLION);
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeWholePair settlementPriceFutureOptionsSummaryMessageNegativeWholePair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeWholePair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeTenPair settlementPriceFutureOptionsSummaryMessageNegativeTenPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeTenPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeHundredPair settlementPriceFutureOptionsSummaryMessageNegativeHundredPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeHundredPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeThousandPair settlementPriceFutureOptionsSummaryMessageNegativeThousandPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeThousandPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNegativeMillionPair settlementPriceFutureOptionsSummaryMessageNegativeMillionPair() {
        return settlementPriceFutureOptionsSummaryMessageNegativeMillionPair;
    }

    /**
     * Returns the SettlementPriceFutureOptionsSummaryMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SettlementPriceFutureOptionsSummaryMessageNumericPair settlementPriceFutureOptionsSummaryMessageNumericPair() {
        return settlementPriceFutureOptionsSummaryMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeWholePair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeTenPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeHundredPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeThousandPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> settlementPriceFutureOptionsSummaryMessageNegativeMillionPair;
            case SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR -> settlementPriceFutureOptionsSummaryMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        settlementPriceFutureOptionsSummaryMessageNegativeWholePair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeTenPair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeHundredPair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeThousandPair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeTenThousandPair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeHundredThousandPair.clear();
        settlementPriceFutureOptionsSummaryMessageNegativeMillionPair.clear();
        settlementPriceFutureOptionsSummaryMessageNumericPair.clear();
        selected = Case.SETTLEMENT_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof SettlementPriceFutureOptionsSummaryMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof SettlementPriceFutureOptionsSummaryMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
