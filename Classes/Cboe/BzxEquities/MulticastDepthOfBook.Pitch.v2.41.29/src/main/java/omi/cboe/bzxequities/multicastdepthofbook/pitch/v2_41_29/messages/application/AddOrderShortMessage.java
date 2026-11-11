package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.AddOrderFlagsField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.OrderIdField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.PriceShortField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.QuantityShortField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.SideIndicatorField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.SymbolShortField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.fields.TimeOffsetField;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.types.Field;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.types.Message;
import omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.types.PrintOptions;

/**
 * Represents the AddOrderShortMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>An Add Order message represents a newly accepted visible order on the Cboe book.</p>
 */
public final class AddOrderShortMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 24;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Short Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Day-specific identifier assigned to this order
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order Side
     */
    private final SideIndicatorField sideIndicator = new SideIndicatorField();

    /**
     * Instrument quantity being added to the complex book (may be less than the number entered).
     */
    private final QuantityShortField quantityShort = new QuantityShortField();

    /**
     * Symbol
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * The limit order price
     */
    private final PriceShortField priceShort = new PriceShortField();

    /**
     * Add Order Flags
     */
    private final AddOrderFlagsField addOrderFlags = new AddOrderFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, orderId, sideIndicator, quantityShort, symbolShort, priceShort, addOrderFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Day-specific identifier assigned to this order
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order Side
     *
     * @return the SideIndicator field
     */
    public SideIndicatorField sideIndicator() {
        return sideIndicator;
    }

    /**
     * Instrument quantity being added to the complex book (may be less than the number entered).
     *
     * @return the QuantityShort field
     */
    public QuantityShortField quantityShort() {
        return quantityShort;
    }

    /**
     * Symbol
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * The limit order price
     *
     * @return the PriceShort field
     */
    public PriceShortField priceShort() {
        return priceShort;
    }

    /**
     * Add Order Flags
     *
     * @return the AddOrderFlags field
     */
    public AddOrderFlagsField addOrderFlags() {
        return addOrderFlags;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!sideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SideIndicatorField.BYTE_LENGTH;
        if (!quantityShort.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityShortField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!priceShort.parse(data, cursor)) {
            return false;
        }
        cursor += PriceShortField.BYTE_LENGTH;
        return addOrderFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = sideIndicator.encode(data, cursor);
        cursor = quantityShort.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = priceShort.encode(data, cursor);
        cursor = addOrderFlags.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "OrderId" -> Optional.of(orderId);
            case "SideIndicator" -> Optional.of(sideIndicator);
            case "QuantityShort" -> Optional.of(quantityShort);
            case "SymbolShort" -> Optional.of(symbolShort);
            case "PriceShort" -> Optional.of(priceShort);
            case "AddOrderFlags" -> Optional.of(addOrderFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderShortMessage message)) {
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
        if (!(other instanceof AddOrderShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
