package omi.cboe.gaprequestproxy.pitch.v1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.gaprequestproxy.pitch.v1.fields.CountField;
import omi.cboe.gaprequestproxy.pitch.v1.fields.GapResponseStatusField;
import omi.cboe.gaprequestproxy.pitch.v1.fields.GapSequenceField;
import omi.cboe.gaprequestproxy.pitch.v1.fields.GapUnitField;
import omi.cboe.gaprequestproxy.pitch.v1.types.Field;
import omi.cboe.gaprequestproxy.pitch.v1.types.Message;
import omi.cboe.gaprequestproxy.pitch.v1.types.PrintOptions;

/**
 * Represents the GapResponseMessage message from the GapRequestProxy protocol.
 *
 * <p>The Gap Response message is sent by the Gap Request Proxy in response to a Gap Request message. The Unit and Sequence fields will match the values supplied in the Gap Request message. A Gap Response message, with a Status of Accepted or reason for failure, will be sent for each Gap Request message received by the Gap Request Proxy.</p>
 */
public final class GapResponseMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Gap Response Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Unit that the gap is requested for.
     */
    private final GapUnitField gapUnit = new GapUnitField();

    /**
     * Sequence of first message, (lowest sequence in range).
     */
    private final GapSequenceField gapSequence = new GapSequenceField();

    /**
     * Count of messages requested.
     */
    private final CountField count = new CountField();

    /**
     * Accepted or reason for reject. All non-'A' status codes should be interpreted as a reject.
     */
    private final GapResponseStatusField gapResponseStatus = new GapResponseStatusField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(gapUnit, gapSequence, count, gapResponseStatus);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unit that the gap is requested for.
     *
     * @return the GapUnit field
     */
    public GapUnitField gapUnit() {
        return gapUnit;
    }

    /**
     * Sequence of first message, (lowest sequence in range).
     *
     * @return the GapSequence field
     */
    public GapSequenceField gapSequence() {
        return gapSequence;
    }

    /**
     * Count of messages requested.
     *
     * @return the Count field
     */
    public CountField count() {
        return count;
    }

    /**
     * Accepted or reason for reject. All non-'A' status codes should be interpreted as a reject.
     *
     * @return the GapResponseStatus field
     */
    public GapResponseStatusField gapResponseStatus() {
        return gapResponseStatus;
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
        return PADDING.clone();
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
        if (!gapUnit.parse(data, cursor)) {
            return false;
        }
        cursor += GapUnitField.BYTE_LENGTH;
        if (!gapSequence.parse(data, cursor)) {
            return false;
        }
        cursor += GapSequenceField.BYTE_LENGTH;
        if (!count.parse(data, cursor)) {
            return false;
        }
        cursor += CountField.BYTE_LENGTH;
        if (!gapResponseStatus.parse(data, cursor)) {
            return false;
        }
        cursor += GapResponseStatusField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = gapUnit.encode(data, cursor);
        cursor = gapSequence.encode(data, cursor);
        cursor = count.encode(data, cursor);
        cursor = gapResponseStatus.encode(data, cursor);
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
            case "GapUnit" -> Optional.of(gapUnit);
            case "GapSequence" -> Optional.of(gapSequence);
            case "Count" -> Optional.of(count);
            case "GapResponseStatus" -> Optional.of(gapResponseStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof GapResponseMessage message)) {
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
        if (!(other instanceof GapResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
