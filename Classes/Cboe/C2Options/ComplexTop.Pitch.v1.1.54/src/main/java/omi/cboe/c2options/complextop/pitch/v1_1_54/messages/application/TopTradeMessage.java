package omi.cboe.c2options.complextop.pitch.v1_1_54.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.ComplexInstrumentIdShortField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.ExecutionIdField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.PriceLongField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.QuantityLongField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.TimeOffsetField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.TotalVolumeField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.fields.TradeConditionField;
import omi.cboe.c2options.complextop.pitch.v1_1_54.types.Field;
import omi.cboe.c2options.complextop.pitch.v1_1_54.types.Message;
import omi.cboe.c2options.complextop.pitch.v1_1_54.types.PrintOptions;

/**
 * Represents the TopTradeMessage message from the ComplexTop protocol.
 *
 * <p>The TOP Trade message provides information about executions of complex orders. TOP Trade messages are necessary to calculate Cboe execution-based data. TOP Trade messages do not alter the complex book. One or more Single Side Update Expanded or Two Side Update Expanded messages will follow a TOP Trade message to reflect the updated complex book. The TOP Trade message sends the trade price, trade quantity, and trade condition of a trade as well as the cumulative volume for the business day.</p>
 */
public final class TopTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Top Trade Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id right padded with spaces.
     */
    private final ComplexInstrumentIdShortField complexInstrumentIdShort = new ComplexInstrumentIdShortField();

    /**
     * Total number of contracts on the inside book (customer and non-customer). A zero value denotes there is no Bid/Ask.
     */
    private final QuantityLongField quantityLong = new QuantityLongField();

    /**
     * Price (may be a zero or negative price for some instruments).
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Cboe generated day-unique execution identifier of this trade. Execution Id is also referenced in the Trade Break message.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Total quantity traded on the current business day (may decrease if the Trade Condition field indicates a cancelled trade).
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * See Options Trade Condition Codes for details.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentIdShort, quantityLong, priceLong, executionId, totalVolume, tradeCondition);

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
     * Complex Instrument Id right padded with spaces.
     *
     * @return the ComplexInstrumentIdShort field
     */
    public ComplexInstrumentIdShortField complexInstrumentIdShort() {
        return complexInstrumentIdShort;
    }

    /**
     * Total number of contracts on the inside book (customer and non-customer). A zero value denotes there is no Bid/Ask.
     *
     * @return the QuantityLong field
     */
    public QuantityLongField quantityLong() {
        return quantityLong;
    }

    /**
     * Price (may be a zero or negative price for some instruments).
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Cboe generated day-unique execution identifier of this trade. Execution Id is also referenced in the Trade Break message.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Total quantity traded on the current business day (may decrease if the Trade Condition field indicates a cancelled trade).
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * See Options Trade Condition Codes for details.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
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
        if (!complexInstrumentIdShort.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentIdShortField.BYTE_LENGTH;
        if (!quantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityLongField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        return tradeCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentIdShort.encode(data, cursor);
        cursor = quantityLong.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
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
            case "ComplexInstrumentIdShort" -> Optional.of(complexInstrumentIdShort);
            case "QuantityLong" -> Optional.of(quantityLong);
            case "PriceLong" -> Optional.of(priceLong);
            case "ExecutionId" -> Optional.of(executionId);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TradeCondition" -> Optional.of(tradeCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TopTradeMessage message)) {
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
        if (!(other instanceof TopTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
