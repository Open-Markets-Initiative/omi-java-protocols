package omi.asx.asxderivatives.ntp.itch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.NanosecondsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.OrderBookPriorityField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.OrderIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.QuantityField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SideField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Field;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the Ntp protocol.
 *
 * <p>An Order Added message indicates a new order or a restated order that has been accepted by the matching engine and added to the order book</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifier of the Order Book.
     */
    private final TradeableInstrumentIdField tradeableInstrumentId = new TradeableInstrumentIdField();

    /**
     * Type of order
     */
    private final SideField side = new SideField();

    /**
     * Public order id of the order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Time priority of this order within the order book.
     */
    private final OrderBookPriorityField orderBookPriority = new OrderBookPriorityField();

    /**
     * Number of lots added to the book (all volume is visible).
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, tradeableInstrumentId, side, orderId, orderBookPriority, quantity, price);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifier of the Order Book.
     *
     * @return the TradeableInstrumentId field
     */
    public TradeableInstrumentIdField tradeableInstrumentId() {
        return tradeableInstrumentId;
    }

    /**
     * Type of order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Public order id of the order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Time priority of this order within the order book.
     *
     * @return the OrderBookPriority field
     */
    public OrderBookPriorityField orderBookPriority() {
        return orderBookPriority;
    }

    /**
     * Number of lots added to the book (all volume is visible).
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeableInstrumentIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderBookPriority.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookPriorityField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        return price.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeableInstrumentId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderBookPriority.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
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
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeableInstrumentId" -> Optional.of(tradeableInstrumentId);
            case "Side" -> Optional.of(side);
            case "OrderId" -> Optional.of(orderId);
            case "OrderBookPriority" -> Optional.of(orderBookPriority);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderMessage message)) {
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
        if (!(other instanceof AddOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
