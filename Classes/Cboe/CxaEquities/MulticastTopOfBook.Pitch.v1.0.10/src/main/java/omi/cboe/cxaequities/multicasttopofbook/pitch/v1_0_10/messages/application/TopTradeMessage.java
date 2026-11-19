package omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.ContraPidField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.ExecutionIdField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.FlagsField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.PidField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.PriceField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.QuantityField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.SymbolField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TimestampField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TotalVolumeField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TradeDesignationField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TradeReportTypeField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TradeTransactionTimeField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.fields.TradeTypeField;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.types.Field;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.types.Message;
import omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.types.PrintOptions;

/**
 * Represents the TopTradeMessage message from the MulticastTopOfBook protocol.
 *
 * <p>Provides information about executions of orders on the CXA book or executions that occur off-exchange and reported to CXA. TOP Trade messages for on-exchange electronic executions are necessary to calculate CXA execution-based data. TOP Trade messages do not alter the book. A TOP Trade message is also sent whenever an execution or trade report is broken with the Flags field value indicating trade break.</p>
 */
public final class TopTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Top Trade Message";

    /**
     * Nanoseconds since epoch.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Number of shares on the inside book. May be zero if only undisclosed orders exist on the inside book.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Price of the update.
     */
    private final PriceField price = new PriceField();

    /**
     * CXA generated day-unique execution identifier of this trade. Execution Id is also referenced in trade breaks.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Total number of shares executed on the CXA book, or off-exchange reported trades, for the symbol on the current business day (may decrease if the Flags field indicates a trade break).
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     */
    private final PidField pid = new PidField();

    /**
     * Contra Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     */
    private final ContraPidField contraPid = new ContraPidField();

    /**
     * Trade type.
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Trade designation. Valid only for on-exchange executions, space otherwise.
     */
    private final TradeDesignationField tradeDesignation = new TradeDesignationField();

    /**
     * Trade report type. Valid only for off-exchange trade reports, space otherwise.
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Nanosecond timestamp of the off-exchange trade as specified in the Trade Report submitted by the trading participant. Valid only for off-exchange trade reports, zero otherwise.
     */
    private final TradeTransactionTimeField tradeTransactionTime = new TradeTransactionTimeField();

    /**
     * Trade flags.
     */
    private final FlagsField flags = new FlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbol, quantity, price, executionId, totalVolume, pid, contraPid, tradeType, tradeDesignation, tradeReportType, tradeTransactionTime, flags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Number of shares on the inside book. May be zero if only undisclosed orders exist on the inside book.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Price of the update.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * CXA generated day-unique execution identifier of this trade. Execution Id is also referenced in trade breaks.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Total number of shares executed on the CXA book, or off-exchange reported trades, for the symbol on the current business day (may decrease if the Flags field indicates a trade break).
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     *
     * @return the Pid field
     */
    public PidField pid() {
        return pid;
    }

    /**
     * Contra Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     *
     * @return the ContraPid field
     */
    public ContraPidField contraPid() {
        return contraPid;
    }

    /**
     * Trade type.
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Trade designation. Valid only for on-exchange executions, space otherwise.
     *
     * @return the TradeDesignation field
     */
    public TradeDesignationField tradeDesignation() {
        return tradeDesignation;
    }

    /**
     * Trade report type. Valid only for off-exchange trade reports, space otherwise.
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
    }

    /**
     * Nanosecond timestamp of the off-exchange trade as specified in the Trade Report submitted by the trading participant. Valid only for off-exchange trade reports, zero otherwise.
     *
     * @return the TradeTransactionTime field
     */
    public TradeTransactionTimeField tradeTransactionTime() {
        return tradeTransactionTime;
    }

    /**
     * Trade flags.
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!pid.parse(data, cursor)) {
            return false;
        }
        cursor += PidField.BYTE_LENGTH;
        if (!contraPid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPidField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!tradeDesignation.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDesignationField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!tradeTransactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTransactionTimeField.BYTE_LENGTH;
        return flags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = pid.encode(data, cursor);
        cursor = contraPid.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = tradeDesignation.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = tradeTransactionTime.encode(data, cursor);
        cursor = flags.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "ExecutionId" -> Optional.of(executionId);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "Pid" -> Optional.of(pid);
            case "ContraPid" -> Optional.of(contraPid);
            case "TradeType" -> Optional.of(tradeType);
            case "TradeDesignation" -> Optional.of(tradeDesignation);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TradeTransactionTime" -> Optional.of(tradeTransactionTime);
            case "Flags" -> Optional.of(flags);
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
