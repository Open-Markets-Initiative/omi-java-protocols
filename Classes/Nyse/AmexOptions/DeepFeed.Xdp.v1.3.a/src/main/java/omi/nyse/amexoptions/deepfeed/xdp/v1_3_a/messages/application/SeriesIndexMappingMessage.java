package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ChannelIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ContractMultiplierField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.GroupIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.MarketIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.MaturityDateField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.OptionSymbolRootField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.PriceScaleCodeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.PutOrCallField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SeriesIndexField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.StreamIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.StrikePriceField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SystemIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.UnderlyingIndexField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.UnderlyingSymbolField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Message;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the SeriesIndexMappingMessage message from the DeepFeed protocol.
 *
 * <p>On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.</p>
 */
public final class SeriesIndexMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Series Index Mapping Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 5, 1, 9, 1 };

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * Multicast channel ID of the symbols being provided.
     */
    private final ChannelIdField channelId = new ChannelIdField();

    /**
     * Identifies originating market
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * ID of the Originating System
     */
    private final SystemIdField systemId = new SystemIdField();

    /**
     * Identifies Stream on which this symbol will be updated
     */
    private final StreamIdField streamId = new StreamIdField();

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final UnderlyingIndexField underlyingIndex = new UnderlyingIndexField();

    /**
     * Contract quantity
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * YY MM DD
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Put or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Strike price. ASCII 0-9 with optional decimal point. EG: 51.75, 123
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Price Scale Code for price conversion of the symbol. See Price Formats.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Full symbol in NYSE Symbology.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * OCC root of option symbol
     */
    private final OptionSymbolRootField optionSymbolRoot = new OptionSymbolRootField();

    /**
     * Used by Market Makers. Predefined group of series within a given underlying symbol.
     */
    private final GroupIdField groupId = new GroupIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seriesIndex, channelId, marketId, systemId, streamId, underlyingIndex, contractMultiplier, maturityDate, putOrCall, strikePrice, priceScaleCode, underlyingSymbol, optionSymbolRoot, groupId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of the symbol in the Series Index message
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
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
     * ID of the Originating System
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
     * The unique ID of the symbol in the Series Index message
     *
     * @return the UnderlyingIndex field
     */
    public UnderlyingIndexField underlyingIndex() {
        return underlyingIndex;
    }

    /**
     * Contract quantity
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * YY MM DD
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Put or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Strike price. ASCII 0-9 with optional decimal point. EG: 51.75, 123
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Price Scale Code for price conversion of the symbol. See Price Formats.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * Full symbol in NYSE Symbology.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * OCC root of option symbol
     *
     * @return the OptionSymbolRoot field
     */
    public OptionSymbolRootField optionSymbolRoot() {
        return optionSymbolRoot;
    }

    /**
     * Used by Market Makers. Predefined group of series within a given underlying symbol.
     *
     * @return the GroupId field
     */
    public GroupIdField groupId() {
        return groupId;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!seriesIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesIndexField.BYTE_LENGTH;
        if (!channelId.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelIdField.BYTE_LENGTH;
        cursor += 1; // padding
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
        if (!underlyingIndex.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIndexField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!optionSymbolRoot.parse(data, cursor)) {
            return false;
        }
        cursor += OptionSymbolRootField.BYTE_LENGTH;
        return groupId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seriesIndex.encode(data, cursor);
        cursor = channelId.encode(data, cursor);
        if (buffer != null && buffer.length >= 6) {
            System.arraycopy(buffer, 5, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 9, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = streamId.encode(data, cursor);
        cursor = underlyingIndex.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = optionSymbolRoot.encode(data, cursor);
        cursor = groupId.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
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
            case "ChannelId" -> Optional.of(channelId);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "StreamId" -> Optional.of(streamId);
            case "UnderlyingIndex" -> Optional.of(underlyingIndex);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "OptionSymbolRoot" -> Optional.of(optionSymbolRoot);
            case "GroupId" -> Optional.of(groupId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SeriesIndexMappingMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof SeriesIndexMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
