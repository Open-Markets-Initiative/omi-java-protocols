package omi.cboe.bzxoptions.complex.pitch.v2_1_61.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.ExecutedQuantityField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.ExecutionIdField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.OrderIdField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.RemainingQuantityField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.SignedPriceLongField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.TimeOffsetField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.fields.TradeConditionField;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.types.Field;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.types.Message;
import omi.cboe.bzxoptions.complex.pitch.v2_1_61.types.PrintOptions;

/**
 * Represents the OrderExecutedAtPriceSizeMessage message from the Complex protocol.
 *
 * <p>Order Execution at Price/Size messages are sent when a complex order on the Cboe complex book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the complex order should be completely removed from the complex book. Order Execution at Price/Size messages may also be sent in the event the existing size for Order Id is not equal to Executed Quantity + Remaining Quantity. In this case the complex order should be prioritized the same as a new complex order.</p>
 */
public final class OrderExecutedAtPriceSizeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed At Price Size Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Day-specific identifier assigned to this order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Instrument quantity executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Number of contracts remaining after the execution.
     */
    private final RemainingQuantityField remainingQuantity = new RemainingQuantityField();

    /**
     * Cboe generated day-unique execution identifier of this execution.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * The limit order price.
     */
    private final SignedPriceLongField signedPriceLong = new SignedPriceLongField();

    /**
     * See Options Trade Condition Codes for details.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, orderId, executedQuantity, remainingQuantity, executionId, signedPriceLong, tradeCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Day-specific identifier assigned to this order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Instrument quantity executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Number of contracts remaining after the execution.
     *
     * @return the RemainingQuantity field
     */
    public RemainingQuantityField remainingQuantity() {
        return remainingQuantity;
    }

    /**
     * Cboe generated day-unique execution identifier of this execution.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * The limit order price.
     *
     * @return the SignedPriceLong field
     */
    public SignedPriceLongField signedPriceLong() {
        return signedPriceLong;
    }

    /**
     * See Options Trade Condition Codes for details.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
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
        if (!signedPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += SignedPriceLongField.BYTE_LENGTH;
        return tradeCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = remainingQuantity.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = signedPriceLong.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "OrderId" -> Optional.of(orderId);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "RemainingQuantity" -> Optional.of(remainingQuantity);
            case "ExecutionId" -> Optional.of(executionId);
            case "SignedPriceLong" -> Optional.of(signedPriceLong);
            case "TradeCondition" -> Optional.of(tradeCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedAtPriceSizeMessage message)) {
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
        if (!(other instanceof OrderExecutedAtPriceSizeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
