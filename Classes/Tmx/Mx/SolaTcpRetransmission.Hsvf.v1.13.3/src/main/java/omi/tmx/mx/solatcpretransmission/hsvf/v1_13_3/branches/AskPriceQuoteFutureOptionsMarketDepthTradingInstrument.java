package omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.structs.AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.PrintOptions;

/**
 * The AskPriceQuoteFutureOptionsMarketDepthTradingInstrument branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the series For Implied, it represents the best (1st limit) indicative implied ask price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteFutureOptionsMarketDepthTradingInstrument implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteFutureOptionsMarketDepthTradingInstrument";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR
    }

    private final AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair = new AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair();
    private final AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair askPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair = new AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> {
                askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair() {
        return askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair askPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair() {
        return askPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR -> askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR -> askPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        askPriceQuoteFutureOptionsMarketDepthTradingInstrumentOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPairNegativeMillionPair.clear();
        askPriceQuoteFutureOptionsMarketDepthTradingInstrumentNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_FUTURE_OPTIONS_MARKET_DEPTH_TRADING_INSTRUMENT_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteFutureOptionsMarketDepthTradingInstrument branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteFutureOptionsMarketDepthTradingInstrument branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
