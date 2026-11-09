package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteMarketDepthLevelHbNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteMarketDepthLevelHbOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceQuoteMarketDepthLevelHb branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the series For Implied, it represents the best (1st limit) indicative implied ask price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteMarketDepthLevelHb implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteMarketDepthLevelHb";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR
    }

    private final AskPriceQuoteMarketDepthLevelHbOpeningPair askPriceQuoteMarketDepthLevelHbOpeningPair = new AskPriceQuoteMarketDepthLevelHbOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair();
    private final AskPriceQuoteMarketDepthLevelHbNumericPair askPriceQuoteMarketDepthLevelHbNumericPair = new AskPriceQuoteMarketDepthLevelHbNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR -> {
                askPriceQuoteMarketDepthLevelHbOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteMarketDepthLevelHbOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteMarketDepthLevelHbOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteMarketDepthLevelHbOpeningPair askPriceQuoteMarketDepthLevelHbOpeningPair() {
        return askPriceQuoteMarketDepthLevelHbOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteMarketDepthLevelHbNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteMarketDepthLevelHbNumericPair askPriceQuoteMarketDepthLevelHbNumericPair() {
        return askPriceQuoteMarketDepthLevelHbNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR -> askPriceQuoteMarketDepthLevelHbOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR -> askPriceQuoteMarketDepthLevelHbNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;
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
        askPriceQuoteMarketDepthLevelHbOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteMarketDepthLevelHbNumericPairNegativeMillionPair.clear();
        askPriceQuoteMarketDepthLevelHbNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_MARKET_DEPTH_LEVEL_HB_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteMarketDepthLevelHb branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteMarketDepthLevelHb branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
