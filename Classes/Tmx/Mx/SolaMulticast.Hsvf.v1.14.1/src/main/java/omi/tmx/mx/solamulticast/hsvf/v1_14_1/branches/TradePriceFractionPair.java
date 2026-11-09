package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.TradePriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.TradePriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The TradePriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class TradePriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "TradePriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when TradePriceFractionIndicator is "A".
         */
        TRADE_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "B".
         */
        TRADE_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "C".
         */
        TRADE_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "D".
         */
        TRADE_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "E".
         */
        TRADE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "F".
         */
        TRADE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when TradePriceFractionIndicator is "G".
         */
        TRADE_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        TRADE_PRICE_NUMERIC_PAIR
    }

    private final TradePriceNegativeWholePair tradePriceNegativeWholePair = new TradePriceNegativeWholePair();
    private final TradePriceNegativeTenPair tradePriceNegativeTenPair = new TradePriceNegativeTenPair();
    private final TradePriceNegativeHundredPair tradePriceNegativeHundredPair = new TradePriceNegativeHundredPair();
    private final TradePriceNegativeThousandPair tradePriceNegativeThousandPair = new TradePriceNegativeThousandPair();
    private final TradePriceNegativeTenThousandPair tradePriceNegativeTenThousandPair = new TradePriceNegativeTenThousandPair();
    private final TradePriceNegativeHundredThousandPair tradePriceNegativeHundredThousandPair = new TradePriceNegativeHundredThousandPair();
    private final TradePriceNegativeMillionPair tradePriceNegativeMillionPair = new TradePriceNegativeMillionPair();
    private final TradePriceNumericPair tradePriceNumericPair = new TradePriceNumericPair();
    private Case selected = Case.TRADE_PRICE_NUMERIC_PAIR;

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
            case TRADE_PRICE_NEGATIVE_WHOLE_PAIR -> tradePriceNegativeWholePair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_WHOLE);
            case TRADE_PRICE_NEGATIVE_TEN_PAIR -> tradePriceNegativeTenPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_TEN);
            case TRADE_PRICE_NEGATIVE_HUNDRED_PAIR -> tradePriceNegativeHundredPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_HUNDRED);
            case TRADE_PRICE_NEGATIVE_THOUSAND_PAIR -> tradePriceNegativeThousandPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_THOUSAND);
            case TRADE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> tradePriceNegativeTenThousandPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case TRADE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tradePriceNegativeHundredThousandPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case TRADE_PRICE_NEGATIVE_MILLION_PAIR -> tradePriceNegativeMillionPair.tradePriceFractionIndicator().value(TradePriceFractionIndicator.NEGATIVE_MILLION);
            case TRADE_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the TradePriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeWholePair tradePriceNegativeWholePair() {
        return tradePriceNegativeWholePair;
    }

    /**
     * Returns the TradePriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeTenPair tradePriceNegativeTenPair() {
        return tradePriceNegativeTenPair;
    }

    /**
     * Returns the TradePriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeHundredPair tradePriceNegativeHundredPair() {
        return tradePriceNegativeHundredPair;
    }

    /**
     * Returns the TradePriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeThousandPair tradePriceNegativeThousandPair() {
        return tradePriceNegativeThousandPair;
    }

    /**
     * Returns the TradePriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeTenThousandPair tradePriceNegativeTenThousandPair() {
        return tradePriceNegativeTenThousandPair;
    }

    /**
     * Returns the TradePriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeHundredThousandPair tradePriceNegativeHundredThousandPair() {
        return tradePriceNegativeHundredThousandPair;
    }

    /**
     * Returns the TradePriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNegativeMillionPair tradePriceNegativeMillionPair() {
        return tradePriceNegativeMillionPair;
    }

    /**
     * Returns the TradePriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradePriceNumericPair tradePriceNumericPair() {
        return tradePriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case TRADE_PRICE_NEGATIVE_WHOLE_PAIR -> tradePriceNegativeWholePair;
            case TRADE_PRICE_NEGATIVE_TEN_PAIR -> tradePriceNegativeTenPair;
            case TRADE_PRICE_NEGATIVE_HUNDRED_PAIR -> tradePriceNegativeHundredPair;
            case TRADE_PRICE_NEGATIVE_THOUSAND_PAIR -> tradePriceNegativeThousandPair;
            case TRADE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> tradePriceNegativeTenThousandPair;
            case TRADE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> tradePriceNegativeHundredThousandPair;
            case TRADE_PRICE_NEGATIVE_MILLION_PAIR -> tradePriceNegativeMillionPair;
            case TRADE_PRICE_NUMERIC_PAIR -> tradePriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.TRADE_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.TRADE_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.TRADE_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.TRADE_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.TRADE_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.TRADE_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.TRADE_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.TRADE_PRICE_NUMERIC_PAIR;
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
        tradePriceNegativeWholePair.clear();
        tradePriceNegativeTenPair.clear();
        tradePriceNegativeHundredPair.clear();
        tradePriceNegativeThousandPair.clear();
        tradePriceNegativeTenThousandPair.clear();
        tradePriceNegativeHundredThousandPair.clear();
        tradePriceNegativeMillionPair.clear();
        tradePriceNumericPair.clear();
        selected = Case.TRADE_PRICE_NUMERIC_PAIR;
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
        return other instanceof TradePriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof TradePriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
