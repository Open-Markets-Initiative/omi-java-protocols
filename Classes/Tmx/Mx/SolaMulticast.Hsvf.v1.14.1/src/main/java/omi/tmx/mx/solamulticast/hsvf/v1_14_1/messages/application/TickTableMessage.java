package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NumberOfEntriesField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TickTableNameField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TickTableShortNameField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups.TickEntryEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups.TickEntryList;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the TickTableMessage message from the SolaMulticast protocol.
 *
 * <p>The TT: Tick Table message is used to send the Tick Table information via HSVF.</p>
 */
public final class TickTableMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tick Table Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Tick Table name
     */
    private final TickTableNameField tickTableName = new TickTableNameField();

    /**
     * Tick Table short name
     */
    private final TickTableShortNameField tickTableShortName = new TickTableShortNameField();

    /**
     * Indicates the number of entries in the table (from 1 to 30)
     */
    private final NumberOfEntriesField numberOfEntries = new NumberOfEntriesField();

    /**
     * Tick Entry
     */
    private final TickEntryList tickEntry = new TickEntryList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, tickTableName, tickTableShortName, numberOfEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Tick Table name
     *
     * @return the TickTableName field
     */
    public TickTableNameField tickTableName() {
        return tickTableName;
    }

    /**
     * Tick Table short name
     *
     * @return the TickTableShortName field
     */
    public TickTableShortNameField tickTableShortName() {
        return tickTableShortName;
    }

    /**
     * Indicates the number of entries in the table (from 1 to 30)
     *
     * @return the NumberOfEntries field
     */
    public NumberOfEntriesField numberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Tick Entry
     *
     * <p>Encode writes this list's size to the NumberOfEntries field.</p>
     *
     * @return the TickEntry entries
     */
    public TickEntryList tickEntry() {
        return tickEntry;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tickEntry.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 1;
        cursor += 50;
        cursor += 2;
        cursor += 2;
        cursor = tickEntry.padding(runs, cursor);
        return cursor;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!tickTableName.parse(data, cursor)) {
            return false;
        }
        cursor += TickTableNameField.BYTE_LENGTH;
        if (!tickTableShortName.parse(data, cursor)) {
            return false;
        }
        cursor += TickTableShortNameField.BYTE_LENGTH;
        if (!numberOfEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfEntriesField.BYTE_LENGTH;
        if (numberOfEntries.value() == null) {
            return false;
        }
        if (!tickEntry.parse(data, cursor, end, numberOfEntries.value())) {
            return false;
        }
        cursor += tickEntry.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tickEntry.size() > 99) {
            throw new IllegalStateException("tickEntry holds " + tickEntry.size() + " entries, more than its count field can state");
        }
        numberOfEntries.value((long) tickEntry.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = tickTableName.encode(data, cursor);
        cursor = tickTableShortName.encode(data, cursor);
        cursor = numberOfEntries.encode(data, cursor);
        cursor = tickEntry.encode(data, cursor);
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
        tickEntry.clear();
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
            if (field != numberOfEntries && !field.isRecognized()) {
                return false;
            }
        }
        if (!tickEntry.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfEntries && !field.isValid()) {
                return false;
            }
        }
        if (!tickEntry.isValid()) {
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
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!tickTableName.isDecoded()) {
            return Optional.of(tickTableName);
        }
        if (!tickTableShortName.isDecoded()) {
            return Optional.of(tickTableShortName);
        }
        if (!numberOfEntries.isDecoded()) {
            return Optional.of(numberOfEntries);
        }
        if (!tickEntry.isDecoded()) {
            return Optional.of(tickEntry.failedEntry().flatMap(TickEntryEntry::failedAt).orElse(numberOfEntries));
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "TickTableName" -> Optional.of(tickTableName);
            case "TickTableShortName" -> Optional.of(tickTableShortName);
            case "NumberOfEntries" -> Optional.of(numberOfEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TickTableMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tickEntry.diffFields(message.tickEntry));
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
            tickEntry.toFormattedString(builder, options);
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
        tickEntry.toFormattedString(builder, nested);
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
        if (!(other instanceof TickTableMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tickEntry.equals(message.tickEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tickEntry);
    }
}
