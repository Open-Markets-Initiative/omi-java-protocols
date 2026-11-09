package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.ChannelIdField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.ComplexIndexField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.ComplexSymbolField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.MarketIdField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.NoOfLegsField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.StreamIdField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.SystemIdField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.groups.LegDefinitionEntry;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.groups.LegDefinitionList;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Message;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the ComplexSymbolDefinitionMessage message from the ComplexFeed protocol.
 *
 * <p>The Complex Symbol Definition message provides a description of the legs in a Complex symbol, and specifies its Complex symbol ID, which is unique for its stream. If the same symbol ID appears in a different stream, it represents a different Complex symbol.</p>
 */
public final class ComplexSymbolDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Symbol Definition Message";

    /**
     * The unique ID of the symbol in the Complex Index msg
     */
    private final ComplexIndexField complexIndex = new ComplexIndexField();

    /**
     * Complex Symbol. This is an alpha numeric symbol which can be used for a unique strategy until one of the legs expire.
     */
    private final ComplexSymbolField complexSymbol = new ComplexSymbolField();

    /**
     * Multicast channel ID of the symbols being provided.
     */
    private final ChannelIdField channelId = new ChannelIdField();

    /**
     * Identifies originating market
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Identifies Trading unit (TU)
     */
    private final SystemIdField systemId = new SystemIdField();

    /**
     * Identifies Stream on which this symbol will be updated
     */
    private final StreamIdField streamId = new StreamIdField();

    /**
     * Number of legs in complex symbol: 1 – 5
     */
    private final NoOfLegsField noOfLegs = new NoOfLegsField();

    /**
     * Leg definition
     */
    private final LegDefinitionList legDefinition = new LegDefinitionList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(complexIndex, complexSymbol, channelId, marketId, systemId, streamId, noOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of the symbol in the Complex Index msg
     *
     * @return the ComplexIndex field
     */
    public ComplexIndexField complexIndex() {
        return complexIndex;
    }

    /**
     * Complex Symbol. This is an alpha numeric symbol which can be used for a unique strategy until one of the legs expire.
     *
     * @return the ComplexSymbol field
     */
    public ComplexSymbolField complexSymbol() {
        return complexSymbol;
    }

    /**
     * Multicast channel ID of the symbols being provided.
     *
     * @return the ChannelId field
     */
    public ChannelIdField channelId() {
        return channelId;
    }

    /**
     * Identifies originating market
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Identifies Trading unit (TU)
     *
     * @return the SystemId field
     */
    public SystemIdField systemId() {
        return systemId;
    }

    /**
     * Identifies Stream on which this symbol will be updated
     *
     * @return the StreamId field
     */
    public StreamIdField streamId() {
        return streamId;
    }

    /**
     * Number of legs in complex symbol: 1 – 5
     *
     * @return the NoOfLegs field
     */
    public NoOfLegsField noOfLegs() {
        return noOfLegs;
    }

    /**
     * Leg definition
     *
     * <p>Encode writes this list's size to the NoOfLegs field.</p>
     *
     * @return the LegDefinition entries
     */
    public LegDefinitionList legDefinition() {
        return legDefinition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legDefinition.byteLength();
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
        cursor += 4;
        cursor += 21;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 2;
        cursor += 2;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = legDefinition.padding(runs, cursor);
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
        if (!complexIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexIndexField.BYTE_LENGTH;
        if (!complexSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexSymbolField.BYTE_LENGTH;
        if (!channelId.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelIdField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!systemId.parse(data, cursor)) {
            return false;
        }
        cursor += SystemIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!streamId.parse(data, cursor)) {
            return false;
        }
        cursor += StreamIdField.BYTE_LENGTH;
        if (!noOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfLegsField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!legDefinition.parse(data, cursor, end, noOfLegs.value())) {
            return false;
        }
        cursor += legDefinition.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legDefinition.size() > 65535) {
            throw new IllegalStateException("legDefinition holds " + legDefinition.size() + " entries, more than its count field can state");
        }
        noOfLegs.value(legDefinition.size());
        int cursor = offset;
        cursor = complexIndex.encode(data, cursor);
        cursor = complexSymbol.encode(data, cursor);
        cursor = channelId.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        if (buffer != null && buffer.length >= 29 + 1) {
            System.arraycopy(buffer, 29, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = streamId.encode(data, cursor);
        cursor = noOfLegs.encode(data, cursor);
        if (buffer != null && buffer.length >= 34 + 2) {
            System.arraycopy(buffer, 34, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = legDefinition.encode(data, cursor);
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
        legDefinition.clear();
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
        if (!legDefinition.isRecognized()) {
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
            if (field != noOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!legDefinition.isValid()) {
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
        if (!complexIndex.isDecoded()) {
            return Optional.of(complexIndex);
        }
        if (!complexSymbol.isDecoded()) {
            return Optional.of(complexSymbol);
        }
        if (!channelId.isDecoded()) {
            return Optional.of(channelId);
        }
        if (!marketId.isDecoded()) {
            return Optional.of(marketId);
        }
        if (!systemId.isDecoded()) {
            return Optional.of(systemId);
        }
        if (!streamId.isDecoded()) {
            return Optional.of(streamId);
        }
        if (!noOfLegs.isDecoded()) {
            return Optional.of(noOfLegs);
        }
        if (!legDefinition.isDecoded()) {
            return Optional.of(legDefinition.failedEntry().flatMap(LegDefinitionEntry::failedAt).orElse(noOfLegs));
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
            case "ComplexIndex" -> Optional.of(complexIndex);
            case "ComplexSymbol" -> Optional.of(complexSymbol);
            case "ChannelId" -> Optional.of(channelId);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "StreamId" -> Optional.of(streamId);
            case "NoOfLegs" -> Optional.of(noOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexSymbolDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legDefinition.diffFields(message.legDefinition));
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
            legDefinition.toFormattedString(builder, options);
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
        legDefinition.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexSymbolDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legDefinition.equals(message.legDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legDefinition);
    }
}
