package omi.cboe.cfefutures.multicasttop.spin.v1_2_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.AskPriceLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.AskQuantityLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.BidPriceLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.BidQuantityLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.LastTradeConditionField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.LastTradePriceLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.LastTradeSizeLongField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.ReservedField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.SymbolField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.TimeOffsetField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.TotalVolumeField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.TradingStatusField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.fields.UnitTimestampField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.types.Field;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.types.Message;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_22.types.PrintOptions;

/**
 * Represents the MarketSnapshotLongMessage message from the MulticastTop protocol.
 *
 * <p>A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol.</p>
 */
public final class MarketSnapshotLongMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Snapshot Long Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Six character, base 62 symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     */
    private final UnitTimestampField unitTimestamp = new UnitTimestampField();

    /**
     * Bid price (may be a zero or negative price for some instruments).
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     */
    private final BidQuantityLongField bidQuantityLong = new BidQuantityLongField();

    /**
     * Ask price (may be a zero or negative price for some instruments).
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     */
    private final AskQuantityLongField askQuantityLong = new AskQuantityLongField();

    /**
     * Price of last execution (this can be zero or negative for some instruments).
     */
    private final LastTradePriceLongField lastTradePriceLong = new LastTradePriceLongField();

    /**
     * Number of contracts traded on the last trade (if this value is 0 the Last Trade Price is invalid).
     */
    private final LastTradeSizeLongField lastTradeSizeLong = new LastTradeSizeLongField();

    /**
     * Last Trade Condition Values
     */
    private final LastTradeConditionField lastTradeCondition = new LastTradeConditionField();

    /**
     * Total number of contracts traded on the current business day.
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Trading Status Values
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Reserved for use in other markets.
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, unitTimestamp, bidPriceLong, bidQuantityLong, askPriceLong, askQuantityLong, lastTradePriceLong, lastTradeSizeLong, lastTradeCondition, totalVolume, tradingStatus, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Six character, base 62 symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     *
     * @return the UnitTimestamp field
     */
    public UnitTimestampField unitTimestamp() {
        return unitTimestamp;
    }

    /**
     * Bid price (may be a zero or negative price for some instruments).
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     *
     * @return the BidQuantityLong field
     */
    public BidQuantityLongField bidQuantityLong() {
        return bidQuantityLong;
    }

    /**
     * Ask price (may be a zero or negative price for some instruments).
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     *
     * @return the AskQuantityLong field
     */
    public AskQuantityLongField askQuantityLong() {
        return askQuantityLong;
    }

    /**
     * Price of last execution (this can be zero or negative for some instruments).
     *
     * @return the LastTradePriceLong field
     */
    public LastTradePriceLongField lastTradePriceLong() {
        return lastTradePriceLong;
    }

    /**
     * Number of contracts traded on the last trade (if this value is 0 the Last Trade Price is invalid).
     *
     * @return the LastTradeSizeLong field
     */
    public LastTradeSizeLongField lastTradeSizeLong() {
        return lastTradeSizeLong;
    }

    /**
     * Last Trade Condition Values
     *
     * @return the LastTradeCondition field
     */
    public LastTradeConditionField lastTradeCondition() {
        return lastTradeCondition;
    }

    /**
     * Total number of contracts traded on the current business day.
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Trading Status Values
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Reserved for use in other markets.
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!unitTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += UnitTimestampField.BYTE_LENGTH;
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityLongField.BYTE_LENGTH;
        if (!askPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceLongField.BYTE_LENGTH;
        if (!askQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuantityLongField.BYTE_LENGTH;
        if (!lastTradePriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceLongField.BYTE_LENGTH;
        if (!lastTradeSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeSizeLongField.BYTE_LENGTH;
        if (!lastTradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeConditionField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = unitTimestamp.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidQuantityLong.encode(data, cursor);
        cursor = askPriceLong.encode(data, cursor);
        cursor = askQuantityLong.encode(data, cursor);
        cursor = lastTradePriceLong.encode(data, cursor);
        cursor = lastTradeSizeLong.encode(data, cursor);
        cursor = lastTradeCondition.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "Symbol" -> Optional.of(symbol);
            case "UnitTimestamp" -> Optional.of(unitTimestamp);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidQuantityLong" -> Optional.of(bidQuantityLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskQuantityLong" -> Optional.of(askQuantityLong);
            case "LastTradePriceLong" -> Optional.of(lastTradePriceLong);
            case "LastTradeSizeLong" -> Optional.of(lastTradeSizeLong);
            case "LastTradeCondition" -> Optional.of(lastTradeCondition);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSnapshotLongMessage message)) {
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
        if (!(other instanceof MarketSnapshotLongMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
