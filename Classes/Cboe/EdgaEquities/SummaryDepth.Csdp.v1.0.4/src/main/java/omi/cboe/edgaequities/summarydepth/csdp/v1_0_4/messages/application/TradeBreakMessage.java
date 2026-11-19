package omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.CboeCumulativeExecutedVolumeField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.ExecutionIdField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.Reserved1Field;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.Reserved8Field;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.SymbolField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.TradeBreakFlagsField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.TransactionTimeField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.Field;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.Message;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.PrintOptions;

/**
 * Represents the TradeBreakMessage message from the SummaryDepth protocol.
 *
 * <p>Trade Break Message</p>
 */
public final class TradeBreakMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Break Message";

    /**
     * The time the trade occurred, encoded as the number of nanoseconds since midnight.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Symbol right padded with spaces.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Reserved
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * Execution identifier of this trade.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Cumulative number of shares traded today.
     */
    private final CboeCumulativeExecutedVolumeField cboeCumulativeExecutedVolume = new CboeCumulativeExecutedVolumeField();

    /**
     * Reserved
     */
    private final Reserved8Field reserved8 = new Reserved8Field();

    /**
     * Reserved
     */
    private final TradeBreakFlagsField tradeBreakFlags = new TradeBreakFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, symbol, reserved1, executionId, cboeCumulativeExecutedVolume, reserved8, tradeBreakFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the trade occurred, encoded as the number of nanoseconds since midnight.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Reserved
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * Execution identifier of this trade.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Cumulative number of shares traded today.
     *
     * @return the CboeCumulativeExecutedVolume field
     */
    public CboeCumulativeExecutedVolumeField cboeCumulativeExecutedVolume() {
        return cboeCumulativeExecutedVolume;
    }

    /**
     * Reserved
     *
     * @return the Reserved8 field
     */
    public Reserved8Field reserved8() {
        return reserved8;
    }

    /**
     * Reserved
     *
     * @return the TradeBreakFlags field
     */
    public TradeBreakFlagsField tradeBreakFlags() {
        return tradeBreakFlags;
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!reserved1.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved1Field.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!cboeCumulativeExecutedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += CboeCumulativeExecutedVolumeField.BYTE_LENGTH;
        if (!reserved8.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved8Field.BYTE_LENGTH;
        return tradeBreakFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = cboeCumulativeExecutedVolume.encode(data, cursor);
        cursor = reserved8.encode(data, cursor);
        cursor = tradeBreakFlags.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "Symbol" -> Optional.of(symbol);
            case "Reserved1" -> Optional.of(reserved1);
            case "ExecutionId" -> Optional.of(executionId);
            case "CboeCumulativeExecutedVolume" -> Optional.of(cboeCumulativeExecutedVolume);
            case "Reserved8" -> Optional.of(reserved8);
            case "TradeBreakFlags" -> Optional.of(tradeBreakFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeBreakMessage message)) {
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
        if (!(other instanceof TradeBreakMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
