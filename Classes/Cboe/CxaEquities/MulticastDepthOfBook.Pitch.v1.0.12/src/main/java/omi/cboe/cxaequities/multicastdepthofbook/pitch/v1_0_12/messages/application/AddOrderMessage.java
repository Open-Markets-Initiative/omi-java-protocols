package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.OrderIdField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.PidField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.PriceField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.QuantityField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.ReservedField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.SideIndicatorField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.SymbolField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.fields.TimestampField;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.Field;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.Message;
import omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Represents a newly accepted visible or undisclosed order on the CXA book. Includes a day-specific Order Id assigned by CXA to the order.</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Nanoseconds since epoch.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Day-specific identifier assigned to this order. Order Ids received on PITCH may be compared to those received on order acknowledgements in FIX or BOE by converting the decimal value to a base 36 value.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side of the order.
     */
    private final SideIndicatorField sideIndicator = new SideIndicatorField();

    /**
     * Number of shares being added to the book. For undisclosed orders, the number of shares is zero.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The display price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     */
    private final PidField pid = new PidField();

    /**
     * Reserved (undefined).
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderId, sideIndicator, quantity, symbol, price, pid, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Day-specific identifier assigned to this order. Order Ids received on PITCH may be compared to those received on order acknowledgements in FIX or BOE by converting the decimal value to a base 36 value.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Side of the order.
     *
     * @return the SideIndicator field
     */
    public SideIndicatorField sideIndicator() {
        return sideIndicator;
    }

    /**
     * Number of shares being added to the book. For undisclosed orders, the number of shares is zero.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * The display price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Participant ID (right padded with spaces). Blank (spaces) if not attributed.
     *
     * @return the Pid field
     */
    public PidField pid() {
        return pid;
    }

    /**
     * Reserved (undefined).
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!sideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SideIndicatorField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!pid.parse(data, cursor)) {
            return false;
        }
        cursor += PidField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = sideIndicator.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = pid.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "SideIndicator" -> Optional.of(sideIndicator);
            case "Quantity" -> Optional.of(quantity);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "Pid" -> Optional.of(pid);
            case "Reserved" -> Optional.of(reserved);
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
