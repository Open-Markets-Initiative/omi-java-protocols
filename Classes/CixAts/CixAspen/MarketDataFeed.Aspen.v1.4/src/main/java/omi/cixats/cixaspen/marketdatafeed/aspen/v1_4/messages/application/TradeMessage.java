package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.BrokerField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ContraBrokerField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ExecutionIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.PriceField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ReservedField3;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SharesField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SideField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.TimestampField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Field;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Message;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.PrintOptions;

/**
 * Represents the TradeMessage message from the MarketDataFeed protocol.
 *
 * <p>Sent when a hidden order is executed</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

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
    private final ReservedField3 reserved = new ReservedField3();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Qty Executed - 6 implied decimals
     */
    private final SharesField shares = new SharesField();

    /**
     * Stock Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Price - 6 implied decimals
     */
    private final PriceField price = new PriceField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, timestampField, reserved, side, shares, symbol, price, executionId, broker, contraBroker);

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
     * @return the Reserved field
     */
    public ReservedField3 reserved() {
        return reserved;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Qty Executed - 6 implied decimals
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
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
     * Price - 6 implied decimals
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField3.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!broker.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerField.BYTE_LENGTH;
        return contraBroker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = broker.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
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
            case "Reserved" -> Optional.of(reserved);
            case "Side" -> Optional.of(side);
            case "Shares" -> Optional.of(shares);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "ExecutionId" -> Optional.of(executionId);
            case "Broker" -> Optional.of(broker);
            case "ContraBroker" -> Optional.of(contraBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
