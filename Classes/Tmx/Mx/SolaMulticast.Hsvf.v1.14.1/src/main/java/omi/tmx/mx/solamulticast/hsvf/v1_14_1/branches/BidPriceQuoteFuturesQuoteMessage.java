package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.BidPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteFuturesQuoteMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteFuturesQuoteMessageOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The BidPriceQuoteFuturesQuoteMessage branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Bid price for the future contract</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class BidPriceQuoteFuturesQuoteMessage implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "BidPriceQuoteFuturesQuoteMessage";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when BidPriceQuoteOpening is "0000OUV" and BidPriceFractionIndicator is "0".
         */
        BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "A".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "B".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "C".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "D".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "E".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "F".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when BidPriceFractionIndicator is "G".
         */
        BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR
    }

    private final BidPriceQuoteFuturesQuoteMessageOpeningPair bidPriceQuoteFuturesQuoteMessageOpeningPair = new BidPriceQuoteFuturesQuoteMessageOpeningPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair();
    private final BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair = new BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair();
    private final BidPriceQuoteFuturesQuoteMessageNumericPair bidPriceQuoteFuturesQuoteMessageNumericPair = new BidPriceQuoteFuturesQuoteMessageNumericPair();
    private Case selected = Case.BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;

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
            case BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR -> {
                bidPriceQuoteFuturesQuoteMessageOpeningPair.bidPriceQuoteOpening().value("0000OUV");
                bidPriceQuoteFuturesQuoteMessageOpeningPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.WHOLE);
            }
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_WHOLE);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair.bidPriceFractionIndicator().value(BidPriceFractionIndicator.NEGATIVE_MILLION);
            case BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the BidPriceQuoteFuturesQuoteMessageOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteFuturesQuoteMessageOpeningPair bidPriceQuoteFuturesQuoteMessageOpeningPair() {
        return bidPriceQuoteFuturesQuoteMessageOpeningPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
    }

    /**
     * Returns the BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair() {
        return bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
    }

    /**
     * Returns the BidPriceQuoteFuturesQuoteMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BidPriceQuoteFuturesQuoteMessageNumericPair bidPriceQuoteFuturesQuoteMessageNumericPair() {
        return bidPriceQuoteFuturesQuoteMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR -> bidPriceQuoteFuturesQuoteMessageOpeningPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair;
            case BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR -> bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair;
            case BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR -> bidPriceQuoteFuturesQuoteMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.BID_PRICE_QUOTE_NUMERIC_BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR_NEGATIVE_MILLION_PAIR;
        }
        return Case.BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        bidPriceQuoteFuturesQuoteMessageOpeningPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeWholePair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeTenThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeHundredThousandPair.clear();
        bidPriceQuoteNumericBidPriceQuoteFuturesQuoteMessageNumericPairNegativeMillionPair.clear();
        bidPriceQuoteFuturesQuoteMessageNumericPair.clear();
        selected = Case.BID_PRICE_QUOTE_FUTURES_QUOTE_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof BidPriceQuoteFuturesQuoteMessage branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof BidPriceQuoteFuturesQuoteMessage branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
