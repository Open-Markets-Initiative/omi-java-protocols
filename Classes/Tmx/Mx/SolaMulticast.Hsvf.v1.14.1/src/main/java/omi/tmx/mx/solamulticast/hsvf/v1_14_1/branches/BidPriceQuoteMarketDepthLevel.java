package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteMarketDepthLevelNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteMarketDepthLevelOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The BidPriceQuoteMarketDepthLevel branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Bid price for the option series For Implied, it represents the best (1st limit) indicative implied bid price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceQuoteMarketDepthLevel implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceQuoteMarketDepthLevel";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceQuoteOpening is "0000OUV" and BidPriceFractionIndicator is "0".
         */
        BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_OPENING_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR
    }

    private final BidPriceQuoteMarketDepthLevelOpeningPair bidPriceQuoteMarketDepthLevelOpeningPair = new BidPriceQuoteMarketDepthLevelOpeningPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair();
    private final BidPriceQuoteMarketDepthLevelNumericPair bidPriceQuoteMarketDepthLevelNumericPair = new BidPriceQuoteMarketDepthLevelNumericPair();
    private Case selected = Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;

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
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_OPENING_PAIR -> {
                bidPriceQuoteMarketDepthLevelOpeningPair.bidPriceQuoteOpening().value("0000OUV");
                bidPriceQuoteMarketDepthLevelOpeningPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.WHOLE);
            }
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceQuoteMarketDepthLevelOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteMarketDepthLevelOpeningPair bidPriceQuoteMarketDepthLevelOpeningPair() {
        return bidPriceQuoteMarketDepthLevelOpeningPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair;
    }

    /**
     * Returns the BidPriceQuoteMarketDepthLevelNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteMarketDepthLevelNumericPair bidPriceQuoteMarketDepthLevelNumericPair() {
        return bidPriceQuoteMarketDepthLevelNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_OPENING_PAIR -> bidPriceQuoteMarketDepthLevelOpeningPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair;
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR -> bidPriceQuoteMarketDepthLevelNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;
    }

    private static boolean matches(byte[] data, int at, String spelled) {
        for (int index = 0; index < spelled.length(); index++) {
            if (data[at + index] != (byte) spelled.charAt(index)) {
                return false;
            }
        }
        return true;
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
        bidPriceQuoteMarketDepthLevelOpeningPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeWholePair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeTenThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeHundredThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelNumericPairNegativeMillionPair.clear();
        bidPriceQuoteMarketDepthLevelNumericPair.clear();
        selected = Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;
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
        return other instanceof BidPriceQuoteMarketDepthLevel branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceQuoteMarketDepthLevel branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
