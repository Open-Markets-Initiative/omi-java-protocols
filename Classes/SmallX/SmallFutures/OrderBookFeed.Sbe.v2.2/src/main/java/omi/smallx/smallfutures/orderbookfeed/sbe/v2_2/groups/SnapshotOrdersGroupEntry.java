package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OrderAttributesField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OrderIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OrderPriorityField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SideField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SizeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TimeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.GroupEntry;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * One entry of the SnapshotOrdersGroup repeating group.
 *
 * <p>NoOrders</p>
 */
public final class SnapshotOrdersGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 43;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SnapshotOrdersGroup";

    /**
     * Unique numeric order identifier. Order id here is the same as reported in FIX protocol
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order side
     */
    private final SideField side = new SideField();

    /**
     * Trade price, or the order price in the Order Book Snapshot Message
     */
    private final PriceField price = new PriceField();

    /**
     * Trade quantity, or the order quantity in order book messages
     */
    private final SizeField size = new SizeField();

    /**
     * Order priority assigned to all orders in a book. This field can be used to compare order priority in a queue across all orders on the same price level: an order with lower field value has higher priority. Implied orders have maximum value of order priority (0x7fffffffffffffff) so that they always have less priority than any direct order
     */
    private final OrderPriorityField orderPriority = new OrderPriorityField();

    /**
     * Bit set of order attribute flags
     */
    private final OrderAttributesField orderAttributes = new OrderAttributesField();

    /**
     * Trade timestamp, or the order timestamp in the Order Book Snapshot Message
     */
    private final TimeField time = new TimeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderId, side, price, size, orderPriority, orderAttributes, time);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique numeric order identifier. Order id here is the same as reported in FIX protocol
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Trade price, or the order price in the Order Book Snapshot Message
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Trade quantity, or the order quantity in order book messages
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Order priority assigned to all orders in a book. This field can be used to compare order priority in a queue across all orders on the same price level: an order with lower field value has higher priority. Implied orders have maximum value of order priority (0x7fffffffffffffff) so that they always have less priority than any direct order
     *
     * @return the OrderPriority field
     */
    public OrderPriorityField orderPriority() {
        return orderPriority;
    }

    /**
     * Bit set of order attribute flags
     *
     * @return the OrderAttributes field
     */
    public OrderAttributesField orderAttributes() {
        return orderAttributes;
    }

    /**
     * Trade timestamp, or the order timestamp in the Order Book Snapshot Message
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    private int wireBlock = ROOT_BYTE_LENGTH;

    private byte[] blockTrailer = new byte[0];

    /**
     * Sets the width the wire gives this entry's fixed part, as the list holding it states.
     *
     * @param wireBlock the width in bytes
     */
    public void wireBlock(int wireBlock) {
        this.wireBlock = wireBlock;
    }

    /**
     * Returns the bytes of this entry's known fields that lie wholly inside its block.
     *
     * @return the width in bytes; a field past it is absent
     */
    public int knownBytes() {
        if (wireBlock >= 43) {
            return 43;
        }
        if (wireBlock >= 35) {
            return 35;
        }
        if (wireBlock >= 33) {
            return 33;
        }
        if (wireBlock >= 25) {
            return 25;
        }
        if (wireBlock >= 17) {
            return 17;
        }
        if (wireBlock >= 9) {
            return 9;
        }
        if (wireBlock >= 8) {
            return 8;
        }
        return 0;
    }

    /**
     * Returns what this entry's block held past the fields this class knows.
     *
     * @return a copy of those bytes, empty when the block held no more
     */
    public byte[] blockTrailer() {
        return blockTrailer.clone();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock;
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
        return parseBlock(data, offset, end, ROOT_BYTE_LENGTH);
    }

    /**
     * Decodes this entry given the width the wire states for its fixed part.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @param block  the width of the fixed part
     * @return true when every field inside the block, and what follows it, decoded
     */
    public boolean parseBlock(byte[] data, int offset, int end, int block) {
        clear();
        this.wireBlock = block;
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock) {
            return false;
        }

        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            if (!orderId.parse(data, cursor)) {
                return false;
            }
            cursor += OrderIdField.BYTE_LENGTH;
        }
        if (known >= 9) {
            if (!side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (known >= 17) {
            if (!price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (known >= 25) {
            if (!size.parse(data, cursor)) {
                return false;
            }
            cursor += SizeField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!orderPriority.parse(data, cursor)) {
                return false;
            }
            cursor += OrderPriorityField.BYTE_LENGTH;
        }
        if (known >= 35) {
            if (!orderAttributes.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAttributesField.BYTE_LENGTH;
        }
        if (known >= 43) {
            if (!time.parse(data, cursor)) {
                return false;
            }
            cursor += TimeField.BYTE_LENGTH;
        }
        if (wireBlock > known) {
            this.blockTrailer = Arrays.copyOfRange(data, offset + known, offset + wireBlock);
        }
        cursor = offset + wireBlock;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            cursor = orderId.encode(data, cursor);
        }
        if (known >= 9) {
            cursor = side.encode(data, cursor);
        }
        if (known >= 17) {
            cursor = price.encode(data, cursor);
        }
        if (known >= 25) {
            cursor = size.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = orderPriority.encode(data, cursor);
        }
        if (known >= 35) {
            cursor = orderAttributes.encode(data, cursor);
        }
        if (known >= 43) {
            cursor = time.encode(data, cursor);
        }
        int kept = Math.min(blockTrailer.length, wireBlock - known);
        System.arraycopy(blockTrailer, 0, data, offset + known, kept);
        Arrays.fill(data, offset + known + kept, offset + wireBlock, (byte) 0);
        cursor = offset + wireBlock;
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.blockTrailer = new byte[0];
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
            if ((!decoded || field.hasValue()) && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isValid()) {
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
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "OrderPriority" -> Optional.of(orderPriority);
            case "OrderAttributes" -> Optional.of(orderAttributes);
            case "Time" -> Optional.of(time);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SnapshotOrdersGroupEntry message)) {
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
        if (!(other instanceof SnapshotOrdersGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
