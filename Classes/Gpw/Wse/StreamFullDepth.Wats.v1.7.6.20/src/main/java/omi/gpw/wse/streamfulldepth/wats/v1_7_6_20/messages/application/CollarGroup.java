package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OrderDynamicCollarTableIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OrderStaticCollarTableIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradeDynamicCollarTableIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradeStaticCollarTableIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the CollarGroup message from the StreamFullDepth protocol.
 *
 * <p>Message defining a collar group</p>
 */
public final class CollarGroup implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Collar Group";

    /**
     * ID of the market structure
     */
    private final IdField id = new IdField();

    /**
     * Collar table ID
     */
    private final OrderStaticCollarTableIdField orderStaticCollarTableId = new OrderStaticCollarTableIdField();

    /**
     * Collar table ID
     */
    private final OrderDynamicCollarTableIdField orderDynamicCollarTableId = new OrderDynamicCollarTableIdField();

    /**
     * Collar table ID
     */
    private final TradeStaticCollarTableIdField tradeStaticCollarTableId = new TradeStaticCollarTableIdField();

    /**
     * Collar table ID
     */
    private final TradeDynamicCollarTableIdField tradeDynamicCollarTableId = new TradeDynamicCollarTableIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(id, orderStaticCollarTableId, orderDynamicCollarTableId, tradeStaticCollarTableId, tradeDynamicCollarTableId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of the market structure
     *
     * @return the Id field
     */
    public IdField id() {
        return id;
    }

    /**
     * Collar table ID
     *
     * @return the OrderStaticCollarTableId field
     */
    public OrderStaticCollarTableIdField orderStaticCollarTableId() {
        return orderStaticCollarTableId;
    }

    /**
     * Collar table ID
     *
     * @return the OrderDynamicCollarTableId field
     */
    public OrderDynamicCollarTableIdField orderDynamicCollarTableId() {
        return orderDynamicCollarTableId;
    }

    /**
     * Collar table ID
     *
     * @return the TradeStaticCollarTableId field
     */
    public TradeStaticCollarTableIdField tradeStaticCollarTableId() {
        return tradeStaticCollarTableId;
    }

    /**
     * Collar table ID
     *
     * @return the TradeDynamicCollarTableId field
     */
    public TradeDynamicCollarTableIdField tradeDynamicCollarTableId() {
        return tradeDynamicCollarTableId;
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
        if (!id.parse(data, cursor)) {
            return false;
        }
        cursor += IdField.BYTE_LENGTH;
        if (!orderStaticCollarTableId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStaticCollarTableIdField.BYTE_LENGTH;
        if (!orderDynamicCollarTableId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderDynamicCollarTableIdField.BYTE_LENGTH;
        if (!tradeStaticCollarTableId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeStaticCollarTableIdField.BYTE_LENGTH;
        return tradeDynamicCollarTableId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = id.encode(data, cursor);
        cursor = orderStaticCollarTableId.encode(data, cursor);
        cursor = orderDynamicCollarTableId.encode(data, cursor);
        cursor = tradeStaticCollarTableId.encode(data, cursor);
        cursor = tradeDynamicCollarTableId.encode(data, cursor);
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
            case "Id" -> Optional.of(id);
            case "OrderStaticCollarTableId" -> Optional.of(orderStaticCollarTableId);
            case "OrderDynamicCollarTableId" -> Optional.of(orderDynamicCollarTableId);
            case "TradeStaticCollarTableId" -> Optional.of(tradeStaticCollarTableId);
            case "TradeDynamicCollarTableId" -> Optional.of(tradeDynamicCollarTableId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CollarGroup message)) {
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
        if (!(other instanceof CollarGroup message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
