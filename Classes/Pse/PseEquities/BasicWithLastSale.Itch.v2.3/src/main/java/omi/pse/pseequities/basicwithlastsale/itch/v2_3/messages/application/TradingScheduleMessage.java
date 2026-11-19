package omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.EventCodeField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.GroupField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.OrderbookField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.ScheduledTimeField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.TimestampField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.Field;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.Message;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.PrintOptions;

/**
 * Represents the TradingScheduleMessage message from the BasicWithLastSale protocol.
 *
 * <p>Trading Schedule Message.</p>
 */
public final class TradingScheduleMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 's';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Schedule Message";

    /**
     * Nanoseconds since last Time Stamp seconds message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Id for symbol grouping (Board level only).
     */
    private final GroupField group = new GroupField();

    /**
     * Event Code.
     */
    private final EventCodeField eventCode = new EventCodeField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * Number of seconds past midnight that the event is scheduled.
     */
    private final ScheduledTimeField scheduledTime = new ScheduledTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, group, eventCode, orderbook, scheduledTime);

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
     * Id for symbol grouping (Board level only).
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Event Code.
     *
     * @return the EventCode field
     */
    public EventCodeField eventCode() {
        return eventCode;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * Number of seconds past midnight that the event is scheduled.
     *
     * @return the ScheduledTime field
     */
    public ScheduledTimeField scheduledTime() {
        return scheduledTime;
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
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!eventCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventCodeField.BYTE_LENGTH;
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        return scheduledTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = group.encode(data, cursor);
        cursor = eventCode.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = scheduledTime.encode(data, cursor);
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
            case "Group" -> Optional.of(group);
            case "EventCode" -> Optional.of(eventCode);
            case "Orderbook" -> Optional.of(orderbook);
            case "ScheduledTime" -> Optional.of(scheduledTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingScheduleMessage message)) {
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
        if (!(other instanceof TradingScheduleMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
