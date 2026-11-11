package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LeavesQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderModifiedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderModifiedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderModifiedOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderModifiedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the OrderModifiedMessage message from the Seed protocol.
 *
 * <p>An order has been modified.</p>
 */
public final class OrderModifiedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Y';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final OrderModifiedPresenceBitsField orderModifiedPresenceBits = new OrderModifiedPresenceBitsField();

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
     * The ClOrdId of the order to be canceled.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Number of shares that were still available to execute after the modify.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Quantity can remain the same or decrease.
     */
    private final OrderModifiedOrderQtyField orderModifiedOrderQty = new OrderModifiedOrderQtyField();

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     */
    private final OrderModifiedBitFieldsField orderModifiedBitFields = new OrderModifiedBitFieldsField();

    /**
     * Locate broker.
     */
    private final OrderModifiedLocateBrokerField orderModifiedLocateBroker = new OrderModifiedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderModifiedPresenceBits, transactTime, orderId, clOrdId, origClOrdId, leavesQty, orderModifiedOrderQty, orderModifiedBitFields, orderModifiedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the OrderModifiedPresenceBits field
     */
    public OrderModifiedPresenceBitsField orderModifiedPresenceBits() {
        return orderModifiedPresenceBits;
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
     * The ClOrdId of the order to be canceled.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Number of shares that were still available to execute after the modify.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Quantity can remain the same or decrease.
     *
     * @return the OrderModifiedOrderQty field
     */
    public OrderModifiedOrderQtyField orderModifiedOrderQty() {
        return orderModifiedOrderQty;
    }

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     *
     * @return the OrderModifiedBitFields field
     */
    public OrderModifiedBitFieldsField orderModifiedBitFields() {
        return orderModifiedBitFields;
    }

    /**
     * Locate broker.
     *
     * @return the OrderModifiedLocateBroker field
     */
    public OrderModifiedLocateBrokerField orderModifiedLocateBroker() {
        return orderModifiedLocateBroker;
    }

    /**
     * Returns whether the fields before the OrderModifiedOrderQty put it on the wire.
     *
     * <p>Decode reads the OrderModifiedOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedOrderQty is on the wire
     */
    public boolean orderModifiedOrderQtyPresent() {
        return orderModifiedPresenceBits.hasOrderModifiedOrderQty();
    }

    /**
     * Returns whether the fields before the OrderModifiedBitFields put it on the wire.
     *
     * <p>Decode reads the OrderModifiedBitFields where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedBitFields is on the wire
     */
    public boolean orderModifiedBitFieldsPresent() {
        return orderModifiedPresenceBits.hasOrderModifiedBitFields();
    }

    /**
     * Returns whether the fields before the OrderModifiedLocateBroker put it on the wire.
     *
     * <p>Decode reads the OrderModifiedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedLocateBroker is on the wire
     */
    public boolean orderModifiedLocateBrokerPresent() {
        return orderModifiedPresenceBits.hasOrderModifiedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != orderModifiedOrderQty || orderModifiedOrderQtyPresent()) && (field != orderModifiedBitFields || orderModifiedBitFieldsPresent()) && (field != orderModifiedLocateBroker || orderModifiedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderModifiedOrderQtyPresent() ? OrderModifiedOrderQtyField.BYTE_LENGTH : 0) + (orderModifiedBitFieldsPresent() ? OrderModifiedBitFieldsField.BYTE_LENGTH : 0) + (orderModifiedLocateBrokerPresent() ? OrderModifiedLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!orderModifiedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += OrderModifiedPresenceBitsField.BYTE_LENGTH;
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
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (orderModifiedOrderQtyPresent()) {
            if (end - cursor < OrderModifiedOrderQtyField.BYTE_LENGTH || !orderModifiedOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedBitFieldsPresent()) {
            if (end - cursor < OrderModifiedBitFieldsField.BYTE_LENGTH || !orderModifiedBitFields.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedBitFieldsField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedLocateBrokerPresent()) {
            if (end - cursor < OrderModifiedLocateBrokerField.BYTE_LENGTH || !orderModifiedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderModifiedOrderQtyPresent() != orderModifiedOrderQty.hasValue()) {
            throw new IllegalStateException(orderModifiedOrderQty.hasValue() ? "orderModifiedOrderQty holds a value the fields before it leave off the wire" : "orderModifiedOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedBitFieldsPresent() != orderModifiedBitFields.hasValue()) {
            throw new IllegalStateException(orderModifiedBitFields.hasValue() ? "orderModifiedBitFields holds a value the fields before it leave off the wire" : "orderModifiedBitFields holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedLocateBrokerPresent() != orderModifiedLocateBroker.hasValue()) {
            throw new IllegalStateException(orderModifiedLocateBroker.hasValue() ? "orderModifiedLocateBroker holds a value the fields before it leave off the wire" : "orderModifiedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = orderModifiedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        if (orderModifiedOrderQtyPresent()) {
            cursor = orderModifiedOrderQty.encode(data, cursor);
        }
        if (orderModifiedBitFieldsPresent()) {
            cursor = orderModifiedBitFields.encode(data, cursor);
        }
        if (orderModifiedLocateBrokerPresent()) {
            cursor = orderModifiedLocateBroker.encode(data, cursor);
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
            case "OrderModifiedPresenceBits" -> Optional.of(orderModifiedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "OrderModifiedOrderQty" -> Optional.of(orderModifiedOrderQty);
            case "OrderModifiedBitFields" -> Optional.of(orderModifiedBitFields);
            case "OrderModifiedLocateBroker" -> Optional.of(orderModifiedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedMessage message)) {
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
        if (!(other instanceof OrderModifiedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
