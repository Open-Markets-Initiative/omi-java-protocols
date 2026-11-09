package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteFuturesQuoteMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteFuturesQuoteMessageOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceQuoteFuturesQuoteMessage branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask Price for the future contract</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuoteFuturesQuoteMessage implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuoteFuturesQuoteMessage";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR
    }

    private final AskPriceQuoteFuturesQuoteMessageOpeningPair askPriceQuoteFuturesQuoteMessageOpeningPair = new AskPriceQuoteFuturesQuoteMessageOpeningPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair();
    private final AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair = new AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair();
    private final AskPriceQuoteFuturesQuoteMessageNumericPair askPriceQuoteFuturesQuoteMessageNumericPair = new AskPriceQuoteFuturesQuoteMessageNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR -> {
                askPriceQuoteFuturesQuoteMessageOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteFuturesQuoteMessageOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteFuturesQuoteMessageOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteFuturesQuoteMessageOpeningPair askPriceQuoteFuturesQuoteMessageOpeningPair() {
        return askPriceQuoteFuturesQuoteMessageOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair() {
        return askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteFuturesQuoteMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteFuturesQuoteMessageNumericPair askPriceQuoteFuturesQuoteMessageNumericPair() {
        return askPriceQuoteFuturesQuoteMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR -> askPriceQuoteFuturesQuoteMessageOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
            case ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR -> askPriceQuoteFuturesQuoteMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        askPriceQuoteFuturesQuoteMessageOpeningPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair.clear();
        askPriceQuoteNumericAskPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair.clear();
        askPriceQuoteFuturesQuoteMessageNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuoteFuturesQuoteMessage branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuoteFuturesQuoteMessage branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
