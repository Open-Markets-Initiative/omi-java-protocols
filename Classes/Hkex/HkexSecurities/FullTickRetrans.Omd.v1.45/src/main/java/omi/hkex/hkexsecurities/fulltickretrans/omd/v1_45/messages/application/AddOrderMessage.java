package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.OrderBookPositionField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.OrderIdField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.OrderTypeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.PriceField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.QuantityField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.SecurityCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.fields.SideField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.types.Field;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.types.Message;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the FullTickRetrans protocol.
 *
 * <p>The Add Order message is generated when a new order is inserted into the order book. The OrderId is unique per security but will not increment consecutively. Note for Securities instruments the OrderBookPosition is always set to zero.</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 23, 1 };

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Unique identifier for each order performed within the trading day. Values may not be consecutive.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Price. 3 implied decimal places.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of shares.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Order type.
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Order rank information for the order position within the order book for each security.
     */
    private final OrderBookPositionField orderBookPosition = new OrderBookPositionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityCode, orderId, price, quantity, side, orderType, orderBookPosition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Unique identifier for each order performed within the trading day. Values may not be consecutive.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Price. 3 implied decimal places.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of shares.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order type.
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Order rank information for the order position within the order book for each security.
     *
     * @return the OrderBookPosition field
     */
    public OrderBookPositionField orderBookPosition() {
        return orderBookPosition;
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
        return PADDING.clone();
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
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        return orderBookPosition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityCode.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 23, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = orderBookPosition.encode(data, cursor);
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
            case "SecurityCode" -> Optional.of(securityCode);
            case "OrderId" -> Optional.of(orderId);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "Side" -> Optional.of(side);
            case "OrderType" -> Optional.of(orderType);
            case "OrderBookPosition" -> Optional.of(orderBookPosition);
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
