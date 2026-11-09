package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.NoMdEntriesField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.SummaryTypeField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.TransactTimeField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.groups.MdEntriesEntry;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.groups.MdEntriesList;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.structs.EffectiveBusinessDate;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.structs.Symbol;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.Field;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.Message;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.PrintOptions;

/**
 * Represents the IndexSummaryMessage message from the Indices protocol.
 *
 * <p>Index Summary message containing values associated with start or end of day. Includes an effective business date for reference.</p>
 */
public final class IndexSummaryMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Summary Message";

    /**
     * Time that data was calculated or produced from client. Applies only to this message within the packet.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Type of summary message.
     */
    private final SummaryTypeField summaryType = new SummaryTypeField();

    /**
     * Number of MDEntries in this message. Will not exceed 255.
     */
    private final NoMdEntriesField noMdEntries = new NoMdEntriesField();

    /**
     * One entry in a repeating MDEntries group. Repeats NoMDEntries times within the containing message.
     */
    private final MdEntriesList mdEntries = new MdEntriesList();

    /**
     * EffectiveBusinessDate
     */
    private final EffectiveBusinessDate effectiveBusinessDate = new EffectiveBusinessDate();

    /**
     * Symbol
     */
    private final Symbol symbol = new Symbol();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(transactTime), effectiveBusinessDate.fields(), List.<Field>of(summaryType), symbol.fields(), List.<Field>of(noMdEntries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time that data was calculated or produced from client. Applies only to this message within the packet.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Type of summary message.
     *
     * @return the SummaryType field
     */
    public SummaryTypeField summaryType() {
        return summaryType;
    }

    /**
     * Number of MDEntries in this message. Will not exceed 255.
     *
     * @return the NoMdEntries field
     */
    public NoMdEntriesField noMdEntries() {
        return noMdEntries;
    }

    /**
     * One entry in a repeating MDEntries group. Repeats NoMDEntries times within the containing message.
     *
     * <p>Encode writes this list's size to the NoMdEntries field.</p>
     *
     * @return the MdEntries entries
     */
    public MdEntriesList mdEntries() {
        return mdEntries;
    }

    /**
     * EffectiveBusinessDate
     *
     * @return the EffectiveBusinessDate record
     */
    public EffectiveBusinessDate effectiveBusinessDate() {
        return effectiveBusinessDate;
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
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + symbol.byteLength() - Symbol.MINIMUM_BYTE_LENGTH + mdEntries.byteLength();
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
        cursor += 8;
        for (int[] run = EffectiveBusinessDate.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += EffectiveBusinessDate.BYTE_LENGTH;
        cursor += 1;
        cursor = symbol.padding(runs, cursor);
        cursor += 1;
        cursor = mdEntries.padding(runs, cursor);
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!effectiveBusinessDate.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += effectiveBusinessDate.byteLength();
        if (!summaryType.parse(data, cursor)) {
            return false;
        }
        cursor += SummaryTypeField.BYTE_LENGTH;
        if (!symbol.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += symbol.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!noMdEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoMdEntriesField.BYTE_LENGTH;
        if (!mdEntries.parse(data, cursor, end, noMdEntries.value())) {
            return false;
        }
        cursor += mdEntries.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (mdEntries.size() > 255) {
            throw new IllegalStateException("mdEntries holds " + mdEntries.size() + " entries, more than its count field can state");
        }
        noMdEntries.value((short) mdEntries.size());
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = effectiveBusinessDate.encode(data, cursor);
        cursor = summaryType.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = noMdEntries.encode(data, cursor);
        cursor = mdEntries.encode(data, cursor);
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
        effectiveBusinessDate.clear();
        symbol.clear();
        mdEntries.clear();
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
            if (field != symbol.symbolLength() && field != noMdEntries && !field.isRecognized()) {
                return false;
            }
        }
        if (!mdEntries.isRecognized()) {
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
            if (field != symbol.symbolLength() && field != noMdEntries && !field.isValid()) {
                return false;
            }
        }
        if (!mdEntries.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!effectiveBusinessDate.isDecoded()) {
            return effectiveBusinessDate.failedAt();
        }
        if (!summaryType.isDecoded()) {
            return Optional.of(summaryType);
        }
        if (!symbol.isDecoded()) {
            return symbol.failedAt();
        }
        if (!noMdEntries.isDecoded()) {
            return Optional.of(noMdEntries);
        }
        if (!mdEntries.isDecoded()) {
            return Optional.of(mdEntries.failedEntry().flatMap(MdEntriesEntry::failedAt).orElse(noMdEntries));
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SummaryType" -> Optional.of(summaryType);
            case "NoMdEntries" -> Optional.of(noMdEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexSummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdEntries.diffFields(message.mdEntries));
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
            mdEntries.toFormattedString(builder, options);
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
        mdEntries.toFormattedString(builder, nested);
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
        if (!(other instanceof IndexSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && mdEntries.equals(message.mdEntries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdEntries);
    }
}
