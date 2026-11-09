package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.CouponFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.CouponNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The CouponFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class CouponFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "CouponFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when CouponFractionIndicator is "A".
         */
        COUPON_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when CouponFractionIndicator is "B".
         */
        COUPON_NEGATIVE_TEN_PAIR,
        /**
         * Selected when CouponFractionIndicator is "C".
         */
        COUPON_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when CouponFractionIndicator is "D".
         */
        COUPON_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when CouponFractionIndicator is "E".
         */
        COUPON_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when CouponFractionIndicator is "F".
         */
        COUPON_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when CouponFractionIndicator is "G".
         */
        COUPON_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        COUPON_NUMERIC_PAIR
    }

    private final CouponNegativeWholePair couponNegativeWholePair = new CouponNegativeWholePair();
    private final CouponNegativeTenPair couponNegativeTenPair = new CouponNegativeTenPair();
    private final CouponNegativeHundredPair couponNegativeHundredPair = new CouponNegativeHundredPair();
    private final CouponNegativeThousandPair couponNegativeThousandPair = new CouponNegativeThousandPair();
    private final CouponNegativeTenThousandPair couponNegativeTenThousandPair = new CouponNegativeTenThousandPair();
    private final CouponNegativeHundredThousandPair couponNegativeHundredThousandPair = new CouponNegativeHundredThousandPair();
    private final CouponNegativeMillionPair couponNegativeMillionPair = new CouponNegativeMillionPair();
    private final CouponNumericPair couponNumericPair = new CouponNumericPair();
    private Case selected = Case.COUPON_NUMERIC_PAIR;

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
            case COUPON_NEGATIVE_WHOLE_PAIR -> couponNegativeWholePair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_WHOLE);
            case COUPON_NEGATIVE_TEN_PAIR -> couponNegativeTenPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_TEN);
            case COUPON_NEGATIVE_HUNDRED_PAIR -> couponNegativeHundredPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_HUNDRED);
            case COUPON_NEGATIVE_THOUSAND_PAIR -> couponNegativeThousandPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_THOUSAND);
            case COUPON_NEGATIVE_TEN_THOUSAND_PAIR -> couponNegativeTenThousandPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case COUPON_NEGATIVE_HUNDRED_THOUSAND_PAIR -> couponNegativeHundredThousandPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case COUPON_NEGATIVE_MILLION_PAIR -> couponNegativeMillionPair.couponFractionIndicator().value(CouponFractionIndicator.NEGATIVE_MILLION);
            case COUPON_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the CouponNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeWholePair couponNegativeWholePair() {
        return couponNegativeWholePair;
    }

    /**
     * Returns the CouponNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeTenPair couponNegativeTenPair() {
        return couponNegativeTenPair;
    }

    /**
     * Returns the CouponNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeHundredPair couponNegativeHundredPair() {
        return couponNegativeHundredPair;
    }

    /**
     * Returns the CouponNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeThousandPair couponNegativeThousandPair() {
        return couponNegativeThousandPair;
    }

    /**
     * Returns the CouponNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeTenThousandPair couponNegativeTenThousandPair() {
        return couponNegativeTenThousandPair;
    }

    /**
     * Returns the CouponNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeHundredThousandPair couponNegativeHundredThousandPair() {
        return couponNegativeHundredThousandPair;
    }

    /**
     * Returns the CouponNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNegativeMillionPair couponNegativeMillionPair() {
        return couponNegativeMillionPair;
    }

    /**
     * Returns the CouponNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CouponNumericPair couponNumericPair() {
        return couponNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case COUPON_NEGATIVE_WHOLE_PAIR -> couponNegativeWholePair;
            case COUPON_NEGATIVE_TEN_PAIR -> couponNegativeTenPair;
            case COUPON_NEGATIVE_HUNDRED_PAIR -> couponNegativeHundredPair;
            case COUPON_NEGATIVE_THOUSAND_PAIR -> couponNegativeThousandPair;
            case COUPON_NEGATIVE_TEN_THOUSAND_PAIR -> couponNegativeTenThousandPair;
            case COUPON_NEGATIVE_HUNDRED_THOUSAND_PAIR -> couponNegativeHundredThousandPair;
            case COUPON_NEGATIVE_MILLION_PAIR -> couponNegativeMillionPair;
            case COUPON_NUMERIC_PAIR -> couponNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.COUPON_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.COUPON_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.COUPON_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.COUPON_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.COUPON_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.COUPON_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.COUPON_NEGATIVE_MILLION_PAIR;
        }
        return Case.COUPON_NUMERIC_PAIR;
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
        couponNegativeWholePair.clear();
        couponNegativeTenPair.clear();
        couponNegativeHundredPair.clear();
        couponNegativeThousandPair.clear();
        couponNegativeTenThousandPair.clear();
        couponNegativeHundredThousandPair.clear();
        couponNegativeMillionPair.clear();
        couponNumericPair.clear();
        selected = Case.COUPON_NUMERIC_PAIR;
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
        return other instanceof CouponFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof CouponFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
