package omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.DepthOrderCapacityField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.DepthSideField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.OrderReferenceNumberField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.PriceLongField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.ScopeField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.StrategyIdField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.TimestampField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.fields.VolumeLongField;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.types.Field;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.types.Message;
import omi.nasdaq.mrxoptions.spreaddepthofmarket.itch.v2_1.types.PrintOptions;

/**
 * Represents the AddOrderLongFormMessage message from the SpreadDepthOfMarket protocol.
 *
 * <p>A Complex Add Order Message indicates that a new order has been accepted and was added to the displayable book. Long form.</p>
 */
public final class AddOrderLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'o';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Long Form Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 33, 3 };

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID assigned daily. Valid for trading day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * The unique reference number assigned to the new order.
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * Indicates the side of the order
     */
    private final DepthSideField depthSide = new DepthSideField();

    /**
     * Indicates the order capacity
     */
    private final DepthOrderCapacityField depthOrderCapacity = new DepthOrderCapacityField();

    /**
     * The display price of the new order being added to the book.
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * The total quantity of the new order being added to the book
     */
    private final VolumeLongField volumeLong = new VolumeLongField();

    /**
     * Scope
     */
    private final ScopeField scope = new ScopeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, strategyId, orderReferenceNumber, depthSide, depthOrderCapacity, priceLong, volumeLong, scope);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Option ID assigned daily. Valid for trading day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * The unique reference number assigned to the new order.
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * Indicates the side of the order
     *
     * @return the DepthSide field
     */
    public DepthSideField depthSide() {
        return depthSide;
    }

    /**
     * Indicates the order capacity
     *
     * @return the DepthOrderCapacity field
     */
    public DepthOrderCapacityField depthOrderCapacity() {
        return depthOrderCapacity;
    }

    /**
     * The display price of the new order being added to the book.
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * The total quantity of the new order being added to the book
     *
     * @return the VolumeLong field
     */
    public VolumeLongField volumeLong() {
        return volumeLong;
    }

    /**
     * Scope
     *
     * @return the Scope field
     */
    public ScopeField scope() {
        return scope;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!depthSide.parse(data, cursor)) {
            return false;
        }
        cursor += DepthSideField.BYTE_LENGTH;
        if (!depthOrderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += DepthOrderCapacityField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!volumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeLongField.BYTE_LENGTH;
        if (!scope.parse(data, cursor)) {
            return false;
        }
        cursor += ScopeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = depthSide.encode(data, cursor);
        cursor = depthOrderCapacity.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = volumeLong.encode(data, cursor);
        cursor = scope.encode(data, cursor);
        if (buffer != null && buffer.length >= 36) {
            System.arraycopy(buffer, 33, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "DepthSide" -> Optional.of(depthSide);
            case "DepthOrderCapacity" -> Optional.of(depthOrderCapacity);
            case "PriceLong" -> Optional.of(priceLong);
            case "VolumeLong" -> Optional.of(volumeLong);
            case "Scope" -> Optional.of(scope);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderLongFormMessage message)) {
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
        if (!(other instanceof AddOrderLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
