package omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.BuyBrokerNumberField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.ExecutionIdField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.PriceField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.QuantityField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.ReservedField2;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.SellBrokerNumberField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.SymbolField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.TimestampField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.TotalVolumeField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.TradeConditionField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.fields.TradeFlagsField;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.types.Field;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.types.Message;
import omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.types.PrintOptions;

/**
 * Represents the TradeMessage message from the MulticastTrades protocol.
 *
 * <p>Sends the trade price, trade quantity, execution id, and trade condition of a trade as well as the cumulative volume for the trading session. A Trade message will be sent for each execution, but not every Trade message indicates a trade. Trade Condition = X (Trade Break) is sent whenever an execution is broken.</p>
 */
public final class TradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Incremental number of shares executed or reported (see Trade Condition).
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The price of the trade.
     */
    private final PriceField price = new PriceField();

    /**
     * MATCHNow generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break message (Trade Condition 'X').
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Broker number of the buyer of the trade (or 1 for anonymous).
     */
    private final BuyBrokerNumberField buyBrokerNumber = new BuyBrokerNumberField();

    /**
     * Broker number of the seller of the trade (or 1 for anonymous).
     */
    private final SellBrokerNumberField sellBrokerNumber = new SellBrokerNumberField();

    /**
     * Total number of shares traded in this symbol during the current trading session (may decrease if the Trade Condition field indicates a trade break).
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Trade condition code.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * Trade flags.
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * Reserved (undefined).
     */
    private final ReservedField2 reserved = new ReservedField2();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbol, quantity, price, executionId, buyBrokerNumber, sellBrokerNumber, totalVolume, tradeCondition, tradeFlags, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
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
     * Incremental number of shares executed or reported (see Trade Condition).
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * The price of the trade.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * MATCHNow generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break message (Trade Condition 'X').
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Broker number of the buyer of the trade (or 1 for anonymous).
     *
     * @return the BuyBrokerNumber field
     */
    public BuyBrokerNumberField buyBrokerNumber() {
        return buyBrokerNumber;
    }

    /**
     * Broker number of the seller of the trade (or 1 for anonymous).
     *
     * @return the SellBrokerNumber field
     */
    public SellBrokerNumberField sellBrokerNumber() {
        return sellBrokerNumber;
    }

    /**
     * Total number of shares traded in this symbol during the current trading session (may decrease if the Trade Condition field indicates a trade break).
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Trade condition code.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * Trade flags.
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
    }

    /**
     * Reserved (undefined).
     *
     * @return the Reserved field
     */
    public ReservedField2 reserved() {
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
        if (!buyBrokerNumber.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerNumberField.BYTE_LENGTH;
        if (!sellBrokerNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SellBrokerNumberField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!tradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TradeFlagsField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
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
        cursor = buyBrokerNumber.encode(data, cursor);
        cursor = sellBrokerNumber.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "ExecutionId" -> Optional.of(executionId);
            case "BuyBrokerNumber" -> Optional.of(buyBrokerNumber);
            case "SellBrokerNumber" -> Optional.of(sellBrokerNumber);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "Reserved" -> Optional.of(reserved);
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
