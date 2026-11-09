package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.OrderPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OrderPriceNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The OrderPriceFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OrderPriceFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OrderPriceFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when OrderPriceFractionIndicator is "A".
         */
        ORDER_PRICE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "B".
         */
        ORDER_PRICE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "C".
         */
        ORDER_PRICE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "D".
         */
        ORDER_PRICE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "E".
         */
        ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "F".
         */
        ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when OrderPriceFractionIndicator is "G".
         */
        ORDER_PRICE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        ORDER_PRICE_NUMERIC_PAIR
    }

    private final OrderPriceNegativeWholePair orderPriceNegativeWholePair = new OrderPriceNegativeWholePair();
    private final OrderPriceNegativeTenPair orderPriceNegativeTenPair = new OrderPriceNegativeTenPair();
    private final OrderPriceNegativeHundredPair orderPriceNegativeHundredPair = new OrderPriceNegativeHundredPair();
    private final OrderPriceNegativeThousandPair orderPriceNegativeThousandPair = new OrderPriceNegativeThousandPair();
    private final OrderPriceNegativeTenThousandPair orderPriceNegativeTenThousandPair = new OrderPriceNegativeTenThousandPair();
    private final OrderPriceNegativeHundredThousandPair orderPriceNegativeHundredThousandPair = new OrderPriceNegativeHundredThousandPair();
    private final OrderPriceNegativeMillionPair orderPriceNegativeMillionPair = new OrderPriceNegativeMillionPair();
    private final OrderPriceNumericPair orderPriceNumericPair = new OrderPriceNumericPair();
    private Case selected = Case.ORDER_PRICE_NUMERIC_PAIR;

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
            case ORDER_PRICE_NEGATIVE_WHOLE_PAIR -> orderPriceNegativeWholePair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_WHOLE);
            case ORDER_PRICE_NEGATIVE_TEN_PAIR -> orderPriceNegativeTenPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_TEN);
            case ORDER_PRICE_NEGATIVE_HUNDRED_PAIR -> orderPriceNegativeHundredPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_HUNDRED);
            case ORDER_PRICE_NEGATIVE_THOUSAND_PAIR -> orderPriceNegativeThousandPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_THOUSAND);
            case ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> orderPriceNegativeTenThousandPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> orderPriceNegativeHundredThousandPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case ORDER_PRICE_NEGATIVE_MILLION_PAIR -> orderPriceNegativeMillionPair.orderPriceFractionIndicator().value(OrderPriceFractionIndicator.NEGATIVE_MILLION);
            case ORDER_PRICE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the OrderPriceNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeWholePair orderPriceNegativeWholePair() {
        return orderPriceNegativeWholePair;
    }

    /**
     * Returns the OrderPriceNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeTenPair orderPriceNegativeTenPair() {
        return orderPriceNegativeTenPair;
    }

    /**
     * Returns the OrderPriceNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeHundredPair orderPriceNegativeHundredPair() {
        return orderPriceNegativeHundredPair;
    }

    /**
     * Returns the OrderPriceNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeThousandPair orderPriceNegativeThousandPair() {
        return orderPriceNegativeThousandPair;
    }

    /**
     * Returns the OrderPriceNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeTenThousandPair orderPriceNegativeTenThousandPair() {
        return orderPriceNegativeTenThousandPair;
    }

    /**
     * Returns the OrderPriceNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeHundredThousandPair orderPriceNegativeHundredThousandPair() {
        return orderPriceNegativeHundredThousandPair;
    }

    /**
     * Returns the OrderPriceNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNegativeMillionPair orderPriceNegativeMillionPair() {
        return orderPriceNegativeMillionPair;
    }

    /**
     * Returns the OrderPriceNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderPriceNumericPair orderPriceNumericPair() {
        return orderPriceNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case ORDER_PRICE_NEGATIVE_WHOLE_PAIR -> orderPriceNegativeWholePair;
            case ORDER_PRICE_NEGATIVE_TEN_PAIR -> orderPriceNegativeTenPair;
            case ORDER_PRICE_NEGATIVE_HUNDRED_PAIR -> orderPriceNegativeHundredPair;
            case ORDER_PRICE_NEGATIVE_THOUSAND_PAIR -> orderPriceNegativeThousandPair;
            case ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR -> orderPriceNegativeTenThousandPair;
            case ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> orderPriceNegativeHundredThousandPair;
            case ORDER_PRICE_NEGATIVE_MILLION_PAIR -> orderPriceNegativeMillionPair;
            case ORDER_PRICE_NUMERIC_PAIR -> orderPriceNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.ORDER_PRICE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.ORDER_PRICE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.ORDER_PRICE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.ORDER_PRICE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.ORDER_PRICE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.ORDER_PRICE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.ORDER_PRICE_NEGATIVE_MILLION_PAIR;
        }
        return Case.ORDER_PRICE_NUMERIC_PAIR;
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
        orderPriceNegativeWholePair.clear();
        orderPriceNegativeTenPair.clear();
        orderPriceNegativeHundredPair.clear();
        orderPriceNegativeThousandPair.clear();
        orderPriceNegativeTenThousandPair.clear();
        orderPriceNegativeHundredThousandPair.clear();
        orderPriceNegativeMillionPair.clear();
        orderPriceNumericPair.clear();
        selected = Case.ORDER_PRICE_NUMERIC_PAIR;
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
        return other instanceof OrderPriceFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OrderPriceFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
