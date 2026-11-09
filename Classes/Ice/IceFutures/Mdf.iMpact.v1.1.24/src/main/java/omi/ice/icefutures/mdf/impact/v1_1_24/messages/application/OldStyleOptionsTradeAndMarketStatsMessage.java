package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.BlockVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EfpVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EfsVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EventCodeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HighField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LowField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OffMarketTradeIndicatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.QuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.StrikePriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TotalVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TradeIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TransactDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.UnderlyingMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.VwapField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the OldStyleOptionsTradeAndMarketStatsMessage message from the Mdf protocol.
 *
 * <p>Option settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one.</p>
 */
public final class OldStyleOptionsTradeAndMarketStatsMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Old Style Options Trade And Market Stats Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Unique identifier of the underlying market
     */
    private final UnderlyingMarketIdField underlyingMarketId = new UnderlyingMarketIdField();

    /**
     * Unique identifier of the trade message, unique per market.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PriceField price = new PriceField();

    /**
     * Quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Legacy field that supports all single character trade types on ICE. The new 3-character “OffMarketTradeType” field replaces this field. In the future (no earlier than 2015), ICE anticipates the introduction of 3 character trade types that will only be available in the new field. Trade types that are longer than a single character will be represented with “#” in this field.
     */
    private final OffMarketTradeIndicatorField offMarketTradeIndicator = new OffMarketTradeIndicatorField();

    /**
     * Deal date time
     */
    private final TransactDateTimeField transactDateTime = new TransactDateTimeField();

    /**
     * “C” – Call, “P” – Put
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Strike Price of the option. Used in conjunction with the NumDecimalsStrikePrice. This is often different from the premium price decimals.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Event code: ‘0’ – Normal trade, ‘1’ – Cancelled trade, ‘2’ – Adjusted trade
     */
    private final EventCodeField eventCode = new EventCodeField();

    /**
     * N/A if set to -1
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Block Volume
     */
    private final BlockVolumeField blockVolume = new BlockVolumeField();

    /**
     * Efs Volume
     */
    private final EfsVolumeField efsVolume = new EfsVolumeField();

    /**
     * Efp Volume
     */
    private final EfpVolumeField efpVolume = new EfpVolumeField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final HighField high = new HighField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final LowField low = new LowField();

    /**
     * Weighted Average Price. DealPriceDenominator for the market should be applied to get the real price.
     */
    private final VwapField vwap = new VwapField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(underlyingMarketId, tradeId, price, quantity, offMarketTradeIndicator, transactDateTime, optionType, strikePrice, eventCode, totalVolume, blockVolume, efsVolume, efpVolume, high, low, vwap);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique identifier of the underlying market
     *
     * @return the UnderlyingMarketId field
     */
    public UnderlyingMarketIdField underlyingMarketId() {
        return underlyingMarketId;
    }

    /**
     * Unique identifier of the trade message, unique per market.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Legacy field that supports all single character trade types on ICE. The new 3-character “OffMarketTradeType” field replaces this field. In the future (no earlier than 2015), ICE anticipates the introduction of 3 character trade types that will only be available in the new field. Trade types that are longer than a single character will be represented with “#” in this field.
     *
     * @return the OffMarketTradeIndicator field
     */
    public OffMarketTradeIndicatorField offMarketTradeIndicator() {
        return offMarketTradeIndicator;
    }

    /**
     * Deal date time
     *
     * @return the TransactDateTime field
     */
    public TransactDateTimeField transactDateTime() {
        return transactDateTime;
    }

    /**
     * “C” – Call, “P” – Put
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Strike Price of the option. Used in conjunction with the NumDecimalsStrikePrice. This is often different from the premium price decimals.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Event code: ‘0’ – Normal trade, ‘1’ – Cancelled trade, ‘2’ – Adjusted trade
     *
     * @return the EventCode field
     */
    public EventCodeField eventCode() {
        return eventCode;
    }

    /**
     * N/A if set to -1
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Block Volume
     *
     * @return the BlockVolume field
     */
    public BlockVolumeField blockVolume() {
        return blockVolume;
    }

    /**
     * Efs Volume
     *
     * @return the EfsVolume field
     */
    public EfsVolumeField efsVolume() {
        return efsVolume;
    }

    /**
     * Efp Volume
     *
     * @return the EfpVolume field
     */
    public EfpVolumeField efpVolume() {
        return efpVolume;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the High field
     */
    public HighField high() {
        return high;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Low field
     */
    public LowField low() {
        return low;
    }

    /**
     * Weighted Average Price. DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!underlyingMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingMarketIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!offMarketTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OffMarketTradeIndicatorField.BYTE_LENGTH;
        if (!transactDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactDateTimeField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!eventCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventCodeField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!blockVolume.parse(data, cursor)) {
            return false;
        }
        cursor += BlockVolumeField.BYTE_LENGTH;
        if (!efsVolume.parse(data, cursor)) {
            return false;
        }
        cursor += EfsVolumeField.BYTE_LENGTH;
        if (!efpVolume.parse(data, cursor)) {
            return false;
        }
        cursor += EfpVolumeField.BYTE_LENGTH;
        if (!high.parse(data, cursor)) {
            return false;
        }
        cursor += HighField.BYTE_LENGTH;
        if (!low.parse(data, cursor)) {
            return false;
        }
        cursor += LowField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = underlyingMarketId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = offMarketTradeIndicator.encode(data, cursor);
        cursor = transactDateTime.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = eventCode.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = blockVolume.encode(data, cursor);
        cursor = efsVolume.encode(data, cursor);
        cursor = efpVolume.encode(data, cursor);
        cursor = high.encode(data, cursor);
        cursor = low.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
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
            case "UnderlyingMarketId" -> Optional.of(underlyingMarketId);
            case "TradeId" -> Optional.of(tradeId);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "OffMarketTradeIndicator" -> Optional.of(offMarketTradeIndicator);
            case "TransactDateTime" -> Optional.of(transactDateTime);
            case "OptionType" -> Optional.of(optionType);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "EventCode" -> Optional.of(eventCode);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "BlockVolume" -> Optional.of(blockVolume);
            case "EfsVolume" -> Optional.of(efsVolume);
            case "EfpVolume" -> Optional.of(efpVolume);
            case "High" -> Optional.of(high);
            case "Low" -> Optional.of(low);
            case "Vwap" -> Optional.of(vwap);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OldStyleOptionsTradeAndMarketStatsMessage message)) {
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
        if (!(other instanceof OldStyleOptionsTradeAndMarketStatsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
