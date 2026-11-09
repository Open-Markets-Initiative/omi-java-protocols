package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ChannelIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ExchangeCodeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.MarketIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.PriceResolutionField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.PriceScaleCodeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SecurityTypeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SystemIdField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.UnderlyingIndexField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.UnderlyingSymbolField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Message;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the UnderlyingIndexMappingMessage message from the DeepFeed protocol.
 *
 * <p>On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.</p>
 */
public final class UnderlyingIndexMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 24;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Underlying Index Mapping Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 23, 1 };

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final UnderlyingIndexField underlyingIndex = new UnderlyingIndexField();

    /**
     * Full symbol in NYSE Symbology.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

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
     * Exchanges where it is listed
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * Price Scale Code for price conversion of the symbol. See Price Formats.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Type of Security
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Price Resolution value
     */
    private final PriceResolutionField priceResolution = new PriceResolutionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(underlyingIndex, underlyingSymbol, channelId, marketId, systemId, exchangeCode, priceScaleCode, securityType, priceResolution);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of the symbol in the Series Index message
     *
     * @return the UnderlyingIndex field
     */
    public UnderlyingIndexField underlyingIndex() {
        return underlyingIndex;
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
     * Exchanges where it is listed
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
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
     * Type of Security
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Price Resolution value
     *
     * @return the PriceResolution field
     */
    public PriceResolutionField priceResolution() {
        return priceResolution;
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
        if (!underlyingIndex.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIndexField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
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
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!priceResolution.parse(data, cursor)) {
            return false;
        }
        cursor += PriceResolutionField.BYTE_LENGTH;
        cursor += 1; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = underlyingIndex.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = channelId.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = priceResolution.encode(data, cursor);
        if (buffer != null && buffer.length >= 23 + 1) {
            System.arraycopy(buffer, 23, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "UnderlyingIndex" -> Optional.of(underlyingIndex);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "ChannelId" -> Optional.of(channelId);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "SecurityType" -> Optional.of(securityType);
            case "PriceResolution" -> Optional.of(priceResolution);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UnderlyingIndexMappingMessage message)) {
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
        if (!(other instanceof UnderlyingIndexMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
