package omi.nse.nsecd.orderentry.nnf.v6_3.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchBuyValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchSellValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchUsedBuyValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchUsedSellValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserOrderBuyValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserOrderSellValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserOrderUsedBuyValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserOrderUsedSellValueLimitField;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.GroupEntry;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * The InstrumentUser record a message holds.
 *
 * <p>INSTRUMENT_USER</p>
 */
public final class InstrumentUser implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "InstrumentUser";

    /**
     * This field should contain branch buy limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     */
    private final BranchBuyValueLimitField branchBuyValueLimit = new BranchBuyValueLimitField();

    /**
     * This field should contain branch sell limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     */
    private final BranchSellValueLimitField branchSellValueLimit = new BranchSellValueLimitField();

    /**
     * BranchUsedBuyValueLimit
     */
    private final BranchUsedBuyValueLimitField branchUsedBuyValueLimit = new BranchUsedBuyValueLimitField();

    /**
     * BranchUsedSellValueLimit
     */
    private final BranchUsedSellValueLimitField branchUsedSellValueLimit = new BranchUsedSellValueLimitField();

    /**
     * This field should contain user buy limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     */
    private final UserOrderBuyValueLimitField userOrderBuyValueLimit = new UserOrderBuyValueLimitField();

    /**
     * This field should contain user sell limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     */
    private final UserOrderSellValueLimitField userOrderSellValueLimit = new UserOrderSellValueLimitField();

    /**
     * UserOrderUsedBuyValueLimit
     */
    private final UserOrderUsedBuyValueLimitField userOrderUsedBuyValueLimit = new UserOrderUsedBuyValueLimitField();

    /**
     * UserOrderUsedSellValueLimit
     */
    private final UserOrderUsedSellValueLimitField userOrderUsedSellValueLimit = new UserOrderUsedSellValueLimitField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(branchBuyValueLimit, branchSellValueLimit, branchUsedBuyValueLimit, branchUsedSellValueLimit, userOrderBuyValueLimit, userOrderSellValueLimit, userOrderUsedBuyValueLimit, userOrderUsedSellValueLimit);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field should contain branch buy limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     *
     * @return the BranchBuyValueLimit field
     */
    public BranchBuyValueLimitField branchBuyValueLimit() {
        return branchBuyValueLimit;
    }

    /**
     * This field should contain branch sell limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     *
     * @return the BranchSellValueLimit field
     */
    public BranchSellValueLimitField branchSellValueLimit() {
        return branchSellValueLimit;
    }

    /**
     * BranchUsedBuyValueLimit
     *
     * @return the BranchUsedBuyValueLimit field
     */
    public BranchUsedBuyValueLimitField branchUsedBuyValueLimit() {
        return branchUsedBuyValueLimit;
    }

    /**
     * BranchUsedSellValueLimit
     *
     * @return the BranchUsedSellValueLimit field
     */
    public BranchUsedSellValueLimitField branchUsedSellValueLimit() {
        return branchUsedSellValueLimit;
    }

    /**
     * This field should contain user buy limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     *
     * @return the UserOrderBuyValueLimit field
     */
    public UserOrderBuyValueLimitField userOrderBuyValueLimit() {
        return userOrderBuyValueLimit;
    }

    /**
     * This field should contain user sell limit to be set (in lakhs) Valid values: 0 to 99999999999.99 This should be multiplied by (100000*10000000) before sending to the trading system
     *
     * @return the UserOrderSellValueLimit field
     */
    public UserOrderSellValueLimitField userOrderSellValueLimit() {
        return userOrderSellValueLimit;
    }

    /**
     * UserOrderUsedBuyValueLimit
     *
     * @return the UserOrderUsedBuyValueLimit field
     */
    public UserOrderUsedBuyValueLimitField userOrderUsedBuyValueLimit() {
        return userOrderUsedBuyValueLimit;
    }

    /**
     * UserOrderUsedSellValueLimit
     *
     * @return the UserOrderUsedSellValueLimit field
     */
    public UserOrderUsedSellValueLimitField userOrderUsedSellValueLimit() {
        return userOrderUsedSellValueLimit;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!branchBuyValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += BranchBuyValueLimitField.BYTE_LENGTH;
        if (!branchSellValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += BranchSellValueLimitField.BYTE_LENGTH;
        if (!branchUsedBuyValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += BranchUsedBuyValueLimitField.BYTE_LENGTH;
        if (!branchUsedSellValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += BranchUsedSellValueLimitField.BYTE_LENGTH;
        if (!userOrderBuyValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += UserOrderBuyValueLimitField.BYTE_LENGTH;
        if (!userOrderSellValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += UserOrderSellValueLimitField.BYTE_LENGTH;
        if (!userOrderUsedBuyValueLimit.parse(data, cursor)) {
            return false;
        }
        cursor += UserOrderUsedBuyValueLimitField.BYTE_LENGTH;
        return userOrderUsedSellValueLimit.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = branchBuyValueLimit.encode(data, cursor);
        cursor = branchSellValueLimit.encode(data, cursor);
        cursor = branchUsedBuyValueLimit.encode(data, cursor);
        cursor = branchUsedSellValueLimit.encode(data, cursor);
        cursor = userOrderBuyValueLimit.encode(data, cursor);
        cursor = userOrderSellValueLimit.encode(data, cursor);
        cursor = userOrderUsedBuyValueLimit.encode(data, cursor);
        cursor = userOrderUsedSellValueLimit.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "BranchBuyValueLimit" -> Optional.of(branchBuyValueLimit);
            case "BranchSellValueLimit" -> Optional.of(branchSellValueLimit);
            case "BranchUsedBuyValueLimit" -> Optional.of(branchUsedBuyValueLimit);
            case "BranchUsedSellValueLimit" -> Optional.of(branchUsedSellValueLimit);
            case "UserOrderBuyValueLimit" -> Optional.of(userOrderBuyValueLimit);
            case "UserOrderSellValueLimit" -> Optional.of(userOrderSellValueLimit);
            case "UserOrderUsedBuyValueLimit" -> Optional.of(userOrderUsedBuyValueLimit);
            case "UserOrderUsedSellValueLimit" -> Optional.of(userOrderUsedSellValueLimit);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof InstrumentUser message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentUser message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
