package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.NoEntriesField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.IndexValueMdEntryEntry;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.IndexValueMdEntryList;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.Symbol;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Field;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Message;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.PrintOptions;

/**
 * Represents the IndexValueMessage message from the MarketDataFeed protocol.
 *
 * <p>Index value messages contain the values associated with a calculated index. They are transmitted when an index is calculated.</p>
 */
public final class IndexValueMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0016';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Value Message";

    /**
     * Number of MDEntries in this message. Will not exceed 255
     */
    private final NoEntriesField noEntries = new NoEntriesField();

    /**
     * Market data associated with the index
     */
    private final IndexValueMdEntryList indexValueMdEntry = new IndexValueMdEntryList();

    /**
     * Symbol
     */
    private final Symbol symbol = new Symbol();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(symbol.fields(), List.<Field>of(noEntries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of MDEntries in this message. Will not exceed 255
     *
     * @return the NoEntries field
     */
    public NoEntriesField noEntries() {
        return noEntries;
    }

    /**
     * Market data associated with the index
     *
     * <p>Encode writes this list's size to the NoEntries field.</p>
     *
     * @return the IndexValueMdEntry entries
     */
    public IndexValueMdEntryList indexValueMdEntry() {
        return indexValueMdEntry;
    }

    /**
     * Symbol
     *
     * @return the Symbol record
     */
    public Symbol symbol() {
        return symbol;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + symbol.byteLength() - Symbol.MINIMUM_BYTE_LENGTH + indexValueMdEntry.byteLength();
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
        cursor = symbol.padding(runs, cursor);
        cursor += 1;
        cursor = indexValueMdEntry.padding(runs, cursor);
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
        if (!symbol.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += symbol.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!noEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoEntriesField.BYTE_LENGTH;
        if (!indexValueMdEntry.parse(data, cursor, end, noEntries.value())) {
            return false;
        }
        cursor += indexValueMdEntry.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (indexValueMdEntry.size() > 255) {
            throw new IllegalStateException("indexValueMdEntry holds " + indexValueMdEntry.size() + " entries, more than its count field can state");
        }
        noEntries.value((short) indexValueMdEntry.size());
        int cursor = offset;
        cursor = symbol.encode(data, cursor);
        cursor = noEntries.encode(data, cursor);
        cursor = indexValueMdEntry.encode(data, cursor);
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
        symbol.clear();
        indexValueMdEntry.clear();
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
            if (field != symbol.symbolLength() && field != noEntries && !field.isRecognized()) {
                return false;
            }
        }
        if (!indexValueMdEntry.isRecognized()) {
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
            if (field != symbol.symbolLength() && field != noEntries && !field.isValid()) {
                return false;
            }
        }
        if (!indexValueMdEntry.isValid()) {
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
        if (!symbol.isDecoded()) {
            return symbol.failedAt();
        }
        if (!noEntries.isDecoded()) {
            return Optional.of(noEntries);
        }
        if (!indexValueMdEntry.isDecoded()) {
            return Optional.of(indexValueMdEntry.failedEntry().flatMap(IndexValueMdEntryEntry::failedAt).orElse(noEntries));
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
            case "NoEntries" -> Optional.of(noEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexValueMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(indexValueMdEntry.diffFields(message.indexValueMdEntry));
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
            indexValueMdEntry.toFormattedString(builder, options);
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
        indexValueMdEntry.toFormattedString(builder, nested);
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
        if (!(other instanceof IndexValueMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && indexValueMdEntry.equals(message.indexValueMdEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, indexValueMdEntry);
    }
}
