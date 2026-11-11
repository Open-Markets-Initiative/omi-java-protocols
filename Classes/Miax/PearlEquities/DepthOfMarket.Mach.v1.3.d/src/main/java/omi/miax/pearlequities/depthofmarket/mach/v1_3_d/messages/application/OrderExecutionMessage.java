package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.NanosecondsField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.OrderExecutionFlagsField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.OrderIdField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.PriceField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.SizeField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.SymbolIdField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.TradeIdField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Field;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.PrintOptions;

/**
 * Represents the OrderExecutionMessage message from the DepthOfMarket protocol.
 *
 * <p>This message format is used when a displayed order on the book executes in whole or in part. The execution is identified by a unique Trade ID that is unique across the exchange for the trading day. Subsequent partial executions of the order would be published with the same Order ID but different Trade ID.</p>
 */
public final class OrderExecutionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0018';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution Message";

    /**
     * Nanosecond part of Matching Engine time.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Symbol ID mapped to a given symbol. It is assigned per trading session and is valid for that session.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Matching engine assigned Order ID.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Unique ID assigned by the Matching Engine.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Displayed price.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of displayed shares of the order.
     */
    private final SizeField size = new SizeField();

    /**
     * Order Execution flags. Bit 0 indicates SIP reportability; bit 1 indicates Traded Against Retail; bits 2-7 are reserved.
     */
    private final OrderExecutionFlagsField orderExecutionFlags = new OrderExecutionFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, symbolId, orderId, tradeId, price, size, orderExecutionFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond part of Matching Engine time.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Symbol ID mapped to a given symbol. It is assigned per trading session and is valid for that session.
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Matching engine assigned Order ID.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Unique ID assigned by the Matching Engine.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Displayed price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of displayed shares of the order.
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Order Execution flags. Bit 0 indicates SIP reportability; bit 1 indicates Traded Against Retail; bits 2-7 are reserved.
     *
     * @return the OrderExecutionFlags field
     */
    public OrderExecutionFlagsField orderExecutionFlags() {
        return orderExecutionFlags;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        return orderExecutionFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = orderExecutionFlags.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "SymbolId" -> Optional.of(symbolId);
            case "OrderId" -> Optional.of(orderId);
            case "TradeId" -> Optional.of(tradeId);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "OrderExecutionFlags" -> Optional.of(orderExecutionFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutionMessage message)) {
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
        if (!(other instanceof OrderExecutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
