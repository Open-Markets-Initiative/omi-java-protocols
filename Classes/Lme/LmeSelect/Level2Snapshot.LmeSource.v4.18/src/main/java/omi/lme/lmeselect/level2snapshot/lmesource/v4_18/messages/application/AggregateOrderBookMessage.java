package omi.lme.lmeselect.level2snapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.fields.NoEntriesField;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.groups.EntriesEntry;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.groups.EntriesList;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level2snapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the AggregateOrderBookMessage message from the Level2Snapshot protocol.
 *
 * <p>Sent whenever there is an order book change within the top fifteen price levels. The TimeOfEvent is the latest incoming event timestamp that resulted in any price level being updated or removed; for orders submitted during Pre-Open and reloaded GTC and GTD orders it reflects the uncrossing event time at market open.</p>
 */
public final class AggregateOrderBookMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Aggregate Order Book Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Time of event.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Number of book entries within the message.
     */
    private final NoEntriesField noEntries = new NoEntriesField();

    /**
     * One aggregate order book entry, giving the aggregated state of one price level on one side
     */
    private final EntriesList entries = new EntriesList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, tradableInstrumentId, noEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Time of event.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Tradable Instrument ID.
     *
     * @return the TradableInstrumentId field
     */
    public TradableInstrumentIdField tradableInstrumentId() {
        return tradableInstrumentId;
    }

    /**
     * Number of book entries within the message.
     *
     * @return the NoEntries field
     */
    public NoEntriesField noEntries() {
        return noEntries;
    }

    /**
     * One aggregate order book entry, giving the aggregated state of one price level on one side
     *
     * <p>Encode writes this list's size to the NoEntries field.</p>
     *
     * @return the Entries entries
     */
    public EntriesList entries() {
        return entries;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + entries.byteLength();
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!noEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoEntriesField.BYTE_LENGTH;
        if (!entries.parse(data, cursor, end, noEntries.value())) {
            return false;
        }
        cursor += entries.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (entries.size() > 255) {
            throw new IllegalStateException("entries holds " + entries.size() + " entries, more than its count field can state");
        }
        noEntries.value((short) entries.size());
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = noEntries.encode(data, cursor);
        cursor = entries.encode(data, cursor);
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
        entries.clear();
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
            if (field != noEntries && !field.isRecognized()) {
                return false;
            }
        }
        return entries.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noEntries && !field.isValid()) {
                return false;
            }
        }
        if (!entries.isValid()) {
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
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!timeOfEvent.isDecoded()) {
            return Optional.of(timeOfEvent);
        }
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!noEntries.isDecoded()) {
            return Optional.of(noEntries);
        }
        if (!entries.isDecoded()) {
            return Optional.of(entries.failedEntry().flatMap(EntriesEntry::failedAt).orElse(noEntries));
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "NoEntries" -> Optional.of(noEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AggregateOrderBookMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(entries.diffFields(message.entries));
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
            entries.toFormattedString(builder, options);
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
        entries.toFormattedString(builder, nested);
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
        if (!(other instanceof AggregateOrderBookMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && entries.equals(message.entries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, entries);
    }
}
