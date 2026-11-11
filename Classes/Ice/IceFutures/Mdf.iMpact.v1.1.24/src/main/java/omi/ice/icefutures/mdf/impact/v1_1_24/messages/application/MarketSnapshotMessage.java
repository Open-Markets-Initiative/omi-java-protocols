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
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HasPreviousDaySettlementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HighField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsSettlePriceOfficialField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LastMessageSequenceIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LastTradeDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LastTradePriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LastTradeQuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LowField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.NumOfBookEntriesField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OpenInterestDateField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OpenInterestField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OpeningPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PreviousDaySettlementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlePriceDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlementPriceWithDealPricePrecisionField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TradingStatusField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.VolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.VwapField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the MarketSnapshotMessage message from the Mdf protocol.
 *
 * <p>The market snapshot message is the same for full order depth and price level snapshot channel.</p>
 */
public final class MarketSnapshotMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 133;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Snapshot Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 103, 2 };

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Market Type
     */
    private final MarketTypeField marketType = new MarketTypeField();

    /**
     * See Appendix A on the trading status codes
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Electronic trade volume only, excluding block and other volumes.
     */
    private final VolumeField volume = new VolumeField();

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
     * Open Interest
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final OpeningPriceField openingPrice = new OpeningPriceField();

    /**
     * DealPriceDenominator for the market should be applied to get this price.
     */
    private final SettlementPriceWithDealPricePrecisionField settlementPriceWithDealPricePrecision = new SettlementPriceWithDealPricePrecisionField();

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
     * Number of book entries in the market. It is the number of order messages followed for full order depth snapshot channel. In case of price level snapshot, it is the number of price level messages that followed for the market.
     */
    private final NumOfBookEntriesField numOfBookEntries = new NumOfBookEntriesField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final LastTradePriceField lastTradePrice = new LastTradePriceField();

    /**
     * Last Trade Quantity
     */
    private final LastTradeQuantityField lastTradeQuantity = new LastTradeQuantityField();

    /**
     * time of last trade
     */
    private final LastTradeDateTimeField lastTradeDateTime = new LastTradeDateTimeField();

    /**
     * Settlement price time
     */
    private final SettlePriceDateTimeField settlePriceDateTime = new SettlePriceDateTimeField();

    /**
     * This should be used for synchronization with live update messages. Please see the main tech spec for details on how it can be done.
     */
    private final LastMessageSequenceIdField lastMessageSequenceId = new LastMessageSequenceIdField();

    /**
     * The date Open Interest is effective for
     */
    private final OpenInterestDateField openInterestDate = new OpenInterestDateField();

    /**
     * Indicate if the SettlementPrice is official, ‘Y’ or ‘N’.
     */
    private final IsSettlePriceOfficialField isSettlePriceOfficial = new IsSettlePriceOfficialField();

    /**
     * SettlePriceDenominator for the market should be applied to get the real settlement price.
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Indicate if the PreviousSettlementDayPrice is populated, ‘Y’ or ‘N’.
     */
    private final HasPreviousDaySettlementPriceField hasPreviousDaySettlementPrice = new HasPreviousDaySettlementPriceField();

    /**
     * SettlePriceDenominator for the market should be applied to get the real previous day settlement price.
     */
    private final PreviousDaySettlementPriceField previousDaySettlementPrice = new PreviousDaySettlementPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, marketType, tradingStatus, volume, blockVolume, efsVolume, efpVolume, openInterest, openingPrice, settlementPriceWithDealPricePrecision, high, low, vwap, numOfBookEntries, lastTradePrice, lastTradeQuantity, lastTradeDateTime, settlePriceDateTime, lastMessageSequenceId, openInterestDate, isSettlePriceOfficial, settlementPrice, hasPreviousDaySettlementPrice, previousDaySettlementPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Market Type
     *
     * @return the MarketType field
     */
    public MarketTypeField marketType() {
        return marketType;
    }

    /**
     * See Appendix A on the trading status codes
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Electronic trade volume only, excluding block and other volumes.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
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
     * Open Interest
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the OpeningPrice field
     */
    public OpeningPriceField openingPrice() {
        return openingPrice;
    }

    /**
     * DealPriceDenominator for the market should be applied to get this price.
     *
     * @return the SettlementPriceWithDealPricePrecision field
     */
    public SettlementPriceWithDealPricePrecisionField settlementPriceWithDealPricePrecision() {
        return settlementPriceWithDealPricePrecision;
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

    /**
     * Number of book entries in the market. It is the number of order messages followed for full order depth snapshot channel. In case of price level snapshot, it is the number of price level messages that followed for the market.
     *
     * @return the NumOfBookEntries field
     */
    public NumOfBookEntriesField numOfBookEntries() {
        return numOfBookEntries;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the LastTradePrice field
     */
    public LastTradePriceField lastTradePrice() {
        return lastTradePrice;
    }

    /**
     * Last Trade Quantity
     *
     * @return the LastTradeQuantity field
     */
    public LastTradeQuantityField lastTradeQuantity() {
        return lastTradeQuantity;
    }

    /**
     * time of last trade
     *
     * @return the LastTradeDateTime field
     */
    public LastTradeDateTimeField lastTradeDateTime() {
        return lastTradeDateTime;
    }

    /**
     * Settlement price time
     *
     * @return the SettlePriceDateTime field
     */
    public SettlePriceDateTimeField settlePriceDateTime() {
        return settlePriceDateTime;
    }

    /**
     * This should be used for synchronization with live update messages. Please see the main tech spec for details on how it can be done.
     *
     * @return the LastMessageSequenceId field
     */
    public LastMessageSequenceIdField lastMessageSequenceId() {
        return lastMessageSequenceId;
    }

    /**
     * The date Open Interest is effective for
     *
     * @return the OpenInterestDate field
     */
    public OpenInterestDateField openInterestDate() {
        return openInterestDate;
    }

    /**
     * Indicate if the SettlementPrice is official, ‘Y’ or ‘N’.
     *
     * @return the IsSettlePriceOfficial field
     */
    public IsSettlePriceOfficialField isSettlePriceOfficial() {
        return isSettlePriceOfficial;
    }

    /**
     * SettlePriceDenominator for the market should be applied to get the real settlement price.
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * Indicate if the PreviousSettlementDayPrice is populated, ‘Y’ or ‘N’.
     *
     * @return the HasPreviousDaySettlementPrice field
     */
    public HasPreviousDaySettlementPriceField hasPreviousDaySettlementPrice() {
        return hasPreviousDaySettlementPrice;
    }

    /**
     * SettlePriceDenominator for the market should be applied to get the real previous day settlement price.
     *
     * @return the PreviousDaySettlementPrice field
     */
    public PreviousDaySettlementPriceField previousDaySettlementPrice() {
        return previousDaySettlementPrice;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!marketType.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
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
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!openingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceField.BYTE_LENGTH;
        if (!settlementPriceWithDealPricePrecision.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceWithDealPricePrecisionField.BYTE_LENGTH;
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
        if (!numOfBookEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfBookEntriesField.BYTE_LENGTH;
        if (!lastTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceField.BYTE_LENGTH;
        if (!lastTradeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeQuantityField.BYTE_LENGTH;
        if (!lastTradeDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeDateTimeField.BYTE_LENGTH;
        if (!settlePriceDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += SettlePriceDateTimeField.BYTE_LENGTH;
        if (!lastMessageSequenceId.parse(data, cursor)) {
            return false;
        }
        cursor += LastMessageSequenceIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!openInterestDate.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestDateField.BYTE_LENGTH;
        if (!isSettlePriceOfficial.parse(data, cursor)) {
            return false;
        }
        cursor += IsSettlePriceOfficialField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!hasPreviousDaySettlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HasPreviousDaySettlementPriceField.BYTE_LENGTH;
        return previousDaySettlementPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = marketType.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = blockVolume.encode(data, cursor);
        cursor = efsVolume.encode(data, cursor);
        cursor = efpVolume.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = openingPrice.encode(data, cursor);
        cursor = settlementPriceWithDealPricePrecision.encode(data, cursor);
        cursor = high.encode(data, cursor);
        cursor = low.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = numOfBookEntries.encode(data, cursor);
        cursor = lastTradePrice.encode(data, cursor);
        cursor = lastTradeQuantity.encode(data, cursor);
        cursor = lastTradeDateTime.encode(data, cursor);
        cursor = settlePriceDateTime.encode(data, cursor);
        cursor = lastMessageSequenceId.encode(data, cursor);
        if (buffer != null && buffer.length >= 105) {
            System.arraycopy(buffer, 103, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = openInterestDate.encode(data, cursor);
        cursor = isSettlePriceOfficial.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = hasPreviousDaySettlementPrice.encode(data, cursor);
        cursor = previousDaySettlementPrice.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "MarketType" -> Optional.of(marketType);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "Volume" -> Optional.of(volume);
            case "BlockVolume" -> Optional.of(blockVolume);
            case "EfsVolume" -> Optional.of(efsVolume);
            case "EfpVolume" -> Optional.of(efpVolume);
            case "OpenInterest" -> Optional.of(openInterest);
            case "OpeningPrice" -> Optional.of(openingPrice);
            case "SettlementPriceWithDealPricePrecision" -> Optional.of(settlementPriceWithDealPricePrecision);
            case "High" -> Optional.of(high);
            case "Low" -> Optional.of(low);
            case "Vwap" -> Optional.of(vwap);
            case "NumOfBookEntries" -> Optional.of(numOfBookEntries);
            case "LastTradePrice" -> Optional.of(lastTradePrice);
            case "LastTradeQuantity" -> Optional.of(lastTradeQuantity);
            case "LastTradeDateTime" -> Optional.of(lastTradeDateTime);
            case "SettlePriceDateTime" -> Optional.of(settlePriceDateTime);
            case "LastMessageSequenceId" -> Optional.of(lastMessageSequenceId);
            case "OpenInterestDate" -> Optional.of(openInterestDate);
            case "IsSettlePriceOfficial" -> Optional.of(isSettlePriceOfficial);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "HasPreviousDaySettlementPrice" -> Optional.of(hasPreviousDaySettlementPrice);
            case "PreviousDaySettlementPrice" -> Optional.of(previousDaySettlementPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSnapshotMessage message)) {
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
        if (!(other instanceof MarketSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
