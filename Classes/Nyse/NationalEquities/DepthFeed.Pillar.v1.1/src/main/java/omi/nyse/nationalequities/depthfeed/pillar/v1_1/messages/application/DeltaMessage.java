package omi.nyse.nationalequities.depthfeed.pillar.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.fields.SourceTimeField;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.fields.SourceTimeNsField;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.fields.SymbolIndexField;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.fields.SymbolSeqNumField;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.fields.UpdateCountField;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.groups.PricePointEntry;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.groups.PricePointList;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.types.Field;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.types.Message;
import omi.nyse.nationalequities.depthfeed.pillar.v1_1.types.PrintOptions;

/**
 * Represents the DeltaMessage message from the DepthFeed protocol.
 *
 * <p>The Delta Message is published each time there is a change to the aggregate limit-order book quantity across the ten best price points on the buy and/or sell side for NYSE Group.</p>
 */
public final class DeltaMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 17;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Delta Message";

    /**
     * The time when this msg was generated in the order book, in secs since 1/1/1970 00:00:00 UTC
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the Source Time
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The ID of the symbol in the Symbol Index msg
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The sequence number of this message in the set of all messages for this symbol
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * Indicates the number of times the following group fields will be repeated in the message: Price, Side, Participants
     */
    private final UpdateCountField updateCount = new UpdateCountField();

    /**
     * Price point group repeating UpdateCount times
     */
    private final PricePointList pricePoint = new PricePointList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, updateCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in secs since 1/1/1970 00:00:00 UTC
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the Source Time
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The ID of the symbol in the Symbol Index msg
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The sequence number of this message in the set of all messages for this symbol
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * Indicates the number of times the following group fields will be repeated in the message: Price, Side, Participants
     *
     * @return the UpdateCount field
     */
    public UpdateCountField updateCount() {
        return updateCount;
    }

    /**
     * Price point group repeating UpdateCount times
     *
     * <p>Encode writes this list's size to the UpdateCount field.</p>
     *
     * @return the PricePoint entries
     */
    public PricePointList pricePoint() {
        return pricePoint;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + pricePoint.byteLength();
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!updateCount.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateCountField.BYTE_LENGTH;
        if (!pricePoint.parse(data, cursor, end, updateCount.value())) {
            return false;
        }
        cursor += pricePoint.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (pricePoint.size() > 255) {
            throw new IllegalStateException("pricePoint holds " + pricePoint.size() + " entries, more than its count field can state");
        }
        updateCount.value((short) pricePoint.size());
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = updateCount.encode(data, cursor);
        cursor = pricePoint.encode(data, cursor);
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
        pricePoint.clear();
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
            if (field != updateCount && !field.isRecognized()) {
                return false;
            }
        }
        return pricePoint.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != updateCount && !field.isValid()) {
                return false;
            }
        }
        if (!pricePoint.isValid()) {
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
        if (!sourceTime.isDecoded()) {
            return Optional.of(sourceTime);
        }
        if (!sourceTimeNs.isDecoded()) {
            return Optional.of(sourceTimeNs);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!symbolSeqNum.isDecoded()) {
            return Optional.of(symbolSeqNum);
        }
        if (!updateCount.isDecoded()) {
            return Optional.of(updateCount);
        }
        if (!pricePoint.isDecoded()) {
            return Optional.of(pricePoint.failedEntry().flatMap(PricePointEntry::failedAt).orElse(updateCount));
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "UpdateCount" -> Optional.of(updateCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DeltaMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(pricePoint.diffFields(message.pricePoint));
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
            pricePoint.toFormattedString(builder, options);
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
        pricePoint.toFormattedString(builder, nested);
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
        if (!(other instanceof DeltaMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && pricePoint.equals(message.pricePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, pricePoint);
    }
}
