package omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.AskPriceShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.AskQuantityShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.BidPriceShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.BidQuantityShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.LastTradeConditionField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.LastTradePriceShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.LastTradeSizeShortField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.ReservedField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.SymbolField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.TimeOffsetField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.TotalVolumeField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.TradingStatusField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.fields.UnitTimestampField;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.types.Field;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.types.Message;
import omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.types.PrintOptions;

/**
 * Represents the MarketSnapshotShortMessage message from the MulticastTop protocol.
 *
 * <p>A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol.</p>
 */
public final class MarketSnapshotShortMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Snapshot Short Message";

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
    private final BidPriceShortField bidPriceShort = new BidPriceShortField();

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     */
    private final BidQuantityShortField bidQuantityShort = new BidQuantityShortField();

    /**
     * Ask price (may be a zero or negative price for some instruments).
     */
    private final AskPriceShortField askPriceShort = new AskPriceShortField();

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     */
    private final AskQuantityShortField askQuantityShort = new AskQuantityShortField();

    /**
     * Price of last execution (this can be zero or negative for some instruments).
     */
    private final LastTradePriceShortField lastTradePriceShort = new LastTradePriceShortField();

    /**
     * Number of contracts traded on the last trade (if this value is 0 the Last Trade Price is invalid).
     */
    private final LastTradeSizeShortField lastTradeSizeShort = new LastTradeSizeShortField();

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
    private final List<Field> fields = List.of(timeOffset, symbol, unitTimestamp, bidPriceShort, bidQuantityShort, askPriceShort, askQuantityShort, lastTradePriceShort, lastTradeSizeShort, lastTradeCondition, totalVolume, tradingStatus, reserved);

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
     * @return the BidPriceShort field
     */
    public BidPriceShortField bidPriceShort() {
        return bidPriceShort;
    }

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     *
     * @return the BidQuantityShort field
     */
    public BidQuantityShortField bidQuantityShort() {
        return bidQuantityShort;
    }

    /**
     * Ask price (may be a zero or negative price for some instruments).
     *
     * @return the AskPriceShort field
     */
    public AskPriceShortField askPriceShort() {
        return askPriceShort;
    }

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     *
     * @return the AskQuantityShort field
     */
    public AskQuantityShortField askQuantityShort() {
        return askQuantityShort;
    }

    /**
     * Price of last execution (this can be zero or negative for some instruments).
     *
     * @return the LastTradePriceShort field
     */
    public LastTradePriceShortField lastTradePriceShort() {
        return lastTradePriceShort;
    }

    /**
     * Number of contracts traded on the last trade (if this value is 0 the Last Trade Price is invalid).
     *
     * @return the LastTradeSizeShort field
     */
    public LastTradeSizeShortField lastTradeSizeShort() {
        return lastTradeSizeShort;
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
        if (!bidPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceShortField.BYTE_LENGTH;
        if (!bidQuantityShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityShortField.BYTE_LENGTH;
        if (!askPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceShortField.BYTE_LENGTH;
        if (!askQuantityShort.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuantityShortField.BYTE_LENGTH;
        if (!lastTradePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceShortField.BYTE_LENGTH;
        if (!lastTradeSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeSizeShortField.BYTE_LENGTH;
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
        cursor = bidPriceShort.encode(data, cursor);
        cursor = bidQuantityShort.encode(data, cursor);
        cursor = askPriceShort.encode(data, cursor);
        cursor = askQuantityShort.encode(data, cursor);
        cursor = lastTradePriceShort.encode(data, cursor);
        cursor = lastTradeSizeShort.encode(data, cursor);
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
            case "BidPriceShort" -> Optional.of(bidPriceShort);
            case "BidQuantityShort" -> Optional.of(bidQuantityShort);
            case "AskPriceShort" -> Optional.of(askPriceShort);
            case "AskQuantityShort" -> Optional.of(askQuantityShort);
            case "LastTradePriceShort" -> Optional.of(lastTradePriceShort);
            case "LastTradeSizeShort" -> Optional.of(lastTradeSizeShort);
            case "LastTradeCondition" -> Optional.of(lastTradeCondition);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSnapshotShortMessage message)) {
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
        if (!(other instanceof MarketSnapshotShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
