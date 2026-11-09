package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthMarketDepthLevelHfNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthMarketDepthLevelHfOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceFuturesDepthNumericNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceFuturesDepthMarketDepthLevelHf branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask Price for the future contract For Implied, it represents the best (1st limit) indicative implied ask price</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceFuturesDepthMarketDepthLevelHf implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceFuturesDepthMarketDepthLevelHf";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceFuturesDepthOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR
    }

    private final AskPriceFuturesDepthMarketDepthLevelHfOpeningPair askPriceFuturesDepthMarketDepthLevelHfOpeningPair = new AskPriceFuturesDepthMarketDepthLevelHfOpeningPair();
    private final AskPriceFuturesDepthNumericNegativeWholePair askPriceFuturesDepthNumericNegativeWholePair = new AskPriceFuturesDepthNumericNegativeWholePair();
    private final AskPriceFuturesDepthNumericNegativeTenPair askPriceFuturesDepthNumericNegativeTenPair = new AskPriceFuturesDepthNumericNegativeTenPair();
    private final AskPriceFuturesDepthNumericNegativeHundredPair askPriceFuturesDepthNumericNegativeHundredPair = new AskPriceFuturesDepthNumericNegativeHundredPair();
    private final AskPriceFuturesDepthNumericNegativeThousandPair askPriceFuturesDepthNumericNegativeThousandPair = new AskPriceFuturesDepthNumericNegativeThousandPair();
    private final AskPriceFuturesDepthNumericNegativeTenThousandPair askPriceFuturesDepthNumericNegativeTenThousandPair = new AskPriceFuturesDepthNumericNegativeTenThousandPair();
    private final AskPriceFuturesDepthNumericNegativeHundredThousandPair askPriceFuturesDepthNumericNegativeHundredThousandPair = new AskPriceFuturesDepthNumericNegativeHundredThousandPair();
    private final AskPriceFuturesDepthNumericNegativeMillionPair askPriceFuturesDepthNumericNegativeMillionPair = new AskPriceFuturesDepthNumericNegativeMillionPair();
    private final AskPriceFuturesDepthMarketDepthLevelHfNumericPair askPriceFuturesDepthMarketDepthLevelHfNumericPair = new AskPriceFuturesDepthMarketDepthLevelHfNumericPair();
    private Case selected = Case.ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR;

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
            case ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_OPENING_PAIR -> {
                askPriceFuturesDepthMarketDepthLevelHfOpeningPair.askPriceFuturesDepthOpening().value("0000OUV");
                askPriceFuturesDepthMarketDepthLevelHfOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_WHOLE_PAIR -> askPriceFuturesDepthNumericNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_PAIR -> askPriceFuturesDepthNumericNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_PAIR -> askPriceFuturesDepthNumericNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_MILLION_PAIR -> askPriceFuturesDepthNumericNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceFuturesDepthMarketDepthLevelHfOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthMarketDepthLevelHfOpeningPair askPriceFuturesDepthMarketDepthLevelHfOpeningPair() {
        return askPriceFuturesDepthMarketDepthLevelHfOpeningPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeWholePair askPriceFuturesDepthNumericNegativeWholePair() {
        return askPriceFuturesDepthNumericNegativeWholePair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeTenPair askPriceFuturesDepthNumericNegativeTenPair() {
        return askPriceFuturesDepthNumericNegativeTenPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeHundredPair askPriceFuturesDepthNumericNegativeHundredPair() {
        return askPriceFuturesDepthNumericNegativeHundredPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeThousandPair askPriceFuturesDepthNumericNegativeThousandPair() {
        return askPriceFuturesDepthNumericNegativeThousandPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeTenThousandPair askPriceFuturesDepthNumericNegativeTenThousandPair() {
        return askPriceFuturesDepthNumericNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeHundredThousandPair askPriceFuturesDepthNumericNegativeHundredThousandPair() {
        return askPriceFuturesDepthNumericNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceFuturesDepthNumericNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthNumericNegativeMillionPair askPriceFuturesDepthNumericNegativeMillionPair() {
        return askPriceFuturesDepthNumericNegativeMillionPair;
    }

    /**
     * Returns the AskPriceFuturesDepthMarketDepthLevelHfNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceFuturesDepthMarketDepthLevelHfNumericPair askPriceFuturesDepthMarketDepthLevelHfNumericPair() {
        return askPriceFuturesDepthMarketDepthLevelHfNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_OPENING_PAIR -> askPriceFuturesDepthMarketDepthLevelHfOpeningPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_WHOLE_PAIR -> askPriceFuturesDepthNumericNegativeWholePair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_PAIR -> askPriceFuturesDepthNumericNegativeTenPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_PAIR -> askPriceFuturesDepthNumericNegativeHundredPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeThousandPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeTenThousandPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceFuturesDepthNumericNegativeHundredThousandPair;
            case ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_MILLION_PAIR -> askPriceFuturesDepthNumericNegativeMillionPair;
            case ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR -> askPriceFuturesDepthMarketDepthLevelHfNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_FUTURES_DEPTH_NUMERIC_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR;
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
        askPriceFuturesDepthMarketDepthLevelHfOpeningPair.clear();
        askPriceFuturesDepthNumericNegativeWholePair.clear();
        askPriceFuturesDepthNumericNegativeTenPair.clear();
        askPriceFuturesDepthNumericNegativeHundredPair.clear();
        askPriceFuturesDepthNumericNegativeThousandPair.clear();
        askPriceFuturesDepthNumericNegativeTenThousandPair.clear();
        askPriceFuturesDepthNumericNegativeHundredThousandPair.clear();
        askPriceFuturesDepthNumericNegativeMillionPair.clear();
        askPriceFuturesDepthMarketDepthLevelHfNumericPair.clear();
        selected = Case.ASK_PRICE_FUTURES_DEPTH_MARKET_DEPTH_LEVEL_HF_NUMERIC_PAIR;
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
        return other instanceof AskPriceFuturesDepthMarketDepthLevelHf branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceFuturesDepthMarketDepthLevelHf branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
