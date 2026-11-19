package omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.MarketIdField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.NoOfLegsField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SeriesIndexField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SystemIdField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.groups.ComplexSeriesIndexMappingLegEntry;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.groups.ComplexSeriesIndexMappingLegList;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.Field;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.Message;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.PrintOptions;

/**
 * Represents the ComplexSeriesIndexMappingMessage message from the ComplexFeed protocol.
 *
 * <p>Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified options complex series.</p>
 */
public final class ComplexSeriesIndexMappingMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 9;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Series Index Mapping Message";

    /**
     * The unique ID of this series within this market.
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * ID of the Originating Market.
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * ID of the Originating matching engine server.
     */
    private final SystemIdField systemId = new SystemIdField();

    /**
     * Number of legs in complex symbol. 2 - 12
     */
    private final NoOfLegsField noOfLegs = new NoOfLegsField();

    /**
     * Complex Series Index Mapping Leg
     */
    private final ComplexSeriesIndexMappingLegList complexSeriesIndexMappingLeg = new ComplexSeriesIndexMappingLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seriesIndex, marketId, systemId, noOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of this series within this market.
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * ID of the Originating Market.
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * ID of the Originating matching engine server.
     *
     * @return the SystemId field
     */
    public SystemIdField systemId() {
        return systemId;
    }

    /**
     * Number of legs in complex symbol. 2 - 12
     *
     * @return the NoOfLegs field
     */
    public NoOfLegsField noOfLegs() {
        return noOfLegs;
    }

    /**
     * Complex Series Index Mapping Leg
     *
     * <p>Encode writes this list's size to the NoOfLegs field.</p>
     *
     * @return the ComplexSeriesIndexMappingLeg entries
     */
    public ComplexSeriesIndexMappingLegList complexSeriesIndexMappingLeg() {
        return complexSeriesIndexMappingLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexSeriesIndexMappingLeg.byteLength();
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
        if (!seriesIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesIndexField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!systemId.parse(data, cursor)) {
            return false;
        }
        cursor += SystemIdField.BYTE_LENGTH;
        if (!noOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfLegsField.BYTE_LENGTH;
        if (!complexSeriesIndexMappingLeg.parse(data, cursor, end, noOfLegs.value())) {
            return false;
        }
        cursor += complexSeriesIndexMappingLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexSeriesIndexMappingLeg.size() > 65535) {
            throw new IllegalStateException("complexSeriesIndexMappingLeg holds " + complexSeriesIndexMappingLeg.size() + " entries, more than its count field can state");
        }
        noOfLegs.value(complexSeriesIndexMappingLeg.size());
        int cursor = offset;
        cursor = seriesIndex.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        cursor = noOfLegs.encode(data, cursor);
        cursor = complexSeriesIndexMappingLeg.encode(data, cursor);
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
        complexSeriesIndexMappingLeg.clear();
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
            if (field != noOfLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexSeriesIndexMappingLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexSeriesIndexMappingLeg.isValid()) {
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
        if (!seriesIndex.isDecoded()) {
            return Optional.of(seriesIndex);
        }
        if (!marketId.isDecoded()) {
            return Optional.of(marketId);
        }
        if (!systemId.isDecoded()) {
            return Optional.of(systemId);
        }
        if (!noOfLegs.isDecoded()) {
            return Optional.of(noOfLegs);
        }
        if (!complexSeriesIndexMappingLeg.isDecoded()) {
            return Optional.of(complexSeriesIndexMappingLeg.failedEntry().flatMap(ComplexSeriesIndexMappingLegEntry::failedAt).orElse(noOfLegs));
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
            case "SeriesIndex" -> Optional.of(seriesIndex);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "NoOfLegs" -> Optional.of(noOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexSeriesIndexMappingMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexSeriesIndexMappingLeg.diffFields(message.complexSeriesIndexMappingLeg));
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
            complexSeriesIndexMappingLeg.toFormattedString(builder, options);
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
        complexSeriesIndexMappingLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexSeriesIndexMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexSeriesIndexMappingLeg.equals(message.complexSeriesIndexMappingLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexSeriesIndexMappingLeg);
    }
}
