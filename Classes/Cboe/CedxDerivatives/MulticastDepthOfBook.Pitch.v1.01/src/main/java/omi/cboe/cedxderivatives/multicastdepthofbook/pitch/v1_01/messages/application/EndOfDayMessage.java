package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.BlockVolumeField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.ClosePriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.EcrpVolumeField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.HighPriceBinaryPriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.LowPriceBinaryPriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.OpenInterestField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.OpenPriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.SummaryFlagsField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.SymbolField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.TimeOffsetField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.TotalVolumeField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.fields.TradeDateField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.types.Field;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.types.Message;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.types.PrintOptions;

/**
 * Represents the EndOfDayMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>End of Day Message</p>
 */
public final class EndOfDayMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "End Of Day Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol right padded with spaces
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Trade Date for the settlement
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Unused in CEDX
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Highest trade price for the day.
     */
    private final HighPriceBinaryPriceField highPriceBinaryPrice = new HighPriceBinaryPriceField();

    /**
     * Lowest trade price for the day.
     */
    private final LowPriceBinaryPriceField lowPriceBinaryPrice = new LowPriceBinaryPriceField();

    /**
     * If Total Volume ¿ 0, represents the first trade of the day
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * If Total Volume ¿ 0, represents the last trade of the day
     */
    private final ClosePriceField closePrice = new ClosePriceField();

    /**
     * Total number of contracts traded
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Total number of block contracts traded
     */
    private final BlockVolumeField blockVolume = new BlockVolumeField();

    /**
     * Unused in CEDX
     */
    private final EcrpVolumeField ecrpVolume = new EcrpVolumeField();

    /**
     * Summary Flags
     */
    private final SummaryFlagsField summaryFlags = new SummaryFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, tradeDate, openInterest, highPriceBinaryPrice, lowPriceBinaryPrice, openPrice, closePrice, totalVolume, blockVolume, ecrpVolume, summaryFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Symbol right padded with spaces
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Trade Date for the settlement
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Unused in CEDX
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Highest trade price for the day.
     *
     * @return the HighPriceBinaryPrice field
     */
    public HighPriceBinaryPriceField highPriceBinaryPrice() {
        return highPriceBinaryPrice;
    }

    /**
     * Lowest trade price for the day.
     *
     * @return the LowPriceBinaryPrice field
     */
    public LowPriceBinaryPriceField lowPriceBinaryPrice() {
        return lowPriceBinaryPrice;
    }

    /**
     * If Total Volume ¿ 0, represents the first trade of the day
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * If Total Volume ¿ 0, represents the last trade of the day
     *
     * @return the ClosePrice field
     */
    public ClosePriceField closePrice() {
        return closePrice;
    }

    /**
     * Total number of contracts traded
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Total number of block contracts traded
     *
     * @return the BlockVolume field
     */
    public BlockVolumeField blockVolume() {
        return blockVolume;
    }

    /**
     * Unused in CEDX
     *
     * @return the EcrpVolume field
     */
    public EcrpVolumeField ecrpVolume() {
        return ecrpVolume;
    }

    /**
     * Summary Flags
     *
     * @return the SummaryFlags field
     */
    public SummaryFlagsField summaryFlags() {
        return summaryFlags;
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
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!highPriceBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceBinaryPriceField.BYTE_LENGTH;
        if (!lowPriceBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceBinaryPriceField.BYTE_LENGTH;
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!closePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosePriceField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!blockVolume.parse(data, cursor)) {
            return false;
        }
        cursor += BlockVolumeField.BYTE_LENGTH;
        if (!ecrpVolume.parse(data, cursor)) {
            return false;
        }
        cursor += EcrpVolumeField.BYTE_LENGTH;
        return summaryFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = highPriceBinaryPrice.encode(data, cursor);
        cursor = lowPriceBinaryPrice.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = closePrice.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = blockVolume.encode(data, cursor);
        cursor = ecrpVolume.encode(data, cursor);
        cursor = summaryFlags.encode(data, cursor);
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
            case "TradeDate" -> Optional.of(tradeDate);
            case "OpenInterest" -> Optional.of(openInterest);
            case "HighPriceBinaryPrice" -> Optional.of(highPriceBinaryPrice);
            case "LowPriceBinaryPrice" -> Optional.of(lowPriceBinaryPrice);
            case "OpenPrice" -> Optional.of(openPrice);
            case "ClosePrice" -> Optional.of(closePrice);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "BlockVolume" -> Optional.of(blockVolume);
            case "EcrpVolume" -> Optional.of(ecrpVolume);
            case "SummaryFlags" -> Optional.of(summaryFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EndOfDayMessage message)) {
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
        if (!(other instanceof EndOfDayMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
