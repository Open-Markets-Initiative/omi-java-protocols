package omi.currenex.currenexforex.now.cbp.v10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.currenex.currenexforex.now.cbp.v10.fields.InstrumentIndexField;
import omi.currenex.currenexforex.now.cbp.v10.groups.LevelEntry;
import omi.currenex.currenexforex.now.cbp.v10.groups.LevelList;
import omi.currenex.currenexforex.now.cbp.v10.types.Field;
import omi.currenex.currenexforex.now.cbp.v10.types.Message;
import omi.currenex.currenexforex.now.cbp.v10.types.PrintOptions;

/**
 * Represents the DepthOfBookMessage message from the Now protocol.
 *
 * <p>Depth of book updates up to 20 levels</p>
 */
public final class DepthOfBookMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'd';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 482;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Depth Of Book Message";

    /**
     * The number of entries that Level carries on the wire.
     */
    public static final int LEVEL_COUNT = 20;

    /**
     * Instrument numeric index
     */
    private final InstrumentIndexField instrumentIndex = new InstrumentIndexField();

    /**
     * Market level
     */
    private final LevelList level = new LevelList(LEVEL_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentIndex);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Instrument numeric index
     *
     * @return the InstrumentIndex field
     */
    public InstrumentIndexField instrumentIndex() {
        return instrumentIndex;
    }

    /**
     * Market level
     *
     * <p>This list always holds 20 entries: replace one with {@code set}, or set the values of those it holds.</p>
     *
     * @return the Level entries
     */
    public LevelList level() {
        return level;
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
        if (!instrumentIndex.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIndexField.BYTE_LENGTH;
        if (!level.parse(data, cursor, end, LEVEL_COUNT)) {
            return false;
        }
        cursor += level.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentIndex.encode(data, cursor);
        cursor = level.encode(data, cursor);
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
        level.clear();
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return level.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!level.isValid()) {
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
        if (!instrumentIndex.isDecoded()) {
            return Optional.of(instrumentIndex);
        }
        if (!level.isDecoded()) {
            return level.failedEntry().flatMap(LevelEntry::failedAt);
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return "InstrumentIndex".equals(name) ? Optional.of(instrumentIndex) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DepthOfBookMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(level.diffFields(message.level));
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            level.toFormattedString(builder, options);
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
        level.toFormattedString(builder, nested);
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
        if (!(other instanceof DepthOfBookMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && level.equals(message.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, level);
    }
}
