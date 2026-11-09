package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteStrategyMarketDepthLevelNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteStrategyMarketDepthLevelOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceQuoteStrategyMarketDepthLevel branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the strategy instrument For Implied, it represents the best (1st limit) indicative implied ask price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteStrategyMarketDepthLevel implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteStrategyMarketDepthLevel";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR
    }

    private final AskPriceQuoteStrategyMarketDepthLevelOpeningPair askPriceQuoteStrategyMarketDepthLevelOpeningPair = new AskPriceQuoteStrategyMarketDepthLevelOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair();
    private final AskPriceQuoteStrategyMarketDepthLevelNumericPair askPriceQuoteStrategyMarketDepthLevelNumericPair = new AskPriceQuoteStrategyMarketDepthLevelNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_OPENING_PAIR -> {
                askPriceQuoteStrategyMarketDepthLevelOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteStrategyMarketDepthLevelOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteStrategyMarketDepthLevelOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyMarketDepthLevelOpeningPair askPriceQuoteStrategyMarketDepthLevelOpeningPair() {
        return askPriceQuoteStrategyMarketDepthLevelOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteStrategyMarketDepthLevelNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyMarketDepthLevelNumericPair askPriceQuoteStrategyMarketDepthLevelNumericPair() {
        return askPriceQuoteStrategyMarketDepthLevelNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_OPENING_PAIR -> askPriceQuoteStrategyMarketDepthLevelOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR -> askPriceQuoteStrategyMarketDepthLevelNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;
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
        askPriceQuoteStrategyMarketDepthLevelOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyMarketDepthLevelNumericPairNegativeMillionPair.clear();
        askPriceQuoteStrategyMarketDepthLevelNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_STRATEGY_MARKET_DEPTH_LEVEL_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteStrategyMarketDepthLevel branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteStrategyMarketDepthLevel branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
