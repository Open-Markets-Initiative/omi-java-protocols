package omi.jnx.jnxequities.pts.itch.v1_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.BuySellIndicatorField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.GroupField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.NanosecondsField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.OrderNumberField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.OrderbookIdField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.PriceField;
import omi.jnx.jnxequities.pts.itch.v1_7.fields.QuantityField;
import omi.jnx.jnxequities.pts.itch.v1_7.types.Field;
import omi.jnx.jnxequities.pts.itch.v1_7.types.Message;
import omi.jnx.jnxequities.pts.itch.v1_7.types.PrintOptions;

/**
 * Represents the OrderAddedWithoutAttributesMessage message from the Pts protocol.
 *
 * <p>Order Added Message will be generated for normal orders accepted by the system.</p>
 */
public final class OrderAddedWithoutAttributesMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Added Without Attributes Message";

    /**
     * Number of nanoseconds since last Timestamp Seconds Message.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Reference number of the accepted order; zero indicates a reference price message.
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * Side of the order.
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * Total number of shares added to the book.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * 4 digit Quick code.
     */
    private final OrderbookIdField orderbookId = new OrderbookIdField();

    /**
     * Orderbook group identifier.
     */
    private final GroupField group = new GroupField();

    /**
     * Price of the order; for a reference price message, a value of 214,748,364.7 (7FFFFFFF hex) denotes no reference price available.
     */
    private final PriceField price = new PriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderNumber, buySellIndicator, quantity, orderbookId, group, price);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of nanoseconds since last Timestamp Seconds Message.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Reference number of the accepted order; zero indicates a reference price message.
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * Side of the order.
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Total number of shares added to the book.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * 4 digit Quick code.
     *
     * @return the OrderbookId field
     */
    public OrderbookIdField orderbookId() {
        return orderbookId;
    }

    /**
     * Orderbook group identifier.
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Price of the order; for a reference price message, a value of 214,748,364.7 (7FFFFFFF hex) denotes no reference price available.
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
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderbookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookIdField.BYTE_LENGTH;
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        return price.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderbookId.encode(data, cursor);
        cursor = group.encode(data, cursor);
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
            case "OrderNumber" -> Optional.of(orderNumber);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "Quantity" -> Optional.of(quantity);
            case "OrderbookId" -> Optional.of(orderbookId);
            case "Group" -> Optional.of(group);
            case "Price" -> Optional.of(price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAddedWithoutAttributesMessage message)) {
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
        if (!(other instanceof OrderAddedWithoutAttributesMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
