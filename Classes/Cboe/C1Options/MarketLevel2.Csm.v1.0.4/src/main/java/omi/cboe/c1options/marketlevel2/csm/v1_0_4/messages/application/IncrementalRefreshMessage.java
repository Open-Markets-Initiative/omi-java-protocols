package omi.cboe.c1options.marketlevel2.csm.v1_0_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.ClassKeyField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.NoEntriesField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.PriceTypeField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.RptSeqField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.SecurityIdField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.SecurityTradingStatusField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.groups.IncrementalRefreshMdEntryEntry;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.groups.IncrementalRefreshMdEntryList;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.Field;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.Message;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.PrintOptions;

/**
 * Represents the IncrementalRefreshMessage message from the MarketLevel2 protocol.
 *
 * <p>IncRefresh messages contain the current SecurityTradingStatus for a product and one or more instructions that indicate how the book structure has incrementally changed since the last book update.</p>
 */
public final class IncrementalRefreshMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0012';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 15;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Incremental Refresh Message";

    /**
     * Product Class key
     */
    private final ClassKeyField classKey = new ClassKeyField();

    /**
     * Product key
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Per-product seq number.
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Specifies how to interpret the value in the StrikePrice field.
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Number of MDEntries in this message. The length of the sequence will not be more than 255
     */
    private final NoEntriesField noEntries = new NoEntriesField();

    /**
     * Incremental Refresh MDEntry
     */
    private final IncrementalRefreshMdEntryList incrementalRefreshMdEntry = new IncrementalRefreshMdEntryList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(classKey, securityId, rptSeq, securityTradingStatus, priceType, noEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Product Class key
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
     * Per-product seq number.
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
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
     * Number of MDEntries in this message. The length of the sequence will not be more than 255
     *
     * @return the NoEntries field
     */
    public NoEntriesField noEntries() {
        return noEntries;
    }

    /**
     * Incremental Refresh MDEntry
     *
     * <p>Encode writes this list's size to the NoEntries field.</p>
     *
     * @return the IncrementalRefreshMdEntry entries
     */
    public IncrementalRefreshMdEntryList incrementalRefreshMdEntry() {
        return incrementalRefreshMdEntry;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + incrementalRefreshMdEntry.byteLength();
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
        if (!rptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RptSeqField.BYTE_LENGTH;
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
        if (!incrementalRefreshMdEntry.parse(data, cursor, end, noEntries.value())) {
            return false;
        }
        cursor += incrementalRefreshMdEntry.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (incrementalRefreshMdEntry.size() > 255) {
            throw new IllegalStateException("incrementalRefreshMdEntry holds " + incrementalRefreshMdEntry.size() + " entries, more than its count field can state");
        }
        noEntries.value((short) incrementalRefreshMdEntry.size());
        int cursor = offset;
        cursor = classKey.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = noEntries.encode(data, cursor);
        cursor = incrementalRefreshMdEntry.encode(data, cursor);
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
        incrementalRefreshMdEntry.clear();
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
        return incrementalRefreshMdEntry.isRecognized();
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
        if (!incrementalRefreshMdEntry.isValid()) {
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
        if (!rptSeq.isDecoded()) {
            return Optional.of(rptSeq);
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
        if (!incrementalRefreshMdEntry.isDecoded()) {
            return Optional.of(incrementalRefreshMdEntry.failedEntry().flatMap(IncrementalRefreshMdEntryEntry::failedAt).orElse(noEntries));
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
            case "RptSeq" -> Optional.of(rptSeq);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "PriceType" -> Optional.of(priceType);
            case "NoEntries" -> Optional.of(noEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IncrementalRefreshMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(incrementalRefreshMdEntry.diffFields(message.incrementalRefreshMdEntry));
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
            incrementalRefreshMdEntry.toFormattedString(builder, options);
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
        incrementalRefreshMdEntry.toFormattedString(builder, nested);
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
        if (!(other instanceof IncrementalRefreshMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && incrementalRefreshMdEntry.equals(message.incrementalRefreshMdEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, incrementalRefreshMdEntry);
    }
}
