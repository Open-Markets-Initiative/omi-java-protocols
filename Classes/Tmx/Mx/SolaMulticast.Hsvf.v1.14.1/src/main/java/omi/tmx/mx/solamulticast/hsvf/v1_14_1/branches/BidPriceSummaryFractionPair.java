package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceSummaryNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The BidPriceSummaryFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceSummaryFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceSummaryFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_SUMMARY_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_SUMMARY_NUMERIC_PAIR
    }

    private final BidPriceSummaryNegativeWholePair bidPriceSummaryNegativeWholePair = new BidPriceSummaryNegativeWholePair();
    private final BidPriceSummaryNegativeTenPair bidPriceSummaryNegativeTenPair = new BidPriceSummaryNegativeTenPair();
    private final BidPriceSummaryNegativeHundredPair bidPriceSummaryNegativeHundredPair = new BidPriceSummaryNegativeHundredPair();
    private final BidPriceSummaryNegativeThousandPair bidPriceSummaryNegativeThousandPair = new BidPriceSummaryNegativeThousandPair();
    private final BidPriceSummaryNegativeTenThousandPair bidPriceSummaryNegativeTenThousandPair = new BidPriceSummaryNegativeTenThousandPair();
    private final BidPriceSummaryNegativeHundredThousandPair bidPriceSummaryNegativeHundredThousandPair = new BidPriceSummaryNegativeHundredThousandPair();
    private final BidPriceSummaryNegativeMillionPair bidPriceSummaryNegativeMillionPair = new BidPriceSummaryNegativeMillionPair();
    private final BidPriceSummaryNumericPair bidPriceSummaryNumericPair = new BidPriceSummaryNumericPair();
    private Case selected = Case.BID_PRICE_SUMMARY_NUMERIC_PAIR;

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
            case BID_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR -> bidPriceSummaryNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_SUMMARY_NEGATIVE_TEN_PAIR -> bidPriceSummaryNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR -> bidPriceSummaryNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR -> bidPriceSummaryNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceSummaryNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceSummaryNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR -> bidPriceSummaryNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_SUMMARY_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceSummaryNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeWholePair bidPriceSummaryNegativeWholePair() {
        return bidPriceSummaryNegativeWholePair;
    }

    /**
     * Returns the BidPriceSummaryNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeTenPair bidPriceSummaryNegativeTenPair() {
        return bidPriceSummaryNegativeTenPair;
    }

    /**
     * Returns the BidPriceSummaryNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeHundredPair bidPriceSummaryNegativeHundredPair() {
        return bidPriceSummaryNegativeHundredPair;
    }

    /**
     * Returns the BidPriceSummaryNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeThousandPair bidPriceSummaryNegativeThousandPair() {
        return bidPriceSummaryNegativeThousandPair;
    }

    /**
     * Returns the BidPriceSummaryNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeTenThousandPair bidPriceSummaryNegativeTenThousandPair() {
        return bidPriceSummaryNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceSummaryNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeHundredThousandPair bidPriceSummaryNegativeHundredThousandPair() {
        return bidPriceSummaryNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceSummaryNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNegativeMillionPair bidPriceSummaryNegativeMillionPair() {
        return bidPriceSummaryNegativeMillionPair;
    }

    /**
     * Returns the BidPriceSummaryNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceSummaryNumericPair bidPriceSummaryNumericPair() {
        return bidPriceSummaryNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR -> bidPriceSummaryNegativeWholePair;
            case BID_PRICE_SUMMARY_NEGATIVE_TEN_PAIR -> bidPriceSummaryNegativeTenPair;
            case BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR -> bidPriceSummaryNegativeHundredPair;
            case BID_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR -> bidPriceSummaryNegativeThousandPair;
            case BID_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceSummaryNegativeTenThousandPair;
            case BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceSummaryNegativeHundredThousandPair;
            case BID_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR -> bidPriceSummaryNegativeMillionPair;
            case BID_PRICE_SUMMARY_NUMERIC_PAIR -> bidPriceSummaryNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.BID_PRICE_SUMMARY_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_SUMMARY_NUMERIC_PAIR;
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
        bidPriceSummaryNegativeWholePair.clear();
        bidPriceSummaryNegativeTenPair.clear();
        bidPriceSummaryNegativeHundredPair.clear();
        bidPriceSummaryNegativeThousandPair.clear();
        bidPriceSummaryNegativeTenThousandPair.clear();
        bidPriceSummaryNegativeHundredThousandPair.clear();
        bidPriceSummaryNegativeMillionPair.clear();
        bidPriceSummaryNumericPair.clear();
        selected = Case.BID_PRICE_SUMMARY_NUMERIC_PAIR;
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
        return other instanceof BidPriceSummaryFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceSummaryFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
