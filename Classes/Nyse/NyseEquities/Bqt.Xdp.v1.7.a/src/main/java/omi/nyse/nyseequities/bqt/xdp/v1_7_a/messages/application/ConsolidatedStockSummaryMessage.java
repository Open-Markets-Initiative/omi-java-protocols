package omi.nyse.nyseequities.bqt.xdp.v1_7_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.CloseField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.HighPriceField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.LowPriceField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.MarketIdOfHighPriceField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.MarketIdOfLowPriceField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.MarketIdOfOpenPriceField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.MarketIdOfTheCloseField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.NumClosePricesField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.OpenField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.SourceTimeField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.SourceTimeNsField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.SymbolIndexField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.fields.TotalVolumeField;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.types.Field;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.types.Message;
import omi.nyse.nyseequities.bqt.xdp.v1_7_a.types.PrintOptions;

/**
 * Represents the ConsolidatedStockSummaryMessage message from the Bqt protocol.
 *
 * <p>The stock summary message is sent every 1 minute regardless of whether there is a change to a particular value or not. In the event that there is no volume on the stock, the stock summary message will not be disseminated.</p>
 */
public final class ConsolidatedStockSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Consolidated Stock Summary Message";

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The High price of the stock for the day. Use the Price scale from the symbol mapping index.
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * The Low price of the stock for the day. Use the Price scale from the symbol mapping index.
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * The Opening price of the stock for the day. Use the Price scale from the symbol mapping index.
     */
    private final OpenField open = new OpenField();

    /**
     * The cumulative volume for the stock throughout the day.
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * The ID of the Originating Market
     */
    private final MarketIdOfHighPriceField marketIdOfHighPrice = new MarketIdOfHighPriceField();

    /**
     * The ID of the Originating Market
     */
    private final MarketIdOfLowPriceField marketIdOfLowPrice = new MarketIdOfLowPriceField();

    /**
     * The ID of the Originating Market
     */
    private final MarketIdOfOpenPriceField marketIdOfOpenPrice = new MarketIdOfOpenPriceField();

    /**
     * The number of Market ID/Closing Price pairs. Values can be 0-3
     */
    private final NumClosePricesField numClosePrices = new NumClosePricesField();

    /**
     * The ID of the Originating Market
     */
    private final MarketIdOfTheCloseField marketIdOfTheClose = new MarketIdOfTheCloseField();

    /**
     * The Closing price of the stock for the day.
     */
    private final CloseField close = new CloseField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, highPrice, lowPrice, open, totalVolume, marketIdOfHighPrice, marketIdOfLowPrice, marketIdOfOpenPrice, numClosePrices, marketIdOfTheClose, close);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the SourceTime
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The High price of the stock for the day. Use the Price scale from the symbol mapping index.
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * The Low price of the stock for the day. Use the Price scale from the symbol mapping index.
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * The Opening price of the stock for the day. Use the Price scale from the symbol mapping index.
     *
     * @return the Open field
     */
    public OpenField open() {
        return open;
    }

    /**
     * The cumulative volume for the stock throughout the day.
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * The ID of the Originating Market
     *
     * @return the MarketIdOfHighPrice field
     */
    public MarketIdOfHighPriceField marketIdOfHighPrice() {
        return marketIdOfHighPrice;
    }

    /**
     * The ID of the Originating Market
     *
     * @return the MarketIdOfLowPrice field
     */
    public MarketIdOfLowPriceField marketIdOfLowPrice() {
        return marketIdOfLowPrice;
    }

    /**
     * The ID of the Originating Market
     *
     * @return the MarketIdOfOpenPrice field
     */
    public MarketIdOfOpenPriceField marketIdOfOpenPrice() {
        return marketIdOfOpenPrice;
    }

    /**
     * The number of Market ID/Closing Price pairs. Values can be 0-3
     *
     * @return the NumClosePrices field
     */
    public NumClosePricesField numClosePrices() {
        return numClosePrices;
    }

    /**
     * The ID of the Originating Market
     *
     * @return the MarketIdOfTheClose field
     */
    public MarketIdOfTheCloseField marketIdOfTheClose() {
        return marketIdOfTheClose;
    }

    /**
     * The Closing price of the stock for the day.
     *
     * @return the Close field
     */
    public CloseField close() {
        return close;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!open.parse(data, cursor)) {
            return false;
        }
        cursor += OpenField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!marketIdOfHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdOfHighPriceField.BYTE_LENGTH;
        if (!marketIdOfLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdOfLowPriceField.BYTE_LENGTH;
        if (!marketIdOfOpenPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdOfOpenPriceField.BYTE_LENGTH;
        if (!numClosePrices.parse(data, cursor)) {
            return false;
        }
        cursor += NumClosePricesField.BYTE_LENGTH;
        if (!marketIdOfTheClose.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdOfTheCloseField.BYTE_LENGTH;
        return close.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = open.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = marketIdOfHighPrice.encode(data, cursor);
        cursor = marketIdOfLowPrice.encode(data, cursor);
        cursor = marketIdOfOpenPrice.encode(data, cursor);
        cursor = numClosePrices.encode(data, cursor);
        cursor = marketIdOfTheClose.encode(data, cursor);
        cursor = close.encode(data, cursor);
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "Open" -> Optional.of(open);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "MarketIdOfHighPrice" -> Optional.of(marketIdOfHighPrice);
            case "MarketIdOfLowPrice" -> Optional.of(marketIdOfLowPrice);
            case "MarketIdOfOpenPrice" -> Optional.of(marketIdOfOpenPrice);
            case "NumClosePrices" -> Optional.of(numClosePrices);
            case "MarketIdOfTheClose" -> Optional.of(marketIdOfTheClose);
            case "Close" -> Optional.of(close);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ConsolidatedStockSummaryMessage message)) {
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
        if (!(other instanceof ConsolidatedStockSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
