package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.BuyBrokerIdField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.ExecutedQuantityField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.ExecutionFlagsField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.ExecutionIdField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.OrderBookTypeField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.OrderIdField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.SellBrokerIdField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.fields.TimestampField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.types.Field;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.types.Message;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.types.PrintOptions;

/**
 * Represents the OrderExecutedMessage message from the MulticastFullDepth protocol.
 *
 * <p>Sent when a visible order on Cboe Canada NEO is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id.</p>
 */
public final class OrderExecutedMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Order book to which the trading status applies.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * Unique identifier assigned to this order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of shares executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Cboe Canada NEO generated day-unique execution identifier of this execution.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Trading participant identity of the buyer of the trade (or 1 for anonymous).
     */
    private final BuyBrokerIdField buyBrokerId = new BuyBrokerIdField();

    /**
     * Trading participant identity of the seller of the trade (or 1 for anonymous).
     */
    private final SellBrokerIdField sellBrokerId = new SellBrokerIdField();

    /**
     * Execution flags.
     */
    private final ExecutionFlagsField executionFlags = new ExecutionFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderBookType, orderId, executedQuantity, executionId, buyBrokerId, sellBrokerId, executionFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Order book to which the trading status applies.
     *
     * @return the OrderBookType field
     */
    public OrderBookTypeField orderBookType() {
        return orderBookType;
    }

    /**
     * Unique identifier assigned to this order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Number of shares executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Cboe Canada NEO generated day-unique execution identifier of this execution.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Trading participant identity of the buyer of the trade (or 1 for anonymous).
     *
     * @return the BuyBrokerId field
     */
    public BuyBrokerIdField buyBrokerId() {
        return buyBrokerId;
    }

    /**
     * Trading participant identity of the seller of the trade (or 1 for anonymous).
     *
     * @return the SellBrokerId field
     */
    public SellBrokerIdField sellBrokerId() {
        return sellBrokerId;
    }

    /**
     * Execution flags.
     *
     * @return the ExecutionFlags field
     */
    public ExecutionFlagsField executionFlags() {
        return executionFlags;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!buyBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerIdField.BYTE_LENGTH;
        if (!sellBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += SellBrokerIdField.BYTE_LENGTH;
        return executionFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = buyBrokerId.encode(data, cursor);
        cursor = sellBrokerId.encode(data, cursor);
        cursor = executionFlags.encode(data, cursor);
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
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
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
            case "Timestamp" -> Optional.of(timestampField);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "OrderId" -> Optional.of(orderId);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "ExecutionId" -> Optional.of(executionId);
            case "BuyBrokerId" -> Optional.of(buyBrokerId);
            case "SellBrokerId" -> Optional.of(sellBrokerId);
            case "ExecutionFlags" -> Optional.of(executionFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedMessage message)) {
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
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof OrderExecutedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
