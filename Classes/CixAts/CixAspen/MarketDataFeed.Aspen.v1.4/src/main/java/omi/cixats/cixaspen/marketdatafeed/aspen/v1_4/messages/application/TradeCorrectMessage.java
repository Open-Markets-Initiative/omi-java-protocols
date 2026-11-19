package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.BrokerField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ContraBrokerField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.CorrectedTradePriceField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.CorrectedTradeQuantityField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ExecutionIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.OriginalExecutionIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.OriginalTradePriceField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.OriginalTradeQuantityField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.Reserved1Field;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.Reserved8Field;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.TimestampField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Field;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Message;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.PrintOptions;

/**
 * Represents the TradeCorrectMessage message from the MarketDataFeed protocol.
 *
 * <p>Sent whenever an execution on CIX ATS is amended</p>
 */
public final class TradeCorrectMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Correct Message";

    /**
     * Symbol Index
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Nanoseconds Since Epoch (UTC)
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Reserved for future use
     */
    private final Reserved8Field reserved8 = new Reserved8Field();

    /**
     * Reserved for future use
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * Stock Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Market Issued Unique Execution ID
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Three digit number Broker Number or 001 for anonymous
     */
    private final BrokerField broker = new BrokerField();

    /**
     * Three digit number Broker Number of the contra order or 001 for anonymous
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Execution ID of the original trade being corrected
     */
    private final OriginalExecutionIdField originalExecutionId = new OriginalExecutionIdField();

    /**
     * Price of the trade being corrected
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * Quantity of the trade being corrected
     */
    private final OriginalTradeQuantityField originalTradeQuantity = new OriginalTradeQuantityField();

    /**
     * Price the trade is being amended/corrected to
     */
    private final CorrectedTradePriceField correctedTradePrice = new CorrectedTradePriceField();

    /**
     * Quantity the trade is being amended/corrected to
     */
    private final CorrectedTradeQuantityField correctedTradeQuantity = new CorrectedTradeQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, timestampField, reserved8, reserved1, symbol, executionId, broker, contraBroker, originalExecutionId, originalTradePrice, originalTradeQuantity, correctedTradePrice, correctedTradeQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Symbol Index
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Nanoseconds Since Epoch (UTC)
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Reserved for future use
     *
     * @return the Reserved8 field
     */
    public Reserved8Field reserved8() {
        return reserved8;
    }

    /**
     * Reserved for future use
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * Stock Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Market Issued Unique Execution ID
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Three digit number Broker Number or 001 for anonymous
     *
     * @return the Broker field
     */
    public BrokerField broker() {
        return broker;
    }

    /**
     * Three digit number Broker Number of the contra order or 001 for anonymous
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Execution ID of the original trade being corrected
     *
     * @return the OriginalExecutionId field
     */
    public OriginalExecutionIdField originalExecutionId() {
        return originalExecutionId;
    }

    /**
     * Price of the trade being corrected
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * Quantity of the trade being corrected
     *
     * @return the OriginalTradeQuantity field
     */
    public OriginalTradeQuantityField originalTradeQuantity() {
        return originalTradeQuantity;
    }

    /**
     * Price the trade is being amended/corrected to
     *
     * @return the CorrectedTradePrice field
     */
    public CorrectedTradePriceField correctedTradePrice() {
        return correctedTradePrice;
    }

    /**
     * Quantity the trade is being amended/corrected to
     *
     * @return the CorrectedTradeQuantity field
     */
    public CorrectedTradeQuantityField correctedTradeQuantity() {
        return correctedTradeQuantity;
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
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!reserved8.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved8Field.BYTE_LENGTH;
        if (!reserved1.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved1Field.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!broker.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!originalExecutionId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalExecutionIdField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
        if (!originalTradeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeQuantityField.BYTE_LENGTH;
        if (!correctedTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradePriceField.BYTE_LENGTH;
        return correctedTradeQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = reserved8.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = broker.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = originalExecutionId.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalTradeQuantity.encode(data, cursor);
        cursor = correctedTradePrice.encode(data, cursor);
        cursor = correctedTradeQuantity.encode(data, cursor);
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
            case "SymbolId" -> Optional.of(symbolId);
            case "Timestamp" -> Optional.of(timestampField);
            case "Reserved8" -> Optional.of(reserved8);
            case "Reserved1" -> Optional.of(reserved1);
            case "Symbol" -> Optional.of(symbol);
            case "ExecutionId" -> Optional.of(executionId);
            case "Broker" -> Optional.of(broker);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "OriginalExecutionId" -> Optional.of(originalExecutionId);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalTradeQuantity" -> Optional.of(originalTradeQuantity);
            case "CorrectedTradePrice" -> Optional.of(correctedTradePrice);
            case "CorrectedTradeQuantity" -> Optional.of(correctedTradeQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCorrectMessage message)) {
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
        if (!(other instanceof TradeCorrectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
