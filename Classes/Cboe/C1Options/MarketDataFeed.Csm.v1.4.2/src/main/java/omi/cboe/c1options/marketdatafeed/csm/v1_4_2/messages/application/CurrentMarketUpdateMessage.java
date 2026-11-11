package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.ClassKeyField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.NoEntriesField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.PriceTypeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.SecurityIdField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.SecurityTradingStatusField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.MdEntryEntry;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.MdEntryList;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Field;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Message;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.PrintOptions;

/**
 * Represents the CurrentMarketUpdateMessage message from the MarketDataFeed protocol.
 *
 * <p>The Current Market Update message contains real-time top of book market updates for a security.</p>
 */
public final class CurrentMarketUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\f';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 11;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Current Market Update Message";

    /**
     * Class key
     */
    private final ClassKeyField classKey = new ClassKeyField();

    /**
     * Product key
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Specifies how to interpret the value in the StrikePrice field.
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Number of MDEntries in this message. Will not exceed 255
     */
    private final NoEntriesField noEntries = new NoEntriesField();

    /**
     * MDEntry
     */
    private final MdEntryList mdEntry = new MdEntryList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(classKey, securityId, securityTradingStatus, priceType, noEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Class key
     *
     * @return the ClassKey field
     */
    public ClassKeyField classKey() {
        return classKey;
    }

    /**
     * Product key
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Security Trading Status
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * Specifies how to interpret the value in the StrikePrice field.
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Number of MDEntries in this message. Will not exceed 255
     *
     * @return the NoEntries field
     */
    public NoEntriesField noEntries() {
        return noEntries;
    }

    /**
     * MDEntry
     *
     * <p>Encode writes this list's size to the NoEntries field.</p>
     *
     * @return the MdEntry entries
     */
    public MdEntryList mdEntry() {
        return mdEntry;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + mdEntry.byteLength();
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
        if (!classKey.parse(data, cursor)) {
            return false;
        }
        cursor += ClassKeyField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!noEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoEntriesField.BYTE_LENGTH;
        if (!mdEntry.parse(data, cursor, end, noEntries.value())) {
            return false;
        }
        cursor += mdEntry.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (mdEntry.size() > 255) {
            throw new IllegalStateException("mdEntry holds " + mdEntry.size() + " entries, more than its count field can state");
        }
        noEntries.value((short) mdEntry.size());
        int cursor = offset;
        cursor = classKey.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = noEntries.encode(data, cursor);
        cursor = mdEntry.encode(data, cursor);
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
        mdEntry.clear();
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
        return mdEntry.isRecognized();
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
        if (!mdEntry.isValid()) {
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
        if (!classKey.isDecoded()) {
            return Optional.of(classKey);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!securityTradingStatus.isDecoded()) {
            return Optional.of(securityTradingStatus);
        }
        if (!priceType.isDecoded()) {
            return Optional.of(priceType);
        }
        if (!noEntries.isDecoded()) {
            return Optional.of(noEntries);
        }
        if (!mdEntry.isDecoded()) {
            return Optional.of(mdEntry.failedEntry().flatMap(MdEntryEntry::failedAt).orElse(noEntries));
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
            case "ClassKey" -> Optional.of(classKey);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "PriceType" -> Optional.of(priceType);
            case "NoEntries" -> Optional.of(noEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CurrentMarketUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdEntry.diffFields(message.mdEntry));
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
            mdEntry.toFormattedString(builder, options);
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
        mdEntry.toFormattedString(builder, nested);
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
        if (!(other instanceof CurrentMarketUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && mdEntry.equals(message.mdEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdEntry);
    }
}
