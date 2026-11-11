package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.ExecutedSharesField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.MatchNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.OrderReferenceNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.StockLocateField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.TimestampField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.PrintOptions;

/**
 * Represents the OrderExecutedMessage message from the TotalView protocol.
 *
 * <p>This message is sent whenever an order on the book is executed in whole or in part. It is possible to receive several Order Executed Messages for the same order reference number if that order is executed in several parts. The multiple Order Executed Messages on the same order are cumulative.</p>
 */
public final class OrderExecutedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed Message";

    /**
     * Always 0
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * NASDAQ OMX internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The unique reference number assigned to the new order at the time of receipt.
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * The number of shares executed.
     */
    private final ExecutedSharesField executedShares = new ExecutedSharesField();

    /**
     * The NASDAQ generated day-unique Match Number of this execution. The match number is also referenced in the Trade Break Message.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, orderReferenceNumber, executedShares, matchNumber);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Always 0
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * NASDAQ OMX internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The unique reference number assigned to the new order at the time of receipt.
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * The number of shares executed.
     *
     * @return the ExecutedShares field
     */
    public ExecutedSharesField executedShares() {
        return executedShares;
    }

    /**
     * The NASDAQ generated day-unique Match Number of this execution. The match number is also referenced in the Trade Break Message.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
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
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!executedShares.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedSharesField.BYTE_LENGTH;
        return matchNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = executedShares.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
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
            case "StockLocate" -> Optional.of(stockLocate);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "ExecutedShares" -> Optional.of(executedShares);
            case "MatchNumber" -> Optional.of(matchNumber);
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
