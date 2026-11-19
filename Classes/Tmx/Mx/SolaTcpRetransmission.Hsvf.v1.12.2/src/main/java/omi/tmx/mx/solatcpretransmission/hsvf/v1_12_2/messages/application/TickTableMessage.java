package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.NbEntriesField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.TickTableNameField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.TickTableShortNameField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.groups.TickEntryEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.groups.TickEntryList;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the TickTableMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>The TT: Tick Table message is used to send the Tick Table information via HSVF.</p>
 */
public final class TickTableMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 67;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tick Table Message";

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Tick Table Name
     */
    private final TickTableNameField tickTableName = new TickTableNameField();

    /**
     * Tick Table Short Name
     */
    private final TickTableShortNameField tickTableShortName = new TickTableShortNameField();

    /**
     * Nb Entries
     */
    private final NbEntriesField nbEntries = new NbEntriesField();

    /**
     * One tick table entry.
     */
    private final TickEntryList tickEntry = new TickEntryList();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), List.<Field>of(tickTableName), List.<Field>of(tickTableShortName), List.<Field>of(nbEntries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange Id
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Tick Table Name
     *
     * @return the TickTableName field
     */
    public TickTableNameField tickTableName() {
        return tickTableName;
    }

    /**
     * Tick Table Short Name
     *
     * @return the TickTableShortName field
     */
    public TickTableShortNameField tickTableShortName() {
        return tickTableShortName;
    }

    /**
     * Nb Entries
     *
     * @return the NbEntries field
     */
    public NbEntriesField nbEntries() {
        return nbEntries;
    }

    /**
     * One tick table entry.
     *
     * <p>Encode writes this list's size to the NbEntries field.</p>
     *
     * @return the TickEntry entries
     */
    public TickEntryList tickEntry() {
        return tickEntry;
    }

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     *
     * @return the LongMessageHeader record
     */
    public LongMessageHeader longMessageHeader() {
        return longMessageHeader;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!longMessageHeader.parseFrom(data, cursor, end - 55)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
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
        if (!nbEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NbEntriesField.BYTE_LENGTH;
        if (nbEntries.value() == null) {
            return false;
        }
        if (!tickEntry.parse(data, cursor, end, nbEntries.value())) {
            return false;
        }
        cursor += tickEntry.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tickEntry.size() > 99) {
            throw new IllegalStateException("tickEntry holds " + tickEntry.size() + " entries, more than its count field can state");
        }
        nbEntries.value((long) tickEntry.size());
        int cursor = offset;
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = tickTableName.encode(data, cursor);
        cursor = tickTableShortName.encode(data, cursor);
        cursor = nbEntries.encode(data, cursor);
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
        longMessageHeader.clear();
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
            if (field != nbEntries && !field.isRecognized()) {
                return false;
            }
        }
        return tickEntry.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != nbEntries && !field.isValid()) {
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
        if (!longMessageHeader.isDecoded()) {
            return longMessageHeader.failedAt();
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
        if (!nbEntries.isDecoded()) {
            return Optional.of(nbEntries);
        }
        if (!tickEntry.isDecoded()) {
            return Optional.of(tickEntry.failedEntry().flatMap(TickEntryEntry::failedAt).orElse(nbEntries));
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
            case "NbEntries" -> Optional.of(nbEntries);
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
