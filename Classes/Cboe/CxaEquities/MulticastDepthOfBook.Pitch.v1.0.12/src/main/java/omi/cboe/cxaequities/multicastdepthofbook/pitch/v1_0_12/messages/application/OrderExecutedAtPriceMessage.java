package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ContraOrderIdField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ContraPidField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ExecutedQuantityField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ExecutionIdField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ExecutionTypeField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.OrderIdField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.PriceField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ReservedField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.TimestampField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.Field;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.Message;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.PrintOptions;

/**
 * Represents the OrderExecutedAtPriceMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Used to update lit orders that have fully or partially executed in an auction. There is one Order Executed at Price message per auction trade, which includes the order IDs of both resting orders matched in the trade. Each message is followed by either a Reduce Size message (if the contra order has partially executed) or a Delete Order message (if the contra order has fully executed).</p>
 */
public final class OrderExecutedAtPriceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed At Price Message";

    /**
     * Nanoseconds since epoch.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Day-specific identifier assigned to this order. Order Ids received on PITCH may be compared to those received on order acknowledgements in FIX or BOE by converting the decimal value to a base 36 value.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of shares executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * CXA generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break message.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Order Id of the contra order that matched with this order.
     */
    private final ContraOrderIdField contraOrderId = new ContraOrderIdField();

    /**
     * Contra Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     */
    private final ContraPidField contraPid = new ContraPidField();

    /**
     * Type of auction execution.
     */
    private final ExecutionTypeField executionType = new ExecutionTypeField();

    /**
     * The display price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Reserved (undefined).
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderId, executedQuantity, executionId, contraOrderId, contraPid, executionType, price, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Day-specific identifier assigned to this order. Order Ids received on PITCH may be compared to those received on order acknowledgements in FIX or BOE by converting the decimal value to a base 36 value.
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
     * CXA generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break message.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Order Id of the contra order that matched with this order.
     *
     * @return the ContraOrderId field
     */
    public ContraOrderIdField contraOrderId() {
        return contraOrderId;
    }

    /**
     * Contra Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     *
     * @return the ContraPid field
     */
    public ContraPidField contraPid() {
        return contraPid;
    }

    /**
     * Type of auction execution.
     *
     * @return the ExecutionType field
     */
    public ExecutionTypeField executionType() {
        return executionType;
    }

    /**
     * The display price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Reserved (undefined).
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (!contraOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderIdField.BYTE_LENGTH;
        if (!contraPid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPidField.BYTE_LENGTH;
        if (!executionType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = contraOrderId.encode(data, cursor);
        cursor = contraPid.encode(data, cursor);
        cursor = executionType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "ExecutionId" -> Optional.of(executionId);
            case "ContraOrderId" -> Optional.of(contraOrderId);
            case "ContraPid" -> Optional.of(contraPid);
            case "ExecutionType" -> Optional.of(executionType);
            case "Price" -> Optional.of(price);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedAtPriceMessage message)) {
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
        if (!(other instanceof OrderExecutedAtPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
