package omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.DailyForeignBuyValueField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.DailyForeignSellValueField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.HighPriceField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.LowPriceField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.MarketCapitalizationField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.NotionalDeltaExposureField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.NotionalExposureField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.SubBookField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.TradesField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.TurnoverField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.VolumeField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.VwapField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.PrintOptions;

/**
 * Represents the ExtendedStatisticsMessage message from the RealTime protocol.
 *
 * <p>Sent to disseminate the high, low, VWAP, volume, turnover and other statistics of an instrument for a sub book.</p>
 */
public final class ExtendedStatisticsMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 93;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Statistics Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 44, 8 };

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * High price for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Low price for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * VWAP for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final VwapField vwap = new VwapField();

    /**
     * Volume for the sub book. Will be set to a negative value if the value is not set or withdrawn. The document types the field as an unsigned integer.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Turnover for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final TurnoverField turnover = new TurnoverField();

    /**
     * Number of trades for the sub book. Will be set to a negative value if the value is not set or withdrawn. The document types the field as an unsigned integer.
     */
    private final TradesField trades = new TradesField();

    /**
     * Order book the status relates to.
     */
    private final SubBookField subBook = new SubBookField();

    /**
     * Notional exposure related to the options trade executions.
     */
    private final NotionalExposureField notionalExposure = new NotionalExposureField();

    /**
     * Notional exposure updated by the delta of the option based on trade executions.
     */
    private final NotionalDeltaExposureField notionalDeltaExposure = new NotionalDeltaExposureField();

    /**
     * Total foreign buy trade value for the day for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final DailyForeignBuyValueField dailyForeignBuyValue = new DailyForeignBuyValueField();

    /**
     * Total foreign sell trade value for the day for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final DailyForeignSellValueField dailyForeignSellValue = new DailyForeignSellValueField();

    /**
     * Market Capitalization of the instrument. Will be set to a negative value if the value is not set or withdrawn.
     */
    private final MarketCapitalizationField marketCapitalization = new MarketCapitalizationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, symbol, highPrice, lowPrice, vwap, volume, turnover, trades, subBook, notionalExposure, notionalDeltaExposure, dailyForeignBuyValue, dailyForeignSellValue, marketCapitalization);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds offset from the last Time message.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Instrument's symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * High price for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Low price for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * VWAP for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * Volume for the sub book. Will be set to a negative value if the value is not set or withdrawn. The document types the field as an unsigned integer.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Turnover for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the Turnover field
     */
    public TurnoverField turnover() {
        return turnover;
    }

    /**
     * Number of trades for the sub book. Will be set to a negative value if the value is not set or withdrawn. The document types the field as an unsigned integer.
     *
     * @return the Trades field
     */
    public TradesField trades() {
        return trades;
    }

    /**
     * Order book the status relates to.
     *
     * @return the SubBook field
     */
    public SubBookField subBook() {
        return subBook;
    }

    /**
     * Notional exposure related to the options trade executions.
     *
     * @return the NotionalExposure field
     */
    public NotionalExposureField notionalExposure() {
        return notionalExposure;
    }

    /**
     * Notional exposure updated by the delta of the option based on trade executions.
     *
     * @return the NotionalDeltaExposure field
     */
    public NotionalDeltaExposureField notionalDeltaExposure() {
        return notionalDeltaExposure;
    }

    /**
     * Total foreign buy trade value for the day for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the DailyForeignBuyValue field
     */
    public DailyForeignBuyValueField dailyForeignBuyValue() {
        return dailyForeignBuyValue;
    }

    /**
     * Total foreign sell trade value for the day for the sub book. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the DailyForeignSellValue field
     */
    public DailyForeignSellValueField dailyForeignSellValue() {
        return dailyForeignSellValue;
    }

    /**
     * Market Capitalization of the instrument. Will be set to a negative value if the value is not set or withdrawn.
     *
     * @return the MarketCapitalization field
     */
    public MarketCapitalizationField marketCapitalization() {
        return marketCapitalization;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!turnover.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverField.BYTE_LENGTH;
        if (!trades.parse(data, cursor)) {
            return false;
        }
        cursor += TradesField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!subBook.parse(data, cursor)) {
            return false;
        }
        cursor += SubBookField.BYTE_LENGTH;
        if (!notionalExposure.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalExposureField.BYTE_LENGTH;
        if (!notionalDeltaExposure.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalDeltaExposureField.BYTE_LENGTH;
        if (!dailyForeignBuyValue.parse(data, cursor)) {
            return false;
        }
        cursor += DailyForeignBuyValueField.BYTE_LENGTH;
        if (!dailyForeignSellValue.parse(data, cursor)) {
            return false;
        }
        cursor += DailyForeignSellValueField.BYTE_LENGTH;
        return marketCapitalization.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = turnover.encode(data, cursor);
        cursor = trades.encode(data, cursor);
        if (buffer != null && buffer.length >= 52) {
            System.arraycopy(buffer, 44, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = subBook.encode(data, cursor);
        cursor = notionalExposure.encode(data, cursor);
        cursor = notionalDeltaExposure.encode(data, cursor);
        cursor = dailyForeignBuyValue.encode(data, cursor);
        cursor = dailyForeignSellValue.encode(data, cursor);
        cursor = marketCapitalization.encode(data, cursor);
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
            case "Nanosecond" -> Optional.of(nanosecond);
            case "Symbol" -> Optional.of(symbol);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "Vwap" -> Optional.of(vwap);
            case "Volume" -> Optional.of(volume);
            case "Turnover" -> Optional.of(turnover);
            case "Trades" -> Optional.of(trades);
            case "SubBook" -> Optional.of(subBook);
            case "NotionalExposure" -> Optional.of(notionalExposure);
            case "NotionalDeltaExposure" -> Optional.of(notionalDeltaExposure);
            case "DailyForeignBuyValue" -> Optional.of(dailyForeignBuyValue);
            case "DailyForeignSellValue" -> Optional.of(dailyForeignSellValue);
            case "MarketCapitalization" -> Optional.of(marketCapitalization);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedStatisticsMessage message)) {
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
        if (!(other instanceof ExtendedStatisticsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
