package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.enums.PriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.PriceNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.PrintOptions;

/**
 * The PriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class PriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "PriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when PriceFractionIndicator is "A".
         */
        PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when PriceFractionIndicator is "B".
         */
        PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when PriceFractionIndicator is "C".
         */
        PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when PriceFractionIndicator is "D".
         */
        PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when PriceFractionIndicator is "E".
         */
        PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when PriceFractionIndicator is "F".
         */
        PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when PriceFractionIndicator is "G".
         */
        PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        PRICE_NUMERIC_PAIR
    }

    private final PriceNegativeWholePair priceNegativeWholePair = new PriceNegativeWholePair();
    private final PriceNegativeTenPair priceNegativeTenPair = new PriceNegativeTenPair();
    private final PriceNegativeHundredPair priceNegativeHundredPair = new PriceNegativeHundredPair();
    private final PriceNegativeThousandPair priceNegativeThousandPair = new PriceNegativeThousandPair();
    private final PriceNegativeTenThousandPair priceNegativeTenThousandPair = new PriceNegativeTenThousandPair();
    private final PriceNegativeHundredThousandPair priceNegativeHundredThousandPair = new PriceNegativeHundredThousandPair();
    private final PriceNegativeMillionPair priceNegativeMillionPair = new PriceNegativeMillionPair();
    private final PriceNumericPair priceNumericPair = new PriceNumericPair();
    private Case selected = Case.PRICE_NUMERIC_PAIR;

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
            case PRICE_NEGATIVE_WHOLE_PAIR -> priceNegativeWholePair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_WHOLE);
            case PRICE_NEGATIVE_TEN_PAIR -> priceNegativeTenPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_TEN);
            case PRICE_NEGATIVE_HUNDRED_PAIR -> priceNegativeHundredPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_HUNDRED);
            case PRICE_NEGATIVE_THOUSAND_PAIR -> priceNegativeThousandPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_THOUSAND);
            case PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> priceNegativeTenThousandPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> priceNegativeHundredThousandPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case PRICE_NEGATIVE_MILLION_PAIR -> priceNegativeMillionPair.priceFractionIndicator().value(PriceFractionIndicator.NEGATIVE_MILLION);
            case PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the PriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeWholePair priceNegativeWholePair() {
        return priceNegativeWholePair;
    }

    /**
     * Returns the PriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeTenPair priceNegativeTenPair() {
        return priceNegativeTenPair;
    }

    /**
     * Returns the PriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeHundredPair priceNegativeHundredPair() {
        return priceNegativeHundredPair;
    }

    /**
     * Returns the PriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeThousandPair priceNegativeThousandPair() {
        return priceNegativeThousandPair;
    }

    /**
     * Returns the PriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeTenThousandPair priceNegativeTenThousandPair() {
        return priceNegativeTenThousandPair;
    }

    /**
     * Returns the PriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeHundredThousandPair priceNegativeHundredThousandPair() {
        return priceNegativeHundredThousandPair;
    }

    /**
     * Returns the PriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNegativeMillionPair priceNegativeMillionPair() {
        return priceNegativeMillionPair;
    }

    /**
     * Returns the PriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceNumericPair priceNumericPair() {
        return priceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case PRICE_NEGATIVE_WHOLE_PAIR -> priceNegativeWholePair;
            case PRICE_NEGATIVE_TEN_PAIR -> priceNegativeTenPair;
            case PRICE_NEGATIVE_HUNDRED_PAIR -> priceNegativeHundredPair;
            case PRICE_NEGATIVE_THOUSAND_PAIR -> priceNegativeThousandPair;
            case PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> priceNegativeTenThousandPair;
            case PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> priceNegativeHundredThousandPair;
            case PRICE_NEGATIVE_MILLION_PAIR -> priceNegativeMillionPair;
            case PRICE_NUMERIC_PAIR -> priceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.PRICE_NUMERIC_PAIR;
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
        priceNegativeWholePair.clear();
        priceNegativeTenPair.clear();
        priceNegativeHundredPair.clear();
        priceNegativeThousandPair.clear();
        priceNegativeTenThousandPair.clear();
        priceNegativeHundredThousandPair.clear();
        priceNegativeMillionPair.clear();
        priceNumericPair.clear();
        selected = Case.PRICE_NUMERIC_PAIR;
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
        return other instanceof PriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof PriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
