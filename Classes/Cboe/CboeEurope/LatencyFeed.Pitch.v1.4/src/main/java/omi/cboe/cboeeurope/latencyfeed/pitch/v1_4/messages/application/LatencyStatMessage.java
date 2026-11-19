package omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.AverageField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.BeginTimeField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.CountField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.EndTimeField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.MatchingUnitField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.MaximumField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.MeasurementTypeField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.MinimumField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.ModeField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile25Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile50Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile75Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile90Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile95Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile99Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.Percentile99PointField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.fields.StandardDeviationField;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.types.Field;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.types.Message;
import omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.types.PrintOptions;

/**
 * Represents the LatencyStatMessage message from the LatencyFeed protocol.
 *
 * <p>A Latency Stat Message demonstrates performance for a specific Matching Engine unit for a specific timeframe</p>
 */
public final class LatencyStatMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 110;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Latency Stat Message";

    /**
     * 0 (zero) = Order to Quote
     */
    private final MeasurementTypeField measurementType = new MeasurementTypeField();

    /**
     * Refer to the Multicast PITCH specification for Matching Unit mappings
     */
    private final MatchingUnitField matchingUnit = new MatchingUnitField();

    /**
     * Number of milliseconds from midnight (London time)
     */
    private final BeginTimeField beginTime = new BeginTimeField();

    /**
     * Number of milliseconds from midnight (London time)
     */
    private final EndTimeField endTime = new EndTimeField();

    /**
     * Count of orders used in calculation of all other metrics from Begin Time to End Time
     */
    private final CountField count = new CountField();

    /**
     * Minimum order processing latency (seconds) from Begin Time to End Time
     */
    private final MinimumField minimum = new MinimumField();

    /**
     * Maximum order processing latency (seconds) from Begin Time to End Time
     */
    private final MaximumField maximum = new MaximumField();

    /**
     * Average order processing latency (seconds) from Begin Time to End Time
     */
    private final AverageField average = new AverageField();

    /**
     * Standard deviation
     */
    private final StandardDeviationField standardDeviation = new StandardDeviationField();

    /**
     * Mode of order processing latency (seconds) from Begin Time to End Time
     */
    private final ModeField mode = new ModeField();

    /**
     * 99.9 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile99PointField percentile99Point = new Percentile99PointField();

    /**
     * 99 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile99Field percentile99 = new Percentile99Field();

    /**
     * 95 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile95Field percentile95 = new Percentile95Field();

    /**
     * 90 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile90Field percentile90 = new Percentile90Field();

    /**
     * 75 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile75Field percentile75 = new Percentile75Field();

    /**
     * 50 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile50Field percentile50 = new Percentile50Field();

    /**
     * 25 percentile of order processing latency (seconds) from Begin Time to End Time
     */
    private final Percentile25Field percentile25 = new Percentile25Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(measurementType, matchingUnit, beginTime, endTime, count, minimum, maximum, average, standardDeviation, mode, percentile99Point, percentile99, percentile95, percentile90, percentile75, percentile50, percentile25);

    private byte[] buffer;

    private boolean decoded;

    /**
     * 0 (zero) = Order to Quote
     *
     * @return the MeasurementType field
     */
    public MeasurementTypeField measurementType() {
        return measurementType;
    }

    /**
     * Refer to the Multicast PITCH specification for Matching Unit mappings
     *
     * @return the MatchingUnit field
     */
    public MatchingUnitField matchingUnit() {
        return matchingUnit;
    }

    /**
     * Number of milliseconds from midnight (London time)
     *
     * @return the BeginTime field
     */
    public BeginTimeField beginTime() {
        return beginTime;
    }

    /**
     * Number of milliseconds from midnight (London time)
     *
     * @return the EndTime field
     */
    public EndTimeField endTime() {
        return endTime;
    }

    /**
     * Count of orders used in calculation of all other metrics from Begin Time to End Time
     *
     * @return the Count field
     */
    public CountField count() {
        return count;
    }

    /**
     * Minimum order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Minimum field
     */
    public MinimumField minimum() {
        return minimum;
    }

    /**
     * Maximum order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Maximum field
     */
    public MaximumField maximum() {
        return maximum;
    }

    /**
     * Average order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Average field
     */
    public AverageField average() {
        return average;
    }

    /**
     * Standard deviation
     *
     * @return the StandardDeviation field
     */
    public StandardDeviationField standardDeviation() {
        return standardDeviation;
    }

    /**
     * Mode of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Mode field
     */
    public ModeField mode() {
        return mode;
    }

    /**
     * 99.9 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile99Point field
     */
    public Percentile99PointField percentile99Point() {
        return percentile99Point;
    }

    /**
     * 99 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile99 field
     */
    public Percentile99Field percentile99() {
        return percentile99;
    }

    /**
     * 95 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile95 field
     */
    public Percentile95Field percentile95() {
        return percentile95;
    }

    /**
     * 90 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile90 field
     */
    public Percentile90Field percentile90() {
        return percentile90;
    }

    /**
     * 75 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile75 field
     */
    public Percentile75Field percentile75() {
        return percentile75;
    }

    /**
     * 50 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile50 field
     */
    public Percentile50Field percentile50() {
        return percentile50;
    }

    /**
     * 25 percentile of order processing latency (seconds) from Begin Time to End Time
     *
     * @return the Percentile25 field
     */
    public Percentile25Field percentile25() {
        return percentile25;
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
        if (!measurementType.parse(data, cursor)) {
            return false;
        }
        cursor += MeasurementTypeField.BYTE_LENGTH;
        if (!matchingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingUnitField.BYTE_LENGTH;
        if (!beginTime.parse(data, cursor)) {
            return false;
        }
        cursor += BeginTimeField.BYTE_LENGTH;
        if (!endTime.parse(data, cursor)) {
            return false;
        }
        cursor += EndTimeField.BYTE_LENGTH;
        if (!count.parse(data, cursor)) {
            return false;
        }
        cursor += CountField.BYTE_LENGTH;
        if (!minimum.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumField.BYTE_LENGTH;
        if (!maximum.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumField.BYTE_LENGTH;
        if (!average.parse(data, cursor)) {
            return false;
        }
        cursor += AverageField.BYTE_LENGTH;
        if (!standardDeviation.parse(data, cursor)) {
            return false;
        }
        cursor += StandardDeviationField.BYTE_LENGTH;
        if (!mode.parse(data, cursor)) {
            return false;
        }
        cursor += ModeField.BYTE_LENGTH;
        if (!percentile99Point.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile99PointField.BYTE_LENGTH;
        if (!percentile99.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile99Field.BYTE_LENGTH;
        if (!percentile95.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile95Field.BYTE_LENGTH;
        if (!percentile90.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile90Field.BYTE_LENGTH;
        if (!percentile75.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile75Field.BYTE_LENGTH;
        if (!percentile50.parse(data, cursor)) {
            return false;
        }
        cursor += Percentile50Field.BYTE_LENGTH;
        return percentile25.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = measurementType.encode(data, cursor);
        cursor = matchingUnit.encode(data, cursor);
        cursor = beginTime.encode(data, cursor);
        cursor = endTime.encode(data, cursor);
        cursor = count.encode(data, cursor);
        cursor = minimum.encode(data, cursor);
        cursor = maximum.encode(data, cursor);
        cursor = average.encode(data, cursor);
        cursor = standardDeviation.encode(data, cursor);
        cursor = mode.encode(data, cursor);
        cursor = percentile99Point.encode(data, cursor);
        cursor = percentile99.encode(data, cursor);
        cursor = percentile95.encode(data, cursor);
        cursor = percentile90.encode(data, cursor);
        cursor = percentile75.encode(data, cursor);
        cursor = percentile50.encode(data, cursor);
        cursor = percentile25.encode(data, cursor);
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
            case "MeasurementType" -> Optional.of(measurementType);
            case "MatchingUnit" -> Optional.of(matchingUnit);
            case "BeginTime" -> Optional.of(beginTime);
            case "EndTime" -> Optional.of(endTime);
            case "Count" -> Optional.of(count);
            case "Minimum" -> Optional.of(minimum);
            case "Maximum" -> Optional.of(maximum);
            case "Average" -> Optional.of(average);
            case "StandardDeviation" -> Optional.of(standardDeviation);
            case "Mode" -> Optional.of(mode);
            case "Percentile99Point" -> Optional.of(percentile99Point);
            case "Percentile99" -> Optional.of(percentile99);
            case "Percentile95" -> Optional.of(percentile95);
            case "Percentile90" -> Optional.of(percentile90);
            case "Percentile75" -> Optional.of(percentile75);
            case "Percentile50" -> Optional.of(percentile50);
            case "Percentile25" -> Optional.of(percentile25);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LatencyStatMessage message)) {
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
        if (!(other instanceof LatencyStatMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
