package omi.bme.bmeequities.orderentry.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderPlacementField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderQtyField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PriceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SideField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.TimeInForceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SimpleNewOrderMessage message from the OrderEntry protocol.
 *
 * <p>Message sent by the client to enter a new order</p>
 */
public final class SimpleNewOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple New Order Message";

    /**
     * Request ID (for application feedback)
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     */
    private final ClientDataIdField clientDataId = new ClientDataIdField();

    /**
     * Application Order ID (unique at security level)
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Total order volume
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * GTD orders are not supported
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Routing Instruction
     */
    private final OrderPlacementField orderPlacement = new OrderPlacementField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(requestId, securityCode, clientDataId, orderId, side, price, orderQty, timeInForce, orderPlacement);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Request ID (for application feedback)
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     *
     * @return the ClientDataId field
     */
    public ClientDataIdField clientDataId() {
        return clientDataId;
    }

    /**
     * Application Order ID (unique at security level)
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Total order volume
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * GTD orders are not supported
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Routing Instruction
     *
     * @return the OrderPlacement field
     */
    public OrderPlacementField orderPlacement() {
        return orderPlacement;
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
        if (!requestId.parse(data, cursor)) {
            return false;
        }
        cursor += RequestIdField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!clientDataId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientDataIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        return orderPlacement.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = requestId.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = clientDataId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = orderPlacement.encode(data, cursor);
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
            case "RequestId" -> Optional.of(requestId);
            case "SecurityCode" -> Optional.of(securityCode);
            case "ClientDataId" -> Optional.of(clientDataId);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderPlacement" -> Optional.of(orderPlacement);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleNewOrderMessage message)) {
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
        if (!(other instanceof SimpleNewOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
