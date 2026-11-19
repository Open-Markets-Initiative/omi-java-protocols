package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The BidPriceQuoteFuturesMarketDepthTradingInstrument branch: one of 9 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Bid price for the future contract For Implied, it represents the best (1st limit) indicative implied bid price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceQuoteFuturesMarketDepthTradingInstrument implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceQuoteFuturesMarketDepthTradingInstrument";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceQuoteOpening is "000OUV" and BidPriceFractionIndicator is "0".
         */
        BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR
    }

    private final BidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair = new BidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair = new BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair();
    private final BidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair bidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair = new BidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair();
    private Case selected = Case.BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;

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
            case BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> {
                bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair.bidPriceQuoteOpening().value("000OUV");
                bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.WHOLE);
            }
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair() {
        return bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
    }

    /**
     * Returns the BidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair bidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair() {
        return bidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
            case BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> bidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "000OUV") && data[offset + 6] == (byte) '0') {
            return Case.BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR;
        }
        if (data[offset + 6] == (byte) 'A') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        bidPriceQuoteFuturesMarketDepthTradingInstrumentOpeningPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeWholePair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPairNegativeMillionPair.clear();
        bidPriceQuoteFuturesMarketDepthTradingInstrumentNumericPair.clear();
        selected = Case.BID_PRICE_QUOTE_FUTURES_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        return other instanceof BidPriceQuoteFuturesMarketDepthTradingInstrument branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceQuoteFuturesMarketDepthTradingInstrument branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
