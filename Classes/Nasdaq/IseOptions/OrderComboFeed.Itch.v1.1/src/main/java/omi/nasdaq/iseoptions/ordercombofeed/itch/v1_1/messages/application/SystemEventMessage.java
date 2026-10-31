package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.CurrentDayField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.CurrentMonthField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.CurrentYearField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.EventCodeField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.SubversionField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.TimestampField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.VersionField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Field;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.PrintOptions;

/**
 * Represents the SystemEventMessage message from the OrderComboFeed protocol.
 *
 * <p>The system event message type is used to signal a market or data feed handler event.</p>
 */
public final class SystemEventMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 13;

    /**
     * This message's declared name.
     */
    public static final String NAME = "System Event Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Refer to System Event Codes below
     */
    private final EventCodeField eventCode = new EventCodeField();

    /**
     * The current calendar year (example: 2016).
     */
    private final CurrentYearField currentYear = new CurrentYearField();

    /**
     * The current calendar month, with values 1 to 12 inclusive, January=1, etc.
     */
    private final CurrentMonthField currentMonth = new CurrentMonthField();

    /**
     * The current calendar day, with values 1 to 31 inclusive.
     */
    private final CurrentDayField currentDay = new CurrentDayField();

    /**
     * Version of this interface. Currently set to 1.
     */
    private final VersionField version = new VersionField();

    /**
     * Sub-version of this interface. Currently set to 0.
     */
    private final SubversionField subversion = new SubversionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, eventCode, currentYear, currentMonth, currentDay, version, subversion);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Refer to System Event Codes below
     *
     * @return the EventCode field
     */
    public EventCodeField eventCode() {
        return eventCode;
    }

    /**
     * The current calendar year (example: 2016).
     *
     * @return the CurrentYear field
     */
    public CurrentYearField currentYear() {
        return currentYear;
    }

    /**
     * The current calendar month, with values 1 to 12 inclusive, January=1, etc.
     *
     * @return the CurrentMonth field
     */
    public CurrentMonthField currentMonth() {
        return currentMonth;
    }

    /**
     * The current calendar day, with values 1 to 31 inclusive.
     *
     * @return the CurrentDay field
     */
    public CurrentDayField currentDay() {
        return currentDay;
    }

    /**
     * Version of this interface. Currently set to 1.
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * Sub-version of this interface. Currently set to 0.
     *
     * @return the Subversion field
     */
    public SubversionField subversion() {
        return subversion;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!eventCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventCodeField.BYTE_LENGTH;
        if (!currentYear.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentYearField.BYTE_LENGTH;
        if (!currentMonth.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentMonthField.BYTE_LENGTH;
        if (!currentDay.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentDayField.BYTE_LENGTH;
        if (!version.parse(data, cursor)) {
            return false;
        }
        cursor += VersionField.BYTE_LENGTH;
        if (!subversion.parse(data, cursor)) {
            return false;
        }
        cursor += SubversionField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = eventCode.encode(data, cursor);
        cursor = currentYear.encode(data, cursor);
        cursor = currentMonth.encode(data, cursor);
        cursor = currentDay.encode(data, cursor);
        cursor = version.encode(data, cursor);
        cursor = subversion.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "EventCode" -> Optional.of(eventCode);
            case "CurrentYear" -> Optional.of(currentYear);
            case "CurrentMonth" -> Optional.of(currentMonth);
            case "CurrentDay" -> Optional.of(currentDay);
            case "Version" -> Optional.of(version);
            case "Subversion" -> Optional.of(subversion);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SystemEventMessage message)) {
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
        if (!(other instanceof SystemEventMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
