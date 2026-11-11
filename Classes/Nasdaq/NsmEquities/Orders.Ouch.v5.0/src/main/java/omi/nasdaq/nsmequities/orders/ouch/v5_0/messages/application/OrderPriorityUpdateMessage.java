package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.DisplayField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.OrderReferenceNumberField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.PriceField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimestampField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.OrderPriorityUpdateAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.OrderPriorityUpdateAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the OrderPriorityUpdateMessage message from the Orders protocol.
 *
 * <p>A Priority Update Message is sent whenever priority of the order has been changed by the system.</p>
 */
public final class OrderPriorityUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 29;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Priority Update Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * The price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Display
     */
    private final DisplayField display = new DisplayField();

    /**
     * The day-unique Order Reference Number assigned by NASDAQ to this order
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Order Priority Update Appendage
     */
    private final OrderPriorityUpdateAppendageList orderPriorityUpdateAppendage = new OrderPriorityUpdateAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, price, display, orderReferenceNumber, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Expressed as nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * The price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Display
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * The day-unique Order Reference Number assigned by NASDAQ to this order
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Order Priority Update Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the OrderPriorityUpdateAppendage entries
     */
    public OrderPriorityUpdateAppendageList orderPriorityUpdateAppendage() {
        return orderPriorityUpdateAppendage;
    }

    /**
     * Returns whether the fields before the AppendageLength put it on the wire.
     *
     * <p>The AppendageLength is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the AppendageLength is on the wire
     */
    public boolean appendageLengthPresent() {
        return appendageLength.hasValue() || !orderPriorityUpdateAppendage.isEmpty();
    }

    private boolean onWire(Field field) {
        return (field != appendageLength || appendageLengthPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (appendageLengthPresent() ? AppendageLengthField.BYTE_LENGTH : 0) + orderPriorityUpdateAppendage.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < AppendageLengthField.BYTE_LENGTH || !appendageLength.parse(data, cursor)) {
                return false;
            }
            cursor += AppendageLengthField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        long orderPriorityUpdateAppendageBudget = appendageLengthPresent() ? appendageLength.value() : 0;
        if (orderPriorityUpdateAppendageBudget < 0 || orderPriorityUpdateAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!orderPriorityUpdateAppendage.parse(data, cursor, cursor + (int) orderPriorityUpdateAppendageBudget)) {
            return false;
        }
        cursor += orderPriorityUpdateAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (!orderPriorityUpdateAppendage.isEmpty() || appendageLengthPresent()) {
            if (orderPriorityUpdateAppendage.byteLength() > 65535) {
                throw new IllegalStateException("orderPriorityUpdateAppendage holds " + orderPriorityUpdateAppendage.byteLength() + " bytes, more than its length field can state");
            }
            appendageLength.value((orderPriorityUpdateAppendage.byteLength()));
        }
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        if (appendageLengthPresent()) {
            cursor = appendageLength.encode(data, cursor);
        }
        cursor = orderPriorityUpdateAppendage.encode(data, cursor);
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
        orderPriorityUpdateAppendage.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return orderPriorityUpdateAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!orderPriorityUpdateAppendage.isValid()) {
            return false;
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!display.isDecoded()) {
            return Optional.of(display);
        }
        if (!orderReferenceNumber.isDecoded()) {
            return Optional.of(orderReferenceNumber);
        }
        if (appendageLengthPresent() && !appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!orderPriorityUpdateAppendage.isDecoded()) {
            return Optional.of(orderPriorityUpdateAppendage.failedEntry().flatMap(OrderPriorityUpdateAppendageEntry::failedAt).orElse(appendageLength));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "Price" -> Optional.of(price);
            case "Display" -> Optional.of(display);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderPriorityUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderPriorityUpdateAppendage.diffFields(message.orderPriorityUpdateAppendage));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            orderPriorityUpdateAppendage.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        orderPriorityUpdateAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderPriorityUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderPriorityUpdateAppendage.equals(message.orderPriorityUpdateAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderPriorityUpdateAppendage);
    }
}
