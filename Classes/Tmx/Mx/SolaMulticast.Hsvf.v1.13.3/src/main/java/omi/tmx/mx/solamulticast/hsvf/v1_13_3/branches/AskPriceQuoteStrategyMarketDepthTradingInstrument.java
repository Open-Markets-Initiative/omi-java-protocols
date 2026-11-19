package omi.tmx.mx.solamulticast.hsvf.v1_13_3.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.structs.AskPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_13_3.types.PrintOptions;

/**
 * The AskPriceQuoteStrategyMarketDepthTradingInstrument branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the strategy instrument For Implied, it represents the best (1st limit) indicative implied ask price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteStrategyMarketDepthTradingInstrument implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteStrategyMarketDepthTradingInstrument";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR
    }

    private final AskPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair = new AskPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair();
    private final AskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair askPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair = new AskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> {
                askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair() {
        return askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair askPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair() {
        return askPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> askPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        askPriceQuoteStrategyMarketDepthTradingInstrumentOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthTradingInstrumentNumericPairNegativeMillionPair.clear();
        askPriceQuoteStrategyMarketDepthTradingInstrumentNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteStrategyMarketDepthTradingInstrument branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteStrategyMarketDepthTradingInstrument branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
