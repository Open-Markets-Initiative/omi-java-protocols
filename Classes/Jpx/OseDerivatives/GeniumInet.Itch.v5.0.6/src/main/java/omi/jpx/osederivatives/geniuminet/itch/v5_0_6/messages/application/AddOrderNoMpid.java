package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.LotTypeField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.NanosecondsField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.OrderAttributesField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.OrderBookIdField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.OrderBookPositionField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.OrderIdField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.PriceField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.QuantityField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.SideField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.Field;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.Message;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.PrintOptions;

/**
 * Represents the AddOrderNoMpid message from the GeniumInet protocol.
 *
 * <p>New order accepted (unattributed).</p>
 */
public final class AddOrderNoMpid implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order No Mpid";

    /**
     * Nanoseconds portion
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Identifier assigned to the new order
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Primary identifier of an order book
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * Rank within orderbook
     */
    private final OrderBookPositionField orderBookPosition = new OrderBookPositionField();

    /**
     * Visible quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Display price
     */
    private final PriceField price = new PriceField();

    /**
     * Additional order attributes
     */
    private final OrderAttributesField orderAttributes = new OrderAttributesField();

    /**
     * Lot Type
     */
    private final LotTypeField lotType = new LotTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderId, orderBookId, side, orderBookPosition, quantity, price, orderAttributes, lotType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Identifier assigned to the new order
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Primary identifier of an order book
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Rank within orderbook
     *
     * @return the OrderBookPosition field
     */
    public OrderBookPositionField orderBookPosition() {
        return orderBookPosition;
    }

    /**
     * Visible quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Display price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Additional order attributes
     *
     * @return the OrderAttributes field
     */
    public OrderAttributesField orderAttributes() {
        return orderAttributes;
    }

    /**
     * Lot Type
     *
     * @return the LotType field
     */
    public LotTypeField lotType() {
        return lotType;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderBookPosition.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookPositionField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderAttributes.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributesField.BYTE_LENGTH;
        return lotType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderBookPosition.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderAttributes.encode(data, cursor);
        cursor = lotType.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "Side" -> Optional.of(side);
            case "OrderBookPosition" -> Optional.of(orderBookPosition);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "OrderAttributes" -> Optional.of(orderAttributes);
            case "LotType" -> Optional.of(lotType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderNoMpid message)) {
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
        if (!(other instanceof AddOrderNoMpid message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
