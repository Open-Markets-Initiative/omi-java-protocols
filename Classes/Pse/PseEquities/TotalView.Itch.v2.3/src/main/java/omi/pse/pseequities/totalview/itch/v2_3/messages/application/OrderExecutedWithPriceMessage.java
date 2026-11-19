package omi.pse.pseequities.totalview.itch.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.pse.pseequities.totalview.itch.v2_3.fields.ExecutedQuantityField;
import omi.pse.pseequities.totalview.itch.v2_3.fields.MatchNumberField;
import omi.pse.pseequities.totalview.itch.v2_3.fields.OrderExecutionPriceField;
import omi.pse.pseequities.totalview.itch.v2_3.fields.OrderNumberField;
import omi.pse.pseequities.totalview.itch.v2_3.fields.PrintableField;
import omi.pse.pseequities.totalview.itch.v2_3.fields.TimestampField;
import omi.pse.pseequities.totalview.itch.v2_3.types.Field;
import omi.pse.pseequities.totalview.itch.v2_3.types.Message;
import omi.pse.pseequities.totalview.itch.v2_3.types.PrintOptions;

/**
 * Represents the OrderExecutedWithPriceMessage message from the TotalView protocol.
 *
 * <p>Order Executed with Price Message.</p>
 */
public final class OrderExecutedWithPriceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed With Price Message";

    /**
     * Nanoseconds since last Time Stamp seconds message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The day unique reference number assigned to the new order.
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * The number of shares executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * The day unique match identifier.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * Indicates if the execution should be reflected in volume calculations.
     */
    private final PrintableField printable = new PrintableField();

    /**
     * The price at which the execution occurred.
     */
    private final OrderExecutionPriceField orderExecutionPrice = new OrderExecutionPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderNumber, executedQuantity, matchNumber, printable, orderExecutionPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The day unique reference number assigned to the new order.
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * The number of shares executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * The day unique match identifier.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * Indicates if the execution should be reflected in volume calculations.
     *
     * @return the Printable field
     */
    public PrintableField printable() {
        return printable;
    }

    /**
     * The price at which the execution occurred.
     *
     * @return the OrderExecutionPrice field
     */
    public OrderExecutionPriceField orderExecutionPrice() {
        return orderExecutionPrice;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!printable.parse(data, cursor)) {
            return false;
        }
        cursor += PrintableField.BYTE_LENGTH;
        return orderExecutionPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = printable.encode(data, cursor);
        cursor = orderExecutionPrice.encode(data, cursor);
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
            case "OrderNumber" -> Optional.of(orderNumber);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "Printable" -> Optional.of(printable);
            case "OrderExecutionPrice" -> Optional.of(orderExecutionPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedWithPriceMessage message)) {
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
        if (!(other instanceof OrderExecutedWithPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
