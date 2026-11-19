package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteStrategyQuoteMessageNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.AskPriceQuoteStrategyQuoteMessageOpeningPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The AskPriceQuoteStrategyQuoteMessage branch: one of 9 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the future contract</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteStrategyQuoteMessage implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteStrategyQuoteMessage";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR
    }

    private final AskPriceQuoteStrategyQuoteMessageOpeningPair askPriceQuoteStrategyQuoteMessageOpeningPair = new AskPriceQuoteStrategyQuoteMessageOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair();
    private final AskPriceQuoteStrategyQuoteMessageNumericPair askPriceQuoteStrategyQuoteMessageNumericPair = new AskPriceQuoteStrategyQuoteMessageNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_OPENING_PAIR -> {
                askPriceQuoteStrategyQuoteMessageOpeningPair.askPriceQuoteOpening().value("000OUV");
                askPriceQuoteStrategyQuoteMessageOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteStrategyQuoteMessageOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyQuoteMessageOpeningPair askPriceQuoteStrategyQuoteMessageOpeningPair() {
        return askPriceQuoteStrategyQuoteMessageOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteStrategyQuoteMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteStrategyQuoteMessageNumericPair askPriceQuoteStrategyQuoteMessageNumericPair() {
        return askPriceQuoteStrategyQuoteMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_OPENING_PAIR -> askPriceQuoteStrategyQuoteMessageOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR -> askPriceQuoteStrategyQuoteMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "000OUV") && data[offset + 6] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_OPENING_PAIR;
        }
        if (data[offset + 6] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        askPriceQuoteStrategyQuoteMessageOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteStrategyQuoteMessageNumericPairNegativeMillionPair.clear();
        askPriceQuoteStrategyQuoteMessageNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_STRATEGY_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteStrategyQuoteMessage branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteStrategyQuoteMessage branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
