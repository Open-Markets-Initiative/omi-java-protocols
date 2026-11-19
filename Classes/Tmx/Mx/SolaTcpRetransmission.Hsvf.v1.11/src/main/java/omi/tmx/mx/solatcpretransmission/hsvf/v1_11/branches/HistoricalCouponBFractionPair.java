package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.HistoricalCouponFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.HistoricalCouponBNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The HistoricalCouponBFractionPair branch: one of 8 records of 12 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class HistoricalCouponBFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "HistoricalCouponBFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when HistoricalCouponFractionIndicator is "A".
         */
        HISTORICAL_COUPON_B_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "B".
         */
        HISTORICAL_COUPON_B_NEGATIVE_TEN_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "C".
         */
        HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "D".
         */
        HISTORICAL_COUPON_B_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "E".
         */
        HISTORICAL_COUPON_B_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "F".
         */
        HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when HistoricalCouponFractionIndicator is "G".
         */
        HISTORICAL_COUPON_B_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        HISTORICAL_COUPON_B_NUMERIC_PAIR
    }

    private final HistoricalCouponBNegativeWholePair historicalCouponBNegativeWholePair = new HistoricalCouponBNegativeWholePair();
    private final HistoricalCouponBNegativeTenPair historicalCouponBNegativeTenPair = new HistoricalCouponBNegativeTenPair();
    private final HistoricalCouponBNegativeHundredPair historicalCouponBNegativeHundredPair = new HistoricalCouponBNegativeHundredPair();
    private final HistoricalCouponBNegativeThousandPair historicalCouponBNegativeThousandPair = new HistoricalCouponBNegativeThousandPair();
    private final HistoricalCouponBNegativeTenThousandPair historicalCouponBNegativeTenThousandPair = new HistoricalCouponBNegativeTenThousandPair();
    private final HistoricalCouponBNegativeHundredThousandPair historicalCouponBNegativeHundredThousandPair = new HistoricalCouponBNegativeHundredThousandPair();
    private final HistoricalCouponBNegativeMillionPair historicalCouponBNegativeMillionPair = new HistoricalCouponBNegativeMillionPair();
    private final HistoricalCouponBNumericPair historicalCouponBNumericPair = new HistoricalCouponBNumericPair();
    private Case selected = Case.HISTORICAL_COUPON_B_NUMERIC_PAIR;

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
            case HISTORICAL_COUPON_B_NEGATIVE_WHOLE_PAIR -> historicalCouponBNegativeWholePair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_WHOLE);
            case HISTORICAL_COUPON_B_NEGATIVE_TEN_PAIR -> historicalCouponBNegativeTenPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_TEN);
            case HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_PAIR -> historicalCouponBNegativeHundredPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_HUNDRED);
            case HISTORICAL_COUPON_B_NEGATIVE_THOUSAND_PAIR -> historicalCouponBNegativeThousandPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_THOUSAND);
            case HISTORICAL_COUPON_B_NEGATIVE_TEN_THOUSAND_PAIR -> historicalCouponBNegativeTenThousandPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_THOUSAND_PAIR -> historicalCouponBNegativeHundredThousandPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case HISTORICAL_COUPON_B_NEGATIVE_MILLION_PAIR -> historicalCouponBNegativeMillionPair.historicalCouponFractionIndicator().value(HistoricalCouponFractionIndicator.NEGATIVE_MILLION);
            case HISTORICAL_COUPON_B_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the HistoricalCouponBNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeWholePair historicalCouponBNegativeWholePair() {
        return historicalCouponBNegativeWholePair;
    }

    /**
     * Returns the HistoricalCouponBNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeTenPair historicalCouponBNegativeTenPair() {
        return historicalCouponBNegativeTenPair;
    }

    /**
     * Returns the HistoricalCouponBNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeHundredPair historicalCouponBNegativeHundredPair() {
        return historicalCouponBNegativeHundredPair;
    }

    /**
     * Returns the HistoricalCouponBNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeThousandPair historicalCouponBNegativeThousandPair() {
        return historicalCouponBNegativeThousandPair;
    }

    /**
     * Returns the HistoricalCouponBNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeTenThousandPair historicalCouponBNegativeTenThousandPair() {
        return historicalCouponBNegativeTenThousandPair;
    }

    /**
     * Returns the HistoricalCouponBNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeHundredThousandPair historicalCouponBNegativeHundredThousandPair() {
        return historicalCouponBNegativeHundredThousandPair;
    }

    /**
     * Returns the HistoricalCouponBNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNegativeMillionPair historicalCouponBNegativeMillionPair() {
        return historicalCouponBNegativeMillionPair;
    }

    /**
     * Returns the HistoricalCouponBNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HistoricalCouponBNumericPair historicalCouponBNumericPair() {
        return historicalCouponBNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case HISTORICAL_COUPON_B_NEGATIVE_WHOLE_PAIR -> historicalCouponBNegativeWholePair;
            case HISTORICAL_COUPON_B_NEGATIVE_TEN_PAIR -> historicalCouponBNegativeTenPair;
            case HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_PAIR -> historicalCouponBNegativeHundredPair;
            case HISTORICAL_COUPON_B_NEGATIVE_THOUSAND_PAIR -> historicalCouponBNegativeThousandPair;
            case HISTORICAL_COUPON_B_NEGATIVE_TEN_THOUSAND_PAIR -> historicalCouponBNegativeTenThousandPair;
            case HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_THOUSAND_PAIR -> historicalCouponBNegativeHundredThousandPair;
            case HISTORICAL_COUPON_B_NEGATIVE_MILLION_PAIR -> historicalCouponBNegativeMillionPair;
            case HISTORICAL_COUPON_B_NUMERIC_PAIR -> historicalCouponBNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 11] == (byte) 'A') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 11] == (byte) 'B') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 11] == (byte) 'C') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 11] == (byte) 'D') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'E') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'F') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'G') {
            return Case.HISTORICAL_COUPON_B_NEGATIVE_MILLION_PAIR;
        }
        return Case.HISTORICAL_COUPON_B_NUMERIC_PAIR;
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
        historicalCouponBNegativeWholePair.clear();
        historicalCouponBNegativeTenPair.clear();
        historicalCouponBNegativeHundredPair.clear();
        historicalCouponBNegativeThousandPair.clear();
        historicalCouponBNegativeTenThousandPair.clear();
        historicalCouponBNegativeHundredThousandPair.clear();
        historicalCouponBNegativeMillionPair.clear();
        historicalCouponBNumericPair.clear();
        selected = Case.HISTORICAL_COUPON_B_NUMERIC_PAIR;
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
        return other instanceof HistoricalCouponBFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof HistoricalCouponBFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
