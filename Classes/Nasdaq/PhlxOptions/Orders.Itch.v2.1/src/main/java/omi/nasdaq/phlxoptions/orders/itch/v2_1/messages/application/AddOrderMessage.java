package omi.nasdaq.phlxoptions.orders.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.AllOrNoneField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.CmtaField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.ExecutableOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.GiveupField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.LimitPriceField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OpenCloseIndicatorField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OrderCapacityField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OrderQualifierField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OrderReferenceNumberField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OrderStatusField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OriginalOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.OwnerIdField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.SideField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.TimeInForceField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.TimestampField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.types.Field;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.types.Message;
import omi.nasdaq.phlxoptions.orders.itch.v2_1.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the Orders protocol.
 *
 * <p>The Order Message indicates a new order has been accepted and was added to the displayable book.</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * The unique reference number assigned to the new order.
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Original Order Volume for this order
     */
    private final OriginalOrderVolumeField originalOrderVolume = new OriginalOrderVolumeField();

    /**
     * Volume available for execution at the venue.
     */
    private final ExecutableOrderVolumeField executableOrderVolume = new ExecutableOrderVolumeField();

    /**
     * Order Status
     */
    private final OrderStatusField orderStatus = new OrderStatusField();

    /**
     * Order Type
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Order Qualifier
     */
    private final OrderQualifierField orderQualifier = new OrderQualifierField();

    /**
     * Original Limit Price of Limit or Stop Order, will not include repricing updates. Otherwise field is zero.
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

    /**
     * All or None
     */
    private final AllOrNoneField allOrNone = new AllOrNoneField();

    /**
     * Time in Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Order Capacity
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Open Close Indicator
     */
    private final OpenCloseIndicatorField openCloseIndicator = new OpenCloseIndicatorField();

    /**
     * Attributable Order may provide Firm ID to disseminate with order; Spaces when not set
     */
    private final OwnerIdField ownerId = new OwnerIdField();

    /**
     * Attributable Order may provide Give-up to disseminate with order; Spaces when not set
     */
    private final GiveupField giveup = new GiveupField();

    /**
     * Attributable Order may provide CMTA to disseminate with order; Spaces when not set
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, instrumentId, orderReferenceNumber, side, originalOrderVolume, executableOrderVolume, orderStatus, orderType, orderQualifier, limitPrice, allOrNone, timeInForce, orderCapacity, openCloseIndicator, ownerId, giveup, cmta);

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
     * Integer ID of the option, as defined in the Options Directory Message.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Original Order Volume for this order
     *
     * @return the OriginalOrderVolume field
     */
    public OriginalOrderVolumeField originalOrderVolume() {
        return originalOrderVolume;
    }

    /**
     * Volume available for execution at the venue.
     *
     * @return the ExecutableOrderVolume field
     */
    public ExecutableOrderVolumeField executableOrderVolume() {
        return executableOrderVolume;
    }

    /**
     * Order Status
     *
     * @return the OrderStatus field
     */
    public OrderStatusField orderStatus() {
        return orderStatus;
    }

    /**
     * Order Type
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Order Qualifier
     *
     * @return the OrderQualifier field
     */
    public OrderQualifierField orderQualifier() {
        return orderQualifier;
    }

    /**
     * Original Limit Price of Limit or Stop Order, will not include repricing updates. Otherwise field is zero.
     *
     * @return the LimitPrice field
     */
    public LimitPriceField limitPrice() {
        return limitPrice;
    }

    /**
     * All or None
     *
     * @return the AllOrNone field
     */
    public AllOrNoneField allOrNone() {
        return allOrNone;
    }

    /**
     * Time in Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Order Capacity
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Open Close Indicator
     *
     * @return the OpenCloseIndicator field
     */
    public OpenCloseIndicatorField openCloseIndicator() {
        return openCloseIndicator;
    }

    /**
     * Attributable Order may provide Firm ID to disseminate with order; Spaces when not set
     *
     * @return the OwnerId field
     */
    public OwnerIdField ownerId() {
        return ownerId;
    }

    /**
     * Attributable Order may provide Give-up to disseminate with order; Spaces when not set
     *
     * @return the Giveup field
     */
    public GiveupField giveup() {
        return giveup;
    }

    /**
     * Attributable Order may provide CMTA to disseminate with order; Spaces when not set
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!originalOrderVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalOrderVolumeField.BYTE_LENGTH;
        if (!executableOrderVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutableOrderVolumeField.BYTE_LENGTH;
        if (!orderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStatusField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!orderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQualifierField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
        if (!allOrNone.parse(data, cursor)) {
            return false;
        }
        cursor += AllOrNoneField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!orderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCapacityField.BYTE_LENGTH;
        if (!openCloseIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseIndicatorField.BYTE_LENGTH;
        if (!ownerId.parse(data, cursor)) {
            return false;
        }
        cursor += OwnerIdField.BYTE_LENGTH;
        if (!giveup.parse(data, cursor)) {
            return false;
        }
        cursor += GiveupField.BYTE_LENGTH;
        return cmta.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = originalOrderVolume.encode(data, cursor);
        cursor = executableOrderVolume.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = orderQualifier.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = allOrNone.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = openCloseIndicator.encode(data, cursor);
        cursor = ownerId.encode(data, cursor);
        cursor = giveup.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "Side" -> Optional.of(side);
            case "OriginalOrderVolume" -> Optional.of(originalOrderVolume);
            case "ExecutableOrderVolume" -> Optional.of(executableOrderVolume);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "OrderType" -> Optional.of(orderType);
            case "OrderQualifier" -> Optional.of(orderQualifier);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "AllOrNone" -> Optional.of(allOrNone);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "OpenCloseIndicator" -> Optional.of(openCloseIndicator);
            case "OwnerId" -> Optional.of(ownerId);
            case "Giveup" -> Optional.of(giveup);
            case "Cmta" -> Optional.of(cmta);
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
