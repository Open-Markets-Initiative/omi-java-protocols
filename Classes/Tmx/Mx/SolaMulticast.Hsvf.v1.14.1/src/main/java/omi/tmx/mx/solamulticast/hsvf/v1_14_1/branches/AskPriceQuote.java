package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.AskPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.AskPriceQuoteOpeningPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The AskPriceQuote branch: one of 9 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Ask price for the option series</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AskPriceQuote implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AskPriceQuote";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when AskPriceQuoteOpening is "0000OUV" and AskPriceFractionIndicator is "0".
         */
        ASK_PRICE_QUOTE_OPENING_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "A".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "B".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "C".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "D".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "E".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "F".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when AskPriceFractionIndicator is "G".
         */
        ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ASK_PRICE_QUOTE_NUMERIC_PAIR
    }

    private final AskPriceQuoteOpeningPair askPriceQuoteOpeningPair = new AskPriceQuoteOpeningPair();
    private final AskPriceQuoteNumericNegativeWholePair askPriceQuoteNumericNegativeWholePair = new AskPriceQuoteNumericNegativeWholePair();
    private final AskPriceQuoteNumericNegativeTenPair askPriceQuoteNumericNegativeTenPair = new AskPriceQuoteNumericNegativeTenPair();
    private final AskPriceQuoteNumericNegativeHundredPair askPriceQuoteNumericNegativeHundredPair = new AskPriceQuoteNumericNegativeHundredPair();
    private final AskPriceQuoteNumericNegativeThousandPair askPriceQuoteNumericNegativeThousandPair = new AskPriceQuoteNumericNegativeThousandPair();
    private final AskPriceQuoteNumericNegativeTenThousandPair askPriceQuoteNumericNegativeTenThousandPair = new AskPriceQuoteNumericNegativeTenThousandPair();
    private final AskPriceQuoteNumericNegativeHundredThousandPair askPriceQuoteNumericNegativeHundredThousandPair = new AskPriceQuoteNumericNegativeHundredThousandPair();
    private final AskPriceQuoteNumericNegativeMillionPair askPriceQuoteNumericNegativeMillionPair = new AskPriceQuoteNumericNegativeMillionPair();
    private final AskPriceQuoteNumericPair askPriceQuoteNumericPair = new AskPriceQuoteNumericPair();
    private Case selected = Case.ASK_PRICE_QUOTE_NUMERIC_PAIR;

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
            case ASK_PRICE_QUOTE_OPENING_PAIR -> {
                askPriceQuoteOpeningPair.askPriceQuoteOpening().value("0000OUV");
                askPriceQuoteOpeningPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.WHOLE);
            }
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericNegativeWholePair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_WHOLE);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericNegativeTenPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericNegativeHundredPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericNegativeThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericNegativeTenThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericNegativeHundredThousandPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericNegativeMillionPair.askPriceFractionIndicator().value(AskPriceFractionIndicator.NEGATIVE_MILLION);
            case ASK_PRICE_QUOTE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the AskPriceQuoteOpeningPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteOpeningPair askPriceQuoteOpeningPair() {
        return askPriceQuoteOpeningPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeWholePair askPriceQuoteNumericNegativeWholePair() {
        return askPriceQuoteNumericNegativeWholePair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeTenPair askPriceQuoteNumericNegativeTenPair() {
        return askPriceQuoteNumericNegativeTenPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeHundredPair askPriceQuoteNumericNegativeHundredPair() {
        return askPriceQuoteNumericNegativeHundredPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeThousandPair askPriceQuoteNumericNegativeThousandPair() {
        return askPriceQuoteNumericNegativeThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeTenThousandPair askPriceQuoteNumericNegativeTenThousandPair() {
        return askPriceQuoteNumericNegativeTenThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeHundredThousandPair askPriceQuoteNumericNegativeHundredThousandPair() {
        return askPriceQuoteNumericNegativeHundredThousandPair;
    }

    /**
     * Returns the AskPriceQuoteNumericNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericNegativeMillionPair askPriceQuoteNumericNegativeMillionPair() {
        return askPriceQuoteNumericNegativeMillionPair;
    }

    /**
     * Returns the AskPriceQuoteNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AskPriceQuoteNumericPair askPriceQuoteNumericPair() {
        return askPriceQuoteNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ASK_PRICE_QUOTE_OPENING_PAIR -> askPriceQuoteOpeningPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_WHOLE_PAIR -> askPriceQuoteNumericNegativeWholePair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_PAIR -> askPriceQuoteNumericNegativeTenPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_PAIR -> askPriceQuoteNumericNegativeHundredPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_THOUSAND_PAIR -> askPriceQuoteNumericNegativeThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR -> askPriceQuoteNumericNegativeTenThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR -> askPriceQuoteNumericNegativeHundredThousandPair;
            case ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_MILLION_PAIR -> askPriceQuoteNumericNegativeMillionPair;
            case ASK_PRICE_QUOTE_NUMERIC_PAIR -> askPriceQuoteNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (matches(data, offset + 0, "0000OUV") && data[offset + 7] == (byte) '0') {
            return Case.ASK_PRICE_QUOTE_OPENING_PAIR;
        }
        if (data[offset + 7] == (byte) 'A') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ASK_PRICE_QUOTE_NUMERIC_NEGATIVE_MILLION_PAIR;
        }
        return Case.ASK_PRICE_QUOTE_NUMERIC_PAIR;
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
        askPriceQuoteOpeningPair.clear();
        askPriceQuoteNumericNegativeWholePair.clear();
        askPriceQuoteNumericNegativeTenPair.clear();
        askPriceQuoteNumericNegativeHundredPair.clear();
        askPriceQuoteNumericNegativeThousandPair.clear();
        askPriceQuoteNumericNegativeTenThousandPair.clear();
        askPriceQuoteNumericNegativeHundredThousandPair.clear();
        askPriceQuoteNumericNegativeMillionPair.clear();
        askPriceQuoteNumericPair.clear();
        selected = Case.ASK_PRICE_QUOTE_NUMERIC_PAIR;
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
        return other instanceof AskPriceQuote branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AskPriceQuote branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
