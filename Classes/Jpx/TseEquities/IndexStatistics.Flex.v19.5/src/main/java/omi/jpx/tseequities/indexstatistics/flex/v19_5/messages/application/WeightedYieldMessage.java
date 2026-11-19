package omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.IssueClassificationCodeField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.ReservedField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.TimeC6HhmmField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.WeightedYield;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.YieldDayOnDayComparison;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Field;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Message;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.PrintOptions;

/**
 * Represents the WeightedYieldMessage message from the IndexStatistics protocol.
 *
 * <p>In this tag, weighted yield information for each market (issue classification) will be set. This data appears as part of a statistics message.</p>
 */
public final class WeightedYieldMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Weighted Yield Message";

    /**
     * This item is reserved.
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Indicates the time of computation.
     */
    private final TimeC6HhmmField timeC6Hhmm = new TimeC6HhmmField();

    /**
     * Indicates the issue classification code.
     */
    private final IssueClassificationCodeField issueClassificationCode = new IssueClassificationCodeField();

    /**
     * Weighted yield
     */
    private final WeightedYield weightedYield = new WeightedYield();

    /**
     * Yield Day-on-day comparison
     */
    private final YieldDayOnDayComparison yieldDayOnDayComparison = new YieldDayOnDayComparison();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reserved), List.<Field>of(timeC6Hhmm), List.<Field>of(issueClassificationCode), weightedYield.fields(), yieldDayOnDayComparison.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Indicates the time of computation.
     *
     * @return the TimeC6Hhmm field
     */
    public TimeC6HhmmField timeC6Hhmm() {
        return timeC6Hhmm;
    }

    /**
     * Indicates the issue classification code.
     *
     * @return the IssueClassificationCode field
     */
    public IssueClassificationCodeField issueClassificationCode() {
        return issueClassificationCode;
    }

    /**
     * Weighted yield
     *
     * @return the WeightedYield record
     */
    public WeightedYield weightedYield() {
        return weightedYield;
    }

    /**
     * Yield Day-on-day comparison
     *
     * @return the YieldDayOnDayComparison record
     */
    public YieldDayOnDayComparison yieldDayOnDayComparison() {
        return yieldDayOnDayComparison;
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
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!timeC6Hhmm.parse(data, cursor)) {
            return false;
        }
        cursor += TimeC6HhmmField.BYTE_LENGTH;
        if (!issueClassificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += IssueClassificationCodeField.BYTE_LENGTH;
        if (!weightedYield.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += weightedYield.byteLength();
        return yieldDayOnDayComparison.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved.encode(data, cursor);
        cursor = timeC6Hhmm.encode(data, cursor);
        cursor = issueClassificationCode.encode(data, cursor);
        cursor = weightedYield.encode(data, cursor);
        cursor = yieldDayOnDayComparison.encode(data, cursor);
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
        weightedYield.clear();
        yieldDayOnDayComparison.clear();
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
            case "Reserved" -> Optional.of(reserved);
            case "TimeC6Hhmm" -> Optional.of(timeC6Hhmm);
            case "IssueClassificationCode" -> Optional.of(issueClassificationCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof WeightedYieldMessage message)) {
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
        if (!(other instanceof WeightedYieldMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
