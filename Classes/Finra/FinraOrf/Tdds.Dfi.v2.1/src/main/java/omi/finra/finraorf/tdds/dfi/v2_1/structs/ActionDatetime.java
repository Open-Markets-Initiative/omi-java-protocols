package omi.finra.finraorf.tdds.dfi.v2_1.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.DayField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.FractionalSecondField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.HourField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.MinuteField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.MonthField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SecondField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.YearField;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.GroupEntry;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * The ActionDatetime record a message holds.
 *
 * <p>Action Datetime</p>
 */
public final class ActionDatetime implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 23;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ActionDatetime";

    /**
     * The year the transaction occurred
     */
    private final YearField year = new YearField();

    /**
     * The month the transaction occurred
     */
    private final MonthField month = new MonthField();

    /**
     * The day of the month the transaction occurred
     */
    private final DayField day = new DayField();

    /**
     * The hour of the day the transaction occurred in military time
     */
    private final HourField hour = new HourField();

    /**
     * The minute of the hour the transaction occurred.
     */
    private final MinuteField minute = new MinuteField();

    /**
     * The second of the minute the transaction occurred
     */
    private final SecondField second = new SecondField();

    /**
     * The smallest unit of seconds, up to nanoseconds, the transaction occurred.
     */
    private final FractionalSecondField fractionalSecond = new FractionalSecondField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(year, month, day, hour, minute, second, fractionalSecond);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The year the transaction occurred
     *
     * @return the Year field
     */
    public YearField year() {
        return year;
    }

    /**
     * The month the transaction occurred
     *
     * @return the Month field
     */
    public MonthField month() {
        return month;
    }

    /**
     * The day of the month the transaction occurred
     *
     * @return the Day field
     */
    public DayField day() {
        return day;
    }

    /**
     * The hour of the day the transaction occurred in military time
     *
     * @return the Hour field
     */
    public HourField hour() {
        return hour;
    }

    /**
     * The minute of the hour the transaction occurred.
     *
     * @return the Minute field
     */
    public MinuteField minute() {
        return minute;
    }

    /**
     * The second of the minute the transaction occurred
     *
     * @return the Second field
     */
    public SecondField second() {
        return second;
    }

    /**
     * The smallest unit of seconds, up to nanoseconds, the transaction occurred.
     *
     * @return the FractionalSecond field
     */
    public FractionalSecondField fractionalSecond() {
        return fractionalSecond;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
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
        if (!year.parse(data, cursor)) {
            return false;
        }
        cursor += YearField.BYTE_LENGTH;
        if (!month.parse(data, cursor)) {
            return false;
        }
        cursor += MonthField.BYTE_LENGTH;
        if (!day.parse(data, cursor)) {
            return false;
        }
        cursor += DayField.BYTE_LENGTH;
        if (!hour.parse(data, cursor)) {
            return false;
        }
        cursor += HourField.BYTE_LENGTH;
        if (!minute.parse(data, cursor)) {
            return false;
        }
        cursor += MinuteField.BYTE_LENGTH;
        if (!second.parse(data, cursor)) {
            return false;
        }
        cursor += SecondField.BYTE_LENGTH;
        return fractionalSecond.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = year.encode(data, cursor);
        cursor = month.encode(data, cursor);
        cursor = day.encode(data, cursor);
        cursor = hour.encode(data, cursor);
        cursor = minute.encode(data, cursor);
        cursor = second.encode(data, cursor);
        cursor = fractionalSecond.encode(data, cursor);
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
            case "Year" -> Optional.of(year);
            case "Month" -> Optional.of(month);
            case "Day" -> Optional.of(day);
            case "Hour" -> Optional.of(hour);
            case "Minute" -> Optional.of(minute);
            case "Second" -> Optional.of(second);
            case "FractionalSecond" -> Optional.of(fractionalSecond);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ActionDatetime message)) {
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
        if (!(other instanceof ActionDatetime message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
