package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.AdjustedClosingPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.AdjustedClosingPriceReasonField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ClosingPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ClosingPriceTypeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.EndTradingDateField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.LastTradeDateField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.LastTradedPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MarketModelTypeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MaxPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MinPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NoTradesField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OpeningPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PctChangeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SettlementPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SettlementValuePriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalVolumeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.VwapField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.GroupEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * The BlockInstrument record a message holds.
 *
 * <p>SingleInstrumentSummary</p>
 */
public final class BlockInstrument implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 119;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BlockInstrument";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Market model type
     */
    private final MarketModelTypeField marketModelType = new MarketModelTypeField();

    /**
     * Last Traded Price (LTP)
     */
    private final LastTradedPriceField lastTradedPrice = new LastTradedPriceField();

    /**
     * Closing Price (CP)
     */
    private final ClosingPriceField closingPrice = new ClosingPriceField();

    /**
     * Closing Price Type
     */
    private final ClosingPriceTypeField closingPriceType = new ClosingPriceTypeField();

    /**
     * Adjusted Closing Price (ACP)
     */
    private final AdjustedClosingPriceField adjustedClosingPrice = new AdjustedClosingPriceField();

    /**
     * Reason for adjusting the Closing Price
     */
    private final AdjustedClosingPriceReasonField adjustedClosingPriceReason = new AdjustedClosingPriceReasonField();

    /**
     * Percentage change
     */
    private final PctChangeField pctChange = new PctChangeField();

    /**
     * Volume-weighted average price
     */
    private final VwapField vwap = new VwapField();

    /**
     * Total number of transactions
     */
    private final NoTradesField noTrades = new NoTradesField();

    /**
     * Total transaction volume
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Total transaction value
     */
    private final TotalValueField totalValue = new TotalValueField();

    /**
     * The price of the first trade on the current trading day
     */
    private final OpeningPriceField openingPrice = new OpeningPriceField();

    /**
     * Highest price of the instrument on the current trading day
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * Lowest price of the instrument on the current trading day
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * Settlement price
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Settlement value
     */
    private final SettlementValuePriceField settlementValuePrice = new SettlementValuePriceField();

    /**
     * End of trading date
     */
    private final EndTradingDateField endTradingDate = new EndTradingDateField();

    /**
     * The date of execution of the last trade for the given instrument
     */
    private final LastTradeDateField lastTradeDate = new LastTradeDateField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, marketModelType, lastTradedPrice, closingPrice, closingPriceType, adjustedClosingPrice, adjustedClosingPriceReason, pctChange, vwap, noTrades, totalVolume, totalValue, openingPrice, maxPrice, minPrice, settlementPrice, settlementValuePrice, endTradingDate, lastTradeDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Market model type
     *
     * @return the MarketModelType field
     */
    public MarketModelTypeField marketModelType() {
        return marketModelType;
    }

    /**
     * Last Traded Price (LTP)
     *
     * @return the LastTradedPrice field
     */
    public LastTradedPriceField lastTradedPrice() {
        return lastTradedPrice;
    }

    /**
     * Closing Price (CP)
     *
     * @return the ClosingPrice field
     */
    public ClosingPriceField closingPrice() {
        return closingPrice;
    }

    /**
     * Closing Price Type
     *
     * @return the ClosingPriceType field
     */
    public ClosingPriceTypeField closingPriceType() {
        return closingPriceType;
    }

    /**
     * Adjusted Closing Price (ACP)
     *
     * @return the AdjustedClosingPrice field
     */
    public AdjustedClosingPriceField adjustedClosingPrice() {
        return adjustedClosingPrice;
    }

    /**
     * Reason for adjusting the Closing Price
     *
     * @return the AdjustedClosingPriceReason field
     */
    public AdjustedClosingPriceReasonField adjustedClosingPriceReason() {
        return adjustedClosingPriceReason;
    }

    /**
     * Percentage change
     *
     * @return the PctChange field
     */
    public PctChangeField pctChange() {
        return pctChange;
    }

    /**
     * Volume-weighted average price
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * Total number of transactions
     *
     * @return the NoTrades field
     */
    public NoTradesField noTrades() {
        return noTrades;
    }

    /**
     * Total transaction volume
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Total transaction value
     *
     * @return the TotalValue field
     */
    public TotalValueField totalValue() {
        return totalValue;
    }

    /**
     * The price of the first trade on the current trading day
     *
     * @return the OpeningPrice field
     */
    public OpeningPriceField openingPrice() {
        return openingPrice;
    }

    /**
     * Highest price of the instrument on the current trading day
     *
     * @return the MaxPrice field
     */
    public MaxPriceField maxPrice() {
        return maxPrice;
    }

    /**
     * Lowest price of the instrument on the current trading day
     *
     * @return the MinPrice field
     */
    public MinPriceField minPrice() {
        return minPrice;
    }

    /**
     * Settlement price
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * Settlement value
     *
     * @return the SettlementValuePrice field
     */
    public SettlementValuePriceField settlementValuePrice() {
        return settlementValuePrice;
    }

    /**
     * End of trading date
     *
     * @return the EndTradingDate field
     */
    public EndTradingDateField endTradingDate() {
        return endTradingDate;
    }

    /**
     * The date of execution of the last trade for the given instrument
     *
     * @return the LastTradeDate field
     */
    public LastTradeDateField lastTradeDate() {
        return lastTradeDate;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!marketModelType.parse(data, cursor)) {
            return false;
        }
        cursor += MarketModelTypeField.BYTE_LENGTH;
        if (!lastTradedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradedPriceField.BYTE_LENGTH;
        if (!closingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceField.BYTE_LENGTH;
        if (!closingPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceTypeField.BYTE_LENGTH;
        if (!adjustedClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AdjustedClosingPriceField.BYTE_LENGTH;
        if (!adjustedClosingPriceReason.parse(data, cursor)) {
            return false;
        }
        cursor += AdjustedClosingPriceReasonField.BYTE_LENGTH;
        if (!pctChange.parse(data, cursor)) {
            return false;
        }
        cursor += PctChangeField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!noTrades.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradesField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!totalValue.parse(data, cursor)) {
            return false;
        }
        cursor += TotalValueField.BYTE_LENGTH;
        if (!openingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!settlementValuePrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementValuePriceField.BYTE_LENGTH;
        if (!endTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndTradingDateField.BYTE_LENGTH;
        return lastTradeDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = marketModelType.encode(data, cursor);
        cursor = lastTradedPrice.encode(data, cursor);
        cursor = closingPrice.encode(data, cursor);
        cursor = closingPriceType.encode(data, cursor);
        cursor = adjustedClosingPrice.encode(data, cursor);
        cursor = adjustedClosingPriceReason.encode(data, cursor);
        cursor = pctChange.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = noTrades.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = totalValue.encode(data, cursor);
        cursor = openingPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = settlementValuePrice.encode(data, cursor);
        cursor = endTradingDate.encode(data, cursor);
        cursor = lastTradeDate.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MarketModelType" -> Optional.of(marketModelType);
            case "LastTradedPrice" -> Optional.of(lastTradedPrice);
            case "ClosingPrice" -> Optional.of(closingPrice);
            case "ClosingPriceType" -> Optional.of(closingPriceType);
            case "AdjustedClosingPrice" -> Optional.of(adjustedClosingPrice);
            case "AdjustedClosingPriceReason" -> Optional.of(adjustedClosingPriceReason);
            case "PctChange" -> Optional.of(pctChange);
            case "Vwap" -> Optional.of(vwap);
            case "NoTrades" -> Optional.of(noTrades);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TotalValue" -> Optional.of(totalValue);
            case "OpeningPrice" -> Optional.of(openingPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "MinPrice" -> Optional.of(minPrice);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "SettlementValuePrice" -> Optional.of(settlementValuePrice);
            case "EndTradingDate" -> Optional.of(endTradingDate);
            case "LastTradeDate" -> Optional.of(lastTradeDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BlockInstrument message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof BlockInstrument message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
