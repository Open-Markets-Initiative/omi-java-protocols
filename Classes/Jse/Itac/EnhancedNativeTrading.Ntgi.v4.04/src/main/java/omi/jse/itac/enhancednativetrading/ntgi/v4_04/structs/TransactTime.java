package omi.jse.itac.enhancednativetrading.ntgi.v4_04.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TransactTimeNanosecondsField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TransactTimeSecondsField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.GroupEntry;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.PrintOptions;

/**
 * The TransactTime record a message holds.
 *
 * <p>Time the Execution Report was generated</p>
 */
public final class TransactTime implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TransactTime";

    /**
     * Seconds elapsed since midnight UTC of 1 January 1970, the first four bytes of Transact Time
     */
    private final TransactTimeSecondsField transactTimeSeconds = new TransactTimeSecondsField();

    /**
     * Nanoseconds elapsed since the second, the last four bytes of Transact Time. The document names them microseconds and states accuracy up to nanoseconds, the last three digits being zero
     */
    private final TransactTimeNanosecondsField transactTimeNanoseconds = new TransactTimeNanosecondsField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTimeSeconds, transactTimeNanoseconds);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Seconds elapsed since midnight UTC of 1 January 1970, the first four bytes of Transact Time
     *
     * @return the TransactTimeSeconds field
     */
    public TransactTimeSecondsField transactTimeSeconds() {
        return transactTimeSeconds;
    }

    /**
     * Nanoseconds elapsed since the second, the last four bytes of Transact Time. The document names them microseconds and states accuracy up to nanoseconds, the last three digits being zero
     *
     * @return the TransactTimeNanoseconds field
     */
    public TransactTimeNanosecondsField transactTimeNanoseconds() {
        return transactTimeNanoseconds;
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
        if (!transactTimeSeconds.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeSecondsField.BYTE_LENGTH;
        return transactTimeNanoseconds.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTimeSeconds.encode(data, cursor);
        cursor = transactTimeNanoseconds.encode(data, cursor);
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
            case "TransactTimeSeconds" -> Optional.of(transactTimeSeconds);
            case "TransactTimeNanoseconds" -> Optional.of(transactTimeNanoseconds);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TransactTime message)) {
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
        if (!(other instanceof TransactTime message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
