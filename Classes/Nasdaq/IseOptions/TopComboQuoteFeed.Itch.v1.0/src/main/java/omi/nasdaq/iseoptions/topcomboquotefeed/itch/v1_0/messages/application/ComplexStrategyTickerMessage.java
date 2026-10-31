package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.FirstField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.HighField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.LastPriceField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.LowField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.SizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.StrategyIdField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.TimestampField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.TradeConditionField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.VolumeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Field;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Message;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.PrintOptions;

/**
 * Represents the ComplexStrategyTickerMessage message from the TopComboQuoteFeed protocol.
 *
 * <p>The ticker message is used to send real time trade information</p>
 */
public final class ComplexStrategyTickerMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 't';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Strategy Ticker Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Most recent price.
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     */
    private final SizeField size = new SizeField();

    /**
     * Total traded quantity.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * High price for the day.
     */
    private final HighField high = new HighField();

    /**
     * Low price for the day.
     */
    private final LowField low = new LowField();

    /**
     * Opening price for the day
     */
    private final FirstField first = new FirstField();

    /**
     * Same value as the Trade Condition sent to OPRA for this trade. To obtain a list of Trade Conditions, refer to the NOTES below.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, strategyId, lastPrice, size, volume, high, low, first, tradeCondition);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Most recent price.
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Total traded quantity.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * High price for the day.
     *
     * @return the High field
     */
    public HighField high() {
        return high;
    }

    /**
     * Low price for the day.
     *
     * @return the Low field
     */
    public LowField low() {
        return low;
    }

    /**
     * Opening price for the day
     *
     * @return the First field
     */
    public FirstField first() {
        return first;
    }

    /**
     * Same value as the Trade Condition sent to OPRA for this trade. To obtain a list of Trade Conditions, refer to the NOTES below.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
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
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!high.parse(data, cursor)) {
            return false;
        }
        cursor += HighField.BYTE_LENGTH;
        if (!low.parse(data, cursor)) {
            return false;
        }
        cursor += LowField.BYTE_LENGTH;
        if (!first.parse(data, cursor)) {
            return false;
        }
        cursor += FirstField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = high.encode(data, cursor);
        cursor = low.encode(data, cursor);
        cursor = first.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "LastPrice" -> Optional.of(lastPrice);
            case "Size" -> Optional.of(size);
            case "Volume" -> Optional.of(volume);
            case "High" -> Optional.of(high);
            case "Low" -> Optional.of(low);
            case "First" -> Optional.of(first);
            case "TradeCondition" -> Optional.of(tradeCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexStrategyTickerMessage message)) {
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
        if (!(other instanceof ComplexStrategyTickerMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
