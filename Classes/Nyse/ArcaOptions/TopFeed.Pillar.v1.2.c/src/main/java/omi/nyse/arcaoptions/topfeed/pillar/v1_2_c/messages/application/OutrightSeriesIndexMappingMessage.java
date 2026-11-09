package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.ClosingOnlyIndicatorField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.ContractMultiplierField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.MarketIdField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.MaturityDateField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.OptionSymbolRootField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.PriceScaleCodeField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.PutOrCallField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SeriesIndexField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SeriesTypeField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.StrikePriceField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SystemIdField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.UnderlyingIndexField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.UnderlyingSymbolField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.Field;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.Message;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.PrintOptions;

/**
 * Represents the OutrightSeriesIndexMappingMessage message from the TopFeed protocol.
 *
 * <p>This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or PILLAR Publisher failover.</p>
 */
public final class OutrightSeriesIndexMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Series Index Mapping Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 50, 1 };

    /**
     * The unique ID of this series for all products within this market
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * Identifies series type
     */
    private final SeriesTypeField seriesType = new SeriesTypeField();

    /**
     * ID of the Originating Market
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * ID of the Originating matching engine server.
     */
    private final SystemIdField systemId = new SystemIdField();

    /**
     * Root symbol for options in OCC symbology
     */
    private final OptionSymbolRootField optionSymbolRoot = new OptionSymbolRootField();

    /**
     * Underlying symbol for options in NYSE symbology
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Underlying stock mapping index
     */
    private final UnderlyingIndexField underlyingIndex = new UnderlyingIndexField();

    /**
     * Specifies placement of the decimal point in price fields for this security.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Number of Underlying shares per option contract
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * Option maturity date - YYMMDD
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Option Type
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Strike price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Closing Only Indicator
     */
    private final ClosingOnlyIndicatorField closingOnlyIndicator = new ClosingOnlyIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seriesIndex, seriesType, marketId, systemId, optionSymbolRoot, underlyingSymbol, underlyingIndex, priceScaleCode, contractMultiplier, maturityDate, putOrCall, strikePrice, closingOnlyIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of this series for all products within this market
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * Identifies series type
     *
     * @return the SeriesType field
     */
    public SeriesTypeField seriesType() {
        return seriesType;
    }

    /**
     * ID of the Originating Market
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
     * Root symbol for options in OCC symbology
     *
     * @return the OptionSymbolRoot field
     */
    public OptionSymbolRootField optionSymbolRoot() {
        return optionSymbolRoot;
    }

    /**
     * Underlying symbol for options in NYSE symbology
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Underlying stock mapping index
     *
     * @return the UnderlyingIndex field
     */
    public UnderlyingIndexField underlyingIndex() {
        return underlyingIndex;
    }

    /**
     * Specifies placement of the decimal point in price fields for this security.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * Number of Underlying shares per option contract
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * Option maturity date - YYMMDD
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Option Type
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Strike price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Closing Only Indicator
     *
     * @return the ClosingOnlyIndicator field
     */
    public ClosingOnlyIndicatorField closingOnlyIndicator() {
        return closingOnlyIndicator;
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
        if (!seriesType.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesTypeField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!systemId.parse(data, cursor)) {
            return false;
        }
        cursor += SystemIdField.BYTE_LENGTH;
        if (!optionSymbolRoot.parse(data, cursor)) {
            return false;
        }
        cursor += OptionSymbolRootField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!underlyingIndex.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIndexField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
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
        if (!closingOnlyIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingOnlyIndicatorField.BYTE_LENGTH;
        cursor += 1; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seriesIndex.encode(data, cursor);
        cursor = seriesType.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        cursor = optionSymbolRoot.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = underlyingIndex.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = closingOnlyIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 50 + 1) {
            System.arraycopy(buffer, 50, data, cursor, 1); // padding
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
            case "SeriesIndex" -> Optional.of(seriesIndex);
            case "SeriesType" -> Optional.of(seriesType);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "OptionSymbolRoot" -> Optional.of(optionSymbolRoot);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "UnderlyingIndex" -> Optional.of(underlyingIndex);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ClosingOnlyIndicator" -> Optional.of(closingOnlyIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightSeriesIndexMappingMessage message)) {
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
        if (!(other instanceof OutrightSeriesIndexMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
