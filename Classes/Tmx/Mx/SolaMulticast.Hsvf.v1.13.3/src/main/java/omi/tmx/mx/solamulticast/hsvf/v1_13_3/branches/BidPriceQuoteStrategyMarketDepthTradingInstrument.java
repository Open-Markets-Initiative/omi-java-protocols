package omi.tmx.mx.solamulticast.hsvf.v1_13_3.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.BidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.PrintOptions;

/**
 * The BidPriceQuoteStrategyMarketDepthTradingInstrument branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Bid price for the strategy instrument For Implied, it represents the best (1st limit) indicative implied bid price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceQuoteStrategyMarketDepthTradingInstrument implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceQuoteStrategyMarketDepthTradingInstrument";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceQuoteOpening is "0000OUV" and BidPriceFractionIndicator is "0".
         */
        BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR
    }

    private final BidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair = new BidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair = new BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair();
    private final BidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair bidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair = new BidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair();
    private Case selected = Case.BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;

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
            case BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> {
                bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.bidPriceQuoteOpening().value("0000OUV");
                bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.WHOLE);
            }
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair() {
        return bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair() {
        return bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
    }

    /**
     * Returns the BidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair bidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair() {
        return bidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
            case BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> bidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        bidPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair.clear();
        bidPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair.clear();
        selected = Case.BID_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        return other instanceof BidPriceQuoteStrategyMarketDepthTradingInstrument branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceQuoteStrategyMarketDepthTradingInstrument branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
