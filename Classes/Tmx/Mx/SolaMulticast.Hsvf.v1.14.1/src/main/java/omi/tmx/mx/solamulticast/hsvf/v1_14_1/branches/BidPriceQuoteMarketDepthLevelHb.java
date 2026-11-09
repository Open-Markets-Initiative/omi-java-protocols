package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteMarketDepthLevelHbNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteMarketDepthLevelHbOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The BidPriceQuoteMarketDepthLevelHb branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Bid Price for the series. For Implied, it represents the best (1st limit) indicative implied bid price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceQuoteMarketDepthLevelHb implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceQuoteMarketDepthLevelHb";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceQuoteOpening is "0000OUV" and BidPriceFractionIndicator is "0".
         */
        BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR
    }

    private final BidPriceQuoteMarketDepthLevelHbOpeningPair bidPriceQuoteMarketDepthLevelHbOpeningPair = new BidPriceQuoteMarketDepthLevelHbOpeningPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair = new BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair();
    private final BidPriceQuoteMarketDepthLevelHbNumericPair bidPriceQuoteMarketDepthLevelHbNumericPair = new BidPriceQuoteMarketDepthLevelHbNumericPair();
    private Case selected = Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;

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
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR -> {
                bidPriceQuoteMarketDepthLevelHbOpeningPair.bidPriceQuoteOpening().value("0000OUV");
                bidPriceQuoteMarketDepthLevelHbOpeningPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.WHOLE);
            }
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceQuoteMarketDepthLevelHbOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteMarketDepthLevelHbOpeningPair bidPriceQuoteMarketDepthLevelHbOpeningPair() {
        return bidPriceQuoteMarketDepthLevelHbOpeningPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair() {
        return bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
    }

    /**
     * Returns the BidPriceQuoteMarketDepthLevelHbNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteMarketDepthLevelHbNumericPair bidPriceQuoteMarketDepthLevelHbNumericPair() {
        return bidPriceQuoteMarketDepthLevelHbNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR -> bidPriceQuoteMarketDepthLevelHbOpeningPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
            case BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR -> bidPriceQuoteMarketDepthLevelHbNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;
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
        bidPriceQuoteMarketDepthLevelHbOpeningPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair.clear();
        bidPriceQuoteMarketDepthLevelHbNumericPair.clear();
        selected = Case.BID_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;
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
        return other instanceof BidPriceQuoteMarketDepthLevelHb branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceQuoteMarketDepthLevelHb branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
