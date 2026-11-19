package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentIdField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OrderIdField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OrderSideField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OrderTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.PriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SizeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TimestampField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Field;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Message;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the DepthOfMarket protocol.
 *
 * <p>Add Order Message</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\n';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Order type
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Matching engine assigned Order ID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side of order
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * Order price
     */
    private final PriceField price = new PriceField();

    /**
     * Open order size
     */
    private final SizeField size = new SizeField();

    /**
     * Instrument Type
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentId, orderType, orderId, orderSide, price, size, instrumentType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching Engine time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Order type
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Matching engine assigned Order ID
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Side of order
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
    }

    /**
     * Order price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Open order size
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Instrument Type
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        return instrumentType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "OrderType" -> Optional.of(orderType);
            case "OrderId" -> Optional.of(orderId);
            case "OrderSide" -> Optional.of(orderSide);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "InstrumentType" -> Optional.of(instrumentType);
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
