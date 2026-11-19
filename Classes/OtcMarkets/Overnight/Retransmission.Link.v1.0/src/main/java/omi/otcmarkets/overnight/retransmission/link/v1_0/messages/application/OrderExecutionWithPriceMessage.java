package omi.otcmarkets.overnight.retransmission.link.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.ExecutedQuantityField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.ExecutionIdField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.OrderIdField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.PriceField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.RemainingQuantityField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.fields.TimeField;
import omi.otcmarkets.overnight.retransmission.link.v1_0.types.Field;
import omi.otcmarkets.overnight.retransmission.link.v1_0.types.Message;
import omi.otcmarkets.overnight.retransmission.link.v1_0.types.PrintOptions;

/**
 * Represents the OrderExecutionWithPriceMessage message from the Retransmission protocol.
 *
 * <p>Appears in the TCP spin response payload during DOB replay. Published when all or some of the displayed quantity of a previously published order executes at a price different than the published price.</p>
 */
public final class OrderExecutionWithPriceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0019';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution With Price Message";

    /**
     * Milliseconds from midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Day-specific identifier assigned to this order. The Order ID consists of 14 alphanumeric characters; use the first 12 characters and convert them from base-36 to a 64-bit integer.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of shares executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Number of shares remaining after the execution. Will be zero if fully filled.
     */
    private final RemainingQuantityField remainingQuantity = new RemainingQuantityField();

    /**
     * System generated day-unique execution identifier of this execution.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * The limit order price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     */
    private final PriceField price = new PriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, orderId, executedQuantity, remainingQuantity, executionId, price);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Milliseconds from midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Day-specific identifier assigned to this order. The Order ID consists of 14 alphanumeric characters; use the first 12 characters and convert them from base-36 to a 64-bit integer.
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
     * Number of shares remaining after the execution. Will be zero if fully filled.
     *
     * @return the RemainingQuantity field
     */
    public RemainingQuantityField remainingQuantity() {
        return remainingQuantity;
    }

    /**
     * System generated day-unique execution identifier of this execution.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * The limit order price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        return Optional.empty();
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!remainingQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingQuantityField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        return price.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = remainingQuantity.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = price.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "OrderId" -> Optional.of(orderId);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "RemainingQuantity" -> Optional.of(remainingQuantity);
            case "ExecutionId" -> Optional.of(executionId);
            case "Price" -> Optional.of(price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutionWithPriceMessage message)) {
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
        if (!(other instanceof OrderExecutionWithPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
