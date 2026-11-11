package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.DisplayQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderRestatedDisplayPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderRestatedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderRestatedRankPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.RestatementReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the OrderRestatedMessage message from the Seed protocol.
 *
 * <p>Informational message from the Exchange. Sent when the Exchange performs work on the Member's order, such as repricing after entry or a reserve replenishment. For a replenishment, the OrderId refers to the new displayed portion of the order. For a repricing, the OrderId is the new OrderId for the entire order. This message is informational.</p>
 */
public final class OrderRestatedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Restated Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final OrderRestatedPresenceBitsField orderRestatedPresenceBits = new OrderRestatedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Exchange-assigned order identifier.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Client-specified order identifier that must increase with each new order.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Enum RestatementReason.
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * The rank price. Only present on re-priced orders.
     */
    private final OrderRestatedRankPriceField orderRestatedRankPrice = new OrderRestatedRankPriceField();

    /**
     * The display price, when different from rank price. Only present on re-priced orders.
     */
    private final OrderRestatedDisplayPriceField orderRestatedDisplayPrice = new OrderRestatedDisplayPriceField();

    /**
     * The quantity of the displayed replenished reserve order. Only present on reserve orders.
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderRestatedPresenceBits, transactTime, orderId, clOrdId, restatementReason, orderRestatedRankPrice, orderRestatedDisplayPrice, displayQty);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the OrderRestatedPresenceBits field
     */
    public OrderRestatedPresenceBitsField orderRestatedPresenceBits() {
        return orderRestatedPresenceBits;
    }

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Exchange-assigned order identifier.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Client-specified order identifier that must increase with each new order.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Enum RestatementReason.
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
    }

    /**
     * The rank price. Only present on re-priced orders.
     *
     * @return the OrderRestatedRankPrice field
     */
    public OrderRestatedRankPriceField orderRestatedRankPrice() {
        return orderRestatedRankPrice;
    }

    /**
     * The display price, when different from rank price. Only present on re-priced orders.
     *
     * @return the OrderRestatedDisplayPrice field
     */
    public OrderRestatedDisplayPriceField orderRestatedDisplayPrice() {
        return orderRestatedDisplayPrice;
    }

    /**
     * The quantity of the displayed replenished reserve order. Only present on reserve orders.
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Returns whether the fields before the OrderRestatedRankPrice put it on the wire.
     *
     * <p>Decode reads the OrderRestatedRankPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedRankPrice is on the wire
     */
    public boolean orderRestatedRankPricePresent() {
        return orderRestatedPresenceBits.hasOrderRestatedRankPrice();
    }

    /**
     * Returns whether the fields before the OrderRestatedDisplayPrice put it on the wire.
     *
     * <p>Decode reads the OrderRestatedDisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedDisplayPrice is on the wire
     */
    public boolean orderRestatedDisplayPricePresent() {
        return orderRestatedPresenceBits.hasOrderRestatedDisplayPrice();
    }

    /**
     * Returns whether the fields before the DisplayQty put it on the wire.
     *
     * <p>Decode reads the DisplayQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayQty is on the wire
     */
    public boolean displayQtyPresent() {
        return orderRestatedPresenceBits.hasDisplayQty();
    }

    private boolean onWire(Field field) {
        return (field != orderRestatedRankPrice || orderRestatedRankPricePresent()) && (field != orderRestatedDisplayPrice || orderRestatedDisplayPricePresent()) && (field != displayQty || displayQtyPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRestatedRankPricePresent() ? OrderRestatedRankPriceField.BYTE_LENGTH : 0) + (orderRestatedDisplayPricePresent() ? OrderRestatedDisplayPriceField.BYTE_LENGTH : 0) + (displayQtyPresent() ? DisplayQtyField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!orderRestatedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRestatedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!restatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += RestatementReasonField.BYTE_LENGTH;
        if (orderRestatedRankPricePresent()) {
            if (end - cursor < OrderRestatedRankPriceField.BYTE_LENGTH || !orderRestatedRankPrice.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedRankPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedDisplayPricePresent()) {
            if (end - cursor < OrderRestatedDisplayPriceField.BYTE_LENGTH || !orderRestatedDisplayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedDisplayPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayQtyPresent()) {
            if (end - cursor < DisplayQtyField.BYTE_LENGTH || !displayQty.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayQtyField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderRestatedRankPricePresent() != orderRestatedRankPrice.hasValue()) {
            throw new IllegalStateException(orderRestatedRankPrice.hasValue() ? "orderRestatedRankPrice holds a value the fields before it leave off the wire" : "orderRestatedRankPrice holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedDisplayPricePresent() != orderRestatedDisplayPrice.hasValue()) {
            throw new IllegalStateException(orderRestatedDisplayPrice.hasValue() ? "orderRestatedDisplayPrice holds a value the fields before it leave off the wire" : "orderRestatedDisplayPrice holds no value, though the fields before it put it on the wire");
        }
        if (displayQtyPresent() != displayQty.hasValue()) {
            throw new IllegalStateException(displayQty.hasValue() ? "displayQty holds a value the fields before it leave off the wire" : "displayQty holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = orderRestatedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
        if (orderRestatedRankPricePresent()) {
            cursor = orderRestatedRankPrice.encode(data, cursor);
        }
        if (orderRestatedDisplayPricePresent()) {
            cursor = orderRestatedDisplayPrice.encode(data, cursor);
        }
        if (displayQtyPresent()) {
            cursor = displayQty.encode(data, cursor);
        }
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
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
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "OrderRestatedPresenceBits" -> Optional.of(orderRestatedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "RestatementReason" -> Optional.of(restatementReason);
            case "OrderRestatedRankPrice" -> Optional.of(orderRestatedRankPrice);
            case "OrderRestatedDisplayPrice" -> Optional.of(orderRestatedDisplayPrice);
            case "DisplayQty" -> Optional.of(displayQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRestatedMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof OrderRestatedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
